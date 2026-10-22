package com.huaweicloud.sdk.aidatalake.v2;

import com.huaweicloud.sdk.aidatalake.v2.model.AddV2TenantImageVersionRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.AddV2TenantImageVersionResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.AttachV2AgencyPolicyRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.AttachV2AgencyPolicyRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.AttachV2AgencyPolicyResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.AuraStatementOperatorMetrics;
import com.huaweicloud.sdk.aidatalake.v2.model.BatchCreateV2ResourceTagsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.BatchCreateV2ResourceTagsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.BatchDeleteV2ResourceTagsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.BatchDeleteV2ResourceTagsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelAuraDataframeJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelAuraDataframeJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelAuraSqlStatementRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelAuraSqlStatementResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelFlinkJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelFlinkJobRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelFlinkJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelRayJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelRayJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelSparkJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelSparkJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelSparkSqlRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelSparkSqlResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CloseAuraSqlSessionRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CloseAuraSqlSessionResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CloseRaySessionRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CloseRaySessionResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CountV2TagResourcesRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CountV2TagResourcesResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateAuraDataframeJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateAuraDataframeJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateAuraSqlSessionRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateAuraSqlSessionResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateDataframeJobRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateFlinkSavepointRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateFlinkSavepointRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateFlinkSavepointResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateImageSnapshotRequestInput;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateRaySessionRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateRaySessionRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateRaySessionResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateSessionRequestBodyV2;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateV2AgencyRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateV2AgencyRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateV2AgencyResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateV2ComputeRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateV2ComputeRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateV2ComputeResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateV2EndpointRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateV2EndpointRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateV2EndpointResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateV2NetworkRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateV2NetworkRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateV2NetworkResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateV2RayFederationRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateV2RayFederationRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateV2RayFederationResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateV2TenantImageSnapshotRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateV2TenantImageSnapshotResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateV2WorkspaceRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateV2WorkspaceRequestInput;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateV2WorkspaceResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteFlinkSavepointRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteFlinkSavepointResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteV2AgencyRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteV2AgencyResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteV2AgreementRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteV2AgreementResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteV2ComputeRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteV2ComputeResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteV2EndpointRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteV2EndpointResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteV2RayFederationRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteV2RayFederationResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteV2TenantImageRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteV2TenantImageResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteV2TenantImageSnapshotRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteV2TenantImageSnapshotResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteV2TenantImageVersionRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteV2TenantImageVersionResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteV2WorkspaceRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteV2WorkspaceResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.DetachV2AgencyPolicyRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.DetachV2AgencyPolicyResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.EngineType;
import com.huaweicloud.sdk.aidatalake.v2.model.ExecuteAuraSqlStatementRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ExecuteAuraSqlStatementResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.FlinkJobState;
import com.huaweicloud.sdk.aidatalake.v2.model.ImageSnapshotStatus;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraDataframeJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraDataframeJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraSessionStatementRecordsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraSessionStatementRecordsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraSqlSessionsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraSqlSessionsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraStatementRecordsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraStatementRecordsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkJobAutoscalingHistoriesRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkJobAutoscalingHistoriesResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkJobEventsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkJobEventsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkJobsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkJobsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkSavepointRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkSavepointResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListRayJobsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListRayJobsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListSparkJobsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListSparkJobsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListSparkSqlsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListSparkSqlsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2AgreementRuleRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2AgreementRuleResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2AllEndpointsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2AllEndpointsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2ComputeVersionsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2ComputeVersionsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2ComputesRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2ComputesResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2EndpointsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2EndpointsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2NetworksRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2NetworksResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2ProjectTagsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2ProjectTagsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2RayFederationsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2RayFederationsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2ResourceTagsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2ResourceTagsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2TagResourcesRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2TagResourcesResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2TenantImageSnapshotsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2TenantImageSnapshotsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2TenantImageVersionsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2TenantImageVersionsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2TenantImagesRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2TenantImagesResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2WorkspacesRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListV2WorkspacesResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.PreviewSparkSqlResultRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.PreviewSparkSqlResultResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.RegisterV2ImageRequestInput;
import com.huaweicloud.sdk.aidatalake.v2.model.RegisterV2TenantImageRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.RegisterV2TenantImageResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ResourceLimit;
import com.huaweicloud.sdk.aidatalake.v2.model.RestartSparkSqlClusterRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.RestartSparkSqlClusterRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.RestartSparkSqlClusterResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.RunFlinkJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.RunFlinkJobRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.RunFlinkJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.RunRayJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.RunRayJobRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.RunRayJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.RunSparkJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.RunSparkJobRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.RunSparkJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.RunSparkSqlRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.RunSparkSqlRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.RunSparkSqlResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraDataframeJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraDataframeJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraSqlSessionRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraSqlSessionResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraSqlStatementResultRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraSqlStatementResultResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraStatementOperatorMetricsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraStatementOperatorMetricsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraStatementQueryMetricsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraStatementQueryMetricsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkJobAutoscalingPolicyRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkJobAutoscalingPolicyResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkJobStateRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkJobStateResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkSavepointRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkSavepointResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowRayJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowRayJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkJobStateRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkJobStateResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkOperatorStateRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkOperatorStateResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkSqlRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkSqlResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkSqlStateRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkSqlStateResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2AgencyRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2AgencyResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2AgreementRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2AgreementResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2ComputeRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2ComputeResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2ComputesMetricsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2ComputesMetricsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2EndpointRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2EndpointResourceLimitRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2EndpointResourceLimitResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2EndpointResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2EndpointsMetricsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2EndpointsMetricsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2RayFederationRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2RayFederationResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2TenantImageRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2TenantImageResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2TenantImageVersionRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2TenantImageVersionResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2WorkspaceRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowV2WorkspaceResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.SignV2AgreementRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.SignV2AgreementRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.SignV2AgreementResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.StatementExecuteRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.StatementQueryMetrics;
import com.huaweicloud.sdk.aidatalake.v2.model.TagResourceType;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateFlinkJobAutoscalingPolicyRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateFlinkJobAutoscalingPolicyResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateFlinkJobAutoscalingRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateV2ComputeRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateV2ComputeRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateV2ComputeResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateV2EndpointRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateV2EndpointRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateV2EndpointResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateV2ImageVersionInput;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateV2RayFederationRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateV2RayFederationRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateV2RayFederationResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateV2TenantImageVersionRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateV2TenantImageVersionResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateV2WorkspaceRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateV2WorkspaceRequestInput;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateV2WorkspaceResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.V2BatchCreateTagsRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.V2BatchDeleteTagsRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.V2ListTagResourcesRequestBody;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class AIDataLakeMeta {

    public static final HttpRequestDef<AddV2TenantImageVersionRequest, AddV2TenantImageVersionResponse> addV2TenantImageVersion =
        genForAddV2TenantImageVersion();

    private static HttpRequestDef<AddV2TenantImageVersionRequest, AddV2TenantImageVersionResponse> genForAddV2TenantImageVersion() {
        // basic
        HttpRequestDef.Builder<AddV2TenantImageVersionRequest, AddV2TenantImageVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddV2TenantImageVersionRequest.class, AddV2TenantImageVersionResponse.class)
            .withName("AddV2TenantImageVersion")
            .withUri("/v2/images/{image_id}/versions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddV2TenantImageVersionRequest::getImageId,
                AddV2TenantImageVersionRequest::setImageId));
        builder.<RegisterV2ImageRequestInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RegisterV2ImageRequestInput.class),
            f -> f.withMarshaller(AddV2TenantImageVersionRequest::getBody, AddV2TenantImageVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachV2AgencyPolicyRequest, AttachV2AgencyPolicyResponse> attachV2AgencyPolicy =
        genForAttachV2AgencyPolicy();

    private static HttpRequestDef<AttachV2AgencyPolicyRequest, AttachV2AgencyPolicyResponse> genForAttachV2AgencyPolicy() {
        // basic
        HttpRequestDef.Builder<AttachV2AgencyPolicyRequest, AttachV2AgencyPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AttachV2AgencyPolicyRequest.class, AttachV2AgencyPolicyResponse.class)
            .withName("AttachV2AgencyPolicy")
            .withUri("/v2/agencies/{agency_name}/policies")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agency_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachV2AgencyPolicyRequest::getAgencyName,
                AttachV2AgencyPolicyRequest::setAgencyName));
        builder.<AttachV2AgencyPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AttachV2AgencyPolicyRequestBody.class),
            f -> f.withMarshaller(AttachV2AgencyPolicyRequest::getBody, AttachV2AgencyPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateV2AgencyRequest, CreateV2AgencyResponse> createV2Agency =
        genForCreateV2Agency();

    private static HttpRequestDef<CreateV2AgencyRequest, CreateV2AgencyResponse> genForCreateV2Agency() {
        // basic
        HttpRequestDef.Builder<CreateV2AgencyRequest, CreateV2AgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateV2AgencyRequest.class, CreateV2AgencyResponse.class)
                .withName("CreateV2Agency")
                .withUri("/v2/agencies")
                .withContentType("application/json");

        // requests
        builder.<CreateV2AgencyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateV2AgencyRequestBody.class),
            f -> f.withMarshaller(CreateV2AgencyRequest::getBody, CreateV2AgencyRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateV2AgencyResponse::getXRequestId, CreateV2AgencyResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateV2ComputeRequest, CreateV2ComputeResponse> createV2Compute =
        genForCreateV2Compute();

    private static HttpRequestDef<CreateV2ComputeRequest, CreateV2ComputeResponse> genForCreateV2Compute() {
        // basic
        HttpRequestDef.Builder<CreateV2ComputeRequest, CreateV2ComputeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateV2ComputeRequest.class, CreateV2ComputeResponse.class)
                .withName("CreateV2Compute")
                .withUri("/v2/workspaces/{workspace_id}/computes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateV2ComputeRequest::getWorkspaceId, CreateV2ComputeRequest::setWorkspaceId));
        builder.<CreateV2ComputeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateV2ComputeRequestBody.class),
            f -> f.withMarshaller(CreateV2ComputeRequest::getBody, CreateV2ComputeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateV2EndpointRequest, CreateV2EndpointResponse> createV2Endpoint =
        genForCreateV2Endpoint();

    private static HttpRequestDef<CreateV2EndpointRequest, CreateV2EndpointResponse> genForCreateV2Endpoint() {
        // basic
        HttpRequestDef.Builder<CreateV2EndpointRequest, CreateV2EndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateV2EndpointRequest.class, CreateV2EndpointResponse.class)
                .withName("CreateV2Endpoint")
                .withUri("/v2/workspaces/{workspace_id}/endpoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateV2EndpointRequest::getWorkspaceId, CreateV2EndpointRequest::setWorkspaceId));
        builder.<CreateV2EndpointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateV2EndpointRequestBody.class),
            f -> f.withMarshaller(CreateV2EndpointRequest::getBody, CreateV2EndpointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateV2NetworkRequest, CreateV2NetworkResponse> createV2Network =
        genForCreateV2Network();

    private static HttpRequestDef<CreateV2NetworkRequest, CreateV2NetworkResponse> genForCreateV2Network() {
        // basic
        HttpRequestDef.Builder<CreateV2NetworkRequest, CreateV2NetworkResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateV2NetworkRequest.class, CreateV2NetworkResponse.class)
                .withName("CreateV2Network")
                .withUri("/v2/workspaces/{workspace_id}/networks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateV2NetworkRequest::getWorkspaceId, CreateV2NetworkRequest::setWorkspaceId));
        builder.<CreateV2NetworkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateV2NetworkRequestBody.class),
            f -> f.withMarshaller(CreateV2NetworkRequest::getBody, CreateV2NetworkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateV2TenantImageSnapshotRequest, CreateV2TenantImageSnapshotResponse> createV2TenantImageSnapshot =
        genForCreateV2TenantImageSnapshot();

    private static HttpRequestDef<CreateV2TenantImageSnapshotRequest, CreateV2TenantImageSnapshotResponse> genForCreateV2TenantImageSnapshot() {
        // basic
        HttpRequestDef.Builder<CreateV2TenantImageSnapshotRequest, CreateV2TenantImageSnapshotResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateV2TenantImageSnapshotRequest.class,
                    CreateV2TenantImageSnapshotResponse.class)
                .withName("CreateV2TenantImageSnapshot")
                .withUri("/v2/images/{image_id}/versions/{version_id}/image-snapshots")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateV2TenantImageSnapshotRequest::getImageId,
                CreateV2TenantImageSnapshotRequest::setImageId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateV2TenantImageSnapshotRequest::getVersionId,
                CreateV2TenantImageSnapshotRequest::setVersionId));
        builder.<CreateImageSnapshotRequestInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateImageSnapshotRequestInput.class),
            f -> f.withMarshaller(CreateV2TenantImageSnapshotRequest::getBody,
                CreateV2TenantImageSnapshotRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateV2WorkspaceRequest, CreateV2WorkspaceResponse> createV2Workspace =
        genForCreateV2Workspace();

    private static HttpRequestDef<CreateV2WorkspaceRequest, CreateV2WorkspaceResponse> genForCreateV2Workspace() {
        // basic
        HttpRequestDef.Builder<CreateV2WorkspaceRequest, CreateV2WorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateV2WorkspaceRequest.class, CreateV2WorkspaceResponse.class)
                .withName("CreateV2Workspace")
                .withUri("/v2/workspaces")
                .withContentType("application/json");

        // requests
        builder.<CreateV2WorkspaceRequestInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateV2WorkspaceRequestInput.class),
            f -> f.withMarshaller(CreateV2WorkspaceRequest::getBody, CreateV2WorkspaceRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateV2WorkspaceResponse::getXRequestId, CreateV2WorkspaceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteV2AgencyRequest, DeleteV2AgencyResponse> deleteV2Agency =
        genForDeleteV2Agency();

    private static HttpRequestDef<DeleteV2AgencyRequest, DeleteV2AgencyResponse> genForDeleteV2Agency() {
        // basic
        HttpRequestDef.Builder<DeleteV2AgencyRequest, DeleteV2AgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteV2AgencyRequest.class, DeleteV2AgencyResponse.class)
                .withName("DeleteV2Agency")
                .withUri("/v2/agencies/{agency_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agency_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2AgencyRequest::getAgencyName, DeleteV2AgencyRequest::setAgencyName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteV2AgreementRequest, DeleteV2AgreementResponse> deleteV2Agreement =
        genForDeleteV2Agreement();

    private static HttpRequestDef<DeleteV2AgreementRequest, DeleteV2AgreementResponse> genForDeleteV2Agreement() {
        // basic
        HttpRequestDef.Builder<DeleteV2AgreementRequest, DeleteV2AgreementResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteV2AgreementRequest.class, DeleteV2AgreementResponse.class)
                .withName("DeleteV2Agreement")
                .withUri("/v2/agreement")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteV2ComputeRequest, DeleteV2ComputeResponse> deleteV2Compute =
        genForDeleteV2Compute();

    private static HttpRequestDef<DeleteV2ComputeRequest, DeleteV2ComputeResponse> genForDeleteV2Compute() {
        // basic
        HttpRequestDef.Builder<DeleteV2ComputeRequest, DeleteV2ComputeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteV2ComputeRequest.class, DeleteV2ComputeResponse.class)
                .withName("DeleteV2Compute")
                .withUri("/v2/workspaces/{workspace_id}/computes/{compute_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2ComputeRequest::getWorkspaceId, DeleteV2ComputeRequest::setWorkspaceId));
        builder.<String>withRequestField("compute_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2ComputeRequest::getComputeId, DeleteV2ComputeRequest::setComputeId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteV2ComputeResponse::getXRequestId, DeleteV2ComputeResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteV2EndpointRequest, DeleteV2EndpointResponse> deleteV2Endpoint =
        genForDeleteV2Endpoint();

    private static HttpRequestDef<DeleteV2EndpointRequest, DeleteV2EndpointResponse> genForDeleteV2Endpoint() {
        // basic
        HttpRequestDef.Builder<DeleteV2EndpointRequest, DeleteV2EndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteV2EndpointRequest.class, DeleteV2EndpointResponse.class)
                .withName("DeleteV2Endpoint")
                .withUri("/v2/workspaces/{workspace_id}/endpoints/{endpoint_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2EndpointRequest::getWorkspaceId, DeleteV2EndpointRequest::setWorkspaceId));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2EndpointRequest::getEndpointId, DeleteV2EndpointRequest::setEndpointId));
        builder.<Boolean>withRequestField("force",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteV2EndpointRequest::getForce, DeleteV2EndpointRequest::setForce));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteV2EndpointResponse::getXRequestId, DeleteV2EndpointResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteV2TenantImageRequest, DeleteV2TenantImageResponse> deleteV2TenantImage =
        genForDeleteV2TenantImage();

    private static HttpRequestDef<DeleteV2TenantImageRequest, DeleteV2TenantImageResponse> genForDeleteV2TenantImage() {
        // basic
        HttpRequestDef.Builder<DeleteV2TenantImageRequest, DeleteV2TenantImageResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteV2TenantImageRequest.class, DeleteV2TenantImageResponse.class)
            .withName("DeleteV2TenantImage")
            .withUri("/v2/images/{image_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2TenantImageRequest::getImageId, DeleteV2TenantImageRequest::setImageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteV2TenantImageSnapshotRequest, DeleteV2TenantImageSnapshotResponse> deleteV2TenantImageSnapshot =
        genForDeleteV2TenantImageSnapshot();

    private static HttpRequestDef<DeleteV2TenantImageSnapshotRequest, DeleteV2TenantImageSnapshotResponse> genForDeleteV2TenantImageSnapshot() {
        // basic
        HttpRequestDef.Builder<DeleteV2TenantImageSnapshotRequest, DeleteV2TenantImageSnapshotResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteV2TenantImageSnapshotRequest.class,
                    DeleteV2TenantImageSnapshotResponse.class)
                .withName("DeleteV2TenantImageSnapshot")
                .withUri("/v2/images/{image_id}/versions/{version_id}/image-snapshots/{image_snapshot_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2TenantImageSnapshotRequest::getImageId,
                DeleteV2TenantImageSnapshotRequest::setImageId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2TenantImageSnapshotRequest::getVersionId,
                DeleteV2TenantImageSnapshotRequest::setVersionId));
        builder.<String>withRequestField("image_snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2TenantImageSnapshotRequest::getImageSnapshotId,
                DeleteV2TenantImageSnapshotRequest::setImageSnapshotId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteV2TenantImageVersionRequest, DeleteV2TenantImageVersionResponse> deleteV2TenantImageVersion =
        genForDeleteV2TenantImageVersion();

    private static HttpRequestDef<DeleteV2TenantImageVersionRequest, DeleteV2TenantImageVersionResponse> genForDeleteV2TenantImageVersion() {
        // basic
        HttpRequestDef.Builder<DeleteV2TenantImageVersionRequest, DeleteV2TenantImageVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteV2TenantImageVersionRequest.class,
                    DeleteV2TenantImageVersionResponse.class)
                .withName("DeleteV2TenantImageVersion")
                .withUri("/v2/images/{image_id}/versions/{version_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2TenantImageVersionRequest::getImageId,
                DeleteV2TenantImageVersionRequest::setImageId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2TenantImageVersionRequest::getVersionId,
                DeleteV2TenantImageVersionRequest::setVersionId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteV2TenantImageVersionResponse::getXRequestId,
                DeleteV2TenantImageVersionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteV2WorkspaceRequest, DeleteV2WorkspaceResponse> deleteV2Workspace =
        genForDeleteV2Workspace();

    private static HttpRequestDef<DeleteV2WorkspaceRequest, DeleteV2WorkspaceResponse> genForDeleteV2Workspace() {
        // basic
        HttpRequestDef.Builder<DeleteV2WorkspaceRequest, DeleteV2WorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteV2WorkspaceRequest.class, DeleteV2WorkspaceResponse.class)
                .withName("DeleteV2Workspace")
                .withUri("/v2/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2WorkspaceRequest::getWorkspaceId, DeleteV2WorkspaceRequest::setWorkspaceId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteV2WorkspaceResponse::getXRequestId, DeleteV2WorkspaceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetachV2AgencyPolicyRequest, DetachV2AgencyPolicyResponse> detachV2AgencyPolicy =
        genForDetachV2AgencyPolicy();

    private static HttpRequestDef<DetachV2AgencyPolicyRequest, DetachV2AgencyPolicyResponse> genForDetachV2AgencyPolicy() {
        // basic
        HttpRequestDef.Builder<DetachV2AgencyPolicyRequest, DetachV2AgencyPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DetachV2AgencyPolicyRequest.class, DetachV2AgencyPolicyResponse.class)
            .withName("DetachV2AgencyPolicy")
            .withUri("/v2/agencies/{agency_name}/policies/{policy_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agency_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachV2AgencyPolicyRequest::getAgencyName,
                DetachV2AgencyPolicyRequest::setAgencyName));
        builder.<DetachV2AgencyPolicyRequest.PolicyNameEnum>withRequestField("policy_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetachV2AgencyPolicyRequest.PolicyNameEnum.class),
            f -> f.withMarshaller(DetachV2AgencyPolicyRequest::getPolicyName,
                DetachV2AgencyPolicyRequest::setPolicyName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListV2AgreementRuleRequest, ListV2AgreementRuleResponse> listV2AgreementRule =
        genForListV2AgreementRule();

    private static HttpRequestDef<ListV2AgreementRuleRequest, ListV2AgreementRuleResponse> genForListV2AgreementRule() {
        // basic
        HttpRequestDef.Builder<ListV2AgreementRuleRequest, ListV2AgreementRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListV2AgreementRuleRequest.class, ListV2AgreementRuleResponse.class)
                .withName("ListV2AgreementRule")
                .withUri("/v2/agreement/rules")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListV2AllEndpointsRequest, ListV2AllEndpointsResponse> listV2AllEndpoints =
        genForListV2AllEndpoints();

    private static HttpRequestDef<ListV2AllEndpointsRequest, ListV2AllEndpointsResponse> genForListV2AllEndpoints() {
        // basic
        HttpRequestDef.Builder<ListV2AllEndpointsRequest, ListV2AllEndpointsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListV2AllEndpointsRequest.class, ListV2AllEndpointsResponse.class)
                .withName("ListV2AllEndpoints")
                .withUri("/v2/endpoints")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2AllEndpointsRequest::getOffset, ListV2AllEndpointsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2AllEndpointsRequest::getLimit, ListV2AllEndpointsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2AllEndpointsRequest::getName, ListV2AllEndpointsRequest::setName));
        builder.<List<EngineType>>withRequestField("engine_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListV2AllEndpointsRequest::getEngineTypes,
                ListV2AllEndpointsRequest::setEngineTypes));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListV2AllEndpointsRequest::getTags, ListV2AllEndpointsRequest::setTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListV2ComputeVersionsRequest, ListV2ComputeVersionsResponse> listV2ComputeVersions =
        genForListV2ComputeVersions();

    private static HttpRequestDef<ListV2ComputeVersionsRequest, ListV2ComputeVersionsResponse> genForListV2ComputeVersions() {
        // basic
        HttpRequestDef.Builder<ListV2ComputeVersionsRequest, ListV2ComputeVersionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListV2ComputeVersionsRequest.class, ListV2ComputeVersionsResponse.class)
            .withName("ListV2ComputeVersions")
            .withUri("/v2/workspaces/{workspace_id}/computes/versions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2ComputeVersionsRequest::getWorkspaceId,
                ListV2ComputeVersionsRequest::setWorkspaceId));
        builder.<String>withRequestField("compute_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2ComputeVersionsRequest::getComputeId,
                ListV2ComputeVersionsRequest::setComputeId));
        builder.<ListV2ComputeVersionsRequest.OperationResultEnum>withRequestField("operation_result",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListV2ComputeVersionsRequest.OperationResultEnum.class),
            f -> f.withMarshaller(ListV2ComputeVersionsRequest::getOperationResult,
                ListV2ComputeVersionsRequest::setOperationResult));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2ComputeVersionsRequest::getOffset, ListV2ComputeVersionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2ComputeVersionsRequest::getLimit, ListV2ComputeVersionsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListV2ComputesRequest, ListV2ComputesResponse> listV2Computes =
        genForListV2Computes();

    private static HttpRequestDef<ListV2ComputesRequest, ListV2ComputesResponse> genForListV2Computes() {
        // basic
        HttpRequestDef.Builder<ListV2ComputesRequest, ListV2ComputesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListV2ComputesRequest.class, ListV2ComputesResponse.class)
                .withName("ListV2Computes")
                .withUri("/v2/workspaces/{workspace_id}/computes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2ComputesRequest::getWorkspaceId, ListV2ComputesRequest::setWorkspaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2ComputesRequest::getOffset, ListV2ComputesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2ComputesRequest::getLimit, ListV2ComputesRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2ComputesRequest::getName, ListV2ComputesRequest::setName));
        builder.<String>withRequestField("compute_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2ComputesRequest::getComputeId, ListV2ComputesRequest::setComputeId));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListV2ComputesRequest::getTags, ListV2ComputesRequest::setTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListV2EndpointsRequest, ListV2EndpointsResponse> listV2Endpoints =
        genForListV2Endpoints();

    private static HttpRequestDef<ListV2EndpointsRequest, ListV2EndpointsResponse> genForListV2Endpoints() {
        // basic
        HttpRequestDef.Builder<ListV2EndpointsRequest, ListV2EndpointsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListV2EndpointsRequest.class, ListV2EndpointsResponse.class)
                .withName("ListV2Endpoints")
                .withUri("/v2/workspaces/{workspace_id}/endpoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2EndpointsRequest::getWorkspaceId, ListV2EndpointsRequest::setWorkspaceId));
        builder.<List<EngineType>>withRequestField("engine_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListV2EndpointsRequest::getEngineTypes, ListV2EndpointsRequest::setEngineTypes));
        builder.<String>withRequestField("compute_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2EndpointsRequest::getComputeId, ListV2EndpointsRequest::setComputeId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2EndpointsRequest::getOffset, ListV2EndpointsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2EndpointsRequest::getLimit, ListV2EndpointsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2EndpointsRequest::getName, ListV2EndpointsRequest::setName));
        builder.<String>withRequestField("storage_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2EndpointsRequest::getStorageId, ListV2EndpointsRequest::setStorageId));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListV2EndpointsRequest::getTags, ListV2EndpointsRequest::setTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListV2NetworksRequest, ListV2NetworksResponse> listV2Networks =
        genForListV2Networks();

    private static HttpRequestDef<ListV2NetworksRequest, ListV2NetworksResponse> genForListV2Networks() {
        // basic
        HttpRequestDef.Builder<ListV2NetworksRequest, ListV2NetworksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListV2NetworksRequest.class, ListV2NetworksResponse.class)
                .withName("ListV2Networks")
                .withUri("/v2/workspaces/{workspace_id}/networks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2NetworksRequest::getWorkspaceId, ListV2NetworksRequest::setWorkspaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2NetworksRequest::getOffset, ListV2NetworksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2NetworksRequest::getLimit, ListV2NetworksRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListV2TenantImageSnapshotsRequest, ListV2TenantImageSnapshotsResponse> listV2TenantImageSnapshots =
        genForListV2TenantImageSnapshots();

    private static HttpRequestDef<ListV2TenantImageSnapshotsRequest, ListV2TenantImageSnapshotsResponse> genForListV2TenantImageSnapshots() {
        // basic
        HttpRequestDef.Builder<ListV2TenantImageSnapshotsRequest, ListV2TenantImageSnapshotsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListV2TenantImageSnapshotsRequest.class,
                    ListV2TenantImageSnapshotsResponse.class)
                .withName("ListV2TenantImageSnapshots")
                .withUri("/v2/image-snapshots")
                .withContentType("application/json");

        // requests
        builder.<ImageSnapshotStatus>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ImageSnapshotStatus.class),
            f -> f.withMarshaller(ListV2TenantImageSnapshotsRequest::getStatus,
                ListV2TenantImageSnapshotsRequest::setStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2TenantImageSnapshotsRequest::getOffset,
                ListV2TenantImageSnapshotsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2TenantImageSnapshotsRequest::getLimit,
                ListV2TenantImageSnapshotsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListV2TenantImageVersionsRequest, ListV2TenantImageVersionsResponse> listV2TenantImageVersions =
        genForListV2TenantImageVersions();

    private static HttpRequestDef<ListV2TenantImageVersionsRequest, ListV2TenantImageVersionsResponse> genForListV2TenantImageVersions() {
        // basic
        HttpRequestDef.Builder<ListV2TenantImageVersionsRequest, ListV2TenantImageVersionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListV2TenantImageVersionsRequest.class,
                    ListV2TenantImageVersionsResponse.class)
                .withName("ListV2TenantImageVersions")
                .withUri("/v2/images/{image_id}/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2TenantImageVersionsRequest::getImageId,
                ListV2TenantImageVersionsRequest::setImageId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2TenantImageVersionsRequest::getLimit,
                ListV2TenantImageVersionsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2TenantImageVersionsRequest::getOffset,
                ListV2TenantImageVersionsRequest::setOffset));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2TenantImageVersionsRequest::getVersion,
                ListV2TenantImageVersionsRequest::setVersion));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2TenantImageVersionsRequest::getType,
                ListV2TenantImageVersionsRequest::setType));
        builder.<String>withRequestField("architectures",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2TenantImageVersionsRequest::getArchitectures,
                ListV2TenantImageVersionsRequest::setArchitectures));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2TenantImageVersionsRequest::getWorkspaceId,
                ListV2TenantImageVersionsRequest::setWorkspaceId));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2TenantImageVersionsRequest::getEndpointId,
                ListV2TenantImageVersionsRequest::setEndpointId));
        builder.<String>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2TenantImageVersionsRequest::getSortBy,
                ListV2TenantImageVersionsRequest::setSortBy));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2TenantImageVersionsRequest::getOrderBy,
                ListV2TenantImageVersionsRequest::setOrderBy));
        builder.<String>withRequestField("tenantId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2TenantImageVersionsRequest::getTenantId,
                ListV2TenantImageVersionsRequest::setTenantId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListV2TenantImagesRequest, ListV2TenantImagesResponse> listV2TenantImages =
        genForListV2TenantImages();

    private static HttpRequestDef<ListV2TenantImagesRequest, ListV2TenantImagesResponse> genForListV2TenantImages() {
        // basic
        HttpRequestDef.Builder<ListV2TenantImagesRequest, ListV2TenantImagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListV2TenantImagesRequest.class, ListV2TenantImagesResponse.class)
                .withName("ListV2TenantImages")
                .withUri("/v2/images")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2TenantImagesRequest::getOffset, ListV2TenantImagesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2TenantImagesRequest::getLimit, ListV2TenantImagesRequest::setLimit));
        builder.<String>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2TenantImagesRequest::getSortBy, ListV2TenantImagesRequest::setSortBy));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2TenantImagesRequest::getOrderBy, ListV2TenantImagesRequest::setOrderBy));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2TenantImagesRequest::getId, ListV2TenantImagesRequest::setId));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2TenantImagesRequest::getCategory, ListV2TenantImagesRequest::setCategory));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2TenantImagesRequest::getNamespace, ListV2TenantImagesRequest::setNamespace));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2TenantImagesRequest::getName, ListV2TenantImagesRequest::setName));
        builder.<String>withRequestField("visibility",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2TenantImagesRequest::getVisibility, ListV2TenantImagesRequest::setVisibility));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListV2TenantImagesResponse::getXRequestId,
                ListV2TenantImagesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListV2WorkspacesRequest, ListV2WorkspacesResponse> listV2Workspaces =
        genForListV2Workspaces();

    private static HttpRequestDef<ListV2WorkspacesRequest, ListV2WorkspacesResponse> genForListV2Workspaces() {
        // basic
        HttpRequestDef.Builder<ListV2WorkspacesRequest, ListV2WorkspacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListV2WorkspacesRequest.class, ListV2WorkspacesResponse.class)
                .withName("ListV2Workspaces")
                .withUri("/v2/workspaces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2WorkspacesRequest::getEnterpriseProjectId,
                ListV2WorkspacesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2WorkspacesRequest::getOffset, ListV2WorkspacesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2WorkspacesRequest::getLimit, ListV2WorkspacesRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2WorkspacesRequest::getName, ListV2WorkspacesRequest::setName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2WorkspacesRequest::getId, ListV2WorkspacesRequest::setId));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListV2WorkspacesRequest::getTags, ListV2WorkspacesRequest::setTags));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListV2WorkspacesResponse::getXRequestId, ListV2WorkspacesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<RegisterV2TenantImageRequest, RegisterV2TenantImageResponse> registerV2TenantImage =
        genForRegisterV2TenantImage();

    private static HttpRequestDef<RegisterV2TenantImageRequest, RegisterV2TenantImageResponse> genForRegisterV2TenantImage() {
        // basic
        HttpRequestDef.Builder<RegisterV2TenantImageRequest, RegisterV2TenantImageResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RegisterV2TenantImageRequest.class, RegisterV2TenantImageResponse.class)
            .withName("RegisterV2TenantImage")
            .withUri("/v2/images")
            .withContentType("application/json");

        // requests
        builder.<RegisterV2ImageRequestInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RegisterV2ImageRequestInput.class),
            f -> f.withMarshaller(RegisterV2TenantImageRequest::getBody, RegisterV2TenantImageRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RegisterV2TenantImageResponse::getXRequestId,
                RegisterV2TenantImageResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowV2AgencyRequest, ShowV2AgencyResponse> showV2Agency = genForShowV2Agency();

    private static HttpRequestDef<ShowV2AgencyRequest, ShowV2AgencyResponse> genForShowV2Agency() {
        // basic
        HttpRequestDef.Builder<ShowV2AgencyRequest, ShowV2AgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowV2AgencyRequest.class, ShowV2AgencyResponse.class)
                .withName("ShowV2Agency")
                .withUri("/v2/agencies/{agency_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agency_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2AgencyRequest::getAgencyName, ShowV2AgencyRequest::setAgencyName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowV2AgreementRequest, ShowV2AgreementResponse> showV2Agreement =
        genForShowV2Agreement();

    private static HttpRequestDef<ShowV2AgreementRequest, ShowV2AgreementResponse> genForShowV2Agreement() {
        // basic
        HttpRequestDef.Builder<ShowV2AgreementRequest, ShowV2AgreementResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowV2AgreementRequest.class, ShowV2AgreementResponse.class)
                .withName("ShowV2Agreement")
                .withUri("/v2/agreement")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowV2ComputeRequest, ShowV2ComputeResponse> showV2Compute =
        genForShowV2Compute();

    private static HttpRequestDef<ShowV2ComputeRequest, ShowV2ComputeResponse> genForShowV2Compute() {
        // basic
        HttpRequestDef.Builder<ShowV2ComputeRequest, ShowV2ComputeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowV2ComputeRequest.class, ShowV2ComputeResponse.class)
                .withName("ShowV2Compute")
                .withUri("/v2/workspaces/{workspace_id}/computes/{compute_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2ComputeRequest::getWorkspaceId, ShowV2ComputeRequest::setWorkspaceId));
        builder.<String>withRequestField("compute_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2ComputeRequest::getComputeId, ShowV2ComputeRequest::setComputeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowV2ComputesMetricsRequest, ShowV2ComputesMetricsResponse> showV2ComputesMetrics =
        genForShowV2ComputesMetrics();

    private static HttpRequestDef<ShowV2ComputesMetricsRequest, ShowV2ComputesMetricsResponse> genForShowV2ComputesMetrics() {
        // basic
        HttpRequestDef.Builder<ShowV2ComputesMetricsRequest, ShowV2ComputesMetricsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowV2ComputesMetricsRequest.class, ShowV2ComputesMetricsResponse.class)
            .withName("ShowV2ComputesMetrics")
            .withUri("/v2/workspaces/{workspace_id}/computes/metrics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2ComputesMetricsRequest::getWorkspaceId,
                ShowV2ComputesMetricsRequest::setWorkspaceId));
        builder.<ShowV2ComputesMetricsRequest.StepEnum>withRequestField("step",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowV2ComputesMetricsRequest.StepEnum.class),
            f -> f.withMarshaller(ShowV2ComputesMetricsRequest::getStep, ShowV2ComputesMetricsRequest::setStep));
        builder.<ShowV2ComputesMetricsRequest.MetricNameEnum>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowV2ComputesMetricsRequest.MetricNameEnum.class),
            f -> f.withMarshaller(ShowV2ComputesMetricsRequest::getMetricName,
                ShowV2ComputesMetricsRequest::setMetricName));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowV2ComputesMetricsRequest::getStartTime,
                ShowV2ComputesMetricsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowV2ComputesMetricsRequest::getEndTime, ShowV2ComputesMetricsRequest::setEndTime));
        builder.<String>withRequestField("compute_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2ComputesMetricsRequest::getComputeIds,
                ShowV2ComputesMetricsRequest::setComputeIds));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowV2ComputesMetricsResponse::getXRequestId,
                ShowV2ComputesMetricsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowV2EndpointRequest, ShowV2EndpointResponse> showV2Endpoint =
        genForShowV2Endpoint();

    private static HttpRequestDef<ShowV2EndpointRequest, ShowV2EndpointResponse> genForShowV2Endpoint() {
        // basic
        HttpRequestDef.Builder<ShowV2EndpointRequest, ShowV2EndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowV2EndpointRequest.class, ShowV2EndpointResponse.class)
                .withName("ShowV2Endpoint")
                .withUri("/v2/workspaces/{workspace_id}/endpoints/{endpoint_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2EndpointRequest::getWorkspaceId, ShowV2EndpointRequest::setWorkspaceId));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2EndpointRequest::getEndpointId, ShowV2EndpointRequest::setEndpointId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowV2EndpointResourceLimitRequest, ShowV2EndpointResourceLimitResponse> showV2EndpointResourceLimit =
        genForShowV2EndpointResourceLimit();

    private static HttpRequestDef<ShowV2EndpointResourceLimitRequest, ShowV2EndpointResourceLimitResponse> genForShowV2EndpointResourceLimit() {
        // basic
        HttpRequestDef.Builder<ShowV2EndpointResourceLimitRequest, ShowV2EndpointResourceLimitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowV2EndpointResourceLimitRequest.class,
                    ShowV2EndpointResourceLimitResponse.class)
                .withName("ShowV2EndpointResourceLimit")
                .withUri("/v2/workspaces/{workspace_id}/endpoint-limit")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2EndpointResourceLimitRequest::getWorkspaceId,
                ShowV2EndpointResourceLimitRequest::setWorkspaceId));
        builder.<ShowV2EndpointResourceLimitRequest.EngineTypeEnum>withRequestField("engine_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowV2EndpointResourceLimitRequest.EngineTypeEnum.class),
            f -> f.withMarshaller(ShowV2EndpointResourceLimitRequest::getEngineType,
                ShowV2EndpointResourceLimitRequest::setEngineType));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2EndpointResourceLimitRequest::getId,
                ShowV2EndpointResourceLimitRequest::setId));
        builder.<String>withRequestField("compute_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2EndpointResourceLimitRequest::getComputeId,
                ShowV2EndpointResourceLimitRequest::setComputeId));

        // response
        builder.<List<ResourceLimit>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ShowV2EndpointResourceLimitResponse::getBody,
                    ShowV2EndpointResourceLimitResponse::setBody)
                .withInnerContainerType(ResourceLimit.class));

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowV2EndpointResourceLimitResponse::getXRequestId,
                ShowV2EndpointResourceLimitResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowV2EndpointsMetricsRequest, ShowV2EndpointsMetricsResponse> showV2EndpointsMetrics =
        genForShowV2EndpointsMetrics();

    private static HttpRequestDef<ShowV2EndpointsMetricsRequest, ShowV2EndpointsMetricsResponse> genForShowV2EndpointsMetrics() {
        // basic
        HttpRequestDef.Builder<ShowV2EndpointsMetricsRequest, ShowV2EndpointsMetricsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowV2EndpointsMetricsRequest.class, ShowV2EndpointsMetricsResponse.class)
            .withName("ShowV2EndpointsMetrics")
            .withUri("/v2/workspaces/{workspace_id}/endpoints/{endpoint_id}/metrics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2EndpointsMetricsRequest::getWorkspaceId,
                ShowV2EndpointsMetricsRequest::setWorkspaceId));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2EndpointsMetricsRequest::getEndpointId,
                ShowV2EndpointsMetricsRequest::setEndpointId));
        builder.<ShowV2EndpointsMetricsRequest.StepEnum>withRequestField("step",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowV2EndpointsMetricsRequest.StepEnum.class),
            f -> f.withMarshaller(ShowV2EndpointsMetricsRequest::getStep, ShowV2EndpointsMetricsRequest::setStep));
        builder.<String>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2EndpointsMetricsRequest::getMetricName,
                ShowV2EndpointsMetricsRequest::setMetricName));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowV2EndpointsMetricsRequest::getStartTime,
                ShowV2EndpointsMetricsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowV2EndpointsMetricsRequest::getEndTime,
                ShowV2EndpointsMetricsRequest::setEndTime));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowV2EndpointsMetricsResponse::getXRequestId,
                ShowV2EndpointsMetricsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowV2TenantImageRequest, ShowV2TenantImageResponse> showV2TenantImage =
        genForShowV2TenantImage();

    private static HttpRequestDef<ShowV2TenantImageRequest, ShowV2TenantImageResponse> genForShowV2TenantImage() {
        // basic
        HttpRequestDef.Builder<ShowV2TenantImageRequest, ShowV2TenantImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowV2TenantImageRequest.class, ShowV2TenantImageResponse.class)
                .withName("ShowV2TenantImage")
                .withUri("/v2/images/{image_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2TenantImageRequest::getImageId, ShowV2TenantImageRequest::setImageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowV2TenantImageVersionRequest, ShowV2TenantImageVersionResponse> showV2TenantImageVersion =
        genForShowV2TenantImageVersion();

    private static HttpRequestDef<ShowV2TenantImageVersionRequest, ShowV2TenantImageVersionResponse> genForShowV2TenantImageVersion() {
        // basic
        HttpRequestDef.Builder<ShowV2TenantImageVersionRequest, ShowV2TenantImageVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowV2TenantImageVersionRequest.class, ShowV2TenantImageVersionResponse.class)
                .withName("ShowV2TenantImageVersion")
                .withUri("/v2/images/{image_id}/versions/{version_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2TenantImageVersionRequest::getImageId,
                ShowV2TenantImageVersionRequest::setImageId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2TenantImageVersionRequest::getVersionId,
                ShowV2TenantImageVersionRequest::setVersionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowV2WorkspaceRequest, ShowV2WorkspaceResponse> showV2Workspace =
        genForShowV2Workspace();

    private static HttpRequestDef<ShowV2WorkspaceRequest, ShowV2WorkspaceResponse> genForShowV2Workspace() {
        // basic
        HttpRequestDef.Builder<ShowV2WorkspaceRequest, ShowV2WorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowV2WorkspaceRequest.class, ShowV2WorkspaceResponse.class)
                .withName("ShowV2Workspace")
                .withUri("/v2/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2WorkspaceRequest::getWorkspaceId, ShowV2WorkspaceRequest::setWorkspaceId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowV2WorkspaceResponse::getXRequestId, ShowV2WorkspaceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<SignV2AgreementRequest, SignV2AgreementResponse> signV2Agreement =
        genForSignV2Agreement();

    private static HttpRequestDef<SignV2AgreementRequest, SignV2AgreementResponse> genForSignV2Agreement() {
        // basic
        HttpRequestDef.Builder<SignV2AgreementRequest, SignV2AgreementResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SignV2AgreementRequest.class, SignV2AgreementResponse.class)
                .withName("SignV2Agreement")
                .withUri("/v2/agreement")
                .withContentType("application/json");

        // requests
        builder.<SignV2AgreementRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SignV2AgreementRequestBody.class),
            f -> f.withMarshaller(SignV2AgreementRequest::getBody, SignV2AgreementRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateV2ComputeRequest, UpdateV2ComputeResponse> updateV2Compute =
        genForUpdateV2Compute();

    private static HttpRequestDef<UpdateV2ComputeRequest, UpdateV2ComputeResponse> genForUpdateV2Compute() {
        // basic
        HttpRequestDef.Builder<UpdateV2ComputeRequest, UpdateV2ComputeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateV2ComputeRequest.class, UpdateV2ComputeResponse.class)
                .withName("UpdateV2Compute")
                .withUri("/v2/workspaces/{workspace_id}/computes/{compute_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateV2ComputeRequest::getWorkspaceId, UpdateV2ComputeRequest::setWorkspaceId));
        builder.<String>withRequestField("compute_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateV2ComputeRequest::getComputeId, UpdateV2ComputeRequest::setComputeId));
        builder.<UpdateV2ComputeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateV2ComputeRequestBody.class),
            f -> f.withMarshaller(UpdateV2ComputeRequest::getBody, UpdateV2ComputeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateV2EndpointRequest, UpdateV2EndpointResponse> updateV2Endpoint =
        genForUpdateV2Endpoint();

    private static HttpRequestDef<UpdateV2EndpointRequest, UpdateV2EndpointResponse> genForUpdateV2Endpoint() {
        // basic
        HttpRequestDef.Builder<UpdateV2EndpointRequest, UpdateV2EndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateV2EndpointRequest.class, UpdateV2EndpointResponse.class)
                .withName("UpdateV2Endpoint")
                .withUri("/v2/workspaces/{workspace_id}/endpoints/{endpoint_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateV2EndpointRequest::getWorkspaceId, UpdateV2EndpointRequest::setWorkspaceId));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateV2EndpointRequest::getEndpointId, UpdateV2EndpointRequest::setEndpointId));
        builder.<UpdateV2EndpointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateV2EndpointRequestBody.class),
            f -> f.withMarshaller(UpdateV2EndpointRequest::getBody, UpdateV2EndpointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateV2TenantImageVersionRequest, UpdateV2TenantImageVersionResponse> updateV2TenantImageVersion =
        genForUpdateV2TenantImageVersion();

    private static HttpRequestDef<UpdateV2TenantImageVersionRequest, UpdateV2TenantImageVersionResponse> genForUpdateV2TenantImageVersion() {
        // basic
        HttpRequestDef.Builder<UpdateV2TenantImageVersionRequest, UpdateV2TenantImageVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateV2TenantImageVersionRequest.class,
                    UpdateV2TenantImageVersionResponse.class)
                .withName("UpdateV2TenantImageVersion")
                .withUri("/v2/images/{image_id}/versions/{version_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateV2TenantImageVersionRequest::getImageId,
                UpdateV2TenantImageVersionRequest::setImageId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateV2TenantImageVersionRequest::getVersionId,
                UpdateV2TenantImageVersionRequest::setVersionId));
        builder.<UpdateV2ImageVersionInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateV2ImageVersionInput.class),
            f -> f.withMarshaller(UpdateV2TenantImageVersionRequest::getBody,
                UpdateV2TenantImageVersionRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateV2TenantImageVersionResponse::getXRequestId,
                UpdateV2TenantImageVersionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateV2WorkspaceRequest, UpdateV2WorkspaceResponse> updateV2Workspace =
        genForUpdateV2Workspace();

    private static HttpRequestDef<UpdateV2WorkspaceRequest, UpdateV2WorkspaceResponse> genForUpdateV2Workspace() {
        // basic
        HttpRequestDef.Builder<UpdateV2WorkspaceRequest, UpdateV2WorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateV2WorkspaceRequest.class, UpdateV2WorkspaceResponse.class)
                .withName("UpdateV2Workspace")
                .withUri("/v2/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateV2WorkspaceRequest::getWorkspaceId, UpdateV2WorkspaceRequest::setWorkspaceId));
        builder.<UpdateV2WorkspaceRequestInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateV2WorkspaceRequestInput.class),
            f -> f.withMarshaller(UpdateV2WorkspaceRequest::getBody, UpdateV2WorkspaceRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateV2WorkspaceResponse::getXRequestId, UpdateV2WorkspaceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CancelAuraDataframeJobRequest, CancelAuraDataframeJobResponse> cancelAuraDataframeJob =
        genForCancelAuraDataframeJob();

    private static HttpRequestDef<CancelAuraDataframeJobRequest, CancelAuraDataframeJobResponse> genForCancelAuraDataframeJob() {
        // basic
        HttpRequestDef.Builder<CancelAuraDataframeJobRequest, CancelAuraDataframeJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CancelAuraDataframeJobRequest.class, CancelAuraDataframeJobResponse.class)
            .withName("CancelAuraDataframeJob")
            .withUri("/v2/workspaces/{workspace_id}/aura-dataframe-jobs/{job_id}/cancel")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelAuraDataframeJobRequest::getWorkspaceId,
                CancelAuraDataframeJobRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelAuraDataframeJobRequest::getJobId, CancelAuraDataframeJobRequest::setJobId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CancelAuraDataframeJobResponse::getXRequestId,
                CancelAuraDataframeJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateAuraDataframeJobRequest, CreateAuraDataframeJobResponse> createAuraDataframeJob =
        genForCreateAuraDataframeJob();

    private static HttpRequestDef<CreateAuraDataframeJobRequest, CreateAuraDataframeJobResponse> genForCreateAuraDataframeJob() {
        // basic
        HttpRequestDef.Builder<CreateAuraDataframeJobRequest, CreateAuraDataframeJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAuraDataframeJobRequest.class, CreateAuraDataframeJobResponse.class)
            .withName("CreateAuraDataframeJob")
            .withUri("/v2/workspaces/{workspace_id}/aura-dataframe-jobs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAuraDataframeJobRequest::getWorkspaceId,
                CreateAuraDataframeJobRequest::setWorkspaceId));
        builder.<CreateDataframeJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDataframeJobRequestBody.class),
            f -> f.withMarshaller(CreateAuraDataframeJobRequest::getBody, CreateAuraDataframeJobRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAuraDataframeJobResponse::getXRequestId,
                CreateAuraDataframeJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAuraDataframeJobRequest, ListAuraDataframeJobResponse> listAuraDataframeJob =
        genForListAuraDataframeJob();

    private static HttpRequestDef<ListAuraDataframeJobRequest, ListAuraDataframeJobResponse> genForListAuraDataframeJob() {
        // basic
        HttpRequestDef.Builder<ListAuraDataframeJobRequest, ListAuraDataframeJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAuraDataframeJobRequest.class, ListAuraDataframeJobResponse.class)
            .withName("ListAuraDataframeJob")
            .withUri("/v2/workspaces/{workspace_id}/aura-dataframe-jobs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraDataframeJobRequest::getWorkspaceId,
                ListAuraDataframeJobRequest::setWorkspaceId));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraDataframeJobRequest::getEndpointId,
                ListAuraDataframeJobRequest::setEndpointId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraDataframeJobRequest::getId, ListAuraDataframeJobRequest::setId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuraDataframeJobRequest::getLimit, ListAuraDataframeJobRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuraDataframeJobRequest::getOffset, ListAuraDataframeJobRequest::setOffset));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraDataframeJobRequest::getStatus, ListAuraDataframeJobRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuraDataframeJobRequest, ShowAuraDataframeJobResponse> showAuraDataframeJob =
        genForShowAuraDataframeJob();

    private static HttpRequestDef<ShowAuraDataframeJobRequest, ShowAuraDataframeJobResponse> genForShowAuraDataframeJob() {
        // basic
        HttpRequestDef.Builder<ShowAuraDataframeJobRequest, ShowAuraDataframeJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAuraDataframeJobRequest.class, ShowAuraDataframeJobResponse.class)
            .withName("ShowAuraDataframeJob")
            .withUri("/v2/workspaces/{workspace_id}/aura-dataframe-jobs/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraDataframeJobRequest::getWorkspaceId,
                ShowAuraDataframeJobRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraDataframeJobRequest::getJobId, ShowAuraDataframeJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelAuraSqlStatementRequest, CancelAuraSqlStatementResponse> cancelAuraSqlStatement =
        genForCancelAuraSqlStatement();

    private static HttpRequestDef<CancelAuraSqlStatementRequest, CancelAuraSqlStatementResponse> genForCancelAuraSqlStatement() {
        // basic
        HttpRequestDef.Builder<CancelAuraSqlStatementRequest, CancelAuraSqlStatementResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CancelAuraSqlStatementRequest.class, CancelAuraSqlStatementResponse.class)
            .withName("CancelAuraSqlStatement")
            .withUri("/v2/workspaces/{workspace_id}/aura-sessions/{session_id}/statements/{statement_id}/cancel")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelAuraSqlStatementRequest::getWorkspaceId,
                CancelAuraSqlStatementRequest::setWorkspaceId));
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelAuraSqlStatementRequest::getSessionId,
                CancelAuraSqlStatementRequest::setSessionId));
        builder.<String>withRequestField("statement_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelAuraSqlStatementRequest::getStatementId,
                CancelAuraSqlStatementRequest::setStatementId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CloseAuraSqlSessionRequest, CloseAuraSqlSessionResponse> closeAuraSqlSession =
        genForCloseAuraSqlSession();

    private static HttpRequestDef<CloseAuraSqlSessionRequest, CloseAuraSqlSessionResponse> genForCloseAuraSqlSession() {
        // basic
        HttpRequestDef.Builder<CloseAuraSqlSessionRequest, CloseAuraSqlSessionResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, CloseAuraSqlSessionRequest.class, CloseAuraSqlSessionResponse.class)
            .withName("CloseAuraSqlSession")
            .withUri("/v2/workspaces/{workspace_id}/aura-sessions/{session_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CloseAuraSqlSessionRequest::getWorkspaceId,
                CloseAuraSqlSessionRequest::setWorkspaceId));
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CloseAuraSqlSessionRequest::getSessionId, CloseAuraSqlSessionRequest::setSessionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAuraSqlSessionRequest, CreateAuraSqlSessionResponse> createAuraSqlSession =
        genForCreateAuraSqlSession();

    private static HttpRequestDef<CreateAuraSqlSessionRequest, CreateAuraSqlSessionResponse> genForCreateAuraSqlSession() {
        // basic
        HttpRequestDef.Builder<CreateAuraSqlSessionRequest, CreateAuraSqlSessionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAuraSqlSessionRequest.class, CreateAuraSqlSessionResponse.class)
            .withName("CreateAuraSqlSession")
            .withUri("/v2/workspaces/{workspace_id}/aura-sessions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAuraSqlSessionRequest::getWorkspaceId,
                CreateAuraSqlSessionRequest::setWorkspaceId));
        builder.<CreateSessionRequestBodyV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateSessionRequestBodyV2.class),
            f -> f.withMarshaller(CreateAuraSqlSessionRequest::getBody, CreateAuraSqlSessionRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAuraSqlSessionResponse::getXRequestId,
                CreateAuraSqlSessionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ExecuteAuraSqlStatementRequest, ExecuteAuraSqlStatementResponse> executeAuraSqlStatement =
        genForExecuteAuraSqlStatement();

    private static HttpRequestDef<ExecuteAuraSqlStatementRequest, ExecuteAuraSqlStatementResponse> genForExecuteAuraSqlStatement() {
        // basic
        HttpRequestDef.Builder<ExecuteAuraSqlStatementRequest, ExecuteAuraSqlStatementResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExecuteAuraSqlStatementRequest.class, ExecuteAuraSqlStatementResponse.class)
            .withName("ExecuteAuraSqlStatement")
            .withUri("/v2/workspaces/{workspace_id}/aura-sessions/statements")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteAuraSqlStatementRequest::getWorkspaceId,
                ExecuteAuraSqlStatementRequest::setWorkspaceId));
        builder.<StatementExecuteRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StatementExecuteRequestBody.class),
            f -> f.withMarshaller(ExecuteAuraSqlStatementRequest::getBody, ExecuteAuraSqlStatementRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ExecuteAuraSqlStatementResponse::getBody, ExecuteAuraSqlStatementResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListAuraSessionStatementRecordsRequest, ListAuraSessionStatementRecordsResponse> listAuraSessionStatementRecords =
        genForListAuraSessionStatementRecords();

    private static HttpRequestDef<ListAuraSessionStatementRecordsRequest, ListAuraSessionStatementRecordsResponse> genForListAuraSessionStatementRecords() {
        // basic
        HttpRequestDef.Builder<ListAuraSessionStatementRecordsRequest, ListAuraSessionStatementRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAuraSessionStatementRecordsRequest.class,
                    ListAuraSessionStatementRecordsResponse.class)
                .withName("ListAuraSessionStatementRecords")
                .withUri("/v2/workspaces/{workspace_id}/aura-sessions/{session_id}/statements")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraSessionStatementRecordsRequest::getWorkspaceId,
                ListAuraSessionStatementRecordsRequest::setWorkspaceId));
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraSessionStatementRecordsRequest::getSessionId,
                ListAuraSessionStatementRecordsRequest::setSessionId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuraSessionStatementRecordsRequest::getLimit,
                ListAuraSessionStatementRecordsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraSessionStatementRecordsRequest::getMarker,
                ListAuraSessionStatementRecordsRequest::setMarker));
        builder.<String>withRequestField("statement_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraSessionStatementRecordsRequest::getStatementId,
                ListAuraSessionStatementRecordsRequest::setStatementId));
        builder.<ListAuraSessionStatementRecordsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAuraSessionStatementRecordsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAuraSessionStatementRecordsRequest::getStatus,
                ListAuraSessionStatementRecordsRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuraSqlSessionsRequest, ListAuraSqlSessionsResponse> listAuraSqlSessions =
        genForListAuraSqlSessions();

    private static HttpRequestDef<ListAuraSqlSessionsRequest, ListAuraSqlSessionsResponse> genForListAuraSqlSessions() {
        // basic
        HttpRequestDef.Builder<ListAuraSqlSessionsRequest, ListAuraSqlSessionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuraSqlSessionsRequest.class, ListAuraSqlSessionsResponse.class)
                .withName("ListAuraSqlSessions")
                .withUri("/v2/workspaces/{workspace_id}/aura-sessions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraSqlSessionsRequest::getWorkspaceId,
                ListAuraSqlSessionsRequest::setWorkspaceId));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraSqlSessionsRequest::getEndpointId,
                ListAuraSqlSessionsRequest::setEndpointId));
        builder.<String>withRequestField("endpoint_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraSqlSessionsRequest::getEndpointName,
                ListAuraSqlSessionsRequest::setEndpointName));
        builder.<String>withRequestField("session_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraSqlSessionsRequest::getSessionId, ListAuraSqlSessionsRequest::setSessionId));
        builder.<ListAuraSqlSessionsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAuraSqlSessionsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAuraSqlSessionsRequest::getStatus, ListAuraSqlSessionsRequest::setStatus));
        builder.<Integer>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuraSqlSessionsRequest::getStartTime, ListAuraSqlSessionsRequest::setStartTime));
        builder.<Integer>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuraSqlSessionsRequest::getEndTime, ListAuraSqlSessionsRequest::setEndTime));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraSqlSessionsRequest::getMarker, ListAuraSqlSessionsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuraSqlSessionsRequest::getLimit, ListAuraSqlSessionsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuraStatementRecordsRequest, ListAuraStatementRecordsResponse> listAuraStatementRecords =
        genForListAuraStatementRecords();

    private static HttpRequestDef<ListAuraStatementRecordsRequest, ListAuraStatementRecordsResponse> genForListAuraStatementRecords() {
        // basic
        HttpRequestDef.Builder<ListAuraStatementRecordsRequest, ListAuraStatementRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListAuraStatementRecordsRequest.class, ListAuraStatementRecordsResponse.class)
                .withName("ListAuraStatementRecords")
                .withUri("/v2/workspaces/{workspace_id}/aura-statement-records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getWorkspaceId,
                ListAuraStatementRecordsRequest::setWorkspaceId));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getEndpointId,
                ListAuraStatementRecordsRequest::setEndpointId));
        builder.<String>withRequestField("endpoint_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getEndpointName,
                ListAuraStatementRecordsRequest::setEndpointName));
        builder.<String>withRequestField("session_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getSessionId,
                ListAuraStatementRecordsRequest::setSessionId));
        builder.<String>withRequestField("statement_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getStatementId,
                ListAuraStatementRecordsRequest::setStatementId));
        builder.<Integer>withRequestField("source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getSource,
                ListAuraStatementRecordsRequest::setSource));
        builder.<ListAuraStatementRecordsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAuraStatementRecordsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getStatus,
                ListAuraStatementRecordsRequest::setStatus));
        builder.<Integer>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getStartTime,
                ListAuraStatementRecordsRequest::setStartTime));
        builder.<Integer>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getEndTime,
                ListAuraStatementRecordsRequest::setEndTime));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getMarker,
                ListAuraStatementRecordsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getLimit,
                ListAuraStatementRecordsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuraSqlSessionRequest, ShowAuraSqlSessionResponse> showAuraSqlSession =
        genForShowAuraSqlSession();

    private static HttpRequestDef<ShowAuraSqlSessionRequest, ShowAuraSqlSessionResponse> genForShowAuraSqlSession() {
        // basic
        HttpRequestDef.Builder<ShowAuraSqlSessionRequest, ShowAuraSqlSessionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuraSqlSessionRequest.class, ShowAuraSqlSessionResponse.class)
                .withName("ShowAuraSqlSession")
                .withUri("/v2/workspaces/{workspace_id}/aura-sessions/{session_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraSqlSessionRequest::getWorkspaceId,
                ShowAuraSqlSessionRequest::setWorkspaceId));
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraSqlSessionRequest::getSessionId, ShowAuraSqlSessionRequest::setSessionId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAuraSqlSessionResponse::getXRequestId,
                ShowAuraSqlSessionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAuraSqlStatementResultRequest, ShowAuraSqlStatementResultResponse> showAuraSqlStatementResult =
        genForShowAuraSqlStatementResult();

    private static HttpRequestDef<ShowAuraSqlStatementResultRequest, ShowAuraSqlStatementResultResponse> genForShowAuraSqlStatementResult() {
        // basic
        HttpRequestDef.Builder<ShowAuraSqlStatementResultRequest, ShowAuraSqlStatementResultResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAuraSqlStatementResultRequest.class,
                    ShowAuraSqlStatementResultResponse.class)
                .withName("ShowAuraSqlStatementResult")
                .withUri("/v2/workspaces/{workspace_id}/aura-sessions/{session_id}/statements/{statement_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraSqlStatementResultRequest::getWorkspaceId,
                ShowAuraSqlStatementResultRequest::setWorkspaceId));
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraSqlStatementResultRequest::getSessionId,
                ShowAuraSqlStatementResultRequest::setSessionId));
        builder.<String>withRequestField("statement_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraSqlStatementResultRequest::getStatementId,
                ShowAuraSqlStatementResultRequest::setStatementId));
        builder.<Integer>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAuraSqlStatementResultRequest::getPageNum,
                ShowAuraSqlStatementResultRequest::setPageNum));
        builder.<Boolean>withRequestField("is_enable_obs_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowAuraSqlStatementResultRequest::getIsEnableObsPath,
                ShowAuraSqlStatementResultRequest::setIsEnableObsPath));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAuraSqlStatementResultResponse::getBody,
                ShowAuraSqlStatementResultResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuraStatementOperatorMetricsRequest, ShowAuraStatementOperatorMetricsResponse> showAuraStatementOperatorMetrics =
        genForShowAuraStatementOperatorMetrics();

    private static HttpRequestDef<ShowAuraStatementOperatorMetricsRequest, ShowAuraStatementOperatorMetricsResponse> genForShowAuraStatementOperatorMetrics() {
        // basic
        HttpRequestDef.Builder<ShowAuraStatementOperatorMetricsRequest, ShowAuraStatementOperatorMetricsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAuraStatementOperatorMetricsRequest.class,
                    ShowAuraStatementOperatorMetricsResponse.class)
                .withName("ShowAuraStatementOperatorMetrics")
                .withUri(
                    "/v2/workspaces/{workspace_id}/aura-sessions/{session_id}/statements/{statement_id}/operator-metrics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraStatementOperatorMetricsRequest::getWorkspaceId,
                ShowAuraStatementOperatorMetricsRequest::setWorkspaceId));
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraStatementOperatorMetricsRequest::getSessionId,
                ShowAuraStatementOperatorMetricsRequest::setSessionId));
        builder.<String>withRequestField("statement_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraStatementOperatorMetricsRequest::getStatementId,
                ShowAuraStatementOperatorMetricsRequest::setStatementId));

        // response
        builder.<List<AuraStatementOperatorMetrics>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ShowAuraStatementOperatorMetricsResponse::getBody,
                    ShowAuraStatementOperatorMetricsResponse::setBody)
                .withInnerContainerType(AuraStatementOperatorMetrics.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuraStatementQueryMetricsRequest, ShowAuraStatementQueryMetricsResponse> showAuraStatementQueryMetrics =
        genForShowAuraStatementQueryMetrics();

    private static HttpRequestDef<ShowAuraStatementQueryMetricsRequest, ShowAuraStatementQueryMetricsResponse> genForShowAuraStatementQueryMetrics() {
        // basic
        HttpRequestDef.Builder<ShowAuraStatementQueryMetricsRequest, ShowAuraStatementQueryMetricsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAuraStatementQueryMetricsRequest.class,
                    ShowAuraStatementQueryMetricsResponse.class)
                .withName("ShowAuraStatementQueryMetrics")
                .withUri(
                    "/v2/workspaces/{workspace_id}/aura-sessions/{session_id}/statements/{statement_id}/query-metrics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraStatementQueryMetricsRequest::getWorkspaceId,
                ShowAuraStatementQueryMetricsRequest::setWorkspaceId));
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraStatementQueryMetricsRequest::getSessionId,
                ShowAuraStatementQueryMetricsRequest::setSessionId));
        builder.<String>withRequestField("statement_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraStatementQueryMetricsRequest::getStatementId,
                ShowAuraStatementQueryMetricsRequest::setStatementId));

        // response
        builder.<List<StatementQueryMetrics>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ShowAuraStatementQueryMetricsResponse::getBody,
                    ShowAuraStatementQueryMetricsResponse::setBody)
                .withInnerContainerType(StatementQueryMetrics.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListFlinkJobAutoscalingHistoriesRequest, ListFlinkJobAutoscalingHistoriesResponse> listFlinkJobAutoscalingHistories =
        genForListFlinkJobAutoscalingHistories();

    private static HttpRequestDef<ListFlinkJobAutoscalingHistoriesRequest, ListFlinkJobAutoscalingHistoriesResponse> genForListFlinkJobAutoscalingHistories() {
        // basic
        HttpRequestDef.Builder<ListFlinkJobAutoscalingHistoriesRequest, ListFlinkJobAutoscalingHistoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListFlinkJobAutoscalingHistoriesRequest.class,
                    ListFlinkJobAutoscalingHistoriesResponse.class)
                .withName("ListFlinkJobAutoscalingHistories")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}/autoscaling-histories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobAutoscalingHistoriesRequest::getWorkspaceId,
                ListFlinkJobAutoscalingHistoriesRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobAutoscalingHistoriesRequest::getJobId,
                ListFlinkJobAutoscalingHistoriesRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlinkJobAutoscalingHistoriesRequest::getOffset,
                ListFlinkJobAutoscalingHistoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlinkJobAutoscalingHistoriesRequest::getLimit,
                ListFlinkJobAutoscalingHistoriesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlinkJobAutoscalingPolicyRequest, ShowFlinkJobAutoscalingPolicyResponse> showFlinkJobAutoscalingPolicy =
        genForShowFlinkJobAutoscalingPolicy();

    private static HttpRequestDef<ShowFlinkJobAutoscalingPolicyRequest, ShowFlinkJobAutoscalingPolicyResponse> genForShowFlinkJobAutoscalingPolicy() {
        // basic
        HttpRequestDef.Builder<ShowFlinkJobAutoscalingPolicyRequest, ShowFlinkJobAutoscalingPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowFlinkJobAutoscalingPolicyRequest.class,
                    ShowFlinkJobAutoscalingPolicyResponse.class)
                .withName("ShowFlinkJobAutoscalingPolicy")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}/autoscaling-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlinkJobAutoscalingPolicyRequest::getWorkspaceId,
                ShowFlinkJobAutoscalingPolicyRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlinkJobAutoscalingPolicyRequest::getJobId,
                ShowFlinkJobAutoscalingPolicyRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlinkJobAutoscalingPolicyRequest, UpdateFlinkJobAutoscalingPolicyResponse> updateFlinkJobAutoscalingPolicy =
        genForUpdateFlinkJobAutoscalingPolicy();

    private static HttpRequestDef<UpdateFlinkJobAutoscalingPolicyRequest, UpdateFlinkJobAutoscalingPolicyResponse> genForUpdateFlinkJobAutoscalingPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateFlinkJobAutoscalingPolicyRequest, UpdateFlinkJobAutoscalingPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateFlinkJobAutoscalingPolicyRequest.class,
                    UpdateFlinkJobAutoscalingPolicyResponse.class)
                .withName("UpdateFlinkJobAutoscalingPolicy")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}/autoscaling-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFlinkJobAutoscalingPolicyRequest::getWorkspaceId,
                UpdateFlinkJobAutoscalingPolicyRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFlinkJobAutoscalingPolicyRequest::getJobId,
                UpdateFlinkJobAutoscalingPolicyRequest::setJobId));
        builder.<UpdateFlinkJobAutoscalingRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFlinkJobAutoscalingRequestBody.class),
            f -> f.withMarshaller(UpdateFlinkJobAutoscalingPolicyRequest::getBody,
                UpdateFlinkJobAutoscalingPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelFlinkJobRequest, CancelFlinkJobResponse> cancelFlinkJob =
        genForCancelFlinkJob();

    private static HttpRequestDef<CancelFlinkJobRequest, CancelFlinkJobResponse> genForCancelFlinkJob() {
        // basic
        HttpRequestDef.Builder<CancelFlinkJobRequest, CancelFlinkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelFlinkJobRequest.class, CancelFlinkJobResponse.class)
                .withName("CancelFlinkJob")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelFlinkJobRequest::getWorkspaceId, CancelFlinkJobRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelFlinkJobRequest::getJobId, CancelFlinkJobRequest::setJobId));
        builder.<CancelFlinkJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CancelFlinkJobRequestBody.class),
            f -> f.withMarshaller(CancelFlinkJobRequest::getBody, CancelFlinkJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlinkJobEventsRequest, ListFlinkJobEventsResponse> listFlinkJobEvents =
        genForListFlinkJobEvents();

    private static HttpRequestDef<ListFlinkJobEventsRequest, ListFlinkJobEventsResponse> genForListFlinkJobEvents() {
        // basic
        HttpRequestDef.Builder<ListFlinkJobEventsRequest, ListFlinkJobEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlinkJobEventsRequest.class, ListFlinkJobEventsResponse.class)
                .withName("ListFlinkJobEvents")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobEventsRequest::getWorkspaceId,
                ListFlinkJobEventsRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobEventsRequest::getJobId, ListFlinkJobEventsRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlinkJobEventsRequest::getOffset, ListFlinkJobEventsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlinkJobEventsRequest::getLimit, ListFlinkJobEventsRequest::setLimit));
        builder.<Long>withRequestField("create_time_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlinkJobEventsRequest::getCreateTimeAfter,
                ListFlinkJobEventsRequest::setCreateTimeAfter));
        builder.<Long>withRequestField("create_time_before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlinkJobEventsRequest::getCreateTimeBefore,
                ListFlinkJobEventsRequest::setCreateTimeBefore));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlinkJobsRequest, ListFlinkJobsResponse> listFlinkJobs =
        genForListFlinkJobs();

    private static HttpRequestDef<ListFlinkJobsRequest, ListFlinkJobsResponse> genForListFlinkJobs() {
        // basic
        HttpRequestDef.Builder<ListFlinkJobsRequest, ListFlinkJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlinkJobsRequest.class, ListFlinkJobsResponse.class)
                .withName("ListFlinkJobs")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getWorkspaceId, ListFlinkJobsRequest::setWorkspaceId));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getMarker, ListFlinkJobsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getLimit, ListFlinkJobsRequest::setLimit));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getPageReverse, ListFlinkJobsRequest::setPageReverse));
        builder.<Long>withRequestField("create_time_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getCreateTimeAfter, ListFlinkJobsRequest::setCreateTimeAfter));
        builder.<Long>withRequestField("create_time_before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getCreateTimeBefore,
                ListFlinkJobsRequest::setCreateTimeBefore));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getEndpointId, ListFlinkJobsRequest::setEndpointId));
        builder.<String>withRequestField("endpoint_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getEndpointName, ListFlinkJobsRequest::setEndpointName));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getName, ListFlinkJobsRequest::setName));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getJobId, ListFlinkJobsRequest::setJobId));
        builder.<String>withRequestField("deployment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getDeploymentId, ListFlinkJobsRequest::setDeploymentId));
        builder.<List<FlinkJobState>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getState, ListFlinkJobsRequest::setState));
        builder.<ListFlinkJobsRequest.JobTypeEnum>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlinkJobsRequest.JobTypeEnum.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getJobType, ListFlinkJobsRequest::setJobType));
        builder.<ListFlinkJobsRequest.ExecutionModeEnum>withRequestField("execution_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlinkJobsRequest.ExecutionModeEnum.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getExecutionMode, ListFlinkJobsRequest::setExecutionMode));
        builder.<String>withRequestField("create_user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getCreateUserId, ListFlinkJobsRequest::setCreateUserId));
        builder.<List<String>>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getLabels, ListFlinkJobsRequest::setLabels));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunFlinkJobRequest, RunFlinkJobResponse> runFlinkJob = genForRunFlinkJob();

    private static HttpRequestDef<RunFlinkJobRequest, RunFlinkJobResponse> genForRunFlinkJob() {
        // basic
        HttpRequestDef.Builder<RunFlinkJobRequest, RunFlinkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunFlinkJobRequest.class, RunFlinkJobResponse.class)
                .withName("RunFlinkJob")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunFlinkJobRequest::getWorkspaceId, RunFlinkJobRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunFlinkJobRequest::getXClientToken, RunFlinkJobRequest::setXClientToken));
        builder.<RunFlinkJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunFlinkJobRequestBody.class),
            f -> f.withMarshaller(RunFlinkJobRequest::getBody, RunFlinkJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlinkJobRequest, ShowFlinkJobResponse> showFlinkJob = genForShowFlinkJob();

    private static HttpRequestDef<ShowFlinkJobRequest, ShowFlinkJobResponse> genForShowFlinkJob() {
        // basic
        HttpRequestDef.Builder<ShowFlinkJobRequest, ShowFlinkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFlinkJobRequest.class, ShowFlinkJobResponse.class)
                .withName("ShowFlinkJob")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlinkJobRequest::getWorkspaceId, ShowFlinkJobRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlinkJobRequest::getJobId, ShowFlinkJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlinkJobStateRequest, ShowFlinkJobStateResponse> showFlinkJobState =
        genForShowFlinkJobState();

    private static HttpRequestDef<ShowFlinkJobStateRequest, ShowFlinkJobStateResponse> genForShowFlinkJobState() {
        // basic
        HttpRequestDef.Builder<ShowFlinkJobStateRequest, ShowFlinkJobStateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFlinkJobStateRequest.class, ShowFlinkJobStateResponse.class)
                .withName("ShowFlinkJobState")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}/state")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlinkJobStateRequest::getWorkspaceId, ShowFlinkJobStateRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlinkJobStateRequest::getJobId, ShowFlinkJobStateRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlinkSavepointRequest, CreateFlinkSavepointResponse> createFlinkSavepoint =
        genForCreateFlinkSavepoint();

    private static HttpRequestDef<CreateFlinkSavepointRequest, CreateFlinkSavepointResponse> genForCreateFlinkSavepoint() {
        // basic
        HttpRequestDef.Builder<CreateFlinkSavepointRequest, CreateFlinkSavepointResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateFlinkSavepointRequest.class, CreateFlinkSavepointResponse.class)
            .withName("CreateFlinkSavepoint")
            .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}/flink-savepoints")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFlinkSavepointRequest::getWorkspaceId,
                CreateFlinkSavepointRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFlinkSavepointRequest::getJobId, CreateFlinkSavepointRequest::setJobId));
        builder.<CreateFlinkSavepointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFlinkSavepointRequestBody.class),
            f -> f.withMarshaller(CreateFlinkSavepointRequest::getBody, CreateFlinkSavepointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFlinkSavepointRequest, DeleteFlinkSavepointResponse> deleteFlinkSavepoint =
        genForDeleteFlinkSavepoint();

    private static HttpRequestDef<DeleteFlinkSavepointRequest, DeleteFlinkSavepointResponse> genForDeleteFlinkSavepoint() {
        // basic
        HttpRequestDef.Builder<DeleteFlinkSavepointRequest, DeleteFlinkSavepointResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteFlinkSavepointRequest.class, DeleteFlinkSavepointResponse.class)
            .withName("DeleteFlinkSavepoint")
            .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}/flink-savepoints/{savepoint_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFlinkSavepointRequest::getWorkspaceId,
                DeleteFlinkSavepointRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFlinkSavepointRequest::getJobId, DeleteFlinkSavepointRequest::setJobId));
        builder.<String>withRequestField("savepoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFlinkSavepointRequest::getSavepointId,
                DeleteFlinkSavepointRequest::setSavepointId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlinkSavepointRequest, ListFlinkSavepointResponse> listFlinkSavepoint =
        genForListFlinkSavepoint();

    private static HttpRequestDef<ListFlinkSavepointRequest, ListFlinkSavepointResponse> genForListFlinkSavepoint() {
        // basic
        HttpRequestDef.Builder<ListFlinkSavepointRequest, ListFlinkSavepointResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlinkSavepointRequest.class, ListFlinkSavepointResponse.class)
                .withName("ListFlinkSavepoint")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}/flink-savepoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkSavepointRequest::getWorkspaceId,
                ListFlinkSavepointRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkSavepointRequest::getJobId, ListFlinkSavepointRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlinkSavepointRequest::getOffset, ListFlinkSavepointRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlinkSavepointRequest::getLimit, ListFlinkSavepointRequest::setLimit));
        builder.<Long>withRequestField("create_time_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlinkSavepointRequest::getCreateTimeAfter,
                ListFlinkSavepointRequest::setCreateTimeAfter));
        builder.<Long>withRequestField("create_time_before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlinkSavepointRequest::getCreateTimeBefore,
                ListFlinkSavepointRequest::setCreateTimeBefore));
        builder.<ListFlinkSavepointRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlinkSavepointRequest.StateEnum.class),
            f -> f.withMarshaller(ListFlinkSavepointRequest::getState, ListFlinkSavepointRequest::setState));
        builder.<ListFlinkSavepointRequest.TriggerTypeEnum>withRequestField("trigger_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlinkSavepointRequest.TriggerTypeEnum.class),
            f -> f.withMarshaller(ListFlinkSavepointRequest::getTriggerType,
                ListFlinkSavepointRequest::setTriggerType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlinkSavepointRequest, ShowFlinkSavepointResponse> showFlinkSavepoint =
        genForShowFlinkSavepoint();

    private static HttpRequestDef<ShowFlinkSavepointRequest, ShowFlinkSavepointResponse> genForShowFlinkSavepoint() {
        // basic
        HttpRequestDef.Builder<ShowFlinkSavepointRequest, ShowFlinkSavepointResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFlinkSavepointRequest.class, ShowFlinkSavepointResponse.class)
                .withName("ShowFlinkSavepoint")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}/flink-savepoints/{savepoint_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlinkSavepointRequest::getWorkspaceId,
                ShowFlinkSavepointRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlinkSavepointRequest::getJobId, ShowFlinkSavepointRequest::setJobId));
        builder.<String>withRequestField("savepoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlinkSavepointRequest::getSavepointId,
                ShowFlinkSavepointRequest::setSavepointId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateV2RayFederationRequest, CreateV2RayFederationResponse> createV2RayFederation =
        genForCreateV2RayFederation();

    private static HttpRequestDef<CreateV2RayFederationRequest, CreateV2RayFederationResponse> genForCreateV2RayFederation() {
        // basic
        HttpRequestDef.Builder<CreateV2RayFederationRequest, CreateV2RayFederationResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateV2RayFederationRequest.class, CreateV2RayFederationResponse.class)
            .withName("CreateV2RayFederation")
            .withUri("/v2/workspaces/{workspace_id}/ray-federations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateV2RayFederationRequest::getWorkspaceId,
                CreateV2RayFederationRequest::setWorkspaceId));
        builder.<CreateV2RayFederationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateV2RayFederationRequestBody.class),
            f -> f.withMarshaller(CreateV2RayFederationRequest::getBody, CreateV2RayFederationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteV2RayFederationRequest, DeleteV2RayFederationResponse> deleteV2RayFederation =
        genForDeleteV2RayFederation();

    private static HttpRequestDef<DeleteV2RayFederationRequest, DeleteV2RayFederationResponse> genForDeleteV2RayFederation() {
        // basic
        HttpRequestDef.Builder<DeleteV2RayFederationRequest, DeleteV2RayFederationResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteV2RayFederationRequest.class, DeleteV2RayFederationResponse.class)
            .withName("DeleteV2RayFederation")
            .withUri("/v2/workspaces/{workspace_id}/ray-federations/{ray_federation_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2RayFederationRequest::getWorkspaceId,
                DeleteV2RayFederationRequest::setWorkspaceId));
        builder.<String>withRequestField("ray_federation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2RayFederationRequest::getRayFederationId,
                DeleteV2RayFederationRequest::setRayFederationId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteV2RayFederationResponse::getXRequestId,
                DeleteV2RayFederationResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListV2RayFederationsRequest, ListV2RayFederationsResponse> listV2RayFederations =
        genForListV2RayFederations();

    private static HttpRequestDef<ListV2RayFederationsRequest, ListV2RayFederationsResponse> genForListV2RayFederations() {
        // basic
        HttpRequestDef.Builder<ListV2RayFederationsRequest, ListV2RayFederationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListV2RayFederationsRequest.class, ListV2RayFederationsResponse.class)
            .withName("ListV2RayFederations")
            .withUri("/v2/workspaces/{workspace_id}/ray-federations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2RayFederationsRequest::getWorkspaceId,
                ListV2RayFederationsRequest::setWorkspaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2RayFederationsRequest::getOffset, ListV2RayFederationsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2RayFederationsRequest::getLimit, ListV2RayFederationsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2RayFederationsRequest::getName, ListV2RayFederationsRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowV2RayFederationRequest, ShowV2RayFederationResponse> showV2RayFederation =
        genForShowV2RayFederation();

    private static HttpRequestDef<ShowV2RayFederationRequest, ShowV2RayFederationResponse> genForShowV2RayFederation() {
        // basic
        HttpRequestDef.Builder<ShowV2RayFederationRequest, ShowV2RayFederationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowV2RayFederationRequest.class, ShowV2RayFederationResponse.class)
                .withName("ShowV2RayFederation")
                .withUri("/v2/workspaces/{workspace_id}/ray-federations/{ray_federation_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2RayFederationRequest::getWorkspaceId,
                ShowV2RayFederationRequest::setWorkspaceId));
        builder.<String>withRequestField("ray_federation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2RayFederationRequest::getRayFederationId,
                ShowV2RayFederationRequest::setRayFederationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateV2RayFederationRequest, UpdateV2RayFederationResponse> updateV2RayFederation =
        genForUpdateV2RayFederation();

    private static HttpRequestDef<UpdateV2RayFederationRequest, UpdateV2RayFederationResponse> genForUpdateV2RayFederation() {
        // basic
        HttpRequestDef.Builder<UpdateV2RayFederationRequest, UpdateV2RayFederationResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateV2RayFederationRequest.class, UpdateV2RayFederationResponse.class)
            .withName("UpdateV2RayFederation")
            .withUri("/v2/workspaces/{workspace_id}/ray-federations/{ray_federation_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateV2RayFederationRequest::getWorkspaceId,
                UpdateV2RayFederationRequest::setWorkspaceId));
        builder.<String>withRequestField("ray_federation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateV2RayFederationRequest::getRayFederationId,
                UpdateV2RayFederationRequest::setRayFederationId));
        builder.<UpdateV2RayFederationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateV2RayFederationRequestBody.class),
            f -> f.withMarshaller(UpdateV2RayFederationRequest::getBody, UpdateV2RayFederationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelRayJobRequest, CancelRayJobResponse> cancelRayJob = genForCancelRayJob();

    private static HttpRequestDef<CancelRayJobRequest, CancelRayJobResponse> genForCancelRayJob() {
        // basic
        HttpRequestDef.Builder<CancelRayJobRequest, CancelRayJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelRayJobRequest.class, CancelRayJobResponse.class)
                .withName("CancelRayJob")
                .withUri("/v2/workspaces/{workspace_id}/ray-jobs/{job_id}/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelRayJobRequest::getWorkspaceId, CancelRayJobRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelRayJobRequest::getJobId, CancelRayJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRayJobsRequest, ListRayJobsResponse> listRayJobs = genForListRayJobs();

    private static HttpRequestDef<ListRayJobsRequest, ListRayJobsResponse> genForListRayJobs() {
        // basic
        HttpRequestDef.Builder<ListRayJobsRequest, ListRayJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRayJobsRequest.class, ListRayJobsResponse.class)
                .withName("ListRayJobs")
                .withUri("/v2/workspaces/{workspace_id}/ray-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRayJobsRequest::getWorkspaceId, ListRayJobsRequest::setWorkspaceId));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRayJobsRequest::getMarker, ListRayJobsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRayJobsRequest::getLimit, ListRayJobsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRayJobsRequest::getName, ListRayJobsRequest::setName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRayJobsRequest::getId, ListRayJobsRequest::setId));
        builder.<String>withRequestField("endpoint_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRayJobsRequest::getEndpointName, ListRayJobsRequest::setEndpointName));
        builder.<String>withRequestField("federation_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRayJobsRequest::getFederationName, ListRayJobsRequest::setFederationName));
        builder.<Long>withRequestField("create_time_before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRayJobsRequest::getCreateTimeBefore, ListRayJobsRequest::setCreateTimeBefore));
        builder.<Long>withRequestField("create_time_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRayJobsRequest::getCreateTimeAfter, ListRayJobsRequest::setCreateTimeAfter));
        builder.<List<String>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRayJobsRequest::getStatus, ListRayJobsRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunRayJobRequest, RunRayJobResponse> runRayJob = genForRunRayJob();

    private static HttpRequestDef<RunRayJobRequest, RunRayJobResponse> genForRunRayJob() {
        // basic
        HttpRequestDef.Builder<RunRayJobRequest, RunRayJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunRayJobRequest.class, RunRayJobResponse.class)
                .withName("RunRayJob")
                .withUri("/v2/workspaces/{workspace_id}/ray-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunRayJobRequest::getWorkspaceId, RunRayJobRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunRayJobRequest::getXClientToken, RunRayJobRequest::setXClientToken));
        builder.<RunRayJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunRayJobRequestBody.class),
            f -> f.withMarshaller(RunRayJobRequest::getBody, RunRayJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRayJobRequest, ShowRayJobResponse> showRayJob = genForShowRayJob();

    private static HttpRequestDef<ShowRayJobRequest, ShowRayJobResponse> genForShowRayJob() {
        // basic
        HttpRequestDef.Builder<ShowRayJobRequest, ShowRayJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRayJobRequest.class, ShowRayJobResponse.class)
                .withName("ShowRayJob")
                .withUri("/v2/workspaces/{workspace_id}/ray-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRayJobRequest::getWorkspaceId, ShowRayJobRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRayJobRequest::getJobId, ShowRayJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CloseRaySessionRequest, CloseRaySessionResponse> closeRaySession =
        genForCloseRaySession();

    private static HttpRequestDef<CloseRaySessionRequest, CloseRaySessionResponse> genForCloseRaySession() {
        // basic
        HttpRequestDef.Builder<CloseRaySessionRequest, CloseRaySessionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CloseRaySessionRequest.class, CloseRaySessionResponse.class)
                .withName("CloseRaySession")
                .withUri("/v2/workspaces/{workspace_id}/ray-sessions/{session_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CloseRaySessionRequest::getWorkspaceId, CloseRaySessionRequest::setWorkspaceId));
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CloseRaySessionRequest::getSessionId, CloseRaySessionRequest::setSessionId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CloseRaySessionResponse::getXRequestId, CloseRaySessionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateRaySessionRequest, CreateRaySessionResponse> createRaySession =
        genForCreateRaySession();

    private static HttpRequestDef<CreateRaySessionRequest, CreateRaySessionResponse> genForCreateRaySession() {
        // basic
        HttpRequestDef.Builder<CreateRaySessionRequest, CreateRaySessionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRaySessionRequest.class, CreateRaySessionResponse.class)
                .withName("CreateRaySession")
                .withUri("/v2/workspaces/{workspace_id}/ray-sessions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRaySessionRequest::getWorkspaceId, CreateRaySessionRequest::setWorkspaceId));
        builder.<CreateRaySessionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRaySessionRequestBody.class),
            f -> f.withMarshaller(CreateRaySessionRequest::getBody, CreateRaySessionRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateRaySessionResponse::getXRequestId, CreateRaySessionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CancelSparkJobRequest, CancelSparkJobResponse> cancelSparkJob =
        genForCancelSparkJob();

    private static HttpRequestDef<CancelSparkJobRequest, CancelSparkJobResponse> genForCancelSparkJob() {
        // basic
        HttpRequestDef.Builder<CancelSparkJobRequest, CancelSparkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelSparkJobRequest.class, CancelSparkJobResponse.class)
                .withName("CancelSparkJob")
                .withUri("/v2/workspaces/{workspace_id}/spark-jobs/{job_id}/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelSparkJobRequest::getWorkspaceId, CancelSparkJobRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelSparkJobRequest::getJobId, CancelSparkJobRequest::setJobId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CancelSparkJobResponse::getBody, CancelSparkJobResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListSparkJobsRequest, ListSparkJobsResponse> listSparkJobs =
        genForListSparkJobs();

    private static HttpRequestDef<ListSparkJobsRequest, ListSparkJobsResponse> genForListSparkJobs() {
        // basic
        HttpRequestDef.Builder<ListSparkJobsRequest, ListSparkJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSparkJobsRequest.class, ListSparkJobsResponse.class)
                .withName("ListSparkJobs")
                .withUri("/v2/workspaces/{workspace_id}/spark-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getWorkspaceId, ListSparkJobsRequest::setWorkspaceId));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getMarker, ListSparkJobsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getLimit, ListSparkJobsRequest::setLimit));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getPageReverse, ListSparkJobsRequest::setPageReverse));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getName, ListSparkJobsRequest::setName));
        builder.<Long>withRequestField("create_time_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getCreateTimeAfter, ListSparkJobsRequest::setCreateTimeAfter));
        builder.<Long>withRequestField("create_time_before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getCreateTimeBefore,
                ListSparkJobsRequest::setCreateTimeBefore));
        builder.<String>withRequestField("endpoint_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getEndpointName, ListSparkJobsRequest::setEndpointName));
        builder.<List<String>>withRequestField("states",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getStates, ListSparkJobsRequest::setStates));
        builder.<ListSparkJobsRequest.JobTypeEnum>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSparkJobsRequest.JobTypeEnum.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getJobType, ListSparkJobsRequest::setJobType));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getJobId, ListSparkJobsRequest::setJobId));
        builder.<String>withRequestField("create_user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getCreateUserId, ListSparkJobsRequest::setCreateUserId));
        builder.<String>withRequestField("create_user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getCreateUserName, ListSparkJobsRequest::setCreateUserName));
        builder.<String>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getLabels, ListSparkJobsRequest::setLabels));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunSparkJobRequest, RunSparkJobResponse> runSparkJob = genForRunSparkJob();

    private static HttpRequestDef<RunSparkJobRequest, RunSparkJobResponse> genForRunSparkJob() {
        // basic
        HttpRequestDef.Builder<RunSparkJobRequest, RunSparkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunSparkJobRequest.class, RunSparkJobResponse.class)
                .withName("RunSparkJob")
                .withUri("/v2/workspaces/{workspace_id}/spark-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunSparkJobRequest::getWorkspaceId, RunSparkJobRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunSparkJobRequest::getXClientToken, RunSparkJobRequest::setXClientToken));
        builder.<RunSparkJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunSparkJobRequestBody.class),
            f -> f.withMarshaller(RunSparkJobRequest::getBody, RunSparkJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSparkJobRequest, ShowSparkJobResponse> showSparkJob = genForShowSparkJob();

    private static HttpRequestDef<ShowSparkJobRequest, ShowSparkJobResponse> genForShowSparkJob() {
        // basic
        HttpRequestDef.Builder<ShowSparkJobRequest, ShowSparkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSparkJobRequest.class, ShowSparkJobResponse.class)
                .withName("ShowSparkJob")
                .withUri("/v2/workspaces/{workspace_id}/spark-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkJobRequest::getWorkspaceId, ShowSparkJobRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkJobRequest::getJobId, ShowSparkJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSparkJobStateRequest, ShowSparkJobStateResponse> showSparkJobState =
        genForShowSparkJobState();

    private static HttpRequestDef<ShowSparkJobStateRequest, ShowSparkJobStateResponse> genForShowSparkJobState() {
        // basic
        HttpRequestDef.Builder<ShowSparkJobStateRequest, ShowSparkJobStateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSparkJobStateRequest.class, ShowSparkJobStateResponse.class)
                .withName("ShowSparkJobState")
                .withUri("/v2/workspaces/{workspace_id}/spark-jobs/{job_id}/state")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkJobStateRequest::getWorkspaceId, ShowSparkJobStateRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkJobStateRequest::getJobId, ShowSparkJobStateRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSparkOperatorStateRequest, ShowSparkOperatorStateResponse> showSparkOperatorState =
        genForShowSparkOperatorState();

    private static HttpRequestDef<ShowSparkOperatorStateRequest, ShowSparkOperatorStateResponse> genForShowSparkOperatorState() {
        // basic
        HttpRequestDef.Builder<ShowSparkOperatorStateRequest, ShowSparkOperatorStateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowSparkOperatorStateRequest.class, ShowSparkOperatorStateResponse.class)
            .withName("ShowSparkOperatorState")
            .withUri("/v2/workspaces/{workspace_id}/spark-operators/{operation_id}/show-state")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkOperatorStateRequest::getWorkspaceId,
                ShowSparkOperatorStateRequest::setWorkspaceId));
        builder.<String>withRequestField("operation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkOperatorStateRequest::getOperationId,
                ShowSparkOperatorStateRequest::setOperationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelSparkSqlRequest, CancelSparkSqlResponse> cancelSparkSql =
        genForCancelSparkSql();

    private static HttpRequestDef<CancelSparkSqlRequest, CancelSparkSqlResponse> genForCancelSparkSql() {
        // basic
        HttpRequestDef.Builder<CancelSparkSqlRequest, CancelSparkSqlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelSparkSqlRequest.class, CancelSparkSqlResponse.class)
                .withName("CancelSparkSql")
                .withUri("/v2/workspaces/{workspace_id}/spark-sqls/{statement_id}/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelSparkSqlRequest::getWorkspaceId, CancelSparkSqlRequest::setWorkspaceId));
        builder.<String>withRequestField("statement_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelSparkSqlRequest::getStatementId, CancelSparkSqlRequest::setStatementId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CancelSparkSqlResponse::getBody, CancelSparkSqlResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListSparkSqlsRequest, ListSparkSqlsResponse> listSparkSqls =
        genForListSparkSqls();

    private static HttpRequestDef<ListSparkSqlsRequest, ListSparkSqlsResponse> genForListSparkSqls() {
        // basic
        HttpRequestDef.Builder<ListSparkSqlsRequest, ListSparkSqlsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSparkSqlsRequest.class, ListSparkSqlsResponse.class)
                .withName("ListSparkSqls")
                .withUri("/v2/workspaces/{workspace_id}/spark-sqls")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getWorkspaceId, ListSparkSqlsRequest::setWorkspaceId));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getMarker, ListSparkSqlsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getLimit, ListSparkSqlsRequest::setLimit));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getPageReverse, ListSparkSqlsRequest::setPageReverse));
        builder.<String>withRequestField("endpoint_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getEndpointName, ListSparkSqlsRequest::setEndpointName));
        builder.<String>withRequestField("statement",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getStatement, ListSparkSqlsRequest::setStatement));
        builder.<Long>withRequestField("create_time_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getCreateTimeAfter, ListSparkSqlsRequest::setCreateTimeAfter));
        builder.<Long>withRequestField("create_time_before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getCreateTimeBefore,
                ListSparkSqlsRequest::setCreateTimeBefore));
        builder.<List<String>>withRequestField("states",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getStates, ListSparkSqlsRequest::setStates));
        builder.<List<String>>withRequestField("statement_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getStatementTypes, ListSparkSqlsRequest::setStatementTypes));
        builder.<String>withRequestField("statement_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getStatementId, ListSparkSqlsRequest::setStatementId));
        builder.<String>withRequestField("create_user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getCreateUserId, ListSparkSqlsRequest::setCreateUserId));
        builder.<String>withRequestField("create_user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getCreateUserName, ListSparkSqlsRequest::setCreateUserName));
        builder.<String>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getLabels, ListSparkSqlsRequest::setLabels));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PreviewSparkSqlResultRequest, PreviewSparkSqlResultResponse> previewSparkSqlResult =
        genForPreviewSparkSqlResult();

    private static HttpRequestDef<PreviewSparkSqlResultRequest, PreviewSparkSqlResultResponse> genForPreviewSparkSqlResult() {
        // basic
        HttpRequestDef.Builder<PreviewSparkSqlResultRequest, PreviewSparkSqlResultResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, PreviewSparkSqlResultRequest.class, PreviewSparkSqlResultResponse.class)
            .withName("PreviewSparkSqlResult")
            .withUri("/v2/workspaces/{workspace_id}/spark-sqls/{statement_id}/preview")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PreviewSparkSqlResultRequest::getWorkspaceId,
                PreviewSparkSqlResultRequest::setWorkspaceId));
        builder.<String>withRequestField("statement_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PreviewSparkSqlResultRequest::getStatementId,
                PreviewSparkSqlResultRequest::setStatementId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartSparkSqlClusterRequest, RestartSparkSqlClusterResponse> restartSparkSqlCluster =
        genForRestartSparkSqlCluster();

    private static HttpRequestDef<RestartSparkSqlClusterRequest, RestartSparkSqlClusterResponse> genForRestartSparkSqlCluster() {
        // basic
        HttpRequestDef.Builder<RestartSparkSqlClusterRequest, RestartSparkSqlClusterResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RestartSparkSqlClusterRequest.class, RestartSparkSqlClusterResponse.class)
            .withName("RestartSparkSqlCluster")
            .withUri("/v2/workspaces/{workspace_id}/endpoints/{endpoint_name}/spark-sqls/restart-cluster")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartSparkSqlClusterRequest::getWorkspaceId,
                RestartSparkSqlClusterRequest::setWorkspaceId));
        builder.<String>withRequestField("endpoint_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartSparkSqlClusterRequest::getEndpointName,
                RestartSparkSqlClusterRequest::setEndpointName));
        builder.<RestartSparkSqlClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestartSparkSqlClusterRequestBody.class),
            f -> f.withMarshaller(RestartSparkSqlClusterRequest::getBody, RestartSparkSqlClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunSparkSqlRequest, RunSparkSqlResponse> runSparkSql = genForRunSparkSql();

    private static HttpRequestDef<RunSparkSqlRequest, RunSparkSqlResponse> genForRunSparkSql() {
        // basic
        HttpRequestDef.Builder<RunSparkSqlRequest, RunSparkSqlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunSparkSqlRequest.class, RunSparkSqlResponse.class)
                .withName("RunSparkSql")
                .withUri("/v2/workspaces/{workspace_id}/spark-sqls")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunSparkSqlRequest::getWorkspaceId, RunSparkSqlRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunSparkSqlRequest::getXClientToken, RunSparkSqlRequest::setXClientToken));
        builder.<RunSparkSqlRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunSparkSqlRequestBody.class),
            f -> f.withMarshaller(RunSparkSqlRequest::getBody, RunSparkSqlRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSparkSqlRequest, ShowSparkSqlResponse> showSparkSql = genForShowSparkSql();

    private static HttpRequestDef<ShowSparkSqlRequest, ShowSparkSqlResponse> genForShowSparkSql() {
        // basic
        HttpRequestDef.Builder<ShowSparkSqlRequest, ShowSparkSqlResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSparkSqlRequest.class, ShowSparkSqlResponse.class)
                .withName("ShowSparkSql")
                .withUri("/v2/workspaces/{workspace_id}/spark-sqls/{statement_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkSqlRequest::getWorkspaceId, ShowSparkSqlRequest::setWorkspaceId));
        builder.<String>withRequestField("statement_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkSqlRequest::getStatementId, ShowSparkSqlRequest::setStatementId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSparkSqlStateRequest, ShowSparkSqlStateResponse> showSparkSqlState =
        genForShowSparkSqlState();

    private static HttpRequestDef<ShowSparkSqlStateRequest, ShowSparkSqlStateResponse> genForShowSparkSqlState() {
        // basic
        HttpRequestDef.Builder<ShowSparkSqlStateRequest, ShowSparkSqlStateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSparkSqlStateRequest.class, ShowSparkSqlStateResponse.class)
                .withName("ShowSparkSqlState")
                .withUri("/v2/workspaces/{workspace_id}/spark-sqls/{statement_id}/state")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkSqlStateRequest::getWorkspaceId, ShowSparkSqlStateRequest::setWorkspaceId));
        builder.<String>withRequestField("statement_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkSqlStateRequest::getStatementId, ShowSparkSqlStateRequest::setStatementId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateV2ResourceTagsRequest, BatchCreateV2ResourceTagsResponse> batchCreateV2ResourceTags =
        genForBatchCreateV2ResourceTags();

    private static HttpRequestDef<BatchCreateV2ResourceTagsRequest, BatchCreateV2ResourceTagsResponse> genForBatchCreateV2ResourceTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateV2ResourceTagsRequest, BatchCreateV2ResourceTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateV2ResourceTagsRequest.class,
                    BatchCreateV2ResourceTagsResponse.class)
                .withName("BatchCreateV2ResourceTags")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<TagResourceType>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagResourceType.class),
            f -> f.withMarshaller(BatchCreateV2ResourceTagsRequest::getResourceType,
                BatchCreateV2ResourceTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateV2ResourceTagsRequest::getResourceId,
                BatchCreateV2ResourceTagsRequest::setResourceId));
        builder.<V2BatchCreateTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(V2BatchCreateTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateV2ResourceTagsRequest::getBody,
                BatchCreateV2ResourceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteV2ResourceTagsRequest, BatchDeleteV2ResourceTagsResponse> batchDeleteV2ResourceTags =
        genForBatchDeleteV2ResourceTags();

    private static HttpRequestDef<BatchDeleteV2ResourceTagsRequest, BatchDeleteV2ResourceTagsResponse> genForBatchDeleteV2ResourceTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteV2ResourceTagsRequest, BatchDeleteV2ResourceTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteV2ResourceTagsRequest.class,
                    BatchDeleteV2ResourceTagsResponse.class)
                .withName("BatchDeleteV2ResourceTags")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<TagResourceType>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagResourceType.class),
            f -> f.withMarshaller(BatchDeleteV2ResourceTagsRequest::getResourceType,
                BatchDeleteV2ResourceTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteV2ResourceTagsRequest::getResourceId,
                BatchDeleteV2ResourceTagsRequest::setResourceId));
        builder.<V2BatchDeleteTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(V2BatchDeleteTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteV2ResourceTagsRequest::getBody,
                BatchDeleteV2ResourceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountV2TagResourcesRequest, CountV2TagResourcesResponse> countV2TagResources =
        genForCountV2TagResources();

    private static HttpRequestDef<CountV2TagResourcesRequest, CountV2TagResourcesResponse> genForCountV2TagResources() {
        // basic
        HttpRequestDef.Builder<CountV2TagResourcesRequest, CountV2TagResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CountV2TagResourcesRequest.class, CountV2TagResourcesResponse.class)
                .withName("CountV2TagResources")
                .withUri("/v2/{project_id}/{resource_type}/resource-instances/count")
                .withContentType("application/json");

        // requests
        builder.<TagResourceType>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagResourceType.class),
            f -> f.withMarshaller(CountV2TagResourcesRequest::getResourceType,
                CountV2TagResourcesRequest::setResourceType));
        builder.<List<EngineType>>withRequestField("engine_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountV2TagResourcesRequest::getEngineTypes,
                CountV2TagResourcesRequest::setEngineTypes));
        builder.<V2ListTagResourcesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(V2ListTagResourcesRequestBody.class),
            f -> f.withMarshaller(CountV2TagResourcesRequest::getBody, CountV2TagResourcesRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CountV2TagResourcesResponse::getXRequestId,
                CountV2TagResourcesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListV2ProjectTagsRequest, ListV2ProjectTagsResponse> listV2ProjectTags =
        genForListV2ProjectTags();

    private static HttpRequestDef<ListV2ProjectTagsRequest, ListV2ProjectTagsResponse> genForListV2ProjectTags() {
        // basic
        HttpRequestDef.Builder<ListV2ProjectTagsRequest, ListV2ProjectTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListV2ProjectTagsRequest.class, ListV2ProjectTagsResponse.class)
                .withName("ListV2ProjectTags")
                .withUri("/v2/{project_id}/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<TagResourceType>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagResourceType.class),
            f -> f.withMarshaller(ListV2ProjectTagsRequest::getResourceType,
                ListV2ProjectTagsRequest::setResourceType));
        builder.<Boolean>withRequestField("use_predefine_tags",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListV2ProjectTagsRequest::getUsePredefineTags,
                ListV2ProjectTagsRequest::setUsePredefineTags));
        builder.<List<EngineType>>withRequestField("engine_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListV2ProjectTagsRequest::getEngineTypes, ListV2ProjectTagsRequest::setEngineTypes));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2ProjectTagsRequest::getOffset, ListV2ProjectTagsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2ProjectTagsRequest::getLimit, ListV2ProjectTagsRequest::setLimit));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListV2ProjectTagsResponse::getXRequestId, ListV2ProjectTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListV2ResourceTagsRequest, ListV2ResourceTagsResponse> listV2ResourceTags =
        genForListV2ResourceTags();

    private static HttpRequestDef<ListV2ResourceTagsRequest, ListV2ResourceTagsResponse> genForListV2ResourceTags() {
        // basic
        HttpRequestDef.Builder<ListV2ResourceTagsRequest, ListV2ResourceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListV2ResourceTagsRequest.class, ListV2ResourceTagsResponse.class)
                .withName("ListV2ResourceTags")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<TagResourceType>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagResourceType.class),
            f -> f.withMarshaller(ListV2ResourceTagsRequest::getResourceType,
                ListV2ResourceTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2ResourceTagsRequest::getResourceId, ListV2ResourceTagsRequest::setResourceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2ResourceTagsRequest::getOffset, ListV2ResourceTagsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2ResourceTagsRequest::getLimit, ListV2ResourceTagsRequest::setLimit));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListV2ResourceTagsResponse::getXRequestId,
                ListV2ResourceTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListV2TagResourcesRequest, ListV2TagResourcesResponse> listV2TagResources =
        genForListV2TagResources();

    private static HttpRequestDef<ListV2TagResourcesRequest, ListV2TagResourcesResponse> genForListV2TagResources() {
        // basic
        HttpRequestDef.Builder<ListV2TagResourcesRequest, ListV2TagResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListV2TagResourcesRequest.class, ListV2TagResourcesResponse.class)
                .withName("ListV2TagResources")
                .withUri("/v2/{project_id}/{resource_type}/resource-instances/filter")
                .withContentType("application/json");

        // requests
        builder.<TagResourceType>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagResourceType.class),
            f -> f.withMarshaller(ListV2TagResourcesRequest::getResourceType,
                ListV2TagResourcesRequest::setResourceType));
        builder.<List<EngineType>>withRequestField("engine_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListV2TagResourcesRequest::getEngineTypes,
                ListV2TagResourcesRequest::setEngineTypes));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2TagResourcesRequest::getOffset, ListV2TagResourcesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2TagResourcesRequest::getLimit, ListV2TagResourcesRequest::setLimit));
        builder.<V2ListTagResourcesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(V2ListTagResourcesRequestBody.class),
            f -> f.withMarshaller(ListV2TagResourcesRequest::getBody, ListV2TagResourcesRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListV2TagResourcesResponse::getXRequestId,
                ListV2TagResourcesResponse::setXRequestId));
        return builder.build();
    }

}
