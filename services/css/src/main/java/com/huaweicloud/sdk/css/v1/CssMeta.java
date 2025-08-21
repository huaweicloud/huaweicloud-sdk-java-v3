package com.huaweicloud.sdk.css.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.css.v1.model.AddFavoriteReq;
import com.huaweicloud.sdk.css.v1.model.AddFavoriteRequest;
import com.huaweicloud.sdk.css.v1.model.AddFavoriteResponse;
import com.huaweicloud.sdk.css.v1.model.AddIndependentNodeRequest;
import com.huaweicloud.sdk.css.v1.model.AddIndependentNodeResponse;
import com.huaweicloud.sdk.css.v1.model.BatchAddOrDeleteTagOnClusterReq;
import com.huaweicloud.sdk.css.v1.model.BindPublicReq;
import com.huaweicloud.sdk.css.v1.model.BindPublicReqEipReq;
import com.huaweicloud.sdk.css.v1.model.ChangeClusterSubnetRequest;
import com.huaweicloud.sdk.css.v1.model.ChangeClusterSubnetResponse;
import com.huaweicloud.sdk.css.v1.model.ChangeModeReq;
import com.huaweicloud.sdk.css.v1.model.ChangeModeRequest;
import com.huaweicloud.sdk.css.v1.model.ChangeModeResponse;
import com.huaweicloud.sdk.css.v1.model.ChangeSecurityGroupReq;
import com.huaweicloud.sdk.css.v1.model.ChangeSecurityGroupRequest;
import com.huaweicloud.sdk.css.v1.model.ChangeSecurityGroupResponse;
import com.huaweicloud.sdk.css.v1.model.CloseKibanaPublicReq;
import com.huaweicloud.sdk.css.v1.model.ClusterChangeMainSubnet;
import com.huaweicloud.sdk.css.v1.model.CreateAiOpsRequest;
import com.huaweicloud.sdk.css.v1.model.CreateAiOpsRequestBody;
import com.huaweicloud.sdk.css.v1.model.CreateAiOpsResponse;
import com.huaweicloud.sdk.css.v1.model.CreateAutoCreatePolicyRequest;
import com.huaweicloud.sdk.css.v1.model.CreateAutoCreatePolicyResponse;
import com.huaweicloud.sdk.css.v1.model.CreateBindPublicRequest;
import com.huaweicloud.sdk.css.v1.model.CreateBindPublicResponse;
import com.huaweicloud.sdk.css.v1.model.CreateClusterReq;
import com.huaweicloud.sdk.css.v1.model.CreateClusterRequest;
import com.huaweicloud.sdk.css.v1.model.CreateClusterResponse;
import com.huaweicloud.sdk.css.v1.model.CreateClustersTagsRequest;
import com.huaweicloud.sdk.css.v1.model.CreateClustersTagsResponse;
import com.huaweicloud.sdk.css.v1.model.CreateCnfReq;
import com.huaweicloud.sdk.css.v1.model.CreateCnfRequest;
import com.huaweicloud.sdk.css.v1.model.CreateCnfResponse;
import com.huaweicloud.sdk.css.v1.model.CreateElbListenerRequest;
import com.huaweicloud.sdk.css.v1.model.CreateElbListenerResponse;
import com.huaweicloud.sdk.css.v1.model.CreateEsListenerRequestBody;
import com.huaweicloud.sdk.css.v1.model.CreateLoadIkThesaurusRequest;
import com.huaweicloud.sdk.css.v1.model.CreateLoadIkThesaurusResponse;
import com.huaweicloud.sdk.css.v1.model.CreateLogBackupRequest;
import com.huaweicloud.sdk.css.v1.model.CreateLogBackupResponse;
import com.huaweicloud.sdk.css.v1.model.CreateSnapshotReq;
import com.huaweicloud.sdk.css.v1.model.CreateSnapshotRequest;
import com.huaweicloud.sdk.css.v1.model.CreateSnapshotResponse;
import com.huaweicloud.sdk.css.v1.model.DeleteAiOpsRequest;
import com.huaweicloud.sdk.css.v1.model.DeleteAiOpsResponse;
import com.huaweicloud.sdk.css.v1.model.DeleteClusterRequest;
import com.huaweicloud.sdk.css.v1.model.DeleteClusterResponse;
import com.huaweicloud.sdk.css.v1.model.DeleteClustersTagsRequest;
import com.huaweicloud.sdk.css.v1.model.DeleteClustersTagsResponse;
import com.huaweicloud.sdk.css.v1.model.DeleteConfReq;
import com.huaweicloud.sdk.css.v1.model.DeleteConfRequest;
import com.huaweicloud.sdk.css.v1.model.DeleteConfResponse;
import com.huaweicloud.sdk.css.v1.model.DeleteConfigRequest;
import com.huaweicloud.sdk.css.v1.model.DeleteConfigResponse;
import com.huaweicloud.sdk.css.v1.model.DeleteIkThesaurusRequest;
import com.huaweicloud.sdk.css.v1.model.DeleteIkThesaurusResponse;
import com.huaweicloud.sdk.css.v1.model.DeleteSnapshotRequest;
import com.huaweicloud.sdk.css.v1.model.DeleteSnapshotResponse;
import com.huaweicloud.sdk.css.v1.model.DeleteTemplateReq;
import com.huaweicloud.sdk.css.v1.model.DeleteTemplateRequest;
import com.huaweicloud.sdk.css.v1.model.DeleteTemplateResponse;
import com.huaweicloud.sdk.css.v1.model.DownloadCertRequest;
import com.huaweicloud.sdk.css.v1.model.DownloadCertResponse;
import com.huaweicloud.sdk.css.v1.model.EnableOrDisableElbRequest;
import com.huaweicloud.sdk.css.v1.model.EnableOrDisableElbResponse;
import com.huaweicloud.sdk.css.v1.model.ExtendClusterReq;
import com.huaweicloud.sdk.css.v1.model.GetLogBackupReq;
import com.huaweicloud.sdk.css.v1.model.IndependentReq;
import com.huaweicloud.sdk.css.v1.model.ListActionsRequest;
import com.huaweicloud.sdk.css.v1.model.ListActionsResponse;
import com.huaweicloud.sdk.css.v1.model.ListAiOpsRequest;
import com.huaweicloud.sdk.css.v1.model.ListAiOpsResponse;
import com.huaweicloud.sdk.css.v1.model.ListCertsRequest;
import com.huaweicloud.sdk.css.v1.model.ListCertsResponse;
import com.huaweicloud.sdk.css.v1.model.ListClustersDetailsRequest;
import com.huaweicloud.sdk.css.v1.model.ListClustersDetailsResponse;
import com.huaweicloud.sdk.css.v1.model.ListClustersTagsRequest;
import com.huaweicloud.sdk.css.v1.model.ListClustersTagsResponse;
import com.huaweicloud.sdk.css.v1.model.ListConfsRequest;
import com.huaweicloud.sdk.css.v1.model.ListConfsResponse;
import com.huaweicloud.sdk.css.v1.model.ListElbCertsRequest;
import com.huaweicloud.sdk.css.v1.model.ListElbCertsResponse;
import com.huaweicloud.sdk.css.v1.model.ListElbsRequest;
import com.huaweicloud.sdk.css.v1.model.ListElbsResponse;
import com.huaweicloud.sdk.css.v1.model.ListFlavorsRequest;
import com.huaweicloud.sdk.css.v1.model.ListFlavorsResponse;
import com.huaweicloud.sdk.css.v1.model.ListImagesRequest;
import com.huaweicloud.sdk.css.v1.model.ListImagesResponse;
import com.huaweicloud.sdk.css.v1.model.ListLogsJobRequest;
import com.huaweicloud.sdk.css.v1.model.ListLogsJobResponse;
import com.huaweicloud.sdk.css.v1.model.ListPipelinesRequest;
import com.huaweicloud.sdk.css.v1.model.ListPipelinesResponse;
import com.huaweicloud.sdk.css.v1.model.ListSmnTopicsRequest;
import com.huaweicloud.sdk.css.v1.model.ListSmnTopicsResponse;
import com.huaweicloud.sdk.css.v1.model.ListSnapshotsRequest;
import com.huaweicloud.sdk.css.v1.model.ListSnapshotsResponse;
import com.huaweicloud.sdk.css.v1.model.ListTemplatesRequest;
import com.huaweicloud.sdk.css.v1.model.ListTemplatesResponse;
import com.huaweicloud.sdk.css.v1.model.ListYmlsJobRequest;
import com.huaweicloud.sdk.css.v1.model.ListYmlsJobResponse;
import com.huaweicloud.sdk.css.v1.model.ListYmlsRequest;
import com.huaweicloud.sdk.css.v1.model.ListYmlsResponse;
import com.huaweicloud.sdk.css.v1.model.LoadCustomThesaurusReq;
import com.huaweicloud.sdk.css.v1.model.PeriodReq;
import com.huaweicloud.sdk.css.v1.model.ResetPasswordReq;
import com.huaweicloud.sdk.css.v1.model.ResetPasswordRequest;
import com.huaweicloud.sdk.css.v1.model.ResetPasswordResponse;
import com.huaweicloud.sdk.css.v1.model.RestartClusterRequest;
import com.huaweicloud.sdk.css.v1.model.RestartClusterResponse;
import com.huaweicloud.sdk.css.v1.model.RestoreSnapshotReq;
import com.huaweicloud.sdk.css.v1.model.RestoreSnapshotRequest;
import com.huaweicloud.sdk.css.v1.model.RestoreSnapshotResponse;
import com.huaweicloud.sdk.css.v1.model.RetryUpgradeTaskRequest;
import com.huaweicloud.sdk.css.v1.model.RetryUpgradeTaskResponse;
import com.huaweicloud.sdk.css.v1.model.RoleExtendReq;
import com.huaweicloud.sdk.css.v1.model.SetRDSBackupCnfReq;
import com.huaweicloud.sdk.css.v1.model.ShowAutoCreatePolicyRequest;
import com.huaweicloud.sdk.css.v1.model.ShowAutoCreatePolicyResponse;
import com.huaweicloud.sdk.css.v1.model.ShowClusterDetailRequest;
import com.huaweicloud.sdk.css.v1.model.ShowClusterDetailResponse;
import com.huaweicloud.sdk.css.v1.model.ShowClusterTagRequest;
import com.huaweicloud.sdk.css.v1.model.ShowClusterTagResponse;
import com.huaweicloud.sdk.css.v1.model.ShowElbDetailRequest;
import com.huaweicloud.sdk.css.v1.model.ShowElbDetailResponse;
import com.huaweicloud.sdk.css.v1.model.ShowGetConfDetailRequest;
import com.huaweicloud.sdk.css.v1.model.ShowGetConfDetailResponse;
import com.huaweicloud.sdk.css.v1.model.ShowGetLogSettingRequest;
import com.huaweicloud.sdk.css.v1.model.ShowGetLogSettingResponse;
import com.huaweicloud.sdk.css.v1.model.ShowIkThesaurusRequest;
import com.huaweicloud.sdk.css.v1.model.ShowIkThesaurusResponse;
import com.huaweicloud.sdk.css.v1.model.ShowLogBackupRequest;
import com.huaweicloud.sdk.css.v1.model.ShowLogBackupResponse;
import com.huaweicloud.sdk.css.v1.model.ShowVpcepConnectionRequest;
import com.huaweicloud.sdk.css.v1.model.ShowVpcepConnectionResponse;
import com.huaweicloud.sdk.css.v1.model.ShrinkClusterReq;
import com.huaweicloud.sdk.css.v1.model.ShrinkNodesReq;
import com.huaweicloud.sdk.css.v1.model.StartAutoSettingRequest;
import com.huaweicloud.sdk.css.v1.model.StartAutoSettingResponse;
import com.huaweicloud.sdk.css.v1.model.StartConnectivityTestReq;
import com.huaweicloud.sdk.css.v1.model.StartConnectivityTestRequest;
import com.huaweicloud.sdk.css.v1.model.StartConnectivityTestResponse;
import com.huaweicloud.sdk.css.v1.model.StartKibanaPublicReq;
import com.huaweicloud.sdk.css.v1.model.StartKibanaPublicRequest;
import com.huaweicloud.sdk.css.v1.model.StartKibanaPublicResponse;
import com.huaweicloud.sdk.css.v1.model.StartLogAutoBackupPolicyReq;
import com.huaweicloud.sdk.css.v1.model.StartLogAutoBackupPolicyRequest;
import com.huaweicloud.sdk.css.v1.model.StartLogAutoBackupPolicyResponse;
import com.huaweicloud.sdk.css.v1.model.StartLogsReq;
import com.huaweicloud.sdk.css.v1.model.StartLogsRequest;
import com.huaweicloud.sdk.css.v1.model.StartLogsResponse;
import com.huaweicloud.sdk.css.v1.model.StartPipelineReq;
import com.huaweicloud.sdk.css.v1.model.StartPipelineRequest;
import com.huaweicloud.sdk.css.v1.model.StartPipelineResponse;
import com.huaweicloud.sdk.css.v1.model.StartPublicWhitelistReq;
import com.huaweicloud.sdk.css.v1.model.StartPublicWhitelistRequest;
import com.huaweicloud.sdk.css.v1.model.StartPublicWhitelistResponse;
import com.huaweicloud.sdk.css.v1.model.StartTargetClusterConnectivityTestReq;
import com.huaweicloud.sdk.css.v1.model.StartTargetClusterConnectivityTestRequest;
import com.huaweicloud.sdk.css.v1.model.StartTargetClusterConnectivityTestResponse;
import com.huaweicloud.sdk.css.v1.model.StartVpecpReq;
import com.huaweicloud.sdk.css.v1.model.StartVpecpRequest;
import com.huaweicloud.sdk.css.v1.model.StartVpecpResponse;
import com.huaweicloud.sdk.css.v1.model.StopHotPipelineRequest;
import com.huaweicloud.sdk.css.v1.model.StopHotPipelineRequestBody;
import com.huaweicloud.sdk.css.v1.model.StopHotPipelineResponse;
import com.huaweicloud.sdk.css.v1.model.StopLogAutoBackupPolicyRequest;
import com.huaweicloud.sdk.css.v1.model.StopLogAutoBackupPolicyResponse;
import com.huaweicloud.sdk.css.v1.model.StopLogsRequest;
import com.huaweicloud.sdk.css.v1.model.StopLogsResponse;
import com.huaweicloud.sdk.css.v1.model.StopPipelineRequest;
import com.huaweicloud.sdk.css.v1.model.StopPipelineResponse;
import com.huaweicloud.sdk.css.v1.model.StopPublicKibanaWhitelistRequest;
import com.huaweicloud.sdk.css.v1.model.StopPublicKibanaWhitelistResponse;
import com.huaweicloud.sdk.css.v1.model.StopPublicWhitelistRequest;
import com.huaweicloud.sdk.css.v1.model.StopPublicWhitelistResponse;
import com.huaweicloud.sdk.css.v1.model.StopSnapshotRequest;
import com.huaweicloud.sdk.css.v1.model.StopSnapshotResponse;
import com.huaweicloud.sdk.css.v1.model.StopVpecpRequest;
import com.huaweicloud.sdk.css.v1.model.StopVpecpResponse;
import com.huaweicloud.sdk.css.v1.model.TagReq;
import com.huaweicloud.sdk.css.v1.model.UnBindPublicReq;
import com.huaweicloud.sdk.css.v1.model.UpdateAlterKibanaRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateAlterKibanaResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateAzByInstanceTypeReq;
import com.huaweicloud.sdk.css.v1.model.UpdateAzByInstanceTypeRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateAzByInstanceTypeResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateBatchClustersTagsRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateBatchClustersTagsResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateCloseKibanaRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateCloseKibanaResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateClusterNameReq;
import com.huaweicloud.sdk.css.v1.model.UpdateClusterNameRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateClusterNameResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateCnfRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateCnfResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateEsElbRequestBody;
import com.huaweicloud.sdk.css.v1.model.UpdateEsListenerRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateEsListenerRequestBody;
import com.huaweicloud.sdk.css.v1.model.UpdateEsListenerResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateExtendClusterRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateExtendClusterResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateExtendInstanceStorageRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateExtendInstanceStorageResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateFlavorByTypeReq;
import com.huaweicloud.sdk.css.v1.model.UpdateFlavorByTypeRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateFlavorByTypeResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateFlavorReq;
import com.huaweicloud.sdk.css.v1.model.UpdateFlavorRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateFlavorResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateInstanceResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateLogSettingReq;
import com.huaweicloud.sdk.css.v1.model.UpdateLogSettingRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateLogSettingResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateOndemandClusterToPeriodRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateOndemandClusterToPeriodResponse;
import com.huaweicloud.sdk.css.v1.model.UpdatePublicBandWidthRequest;
import com.huaweicloud.sdk.css.v1.model.UpdatePublicBandWidthResponse;
import com.huaweicloud.sdk.css.v1.model.UpdatePublicKibanaBandwidthReq;
import com.huaweicloud.sdk.css.v1.model.UpdatePublicKibanaWhitelistReq;
import com.huaweicloud.sdk.css.v1.model.UpdatePublicKibanaWhitelistRequest;
import com.huaweicloud.sdk.css.v1.model.UpdatePublicKibanaWhitelistResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateShrinkClusterRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateShrinkClusterResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateShrinkNodesRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateShrinkNodesResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateSnapshotSettingReq;
import com.huaweicloud.sdk.css.v1.model.UpdateSnapshotSettingRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateSnapshotSettingResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateUnbindPublicRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateUnbindPublicResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateVpcepConnectionReq;
import com.huaweicloud.sdk.css.v1.model.UpdateVpcepConnectionRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateVpcepConnectionResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateVpcepWhitelistReq;
import com.huaweicloud.sdk.css.v1.model.UpdateVpcepWhitelistRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateVpcepWhitelistResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateYmlsReq;
import com.huaweicloud.sdk.css.v1.model.UpdateYmlsRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateYmlsResponse;
import com.huaweicloud.sdk.css.v1.model.UpgradeCoreRequest;
import com.huaweicloud.sdk.css.v1.model.UpgradeCoreResponse;
import com.huaweicloud.sdk.css.v1.model.UpgradeDetailRequest;
import com.huaweicloud.sdk.css.v1.model.UpgradeDetailResponse;
import com.huaweicloud.sdk.css.v1.model.UpgradingTheKernelBody;

@SuppressWarnings("unchecked")
public class CssMeta {

    public static final HttpRequestDef<AddIndependentNodeRequest, AddIndependentNodeResponse> addIndependentNode =
        genForAddIndependentNode();

    private static HttpRequestDef<AddIndependentNodeRequest, AddIndependentNodeResponse> genForAddIndependentNode() {
        // basic
        HttpRequestDef.Builder<AddIndependentNodeRequest, AddIndependentNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddIndependentNodeRequest.class, AddIndependentNodeResponse.class)
                .withName("AddIndependentNode")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/type/{type}/independent")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddIndependentNodeRequest::getClusterId, AddIndependentNodeRequest::setClusterId));
        builder.<String>withRequestField("type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddIndependentNodeRequest::getType, AddIndependentNodeRequest::setType));
        builder.<IndependentReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IndependentReq.class),
            f -> f.withMarshaller(AddIndependentNodeRequest::getBody, AddIndependentNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeClusterSubnetRequest, ChangeClusterSubnetResponse> changeClusterSubnet =
        genForChangeClusterSubnet();

    private static HttpRequestDef<ChangeClusterSubnetRequest, ChangeClusterSubnetResponse> genForChangeClusterSubnet() {
        // basic
        HttpRequestDef.Builder<ChangeClusterSubnetRequest, ChangeClusterSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeClusterSubnetRequest.class, ChangeClusterSubnetResponse.class)
                .withName("ChangeClusterSubnet")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/subnet/change")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeClusterSubnetRequest::getClusterId, ChangeClusterSubnetRequest::setClusterId));
        builder.<ClusterChangeMainSubnet>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClusterChangeMainSubnet.class),
            f -> f.withMarshaller(ChangeClusterSubnetRequest::getBody, ChangeClusterSubnetRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(ChangeClusterSubnetResponse::getBody, ChangeClusterSubnetResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ChangeModeRequest, ChangeModeResponse> changeMode = genForChangeMode();

    private static HttpRequestDef<ChangeModeRequest, ChangeModeResponse> genForChangeMode() {
        // basic
        HttpRequestDef.Builder<ChangeModeRequest, ChangeModeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeModeRequest.class, ChangeModeResponse.class)
                .withName("ChangeMode")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/mode/change")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeModeRequest::getClusterId, ChangeModeRequest::setClusterId));
        builder.<ChangeModeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeModeReq.class),
            f -> f.withMarshaller(ChangeModeRequest::getBody, ChangeModeRequest::setBody));

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
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/sg/change")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeSecurityGroupRequest::getClusterId, ChangeSecurityGroupRequest::setClusterId));
        builder.<ChangeSecurityGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeSecurityGroupReq.class),
            f -> f.withMarshaller(ChangeSecurityGroupRequest::getBody, ChangeSecurityGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAiOpsRequest, CreateAiOpsResponse> createAiOps = genForCreateAiOps();

    private static HttpRequestDef<CreateAiOpsRequest, CreateAiOpsResponse> genForCreateAiOps() {
        // basic
        HttpRequestDef.Builder<CreateAiOpsRequest, CreateAiOpsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAiOpsRequest.class, CreateAiOpsResponse.class)
                .withName("CreateAiOps")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/ai-ops")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAiOpsRequest::getClusterId, CreateAiOpsRequest::setClusterId));
        builder.<CreateAiOpsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAiOpsRequestBody.class),
            f -> f.withMarshaller(CreateAiOpsRequest::getBody, CreateAiOpsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAutoCreatePolicyRequest, CreateAutoCreatePolicyResponse> createAutoCreatePolicy =
        genForCreateAutoCreatePolicy();

    private static HttpRequestDef<CreateAutoCreatePolicyRequest, CreateAutoCreatePolicyResponse> genForCreateAutoCreatePolicy() {
        // basic
        HttpRequestDef.Builder<CreateAutoCreatePolicyRequest, CreateAutoCreatePolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAutoCreatePolicyRequest.class, CreateAutoCreatePolicyResponse.class)
            .withName("CreateAutoCreatePolicy")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/index_snapshot/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAutoCreatePolicyRequest::getClusterId,
                CreateAutoCreatePolicyRequest::setClusterId));
        builder.<SetRDSBackupCnfReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetRDSBackupCnfReq.class),
            f -> f.withMarshaller(CreateAutoCreatePolicyRequest::getBody, CreateAutoCreatePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBindPublicRequest, CreateBindPublicResponse> createBindPublic =
        genForCreateBindPublic();

    private static HttpRequestDef<CreateBindPublicRequest, CreateBindPublicResponse> genForCreateBindPublic() {
        // basic
        HttpRequestDef.Builder<CreateBindPublicRequest, CreateBindPublicResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBindPublicRequest.class, CreateBindPublicResponse.class)
                .withName("CreateBindPublic")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/public/open")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBindPublicRequest::getClusterId, CreateBindPublicRequest::setClusterId));
        builder.<BindPublicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BindPublicReq.class),
            f -> f.withMarshaller(CreateBindPublicRequest::getBody, CreateBindPublicRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterRequest, CreateClusterResponse> createCluster =
        genForCreateCluster();

    private static HttpRequestDef<CreateClusterRequest, CreateClusterResponse> genForCreateCluster() {
        // basic
        HttpRequestDef.Builder<CreateClusterRequest, CreateClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusterRequest.class, CreateClusterResponse.class)
                .withName("CreateCluster")
                .withUri("/v1.0/{project_id}/clusters")
                .withContentType("application/json");

        // requests
        builder.<CreateClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateClusterReq.class),
            f -> f.withMarshaller(CreateClusterRequest::getBody, CreateClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClustersTagsRequest, CreateClustersTagsResponse> createClustersTags =
        genForCreateClustersTags();

    private static HttpRequestDef<CreateClustersTagsRequest, CreateClustersTagsResponse> genForCreateClustersTags() {
        // basic
        HttpRequestDef.Builder<CreateClustersTagsRequest, CreateClustersTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClustersTagsRequest.class, CreateClustersTagsResponse.class)
                .withName("CreateClustersTags")
                .withUri("/v1.0/{project_id}/{resource_type}/{cluster_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClustersTagsRequest::getClusterId, CreateClustersTagsRequest::setClusterId));
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClustersTagsRequest::getResourceType,
                CreateClustersTagsRequest::setResourceType));
        builder.<TagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagReq.class),
            f -> f.withMarshaller(CreateClustersTagsRequest::getBody, CreateClustersTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateElbListenerRequest, CreateElbListenerResponse> createElbListener =
        genForCreateElbListener();

    private static HttpRequestDef<CreateElbListenerRequest, CreateElbListenerResponse> genForCreateElbListener() {
        // basic
        HttpRequestDef.Builder<CreateElbListenerRequest, CreateElbListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateElbListenerRequest.class, CreateElbListenerResponse.class)
                .withName("CreateElbListener")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/es-listeners")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateElbListenerRequest::getClusterId, CreateElbListenerRequest::setClusterId));
        builder.<CreateEsListenerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEsListenerRequestBody.class),
            f -> f.withMarshaller(CreateElbListenerRequest::getBody, CreateElbListenerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLoadIkThesaurusRequest, CreateLoadIkThesaurusResponse> createLoadIkThesaurus =
        genForCreateLoadIkThesaurus();

    private static HttpRequestDef<CreateLoadIkThesaurusRequest, CreateLoadIkThesaurusResponse> genForCreateLoadIkThesaurus() {
        // basic
        HttpRequestDef.Builder<CreateLoadIkThesaurusRequest, CreateLoadIkThesaurusResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateLoadIkThesaurusRequest.class, CreateLoadIkThesaurusResponse.class)
            .withName("CreateLoadIkThesaurus")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/thesaurus")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLoadIkThesaurusRequest::getClusterId,
                CreateLoadIkThesaurusRequest::setClusterId));
        builder.<LoadCustomThesaurusReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LoadCustomThesaurusReq.class),
            f -> f.withMarshaller(CreateLoadIkThesaurusRequest::getBody, CreateLoadIkThesaurusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLogBackupRequest, CreateLogBackupResponse> createLogBackup =
        genForCreateLogBackup();

    private static HttpRequestDef<CreateLogBackupRequest, CreateLogBackupResponse> genForCreateLogBackup() {
        // basic
        HttpRequestDef.Builder<CreateLogBackupRequest, CreateLogBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLogBackupRequest.class, CreateLogBackupResponse.class)
                .withName("CreateLogBackup")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/logs/collect")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLogBackupRequest::getClusterId, CreateLogBackupRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshot =
        genForCreateSnapshot();

    private static HttpRequestDef<CreateSnapshotRequest, CreateSnapshotResponse> genForCreateSnapshot() {
        // basic
        HttpRequestDef.Builder<CreateSnapshotRequest, CreateSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSnapshotRequest.class, CreateSnapshotResponse.class)
                .withName("CreateSnapshot")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/index_snapshot")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSnapshotRequest::getClusterId, CreateSnapshotRequest::setClusterId));
        builder.<CreateSnapshotReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSnapshotReq.class),
            f -> f.withMarshaller(CreateSnapshotRequest::getBody, CreateSnapshotRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAiOpsRequest, DeleteAiOpsResponse> deleteAiOps = genForDeleteAiOps();

    private static HttpRequestDef<DeleteAiOpsRequest, DeleteAiOpsResponse> genForDeleteAiOps() {
        // basic
        HttpRequestDef.Builder<DeleteAiOpsRequest, DeleteAiOpsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAiOpsRequest.class, DeleteAiOpsResponse.class)
                .withName("DeleteAiOps")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/ai-ops/{aiops_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAiOpsRequest::getClusterId, DeleteAiOpsRequest::setClusterId));
        builder.<String>withRequestField("aiops_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAiOpsRequest::getAiopsId, DeleteAiOpsRequest::setAiopsId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> deleteCluster =
        genForDeleteCluster();

    private static HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> genForDeleteCluster() {
        // basic
        HttpRequestDef.Builder<DeleteClusterRequest, DeleteClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteClusterRequest.class, DeleteClusterResponse.class)
                .withName("DeleteCluster")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterRequest::getClusterId, DeleteClusterRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClustersTagsRequest, DeleteClustersTagsResponse> deleteClustersTags =
        genForDeleteClustersTags();

    private static HttpRequestDef<DeleteClustersTagsRequest, DeleteClustersTagsResponse> genForDeleteClustersTags() {
        // basic
        HttpRequestDef.Builder<DeleteClustersTagsRequest, DeleteClustersTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteClustersTagsRequest.class, DeleteClustersTagsResponse.class)
                .withName("DeleteClustersTags")
                .withUri("/v1.0/{project_id}/{resource_type}/{cluster_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClustersTagsRequest::getClusterId, DeleteClustersTagsRequest::setClusterId));
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClustersTagsRequest::getResourceType,
                DeleteClustersTagsRequest::setResourceType));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClustersTagsRequest::getKey, DeleteClustersTagsRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIkThesaurusRequest, DeleteIkThesaurusResponse> deleteIkThesaurus =
        genForDeleteIkThesaurus();

    private static HttpRequestDef<DeleteIkThesaurusRequest, DeleteIkThesaurusResponse> genForDeleteIkThesaurus() {
        // basic
        HttpRequestDef.Builder<DeleteIkThesaurusRequest, DeleteIkThesaurusResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIkThesaurusRequest.class, DeleteIkThesaurusResponse.class)
                .withName("DeleteIkThesaurus")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/thesaurus")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIkThesaurusRequest::getClusterId, DeleteIkThesaurusRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshot =
        genForDeleteSnapshot();

    private static HttpRequestDef<DeleteSnapshotRequest, DeleteSnapshotResponse> genForDeleteSnapshot() {
        // basic
        HttpRequestDef.Builder<DeleteSnapshotRequest, DeleteSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSnapshotRequest.class, DeleteSnapshotResponse.class)
                .withName("DeleteSnapshot")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/index_snapshot/{snapshot_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSnapshotRequest::getClusterId, DeleteSnapshotRequest::setClusterId));
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSnapshotRequest::getSnapshotId, DeleteSnapshotRequest::setSnapshotId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadCertRequest, DownloadCertResponse> downloadCert = genForDownloadCert();

    private static HttpRequestDef<DownloadCertRequest, DownloadCertResponse> genForDownloadCert() {
        // basic
        HttpRequestDef.Builder<DownloadCertRequest, DownloadCertResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadCertRequest.class, DownloadCertResponse.class)
                .withName("DownloadCert")
                .withUri("/v1.0/{project_id}/cer/download")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableOrDisableElbRequest, EnableOrDisableElbResponse> enableOrDisableElb =
        genForEnableOrDisableElb();

    private static HttpRequestDef<EnableOrDisableElbRequest, EnableOrDisableElbResponse> genForEnableOrDisableElb() {
        // basic
        HttpRequestDef.Builder<EnableOrDisableElbRequest, EnableOrDisableElbResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableOrDisableElbRequest.class, EnableOrDisableElbResponse.class)
                .withName("EnableOrDisableElb")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/loadbalancers/es-switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableOrDisableElbRequest::getClusterId, EnableOrDisableElbRequest::setClusterId));
        builder.<UpdateEsElbRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateEsElbRequestBody.class),
            f -> f.withMarshaller(EnableOrDisableElbRequest::getBody, EnableOrDisableElbRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAiOpsRequest, ListAiOpsResponse> listAiOps = genForListAiOps();

    private static HttpRequestDef<ListAiOpsRequest, ListAiOpsResponse> genForListAiOps() {
        // basic
        HttpRequestDef.Builder<ListAiOpsRequest, ListAiOpsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAiOpsRequest.class, ListAiOpsResponse.class)
                .withName("ListAiOps")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/ai-ops")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAiOpsRequest::getClusterId, ListAiOpsRequest::setClusterId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAiOpsRequest::getLimit, ListAiOpsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAiOpsRequest::getOffset, ListAiOpsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClustersDetailsRequest, ListClustersDetailsResponse> listClustersDetails =
        genForListClustersDetails();

    private static HttpRequestDef<ListClustersDetailsRequest, ListClustersDetailsResponse> genForListClustersDetails() {
        // basic
        HttpRequestDef.Builder<ListClustersDetailsRequest, ListClustersDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClustersDetailsRequest.class, ListClustersDetailsResponse.class)
                .withName("ListClustersDetails")
                .withUri("/v1.0/{project_id}/clusters")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClustersDetailsRequest::getOffset, ListClustersDetailsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClustersDetailsRequest::getLimit, ListClustersDetailsRequest::setLimit));
        builder.<String>withRequestField("datastoreType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersDetailsRequest::getDatastoreType,
                ListClustersDetailsRequest::setDatastoreType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClustersTagsRequest, ListClustersTagsResponse> listClustersTags =
        genForListClustersTags();

    private static HttpRequestDef<ListClustersTagsRequest, ListClustersTagsResponse> genForListClustersTags() {
        // basic
        HttpRequestDef.Builder<ListClustersTagsRequest, ListClustersTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClustersTagsRequest.class, ListClustersTagsResponse.class)
                .withName("ListClustersTags")
                .withUri("/v1.0/{project_id}/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersTagsRequest::getResourceType, ListClustersTagsRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListElbCertsRequest, ListElbCertsResponse> listElbCerts = genForListElbCerts();

    private static HttpRequestDef<ListElbCertsRequest, ListElbCertsResponse> genForListElbCerts() {
        // basic
        HttpRequestDef.Builder<ListElbCertsRequest, ListElbCertsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListElbCertsRequest.class, ListElbCertsResponse.class)
                .withName("ListElbCerts")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/elb/certificates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListElbCertsRequest::getClusterId, ListElbCertsRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListElbsRequest, ListElbsResponse> listElbs = genForListElbs();

    private static HttpRequestDef<ListElbsRequest, ListElbsResponse> genForListElbs() {
        // basic
        HttpRequestDef.Builder<ListElbsRequest, ListElbsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListElbsRequest.class, ListElbsResponse.class)
                .withName("ListElbs")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/loadbalancers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListElbsRequest::getClusterId, ListElbsRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForListFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForListFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withName("ListFlavors")
                .withUri("/v1.0/{project_id}/es-flavors")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImagesRequest, ListImagesResponse> listImages = genForListImages();

    private static HttpRequestDef<ListImagesRequest, ListImagesResponse> genForListImages() {
        // basic
        HttpRequestDef.Builder<ListImagesRequest, ListImagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImagesRequest.class, ListImagesResponse.class)
                .withName("ListImages")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/target/{upgrade_type}/images")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getClusterId, ListImagesRequest::setClusterId));
        builder.<String>withRequestField("upgrade_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getUpgradeType, ListImagesRequest::setUpgradeType));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getOffset, ListImagesRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getLimit, ListImagesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogsJobRequest, ListLogsJobResponse> listLogsJob = genForListLogsJob();

    private static HttpRequestDef<ListLogsJobRequest, ListLogsJobResponse> genForListLogsJob() {
        // basic
        HttpRequestDef.Builder<ListLogsJobRequest, ListLogsJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLogsJobRequest.class, ListLogsJobResponse.class)
                .withName("ListLogsJob")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/logs/records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogsJobRequest::getClusterId, ListLogsJobRequest::setClusterId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLogsJobRequest::getOffset, ListLogsJobRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLogsJobRequest::getLimit, ListLogsJobRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSmnTopicsRequest, ListSmnTopicsResponse> listSmnTopics =
        genForListSmnTopics();

    private static HttpRequestDef<ListSmnTopicsRequest, ListSmnTopicsResponse> genForListSmnTopics() {
        // basic
        HttpRequestDef.Builder<ListSmnTopicsRequest, ListSmnTopicsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSmnTopicsRequest.class, ListSmnTopicsResponse.class)
                .withName("ListSmnTopics")
                .withUri("/v1.0/{project_id}/domains/{domain_id}/ai-ops/smn-topics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmnTopicsRequest::getDomainId, ListSmnTopicsRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshots =
        genForListSnapshots();

    private static HttpRequestDef<ListSnapshotsRequest, ListSnapshotsResponse> genForListSnapshots() {
        // basic
        HttpRequestDef.Builder<ListSnapshotsRequest, ListSnapshotsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotsRequest.class, ListSnapshotsResponse.class)
                .withName("ListSnapshots")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/index_snapshots")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getClusterId, ListSnapshotsRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListYmlsRequest, ListYmlsResponse> listYmls = genForListYmls();

    private static HttpRequestDef<ListYmlsRequest, ListYmlsResponse> genForListYmls() {
        // basic
        HttpRequestDef.Builder<ListYmlsRequest, ListYmlsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListYmlsRequest.class, ListYmlsResponse.class)
                .withName("ListYmls")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/ymls/template")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListYmlsRequest::getClusterId, ListYmlsRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListYmlsJobRequest, ListYmlsJobResponse> listYmlsJob = genForListYmlsJob();

    private static HttpRequestDef<ListYmlsJobRequest, ListYmlsJobResponse> genForListYmlsJob() {
        // basic
        HttpRequestDef.Builder<ListYmlsJobRequest, ListYmlsJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListYmlsJobRequest.class, ListYmlsJobResponse.class)
                .withName("ListYmlsJob")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/ymls/joblists")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListYmlsJobRequest::getClusterId, ListYmlsJobRequest::setClusterId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListYmlsJobRequest::getOffset, ListYmlsJobRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListYmlsJobRequest::getLimit, ListYmlsJobRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> resetPassword =
        genForResetPassword();

    private static HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> genForResetPassword() {
        // basic
        HttpRequestDef.Builder<ResetPasswordRequest, ResetPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetPasswordRequest.class, ResetPasswordResponse.class)
                .withName("ResetPassword")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/password/reset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPasswordRequest::getClusterId, ResetPasswordRequest::setClusterId));
        builder.<ResetPasswordReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetPasswordReq.class),
            f -> f.withMarshaller(ResetPasswordRequest::getBody, ResetPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartClusterRequest, RestartClusterResponse> restartCluster =
        genForRestartCluster();

    private static HttpRequestDef<RestartClusterRequest, RestartClusterResponse> genForRestartCluster() {
        // basic
        HttpRequestDef.Builder<RestartClusterRequest, RestartClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestartClusterRequest.class, RestartClusterResponse.class)
                .withName("RestartCluster")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/restart")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartClusterRequest::getClusterId, RestartClusterRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreSnapshotRequest, RestoreSnapshotResponse> restoreSnapshot =
        genForRestoreSnapshot();

    private static HttpRequestDef<RestoreSnapshotRequest, RestoreSnapshotResponse> genForRestoreSnapshot() {
        // basic
        HttpRequestDef.Builder<RestoreSnapshotRequest, RestoreSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreSnapshotRequest.class, RestoreSnapshotResponse.class)
                .withName("RestoreSnapshot")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/index_snapshot/{snapshot_id}/restore")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreSnapshotRequest::getClusterId, RestoreSnapshotRequest::setClusterId));
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreSnapshotRequest::getSnapshotId, RestoreSnapshotRequest::setSnapshotId));
        builder.<RestoreSnapshotReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreSnapshotReq.class),
            f -> f.withMarshaller(RestoreSnapshotRequest::getBody, RestoreSnapshotRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryUpgradeTaskRequest, RetryUpgradeTaskResponse> retryUpgradeTask =
        genForRetryUpgradeTask();

    private static HttpRequestDef<RetryUpgradeTaskRequest, RetryUpgradeTaskResponse> genForRetryUpgradeTask() {
        // basic
        HttpRequestDef.Builder<RetryUpgradeTaskRequest, RetryUpgradeTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RetryUpgradeTaskRequest.class, RetryUpgradeTaskResponse.class)
                .withName("RetryUpgradeTask")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/upgrade/{action_id}/retry")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryUpgradeTaskRequest::getClusterId, RetryUpgradeTaskRequest::setClusterId));
        builder.<String>withRequestField("action_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryUpgradeTaskRequest::getActionId, RetryUpgradeTaskRequest::setActionId));
        builder.<String>withRequestField("retry_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryUpgradeTaskRequest::getRetryMode, RetryUpgradeTaskRequest::setRetryMode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoCreatePolicyRequest, ShowAutoCreatePolicyResponse> showAutoCreatePolicy =
        genForShowAutoCreatePolicy();

    private static HttpRequestDef<ShowAutoCreatePolicyRequest, ShowAutoCreatePolicyResponse> genForShowAutoCreatePolicy() {
        // basic
        HttpRequestDef.Builder<ShowAutoCreatePolicyRequest, ShowAutoCreatePolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAutoCreatePolicyRequest.class, ShowAutoCreatePolicyResponse.class)
            .withName("ShowAutoCreatePolicy")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/index_snapshot/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoCreatePolicyRequest::getClusterId,
                ShowAutoCreatePolicyRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterDetailRequest, ShowClusterDetailResponse> showClusterDetail =
        genForShowClusterDetail();

    private static HttpRequestDef<ShowClusterDetailRequest, ShowClusterDetailResponse> genForShowClusterDetail() {
        // basic
        HttpRequestDef.Builder<ShowClusterDetailRequest, ShowClusterDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusterDetailRequest.class, ShowClusterDetailResponse.class)
                .withName("ShowClusterDetail")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterDetailRequest::getClusterId, ShowClusterDetailRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterTagRequest, ShowClusterTagResponse> showClusterTag =
        genForShowClusterTag();

    private static HttpRequestDef<ShowClusterTagRequest, ShowClusterTagResponse> genForShowClusterTag() {
        // basic
        HttpRequestDef.Builder<ShowClusterTagRequest, ShowClusterTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusterTagRequest.class, ShowClusterTagResponse.class)
                .withName("ShowClusterTag")
                .withUri("/v1.0/{project_id}/{resource_type}/{cluster_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterTagRequest::getClusterId, ShowClusterTagRequest::setClusterId));
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterTagRequest::getResourceType, ShowClusterTagRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowElbDetailRequest, ShowElbDetailResponse> showElbDetail =
        genForShowElbDetail();

    private static HttpRequestDef<ShowElbDetailRequest, ShowElbDetailResponse> genForShowElbDetail() {
        // basic
        HttpRequestDef.Builder<ShowElbDetailRequest, ShowElbDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowElbDetailRequest.class, ShowElbDetailResponse.class)
                .withName("ShowElbDetail")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/es-listeners")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowElbDetailRequest::getClusterId, ShowElbDetailRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGetLogSettingRequest, ShowGetLogSettingResponse> showGetLogSetting =
        genForShowGetLogSetting();

    private static HttpRequestDef<ShowGetLogSettingRequest, ShowGetLogSettingResponse> genForShowGetLogSetting() {
        // basic
        HttpRequestDef.Builder<ShowGetLogSettingRequest, ShowGetLogSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGetLogSettingRequest.class, ShowGetLogSettingResponse.class)
                .withName("ShowGetLogSetting")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/logs/settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetLogSettingRequest::getClusterId, ShowGetLogSettingRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIkThesaurusRequest, ShowIkThesaurusResponse> showIkThesaurus =
        genForShowIkThesaurus();

    private static HttpRequestDef<ShowIkThesaurusRequest, ShowIkThesaurusResponse> genForShowIkThesaurus() {
        // basic
        HttpRequestDef.Builder<ShowIkThesaurusRequest, ShowIkThesaurusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIkThesaurusRequest.class, ShowIkThesaurusResponse.class)
                .withName("ShowIkThesaurus")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/thesaurus")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIkThesaurusRequest::getClusterId, ShowIkThesaurusRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLogBackupRequest, ShowLogBackupResponse> showLogBackup =
        genForShowLogBackup();

    private static HttpRequestDef<ShowLogBackupRequest, ShowLogBackupResponse> genForShowLogBackup() {
        // basic
        HttpRequestDef.Builder<ShowLogBackupRequest, ShowLogBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowLogBackupRequest.class, ShowLogBackupResponse.class)
                .withName("ShowLogBackup")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/logs/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogBackupRequest::getClusterId, ShowLogBackupRequest::setClusterId));
        builder.<GetLogBackupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetLogBackupReq.class),
            f -> f.withMarshaller(ShowLogBackupRequest::getBody, ShowLogBackupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVpcepConnectionRequest, ShowVpcepConnectionResponse> showVpcepConnection =
        genForShowVpcepConnection();

    private static HttpRequestDef<ShowVpcepConnectionRequest, ShowVpcepConnectionResponse> genForShowVpcepConnection() {
        // basic
        HttpRequestDef.Builder<ShowVpcepConnectionRequest, ShowVpcepConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVpcepConnectionRequest.class, ShowVpcepConnectionResponse.class)
                .withName("ShowVpcepConnection")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/vpcepservice/connections")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVpcepConnectionRequest::getClusterId, ShowVpcepConnectionRequest::setClusterId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowVpcepConnectionRequest::getOffset, ShowVpcepConnectionRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowVpcepConnectionRequest::getLimit, ShowVpcepConnectionRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartAutoSettingRequest, StartAutoSettingResponse> startAutoSetting =
        genForStartAutoSetting();

    private static HttpRequestDef<StartAutoSettingRequest, StartAutoSettingResponse> genForStartAutoSetting() {
        // basic
        HttpRequestDef.Builder<StartAutoSettingRequest, StartAutoSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartAutoSettingRequest.class, StartAutoSettingResponse.class)
                .withName("StartAutoSetting")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/index_snapshot/auto_setting")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAutoSettingRequest::getClusterId, StartAutoSettingRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartLogAutoBackupPolicyRequest, StartLogAutoBackupPolicyResponse> startLogAutoBackupPolicy =
        genForStartLogAutoBackupPolicy();

    private static HttpRequestDef<StartLogAutoBackupPolicyRequest, StartLogAutoBackupPolicyResponse> genForStartLogAutoBackupPolicy() {
        // basic
        HttpRequestDef.Builder<StartLogAutoBackupPolicyRequest, StartLogAutoBackupPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, StartLogAutoBackupPolicyRequest.class, StartLogAutoBackupPolicyResponse.class)
                .withName("StartLogAutoBackupPolicy")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/logs/policy/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartLogAutoBackupPolicyRequest::getClusterId,
                StartLogAutoBackupPolicyRequest::setClusterId));
        builder.<StartLogAutoBackupPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartLogAutoBackupPolicyReq.class),
            f -> f.withMarshaller(StartLogAutoBackupPolicyRequest::getBody, StartLogAutoBackupPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartLogsRequest, StartLogsResponse> startLogs = genForStartLogs();

    private static HttpRequestDef<StartLogsRequest, StartLogsResponse> genForStartLogs() {
        // basic
        HttpRequestDef.Builder<StartLogsRequest, StartLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartLogsRequest.class, StartLogsResponse.class)
                .withName("StartLogs")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/logs/open")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartLogsRequest::getClusterId, StartLogsRequest::setClusterId));
        builder.<StartLogsRequest.ActionEnum>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartLogsRequest.ActionEnum.class),
            f -> f.withMarshaller(StartLogsRequest::getAction, StartLogsRequest::setAction));
        builder.<StartLogsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartLogsReq.class),
            f -> f.withMarshaller(StartLogsRequest::getBody, StartLogsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartPublicWhitelistRequest, StartPublicWhitelistResponse> startPublicWhitelist =
        genForStartPublicWhitelist();

    private static HttpRequestDef<StartPublicWhitelistRequest, StartPublicWhitelistResponse> genForStartPublicWhitelist() {
        // basic
        HttpRequestDef.Builder<StartPublicWhitelistRequest, StartPublicWhitelistResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, StartPublicWhitelistRequest.class, StartPublicWhitelistResponse.class)
            .withName("StartPublicWhitelist")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/public/whitelist/update")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartPublicWhitelistRequest::getClusterId,
                StartPublicWhitelistRequest::setClusterId));
        builder.<StartPublicWhitelistReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartPublicWhitelistReq.class),
            f -> f.withMarshaller(StartPublicWhitelistRequest::getBody, StartPublicWhitelistRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartTargetClusterConnectivityTestRequest, StartTargetClusterConnectivityTestResponse> startTargetClusterConnectivityTest =
        genForStartTargetClusterConnectivityTest();

    private static HttpRequestDef<StartTargetClusterConnectivityTestRequest, StartTargetClusterConnectivityTestResponse> genForStartTargetClusterConnectivityTest() {
        // basic
        HttpRequestDef.Builder<StartTargetClusterConnectivityTestRequest, StartTargetClusterConnectivityTestResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    StartTargetClusterConnectivityTestRequest.class,
                    StartTargetClusterConnectivityTestResponse.class)
                .withName("StartTargetClusterConnectivityTest")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/logs/connectivity")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartTargetClusterConnectivityTestRequest::getClusterId,
                StartTargetClusterConnectivityTestRequest::setClusterId));
        builder.<StartTargetClusterConnectivityTestReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartTargetClusterConnectivityTestReq.class),
            f -> f.withMarshaller(StartTargetClusterConnectivityTestRequest::getBody,
                StartTargetClusterConnectivityTestRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StartTargetClusterConnectivityTestResponse::getBody,
                StartTargetClusterConnectivityTestResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<StartVpecpRequest, StartVpecpResponse> startVpecp = genForStartVpecp();

    private static HttpRequestDef<StartVpecpRequest, StartVpecpResponse> genForStartVpecp() {
        // basic
        HttpRequestDef.Builder<StartVpecpRequest, StartVpecpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartVpecpRequest.class, StartVpecpResponse.class)
                .withName("StartVpecp")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/vpcepservice/open")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartVpecpRequest::getClusterId, StartVpecpRequest::setClusterId));
        builder.<StartVpecpReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartVpecpReq.class),
            f -> f.withMarshaller(StartVpecpRequest::getBody, StartVpecpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopLogAutoBackupPolicyRequest, StopLogAutoBackupPolicyResponse> stopLogAutoBackupPolicy =
        genForStopLogAutoBackupPolicy();

    private static HttpRequestDef<StopLogAutoBackupPolicyRequest, StopLogAutoBackupPolicyResponse> genForStopLogAutoBackupPolicy() {
        // basic
        HttpRequestDef.Builder<StopLogAutoBackupPolicyRequest, StopLogAutoBackupPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, StopLogAutoBackupPolicyRequest.class, StopLogAutoBackupPolicyResponse.class)
            .withName("StopLogAutoBackupPolicy")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/logs/policy/close")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopLogAutoBackupPolicyRequest::getClusterId,
                StopLogAutoBackupPolicyRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopLogsRequest, StopLogsResponse> stopLogs = genForStopLogs();

    private static HttpRequestDef<StopLogsRequest, StopLogsResponse> genForStopLogs() {
        // basic
        HttpRequestDef.Builder<StopLogsRequest, StopLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StopLogsRequest.class, StopLogsResponse.class)
                .withName("StopLogs")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/logs/close")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopLogsRequest::getClusterId, StopLogsRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopPublicWhitelistRequest, StopPublicWhitelistResponse> stopPublicWhitelist =
        genForStopPublicWhitelist();

    private static HttpRequestDef<StopPublicWhitelistRequest, StopPublicWhitelistResponse> genForStopPublicWhitelist() {
        // basic
        HttpRequestDef.Builder<StopPublicWhitelistRequest, StopPublicWhitelistResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StopPublicWhitelistRequest.class, StopPublicWhitelistResponse.class)
                .withName("StopPublicWhitelist")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/public/whitelist/close")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopPublicWhitelistRequest::getClusterId, StopPublicWhitelistRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopSnapshotRequest, StopSnapshotResponse> stopSnapshot = genForStopSnapshot();

    private static HttpRequestDef<StopSnapshotRequest, StopSnapshotResponse> genForStopSnapshot() {
        // basic
        HttpRequestDef.Builder<StopSnapshotRequest, StopSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, StopSnapshotRequest.class, StopSnapshotResponse.class)
                .withName("StopSnapshot")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/index_snapshots")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSnapshotRequest::getClusterId, StopSnapshotRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopVpecpRequest, StopVpecpResponse> stopVpecp = genForStopVpecp();

    private static HttpRequestDef<StopVpecpRequest, StopVpecpResponse> genForStopVpecp() {
        // basic
        HttpRequestDef.Builder<StopVpecpRequest, StopVpecpResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StopVpecpRequest.class, StopVpecpResponse.class)
                .withName("StopVpecp")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/vpcepservice/close")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopVpecpRequest::getClusterId, StopVpecpRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAzByInstanceTypeRequest, UpdateAzByInstanceTypeResponse> updateAzByInstanceType =
        genForUpdateAzByInstanceType();

    private static HttpRequestDef<UpdateAzByInstanceTypeRequest, UpdateAzByInstanceTypeResponse> genForUpdateAzByInstanceType() {
        // basic
        HttpRequestDef.Builder<UpdateAzByInstanceTypeRequest, UpdateAzByInstanceTypeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateAzByInstanceTypeRequest.class, UpdateAzByInstanceTypeResponse.class)
            .withName("UpdateAzByInstanceType")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/inst-type/{inst_type}/azmigrate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAzByInstanceTypeRequest::getClusterId,
                UpdateAzByInstanceTypeRequest::setClusterId));
        builder.<UpdateAzByInstanceTypeRequest.InstTypeEnum>withRequestField("inst_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAzByInstanceTypeRequest.InstTypeEnum.class),
            f -> f.withMarshaller(UpdateAzByInstanceTypeRequest::getInstType,
                UpdateAzByInstanceTypeRequest::setInstType));
        builder.<UpdateAzByInstanceTypeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAzByInstanceTypeReq.class),
            f -> f.withMarshaller(UpdateAzByInstanceTypeRequest::getBody, UpdateAzByInstanceTypeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBatchClustersTagsRequest, UpdateBatchClustersTagsResponse> updateBatchClustersTags =
        genForUpdateBatchClustersTags();

    private static HttpRequestDef<UpdateBatchClustersTagsRequest, UpdateBatchClustersTagsResponse> genForUpdateBatchClustersTags() {
        // basic
        HttpRequestDef.Builder<UpdateBatchClustersTagsRequest, UpdateBatchClustersTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateBatchClustersTagsRequest.class, UpdateBatchClustersTagsResponse.class)
            .withName("UpdateBatchClustersTags")
            .withUri("/v1.0/{project_id}/{resource_type}/{cluster_id}/tags/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBatchClustersTagsRequest::getClusterId,
                UpdateBatchClustersTagsRequest::setClusterId));
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBatchClustersTagsRequest::getResourceType,
                UpdateBatchClustersTagsRequest::setResourceType));
        builder.<BatchAddOrDeleteTagOnClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddOrDeleteTagOnClusterReq.class),
            f -> f.withMarshaller(UpdateBatchClustersTagsRequest::getBody, UpdateBatchClustersTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterNameRequest, UpdateClusterNameResponse> updateClusterName =
        genForUpdateClusterName();

    private static HttpRequestDef<UpdateClusterNameRequest, UpdateClusterNameResponse> genForUpdateClusterName() {
        // basic
        HttpRequestDef.Builder<UpdateClusterNameRequest, UpdateClusterNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateClusterNameRequest.class, UpdateClusterNameResponse.class)
                .withName("UpdateClusterName")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/changename")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClusterNameRequest::getClusterId, UpdateClusterNameRequest::setClusterId));
        builder.<UpdateClusterNameReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateClusterNameReq.class),
            f -> f.withMarshaller(UpdateClusterNameRequest::getBody, UpdateClusterNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEsListenerRequest, UpdateEsListenerResponse> updateEsListener =
        genForUpdateEsListener();

    private static HttpRequestDef<UpdateEsListenerRequest, UpdateEsListenerResponse> genForUpdateEsListener() {
        // basic
        HttpRequestDef.Builder<UpdateEsListenerRequest, UpdateEsListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEsListenerRequest.class, UpdateEsListenerResponse.class)
                .withName("UpdateEsListener")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/es-listeners/{listener_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEsListenerRequest::getClusterId, UpdateEsListenerRequest::setClusterId));
        builder.<String>withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEsListenerRequest::getListenerId, UpdateEsListenerRequest::setListenerId));
        builder.<UpdateEsListenerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEsListenerRequestBody.class),
            f -> f.withMarshaller(UpdateEsListenerRequest::getBody, UpdateEsListenerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateExtendClusterRequest, UpdateExtendClusterResponse> updateExtendCluster =
        genForUpdateExtendCluster();

    private static HttpRequestDef<UpdateExtendClusterRequest, UpdateExtendClusterResponse> genForUpdateExtendCluster() {
        // basic
        HttpRequestDef.Builder<UpdateExtendClusterRequest, UpdateExtendClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateExtendClusterRequest.class, UpdateExtendClusterResponse.class)
                .withName("UpdateExtendCluster")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/extend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateExtendClusterRequest::getClusterId, UpdateExtendClusterRequest::setClusterId));
        builder.<ExtendClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExtendClusterReq.class),
            f -> f.withMarshaller(UpdateExtendClusterRequest::getBody, UpdateExtendClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateExtendInstanceStorageRequest, UpdateExtendInstanceStorageResponse> updateExtendInstanceStorage =
        genForUpdateExtendInstanceStorage();

    private static HttpRequestDef<UpdateExtendInstanceStorageRequest, UpdateExtendInstanceStorageResponse> genForUpdateExtendInstanceStorage() {
        // basic
        HttpRequestDef.Builder<UpdateExtendInstanceStorageRequest, UpdateExtendInstanceStorageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateExtendInstanceStorageRequest.class,
                    UpdateExtendInstanceStorageResponse.class)
                .withName("UpdateExtendInstanceStorage")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/role_extend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateExtendInstanceStorageRequest::getClusterId,
                UpdateExtendInstanceStorageRequest::setClusterId));
        builder.<RoleExtendReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RoleExtendReq.class),
            f -> f.withMarshaller(UpdateExtendInstanceStorageRequest::getBody,
                UpdateExtendInstanceStorageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlavorRequest, UpdateFlavorResponse> updateFlavor = genForUpdateFlavor();

    private static HttpRequestDef<UpdateFlavorRequest, UpdateFlavorResponse> genForUpdateFlavor() {
        // basic
        HttpRequestDef.Builder<UpdateFlavorRequest, UpdateFlavorResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateFlavorRequest.class, UpdateFlavorResponse.class)
                .withName("UpdateFlavor")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/flavor")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFlavorRequest::getClusterId, UpdateFlavorRequest::setClusterId));
        builder.<UpdateFlavorReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFlavorReq.class),
            f -> f.withMarshaller(UpdateFlavorRequest::getBody, UpdateFlavorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlavorByTypeRequest, UpdateFlavorByTypeResponse> updateFlavorByType =
        genForUpdateFlavorByType();

    private static HttpRequestDef<UpdateFlavorByTypeRequest, UpdateFlavorByTypeResponse> genForUpdateFlavorByType() {
        // basic
        HttpRequestDef.Builder<UpdateFlavorByTypeRequest, UpdateFlavorByTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateFlavorByTypeRequest.class, UpdateFlavorByTypeResponse.class)
                .withName("UpdateFlavorByType")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/{types}/flavor")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFlavorByTypeRequest::getClusterId, UpdateFlavorByTypeRequest::setClusterId));
        builder.<String>withRequestField("types",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFlavorByTypeRequest::getTypes, UpdateFlavorByTypeRequest::setTypes));
        builder.<UpdateFlavorByTypeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFlavorByTypeReq.class),
            f -> f.withMarshaller(UpdateFlavorByTypeRequest::getBody, UpdateFlavorByTypeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> updateInstance =
        genForUpdateInstance();

    private static HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> genForUpdateInstance() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceRequest, UpdateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceRequest.class, UpdateInstanceResponse.class)
                .withName("UpdateInstance")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/instance/{instance_id}/replace")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getClusterId, UpdateInstanceRequest::setClusterId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getInstanceId, UpdateInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLogSettingRequest, UpdateLogSettingResponse> updateLogSetting =
        genForUpdateLogSetting();

    private static HttpRequestDef<UpdateLogSettingRequest, UpdateLogSettingResponse> genForUpdateLogSetting() {
        // basic
        HttpRequestDef.Builder<UpdateLogSettingRequest, UpdateLogSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateLogSettingRequest.class, UpdateLogSettingResponse.class)
                .withName("UpdateLogSetting")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/logs/settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLogSettingRequest::getClusterId, UpdateLogSettingRequest::setClusterId));
        builder.<UpdateLogSettingReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLogSettingReq.class),
            f -> f.withMarshaller(UpdateLogSettingRequest::getBody, UpdateLogSettingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateOndemandClusterToPeriodRequest, UpdateOndemandClusterToPeriodResponse> updateOndemandClusterToPeriod =
        genForUpdateOndemandClusterToPeriod();

    private static HttpRequestDef<UpdateOndemandClusterToPeriodRequest, UpdateOndemandClusterToPeriodResponse> genForUpdateOndemandClusterToPeriod() {
        // basic
        HttpRequestDef.Builder<UpdateOndemandClusterToPeriodRequest, UpdateOndemandClusterToPeriodResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateOndemandClusterToPeriodRequest.class,
                    UpdateOndemandClusterToPeriodResponse.class)
                .withName("UpdateOndemandClusterToPeriod")
                .withUri("/v1.0/{project_id}/cluster/{cluster_id}/period")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateOndemandClusterToPeriodRequest::getClusterId,
                UpdateOndemandClusterToPeriodRequest::setClusterId));
        builder.<PeriodReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PeriodReq.class),
            f -> f.withMarshaller(UpdateOndemandClusterToPeriodRequest::getBody,
                UpdateOndemandClusterToPeriodRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePublicBandWidthRequest, UpdatePublicBandWidthResponse> updatePublicBandWidth =
        genForUpdatePublicBandWidth();

    private static HttpRequestDef<UpdatePublicBandWidthRequest, UpdatePublicBandWidthResponse> genForUpdatePublicBandWidth() {
        // basic
        HttpRequestDef.Builder<UpdatePublicBandWidthRequest, UpdatePublicBandWidthResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdatePublicBandWidthRequest.class, UpdatePublicBandWidthResponse.class)
            .withName("UpdatePublicBandWidth")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/public/bandwidth")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePublicBandWidthRequest::getClusterId,
                UpdatePublicBandWidthRequest::setClusterId));
        builder.<BindPublicReqEipReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BindPublicReqEipReq.class),
            f -> f.withMarshaller(UpdatePublicBandWidthRequest::getBody, UpdatePublicBandWidthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateShrinkClusterRequest, UpdateShrinkClusterResponse> updateShrinkCluster =
        genForUpdateShrinkCluster();

    private static HttpRequestDef<UpdateShrinkClusterRequest, UpdateShrinkClusterResponse> genForUpdateShrinkCluster() {
        // basic
        HttpRequestDef.Builder<UpdateShrinkClusterRequest, UpdateShrinkClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateShrinkClusterRequest.class, UpdateShrinkClusterResponse.class)
                .withName("UpdateShrinkCluster")
                .withUri("/v1.0/extend/{project_id}/clusters/{cluster_id}/role/shrink")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateShrinkClusterRequest::getClusterId, UpdateShrinkClusterRequest::setClusterId));
        builder.<ShrinkClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShrinkClusterReq.class),
            f -> f.withMarshaller(UpdateShrinkClusterRequest::getBody, UpdateShrinkClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateShrinkNodesRequest, UpdateShrinkNodesResponse> updateShrinkNodes =
        genForUpdateShrinkNodes();

    private static HttpRequestDef<UpdateShrinkNodesRequest, UpdateShrinkNodesResponse> genForUpdateShrinkNodes() {
        // basic
        HttpRequestDef.Builder<UpdateShrinkNodesRequest, UpdateShrinkNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateShrinkNodesRequest.class, UpdateShrinkNodesResponse.class)
                .withName("UpdateShrinkNodes")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/node/offline")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateShrinkNodesRequest::getClusterId, UpdateShrinkNodesRequest::setClusterId));
        builder.<ShrinkNodesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShrinkNodesReq.class),
            f -> f.withMarshaller(UpdateShrinkNodesRequest::getBody, UpdateShrinkNodesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSnapshotSettingRequest, UpdateSnapshotSettingResponse> updateSnapshotSetting =
        genForUpdateSnapshotSetting();

    private static HttpRequestDef<UpdateSnapshotSettingRequest, UpdateSnapshotSettingResponse> genForUpdateSnapshotSetting() {
        // basic
        HttpRequestDef.Builder<UpdateSnapshotSettingRequest, UpdateSnapshotSettingResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateSnapshotSettingRequest.class, UpdateSnapshotSettingResponse.class)
            .withName("UpdateSnapshotSetting")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/index_snapshot/setting")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSnapshotSettingRequest::getClusterId,
                UpdateSnapshotSettingRequest::setClusterId));
        builder.<UpdateSnapshotSettingReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSnapshotSettingReq.class),
            f -> f.withMarshaller(UpdateSnapshotSettingRequest::getBody, UpdateSnapshotSettingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUnbindPublicRequest, UpdateUnbindPublicResponse> updateUnbindPublic =
        genForUpdateUnbindPublic();

    private static HttpRequestDef<UpdateUnbindPublicRequest, UpdateUnbindPublicResponse> genForUpdateUnbindPublic() {
        // basic
        HttpRequestDef.Builder<UpdateUnbindPublicRequest, UpdateUnbindPublicResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUnbindPublicRequest.class, UpdateUnbindPublicResponse.class)
                .withName("UpdateUnbindPublic")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/public/close")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUnbindPublicRequest::getClusterId, UpdateUnbindPublicRequest::setClusterId));
        builder.<UnBindPublicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnBindPublicReq.class),
            f -> f.withMarshaller(UpdateUnbindPublicRequest::getBody, UpdateUnbindPublicRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpcepConnectionRequest, UpdateVpcepConnectionResponse> updateVpcepConnection =
        genForUpdateVpcepConnection();

    private static HttpRequestDef<UpdateVpcepConnectionRequest, UpdateVpcepConnectionResponse> genForUpdateVpcepConnection() {
        // basic
        HttpRequestDef.Builder<UpdateVpcepConnectionRequest, UpdateVpcepConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateVpcepConnectionRequest.class, UpdateVpcepConnectionResponse.class)
            .withName("UpdateVpcepConnection")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/vpcepservice/connections")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpcepConnectionRequest::getClusterId,
                UpdateVpcepConnectionRequest::setClusterId));
        builder.<UpdateVpcepConnectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVpcepConnectionReq.class),
            f -> f.withMarshaller(UpdateVpcepConnectionRequest::getBody, UpdateVpcepConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpcepWhitelistRequest, UpdateVpcepWhitelistResponse> updateVpcepWhitelist =
        genForUpdateVpcepWhitelist();

    private static HttpRequestDef<UpdateVpcepWhitelistRequest, UpdateVpcepWhitelistResponse> genForUpdateVpcepWhitelist() {
        // basic
        HttpRequestDef.Builder<UpdateVpcepWhitelistRequest, UpdateVpcepWhitelistResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateVpcepWhitelistRequest.class, UpdateVpcepWhitelistResponse.class)
            .withName("UpdateVpcepWhitelist")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/vpcepservice/permissions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpcepWhitelistRequest::getClusterId,
                UpdateVpcepWhitelistRequest::setClusterId));
        builder.<UpdateVpcepWhitelistReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVpcepWhitelistReq.class),
            f -> f.withMarshaller(UpdateVpcepWhitelistRequest::getBody, UpdateVpcepWhitelistRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateYmlsRequest, UpdateYmlsResponse> updateYmls = genForUpdateYmls();

    private static HttpRequestDef<UpdateYmlsRequest, UpdateYmlsResponse> genForUpdateYmls() {
        // basic
        HttpRequestDef.Builder<UpdateYmlsRequest, UpdateYmlsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateYmlsRequest.class, UpdateYmlsResponse.class)
                .withName("UpdateYmls")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/ymls/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateYmlsRequest::getClusterId, UpdateYmlsRequest::setClusterId));
        builder.<UpdateYmlsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateYmlsReq.class),
            f -> f.withMarshaller(UpdateYmlsRequest::getBody, UpdateYmlsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeCoreRequest, UpgradeCoreResponse> upgradeCore = genForUpgradeCore();

    private static HttpRequestDef<UpgradeCoreRequest, UpgradeCoreResponse> genForUpgradeCore() {
        // basic
        HttpRequestDef.Builder<UpgradeCoreRequest, UpgradeCoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpgradeCoreRequest.class, UpgradeCoreResponse.class)
                .withName("UpgradeCore")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/inst-type/{inst_type}/image/upgrade")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeCoreRequest::getClusterId, UpgradeCoreRequest::setClusterId));
        builder.<String>withRequestField("inst_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeCoreRequest::getInstType, UpgradeCoreRequest::setInstType));
        builder.<UpgradingTheKernelBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradingTheKernelBody.class),
            f -> f.withMarshaller(UpgradeCoreRequest::getBody, UpgradeCoreRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeDetailRequest, UpgradeDetailResponse> upgradeDetail =
        genForUpgradeDetail();

    private static HttpRequestDef<UpgradeDetailRequest, UpgradeDetailResponse> genForUpgradeDetail() {
        // basic
        HttpRequestDef.Builder<UpgradeDetailRequest, UpgradeDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, UpgradeDetailRequest.class, UpgradeDetailResponse.class)
                .withName("UpgradeDetail")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/upgrade/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeDetailRequest::getClusterId, UpgradeDetailRequest::setClusterId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpgradeDetailRequest::getOffset, UpgradeDetailRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpgradeDetailRequest::getLimit, UpgradeDetailRequest::setLimit));
        builder.<String>withRequestField("action_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeDetailRequest::getActionMode, UpgradeDetailRequest::setActionMode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartKibanaPublicRequest, StartKibanaPublicResponse> startKibanaPublic =
        genForStartKibanaPublic();

    private static HttpRequestDef<StartKibanaPublicRequest, StartKibanaPublicResponse> genForStartKibanaPublic() {
        // basic
        HttpRequestDef.Builder<StartKibanaPublicRequest, StartKibanaPublicResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartKibanaPublicRequest.class, StartKibanaPublicResponse.class)
                .withName("StartKibanaPublic")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/publickibana/open")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartKibanaPublicRequest::getClusterId, StartKibanaPublicRequest::setClusterId));
        builder.<StartKibanaPublicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartKibanaPublicReq.class),
            f -> f.withMarshaller(StartKibanaPublicRequest::getBody, StartKibanaPublicRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopPublicKibanaWhitelistRequest, StopPublicKibanaWhitelistResponse> stopPublicKibanaWhitelist =
        genForStopPublicKibanaWhitelist();

    private static HttpRequestDef<StopPublicKibanaWhitelistRequest, StopPublicKibanaWhitelistResponse> genForStopPublicKibanaWhitelist() {
        // basic
        HttpRequestDef.Builder<StopPublicKibanaWhitelistRequest, StopPublicKibanaWhitelistResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    StopPublicKibanaWhitelistRequest.class,
                    StopPublicKibanaWhitelistResponse.class)
                .withName("StopPublicKibanaWhitelist")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/publickibana/whitelist/close")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopPublicKibanaWhitelistRequest::getClusterId,
                StopPublicKibanaWhitelistRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlterKibanaRequest, UpdateAlterKibanaResponse> updateAlterKibana =
        genForUpdateAlterKibana();

    private static HttpRequestDef<UpdateAlterKibanaRequest, UpdateAlterKibanaResponse> genForUpdateAlterKibana() {
        // basic
        HttpRequestDef.Builder<UpdateAlterKibanaRequest, UpdateAlterKibanaResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateAlterKibanaRequest.class, UpdateAlterKibanaResponse.class)
                .withName("UpdateAlterKibana")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/publickibana/bandwidth")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlterKibanaRequest::getClusterId, UpdateAlterKibanaRequest::setClusterId));
        builder.<UpdatePublicKibanaBandwidthReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePublicKibanaBandwidthReq.class),
            f -> f.withMarshaller(UpdateAlterKibanaRequest::getBody, UpdateAlterKibanaRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCloseKibanaRequest, UpdateCloseKibanaResponse> updateCloseKibana =
        genForUpdateCloseKibana();

    private static HttpRequestDef<UpdateCloseKibanaRequest, UpdateCloseKibanaResponse> genForUpdateCloseKibana() {
        // basic
        HttpRequestDef.Builder<UpdateCloseKibanaRequest, UpdateCloseKibanaResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCloseKibanaRequest.class, UpdateCloseKibanaResponse.class)
                .withName("UpdateCloseKibana")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/publickibana/close")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCloseKibanaRequest::getClusterId, UpdateCloseKibanaRequest::setClusterId));
        builder.<CloseKibanaPublicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CloseKibanaPublicReq.class),
            f -> f.withMarshaller(UpdateCloseKibanaRequest::getBody, UpdateCloseKibanaRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePublicKibanaWhitelistRequest, UpdatePublicKibanaWhitelistResponse> updatePublicKibanaWhitelist =
        genForUpdatePublicKibanaWhitelist();

    private static HttpRequestDef<UpdatePublicKibanaWhitelistRequest, UpdatePublicKibanaWhitelistResponse> genForUpdatePublicKibanaWhitelist() {
        // basic
        HttpRequestDef.Builder<UpdatePublicKibanaWhitelistRequest, UpdatePublicKibanaWhitelistResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdatePublicKibanaWhitelistRequest.class,
                    UpdatePublicKibanaWhitelistResponse.class)
                .withName("UpdatePublicKibanaWhitelist")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/publickibana/whitelist/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePublicKibanaWhitelistRequest::getClusterId,
                UpdatePublicKibanaWhitelistRequest::setClusterId));
        builder.<UpdatePublicKibanaWhitelistReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePublicKibanaWhitelistReq.class),
            f -> f.withMarshaller(UpdatePublicKibanaWhitelistRequest::getBody,
                UpdatePublicKibanaWhitelistRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddFavoriteRequest, AddFavoriteResponse> addFavorite = genForAddFavorite();

    private static HttpRequestDef<AddFavoriteRequest, AddFavoriteResponse> genForAddFavorite() {
        // basic
        HttpRequestDef.Builder<AddFavoriteRequest, AddFavoriteResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddFavoriteRequest.class, AddFavoriteResponse.class)
                .withName("AddFavorite")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/lgsconf/favorite")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddFavoriteRequest::getClusterId, AddFavoriteRequest::setClusterId));
        builder.<AddFavoriteReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddFavoriteReq.class),
            f -> f.withMarshaller(AddFavoriteRequest::getBody, AddFavoriteRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCnfRequest, CreateCnfResponse> createCnf = genForCreateCnf();

    private static HttpRequestDef<CreateCnfRequest, CreateCnfResponse> genForCreateCnf() {
        // basic
        HttpRequestDef.Builder<CreateCnfRequest, CreateCnfResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCnfRequest.class, CreateCnfResponse.class)
                .withName("CreateCnf")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/lgsconf/submit")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCnfRequest::getClusterId, CreateCnfRequest::setClusterId));
        builder.<CreateCnfReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCnfReq.class),
            f -> f.withMarshaller(CreateCnfRequest::getBody, CreateCnfRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConfRequest, DeleteConfResponse> deleteConf = genForDeleteConf();

    private static HttpRequestDef<DeleteConfRequest, DeleteConfResponse> genForDeleteConf() {
        // basic
        HttpRequestDef.Builder<DeleteConfRequest, DeleteConfResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteConfRequest.class, DeleteConfResponse.class)
                .withName("DeleteConf")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/lgsconf/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConfRequest::getClusterId, DeleteConfRequest::setClusterId));
        builder.<DeleteConfReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteConfReq.class),
            f -> f.withMarshaller(DeleteConfRequest::getBody, DeleteConfRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConfigRequest, DeleteConfigResponse> deleteConfig = genForDeleteConfig();

    private static HttpRequestDef<DeleteConfigRequest, DeleteConfigResponse> genForDeleteConfig() {
        // basic
        HttpRequestDef.Builder<DeleteConfigRequest, DeleteConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteConfigRequest.class, DeleteConfigResponse.class)
                .withName("DeleteConfig")
                .withUri("/v2.0/{project_id}/clusters/{cluster_id}/lgsconf/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConfigRequest::getClusterId, DeleteConfigRequest::setClusterId));
        builder.<DeleteConfReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteConfReq.class),
            f -> f.withMarshaller(DeleteConfigRequest::getBody, DeleteConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplate =
        genForDeleteTemplate();

    private static HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> genForDeleteTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateRequest, DeleteTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplateRequest.class, DeleteTemplateResponse.class)
                .withName("DeleteTemplate")
                .withUri("/v1.0/{project_id}/lgsconf/deletetemplate")
                .withContentType("application/json");

        // requests
        builder.<DeleteTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTemplateReq.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getBody, DeleteTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListActionsRequest, ListActionsResponse> listActions = genForListActions();

    private static HttpRequestDef<ListActionsRequest, ListActionsResponse> genForListActions() {
        // basic
        HttpRequestDef.Builder<ListActionsRequest, ListActionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListActionsRequest.class, ListActionsResponse.class)
                .withName("ListActions")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/lgsconf/listactions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActionsRequest::getClusterId, ListActionsRequest::setClusterId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActionsRequest::getOffset, ListActionsRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActionsRequest::getLimit, ListActionsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertsRequest, ListCertsResponse> listCerts = genForListCerts();

    private static HttpRequestDef<ListCertsRequest, ListCertsResponse> genForListCerts() {
        // basic
        HttpRequestDef.Builder<ListCertsRequest, ListCertsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertsRequest.class, ListCertsResponse.class)
                .withName("ListCerts")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/certs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertsRequest::getClusterId, ListCertsRequest::setClusterId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertsRequest::getOffset, ListCertsRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertsRequest::getLimit, ListCertsRequest::setLimit));
        builder.<String>withRequestField("certsType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertsRequest::getCertsType, ListCertsRequest::setCertsType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfsRequest, ListConfsResponse> listConfs = genForListConfs();

    private static HttpRequestDef<ListConfsRequest, ListConfsResponse> genForListConfs() {
        // basic
        HttpRequestDef.Builder<ListConfsRequest, ListConfsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConfsRequest.class, ListConfsResponse.class)
                .withName("ListConfs")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/lgsconf/listconfs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfsRequest::getClusterId, ListConfsRequest::setClusterId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfsRequest::getOffset, ListConfsRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfsRequest::getLimit, ListConfsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPipelinesRequest, ListPipelinesResponse> listPipelines =
        genForListPipelines();

    private static HttpRequestDef<ListPipelinesRequest, ListPipelinesResponse> genForListPipelines() {
        // basic
        HttpRequestDef.Builder<ListPipelinesRequest, ListPipelinesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPipelinesRequest.class, ListPipelinesResponse.class)
                .withName("ListPipelines")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/lgsconf/listpipelines")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipelinesRequest::getClusterId, ListPipelinesRequest::setClusterId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipelinesRequest::getOffset, ListPipelinesRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipelinesRequest::getLimit, ListPipelinesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> listTemplates =
        genForListTemplates();

    private static HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> genForListTemplates() {
        // basic
        HttpRequestDef.Builder<ListTemplatesRequest, ListTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplatesRequest.class, ListTemplatesResponse.class)
                .withName("ListTemplates")
                .withUri("/v1.0/{project_id}/lgsconf/template")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getType, ListTemplatesRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGetConfDetailRequest, ShowGetConfDetailResponse> showGetConfDetail =
        genForShowGetConfDetail();

    private static HttpRequestDef<ShowGetConfDetailRequest, ShowGetConfDetailResponse> genForShowGetConfDetail() {
        // basic
        HttpRequestDef.Builder<ShowGetConfDetailRequest, ShowGetConfDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGetConfDetailRequest.class, ShowGetConfDetailResponse.class)
                .withName("ShowGetConfDetail")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/lgsconf/confdetail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetConfDetailRequest::getClusterId, ShowGetConfDetailRequest::setClusterId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetConfDetailRequest::getName, ShowGetConfDetailRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartConnectivityTestRequest, StartConnectivityTestResponse> startConnectivityTest =
        genForStartConnectivityTest();

    private static HttpRequestDef<StartConnectivityTestRequest, StartConnectivityTestResponse> genForStartConnectivityTest() {
        // basic
        HttpRequestDef.Builder<StartConnectivityTestRequest, StartConnectivityTestResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, StartConnectivityTestRequest.class, StartConnectivityTestResponse.class)
            .withName("StartConnectivityTest")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/checkconnection")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartConnectivityTestRequest::getClusterId,
                StartConnectivityTestRequest::setClusterId));
        builder.<StartConnectivityTestReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartConnectivityTestReq.class),
            f -> f.withMarshaller(StartConnectivityTestRequest::getBody, StartConnectivityTestRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartPipelineRequest, StartPipelineResponse> startPipeline =
        genForStartPipeline();

    private static HttpRequestDef<StartPipelineRequest, StartPipelineResponse> genForStartPipeline() {
        // basic
        HttpRequestDef.Builder<StartPipelineRequest, StartPipelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartPipelineRequest.class, StartPipelineResponse.class)
                .withName("StartPipeline")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/lgsconf/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartPipelineRequest::getClusterId, StartPipelineRequest::setClusterId));
        builder.<StartPipelineReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartPipelineReq.class),
            f -> f.withMarshaller(StartPipelineRequest::getBody, StartPipelineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopHotPipelineRequest, StopHotPipelineResponse> stopHotPipeline =
        genForStopHotPipeline();

    private static HttpRequestDef<StopHotPipelineRequest, StopHotPipelineResponse> genForStopHotPipeline() {
        // basic
        HttpRequestDef.Builder<StopHotPipelineRequest, StopHotPipelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopHotPipelineRequest.class, StopHotPipelineResponse.class)
                .withName("StopHotPipeline")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/lgsconf/hot-stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopHotPipelineRequest::getClusterId, StopHotPipelineRequest::setClusterId));
        builder.<StopHotPipelineRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StopHotPipelineRequestBody.class),
            f -> f.withMarshaller(StopHotPipelineRequest::getBody, StopHotPipelineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopPipelineRequest, StopPipelineResponse> stopPipeline = genForStopPipeline();

    private static HttpRequestDef<StopPipelineRequest, StopPipelineResponse> genForStopPipeline() {
        // basic
        HttpRequestDef.Builder<StopPipelineRequest, StopPipelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopPipelineRequest.class, StopPipelineResponse.class)
                .withName("StopPipeline")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/lgsconf/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopPipelineRequest::getClusterId, StopPipelineRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCnfRequest, UpdateCnfResponse> updateCnf = genForUpdateCnf();

    private static HttpRequestDef<UpdateCnfRequest, UpdateCnfResponse> genForUpdateCnf() {
        // basic
        HttpRequestDef.Builder<UpdateCnfRequest, UpdateCnfResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateCnfRequest.class, UpdateCnfResponse.class)
                .withName("UpdateCnf")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/lgsconf/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCnfRequest::getClusterId, UpdateCnfRequest::setClusterId));
        builder.<CreateCnfReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCnfReq.class),
            f -> f.withMarshaller(UpdateCnfRequest::getBody, UpdateCnfRequest::setBody));

        // response

        return builder.build();
    }

}
