package com.huaweicloud.sdk.live.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.live.v1.model.AddFlowOutputsRequest;
import com.huaweicloud.sdk.live.v1.model.BatchShowIpBelongsRequest;
import com.huaweicloud.sdk.live.v1.model.BatchShowIpBelongsResponse;
import com.huaweicloud.sdk.live.v1.model.CallbackUrl;
import com.huaweicloud.sdk.live.v1.model.CheckDomainVerificationInfo;
import com.huaweicloud.sdk.live.v1.model.CheckDomainVerificationRequest;
import com.huaweicloud.sdk.live.v1.model.CheckDomainVerificationResponse;
import com.huaweicloud.sdk.live.v1.model.CreateDomainMappingRequest;
import com.huaweicloud.sdk.live.v1.model.CreateDomainMappingResponse;
import com.huaweicloud.sdk.live.v1.model.CreateDomainRequest;
import com.huaweicloud.sdk.live.v1.model.CreateDomainResponse;
import com.huaweicloud.sdk.live.v1.model.CreateFlowOutputRequest;
import com.huaweicloud.sdk.live.v1.model.CreateFlowOutputResponse;
import com.huaweicloud.sdk.live.v1.model.CreateFlowsRequest;
import com.huaweicloud.sdk.live.v1.model.CreateFlowsRequestBody;
import com.huaweicloud.sdk.live.v1.model.CreateFlowsResponse;
import com.huaweicloud.sdk.live.v1.model.CreateHarvestTaskInfoReq;
import com.huaweicloud.sdk.live.v1.model.CreateHarvestTaskRequest;
import com.huaweicloud.sdk.live.v1.model.CreateHarvestTaskResponse;
import com.huaweicloud.sdk.live.v1.model.CreateOttChannelInfoReq;
import com.huaweicloud.sdk.live.v1.model.CreateOttChannelInfoRequest;
import com.huaweicloud.sdk.live.v1.model.CreateOttChannelInfoResponse;
import com.huaweicloud.sdk.live.v1.model.CreatePullTaskRequest;
import com.huaweicloud.sdk.live.v1.model.CreatePullTaskResponse;
import com.huaweicloud.sdk.live.v1.model.CreateRecordCallbackConfigRequest;
import com.huaweicloud.sdk.live.v1.model.CreateRecordCallbackConfigResponse;
import com.huaweicloud.sdk.live.v1.model.CreateRecordIndexRequest;
import com.huaweicloud.sdk.live.v1.model.CreateRecordIndexResponse;
import com.huaweicloud.sdk.live.v1.model.CreateRecordRuleRequest;
import com.huaweicloud.sdk.live.v1.model.CreateRecordRuleResponse;
import com.huaweicloud.sdk.live.v1.model.CreateScheduleRecordTasksRequest;
import com.huaweicloud.sdk.live.v1.model.CreateScheduleRecordTasksResponse;
import com.huaweicloud.sdk.live.v1.model.CreateSnapshotConfigRequest;
import com.huaweicloud.sdk.live.v1.model.CreateSnapshotConfigResponse;
import com.huaweicloud.sdk.live.v1.model.CreateStreamForbiddenOnceRequest;
import com.huaweicloud.sdk.live.v1.model.CreateStreamForbiddenOnceResponse;
import com.huaweicloud.sdk.live.v1.model.CreateStreamForbiddenRequest;
import com.huaweicloud.sdk.live.v1.model.CreateStreamForbiddenResponse;
import com.huaweicloud.sdk.live.v1.model.CreateTranscodingsTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.CreateTranscodingsTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.CreateUrlAuthchainReq;
import com.huaweicloud.sdk.live.v1.model.CreateUrlAuthchainRequest;
import com.huaweicloud.sdk.live.v1.model.CreateUrlAuthchainResponse;
import com.huaweicloud.sdk.live.v1.model.CreateWatermarkRuleRequest;
import com.huaweicloud.sdk.live.v1.model.CreateWatermarkRuleResponse;
import com.huaweicloud.sdk.live.v1.model.CreateWatermarkTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.CreateWatermarkTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainHttpsCertRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainHttpsCertResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainKeyChainRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainKeyChainResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainMappingRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainMappingResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteFlowOutputRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteFlowOutputResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteFlowRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteFlowResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteHarvestTaskRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteHarvestTaskResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteOttChannelInfoRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteOttChannelInfoResponse;
import com.huaweicloud.sdk.live.v1.model.DeletePublishTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.DeletePublishTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.DeletePullTaskRequest;
import com.huaweicloud.sdk.live.v1.model.DeletePullTaskResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteRecordCallbackConfigRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteRecordCallbackConfigResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteRecordRuleRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteRecordRuleResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteRefererChainRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteRefererChainResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteScheduleRecordTasksRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteScheduleRecordTasksResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteSnapshotConfigRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteSnapshotConfigResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteStreamForbiddenRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteStreamForbiddenResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteTranscodingsTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteTranscodingsTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteWatermarkRuleRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteWatermarkRuleResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteWatermarkTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteWatermarkTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.DomainHttpsCertInfo;
import com.huaweicloud.sdk.live.v1.model.DomainIpv6SwitchReq;
import com.huaweicloud.sdk.live.v1.model.DomainMapping;
import com.huaweicloud.sdk.live.v1.model.GeoBlockingConfigInfo;
import com.huaweicloud.sdk.live.v1.model.IPAuthInfo;
import com.huaweicloud.sdk.live.v1.model.KeyChainInfo;
import com.huaweicloud.sdk.live.v1.model.ListCesDimsInfoRequest;
import com.huaweicloud.sdk.live.v1.model.ListCesDimsInfoResponse;
import com.huaweicloud.sdk.live.v1.model.ListCesInstanceRequest;
import com.huaweicloud.sdk.live.v1.model.ListCesInstanceRequestBody;
import com.huaweicloud.sdk.live.v1.model.ListCesInstanceResponse;
import com.huaweicloud.sdk.live.v1.model.ListDelayConfigRequest;
import com.huaweicloud.sdk.live.v1.model.ListDelayConfigResponse;
import com.huaweicloud.sdk.live.v1.model.ListFlowsRequest;
import com.huaweicloud.sdk.live.v1.model.ListFlowsResponse;
import com.huaweicloud.sdk.live.v1.model.ListGeoBlockingConfigRequest;
import com.huaweicloud.sdk.live.v1.model.ListGeoBlockingConfigResponse;
import com.huaweicloud.sdk.live.v1.model.ListHarvestTaskRequest;
import com.huaweicloud.sdk.live.v1.model.ListHarvestTaskResponse;
import com.huaweicloud.sdk.live.v1.model.ListHlsConfigRequest;
import com.huaweicloud.sdk.live.v1.model.ListHlsConfigResponse;
import com.huaweicloud.sdk.live.v1.model.ListIpAuthListRequest;
import com.huaweicloud.sdk.live.v1.model.ListIpAuthListResponse;
import com.huaweicloud.sdk.live.v1.model.ListLiveSampleLogsRequest;
import com.huaweicloud.sdk.live.v1.model.ListLiveSampleLogsResponse;
import com.huaweicloud.sdk.live.v1.model.ListLiveStreamsOnlineRequest;
import com.huaweicloud.sdk.live.v1.model.ListLiveStreamsOnlineResponse;
import com.huaweicloud.sdk.live.v1.model.ListOttChannelInfoRequest;
import com.huaweicloud.sdk.live.v1.model.ListOttChannelInfoResponse;
import com.huaweicloud.sdk.live.v1.model.ListPublishTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.ListPublishTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.ListPullTasksRequest;
import com.huaweicloud.sdk.live.v1.model.ListPullTasksResponse;
import com.huaweicloud.sdk.live.v1.model.ListRecordCallbackConfigsRequest;
import com.huaweicloud.sdk.live.v1.model.ListRecordCallbackConfigsResponse;
import com.huaweicloud.sdk.live.v1.model.ListRecordContentsRequest;
import com.huaweicloud.sdk.live.v1.model.ListRecordContentsResponse;
import com.huaweicloud.sdk.live.v1.model.ListRecordRulesRequest;
import com.huaweicloud.sdk.live.v1.model.ListRecordRulesResponse;
import com.huaweicloud.sdk.live.v1.model.ListScheduleRecordTasksRequest;
import com.huaweicloud.sdk.live.v1.model.ListScheduleRecordTasksResponse;
import com.huaweicloud.sdk.live.v1.model.ListSnapshotConfigsRequest;
import com.huaweicloud.sdk.live.v1.model.ListSnapshotConfigsResponse;
import com.huaweicloud.sdk.live.v1.model.ListStreamForbiddenRequest;
import com.huaweicloud.sdk.live.v1.model.ListStreamForbiddenResponse;
import com.huaweicloud.sdk.live.v1.model.ListWatermarkRuleRequest;
import com.huaweicloud.sdk.live.v1.model.ListWatermarkRuleResponse;
import com.huaweicloud.sdk.live.v1.model.ListWatermarkTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.ListWatermarkTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.LiveDomainCreateReq;
import com.huaweicloud.sdk.live.v1.model.LiveDomainModifyReq;
import com.huaweicloud.sdk.live.v1.model.LivePullStreamTask;
import com.huaweicloud.sdk.live.v1.model.LiveSnapshotConfig;
import com.huaweicloud.sdk.live.v1.model.ModifyDelayConfig;
import com.huaweicloud.sdk.live.v1.model.ModifyFlowOutputRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyFlowOutputResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyFlowSourcesRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyFlowSourcesRequestBody;
import com.huaweicloud.sdk.live.v1.model.ModifyFlowSourcesResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyFlowStartRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyFlowStartResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyFlowStopRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyFlowStopResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyHarvestTaskRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyHarvestTaskRequestBody;
import com.huaweicloud.sdk.live.v1.model.ModifyHarvestTaskResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyHlsConfig;
import com.huaweicloud.sdk.live.v1.model.ModifyLivePullStreamTask;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelEncoderSettings;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelEndPointsReq;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelGeneral;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoEncoderSettingsRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoEncoderSettingsResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoEndPointsRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoEndPointsResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoGeneralRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoGeneralResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoInputRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoInputResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoRecordSettingsRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoRecordSettingsResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoStatsRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoStatsResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInputReq;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelRecordSettings;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelState;
import com.huaweicloud.sdk.live.v1.model.ModifyPullSourcesConfig;
import com.huaweicloud.sdk.live.v1.model.ModifyPullTaskRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyPullTaskResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyWatermarkRule;
import com.huaweicloud.sdk.live.v1.model.ObsAuthorityConfigV2;
import com.huaweicloud.sdk.live.v1.model.RecordCallbackConfigRequest;
import com.huaweicloud.sdk.live.v1.model.RecordControlInfo;
import com.huaweicloud.sdk.live.v1.model.RecordIndexRequestBody;
import com.huaweicloud.sdk.live.v1.model.RecordRuleRequest;
import com.huaweicloud.sdk.live.v1.model.RunRecordRequest;
import com.huaweicloud.sdk.live.v1.model.RunRecordResponse;
import com.huaweicloud.sdk.live.v1.model.ScheduleRecordTasksReq;
import com.huaweicloud.sdk.live.v1.model.SetRefererChainInfo;
import com.huaweicloud.sdk.live.v1.model.SetRefererChainRequest;
import com.huaweicloud.sdk.live.v1.model.SetRefererChainResponse;
import com.huaweicloud.sdk.live.v1.model.ShowCertificateInfoRequest;
import com.huaweicloud.sdk.live.v1.model.ShowCertificateInfoResponse;
import com.huaweicloud.sdk.live.v1.model.ShowChannelStatisticReq;
import com.huaweicloud.sdk.live.v1.model.ShowChannelStatisticRequest;
import com.huaweicloud.sdk.live.v1.model.ShowChannelStatisticResponse;
import com.huaweicloud.sdk.live.v1.model.ShowDomainHttpsCertRequest;
import com.huaweicloud.sdk.live.v1.model.ShowDomainHttpsCertResponse;
import com.huaweicloud.sdk.live.v1.model.ShowDomainKeyChainRequest;
import com.huaweicloud.sdk.live.v1.model.ShowDomainKeyChainResponse;
import com.huaweicloud.sdk.live.v1.model.ShowDomainRequest;
import com.huaweicloud.sdk.live.v1.model.ShowDomainResponse;
import com.huaweicloud.sdk.live.v1.model.ShowDomainVerificationRequest;
import com.huaweicloud.sdk.live.v1.model.ShowDomainVerificationResponse;
import com.huaweicloud.sdk.live.v1.model.ShowFlowDetailRequest;
import com.huaweicloud.sdk.live.v1.model.ShowFlowDetailResponse;
import com.huaweicloud.sdk.live.v1.model.ShowOutputInfoRequest;
import com.huaweicloud.sdk.live.v1.model.ShowOutputInfoResponse;
import com.huaweicloud.sdk.live.v1.model.ShowPullSourcesConfigRequest;
import com.huaweicloud.sdk.live.v1.model.ShowPullSourcesConfigResponse;
import com.huaweicloud.sdk.live.v1.model.ShowRecordCallbackConfigRequest;
import com.huaweicloud.sdk.live.v1.model.ShowRecordCallbackConfigResponse;
import com.huaweicloud.sdk.live.v1.model.ShowRecordRuleRequest;
import com.huaweicloud.sdk.live.v1.model.ShowRecordRuleResponse;
import com.huaweicloud.sdk.live.v1.model.ShowRefererChainRequest;
import com.huaweicloud.sdk.live.v1.model.ShowRefererChainResponse;
import com.huaweicloud.sdk.live.v1.model.ShowTranscodingsTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.ShowTranscodingsTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.ShowWatermarkRuleRequest;
import com.huaweicloud.sdk.live.v1.model.ShowWatermarkRuleResponse;
import com.huaweicloud.sdk.live.v1.model.ShowWatermarkTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.ShowWatermarkTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.StreamForbiddenOnceSetting;
import com.huaweicloud.sdk.live.v1.model.StreamForbiddenSetting;
import com.huaweicloud.sdk.live.v1.model.StreamTranscodingTemplate;
import com.huaweicloud.sdk.live.v1.model.UpdateDelayConfigRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateDelayConfigResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateDomainHttpsCertRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateDomainHttpsCertResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateDomainIp6SwitchRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateDomainIp6SwitchResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateDomainKeyChainRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateDomainKeyChainResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateDomainRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateDomainResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateFlowOutputRequestBody;
import com.huaweicloud.sdk.live.v1.model.UpdateGeoBlockingConfigRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateGeoBlockingConfigResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateHarvestJobStatusRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateHarvestJobStatusRequestBody;
import com.huaweicloud.sdk.live.v1.model.UpdateHarvestJobStatusResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateHlsConfigRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateHlsConfigResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateIpAuthListRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateIpAuthListResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateObsBucketAuthorityPublicRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateObsBucketAuthorityPublicResponse;
import com.huaweicloud.sdk.live.v1.model.UpdatePublishTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.UpdatePublishTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.UpdatePullSourcesConfigRequest;
import com.huaweicloud.sdk.live.v1.model.UpdatePullSourcesConfigResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateRecordCallbackConfigRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateRecordCallbackConfigResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateRecordRuleRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateRecordRuleResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateSnapshotConfigRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateSnapshotConfigResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateStreamForbiddenRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateStreamForbiddenResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateTranscodingsTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateTranscodingsTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateWatermarkRuleRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateWatermarkRuleResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateWatermarkTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateWatermarkTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.WatermarkRule;
import com.huaweicloud.sdk.live.v1.model.WatermarkTemplate;

import java.time.OffsetDateTime;
import java.util.List;

@SuppressWarnings("unchecked")
public class LiveMeta {

    public static final HttpRequestDef<BatchShowIpBelongsRequest, BatchShowIpBelongsResponse> batchShowIpBelongs =
        genForBatchShowIpBelongs();

    private static HttpRequestDef<BatchShowIpBelongsRequest, BatchShowIpBelongsResponse> genForBatchShowIpBelongs() {
        // basic
        HttpRequestDef.Builder<BatchShowIpBelongsRequest, BatchShowIpBelongsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, BatchShowIpBelongsRequest.class, BatchShowIpBelongsResponse.class)
                .withName("BatchShowIpBelongs")
                .withUri("/v1/{project_id}/cdn/ip-info")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchShowIpBelongsRequest::getIp, BatchShowIpBelongsRequest::setIp));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckDomainVerificationRequest, CheckDomainVerificationResponse> checkDomainVerification =
        genForCheckDomainVerification();

    private static HttpRequestDef<CheckDomainVerificationRequest, CheckDomainVerificationResponse> genForCheckDomainVerification() {
        // basic
        HttpRequestDef.Builder<CheckDomainVerificationRequest, CheckDomainVerificationResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CheckDomainVerificationRequest.class, CheckDomainVerificationResponse.class)
            .withName("CheckDomainVerification")
            .withUri("/v1/{project_id}/domain/verification")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<CheckDomainVerificationInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckDomainVerificationInfo.class),
            f -> f.withMarshaller(CheckDomainVerificationRequest::getBody, CheckDomainVerificationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDomainRequest, CreateDomainResponse> createDomain = genForCreateDomain();

    private static HttpRequestDef<CreateDomainRequest, CreateDomainResponse> genForCreateDomain() {
        // basic
        HttpRequestDef.Builder<CreateDomainRequest, CreateDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDomainRequest.class, CreateDomainResponse.class)
                .withName("CreateDomain")
                .withUri("/v1/{project_id}/domain")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<LiveDomainCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LiveDomainCreateReq.class),
            f -> f.withMarshaller(CreateDomainRequest::getBody, CreateDomainRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDomainMappingRequest, CreateDomainMappingResponse> createDomainMapping =
        genForCreateDomainMapping();

    private static HttpRequestDef<CreateDomainMappingRequest, CreateDomainMappingResponse> genForCreateDomainMapping() {
        // basic
        HttpRequestDef.Builder<CreateDomainMappingRequest, CreateDomainMappingResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CreateDomainMappingRequest.class, CreateDomainMappingResponse.class)
                .withName("CreateDomainMapping")
                .withUri("/v1/{project_id}/domains_mapping")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<DomainMapping>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DomainMapping.class),
            f -> f.withMarshaller(CreateDomainMappingRequest::getBody, CreateDomainMappingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlowOutputRequest, CreateFlowOutputResponse> createFlowOutput =
        genForCreateFlowOutput();

    private static HttpRequestDef<CreateFlowOutputRequest, CreateFlowOutputResponse> genForCreateFlowOutput() {
        // basic
        HttpRequestDef.Builder<CreateFlowOutputRequest, CreateFlowOutputResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFlowOutputRequest.class, CreateFlowOutputResponse.class)
                .withName("CreateFlowOutput")
                .withUri("/v1/{project_id}/flows/outputs")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("flow_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFlowOutputRequest::getFlowId, CreateFlowOutputRequest::setFlowId));
        builder.<List<AddFlowOutputsRequest>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateFlowOutputRequest::getBody, CreateFlowOutputRequest::setBody)
                .withInnerContainerType(AddFlowOutputsRequest.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlowsRequest, CreateFlowsResponse> createFlows = genForCreateFlows();

    private static HttpRequestDef<CreateFlowsRequest, CreateFlowsResponse> genForCreateFlows() {
        // basic
        HttpRequestDef.Builder<CreateFlowsRequest, CreateFlowsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFlowsRequest.class, CreateFlowsResponse.class)
                .withName("CreateFlows")
                .withUri("/v1/{project_id}/flows")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<CreateFlowsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFlowsRequestBody.class),
            f -> f.withMarshaller(CreateFlowsRequest::getBody, CreateFlowsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePullTaskRequest, CreatePullTaskResponse> createPullTask =
        genForCreatePullTask();

    private static HttpRequestDef<CreatePullTaskRequest, CreatePullTaskResponse> genForCreatePullTask() {
        // basic
        HttpRequestDef.Builder<CreatePullTaskRequest, CreatePullTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePullTaskRequest.class, CreatePullTaskResponse.class)
                .withName("CreatePullTask")
                .withUri("/v1/{project_id}/pull/stream/task")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<LivePullStreamTask>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LivePullStreamTask.class),
            f -> f.withMarshaller(CreatePullTaskRequest::getBody, CreatePullTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordCallbackConfigRequest, CreateRecordCallbackConfigResponse> createRecordCallbackConfig =
        genForCreateRecordCallbackConfig();

    private static HttpRequestDef<CreateRecordCallbackConfigRequest, CreateRecordCallbackConfigResponse> genForCreateRecordCallbackConfig() {
        // basic
        HttpRequestDef.Builder<CreateRecordCallbackConfigRequest, CreateRecordCallbackConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateRecordCallbackConfigRequest.class,
                    CreateRecordCallbackConfigResponse.class)
                .withName("CreateRecordCallbackConfig")
                .withUri("/v1/{project_id}/record/callbacks")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<RecordCallbackConfigRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecordCallbackConfigRequest.class),
            f -> f.withMarshaller(CreateRecordCallbackConfigRequest::getBody,
                CreateRecordCallbackConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordIndexRequest, CreateRecordIndexResponse> createRecordIndex =
        genForCreateRecordIndex();

    private static HttpRequestDef<CreateRecordIndexRequest, CreateRecordIndexResponse> genForCreateRecordIndex() {
        // basic
        HttpRequestDef.Builder<CreateRecordIndexRequest, CreateRecordIndexResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRecordIndexRequest.class, CreateRecordIndexResponse.class)
                .withName("CreateRecordIndex")
                .withUri("/v1/{project_id}/record/indexes")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<RecordIndexRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecordIndexRequestBody.class),
            f -> f.withMarshaller(CreateRecordIndexRequest::getBody, CreateRecordIndexRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateRecordIndexResponse::getXRequestId, CreateRecordIndexResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordRuleRequest, CreateRecordRuleResponse> createRecordRule =
        genForCreateRecordRule();

    private static HttpRequestDef<CreateRecordRuleRequest, CreateRecordRuleResponse> genForCreateRecordRule() {
        // basic
        HttpRequestDef.Builder<CreateRecordRuleRequest, CreateRecordRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRecordRuleRequest.class, CreateRecordRuleResponse.class)
                .withName("CreateRecordRule")
                .withUri("/v1/{project_id}/record/rules")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<RecordRuleRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecordRuleRequest.class),
            f -> f.withMarshaller(CreateRecordRuleRequest::getBody, CreateRecordRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateScheduleRecordTasksRequest, CreateScheduleRecordTasksResponse> createScheduleRecordTasks =
        genForCreateScheduleRecordTasks();

    private static HttpRequestDef<CreateScheduleRecordTasksRequest, CreateScheduleRecordTasksResponse> genForCreateScheduleRecordTasks() {
        // basic
        HttpRequestDef.Builder<CreateScheduleRecordTasksRequest, CreateScheduleRecordTasksResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateScheduleRecordTasksRequest.class,
                    CreateScheduleRecordTasksResponse.class)
                .withName("CreateScheduleRecordTasks")
                .withUri("/v1/{project_id}/schedule/record/tasks")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<ScheduleRecordTasksReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ScheduleRecordTasksReq.class),
            f -> f.withMarshaller(CreateScheduleRecordTasksRequest::getBody,
                CreateScheduleRecordTasksRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateScheduleRecordTasksResponse::getXRequestId,
                CreateScheduleRecordTasksResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateSnapshotConfigRequest, CreateSnapshotConfigResponse> createSnapshotConfig =
        genForCreateSnapshotConfig();

    private static HttpRequestDef<CreateSnapshotConfigRequest, CreateSnapshotConfigResponse> genForCreateSnapshotConfig() {
        // basic
        HttpRequestDef.Builder<CreateSnapshotConfigRequest, CreateSnapshotConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSnapshotConfigRequest.class, CreateSnapshotConfigResponse.class)
            .withName("CreateSnapshotConfig")
            .withUri("/v1/{project_id}/stream/snapshot")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<LiveSnapshotConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LiveSnapshotConfig.class),
            f -> f.withMarshaller(CreateSnapshotConfigRequest::getBody, CreateSnapshotConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse> createStreamForbidden =
        genForCreateStreamForbidden();

    private static HttpRequestDef<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse> genForCreateStreamForbidden() {
        // basic
        HttpRequestDef.Builder<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateStreamForbiddenRequest.class, CreateStreamForbiddenResponse.class)
            .withName("CreateStreamForbidden")
            .withUri("/v1/{project_id}/stream/blocks")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<StreamForbiddenSetting>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StreamForbiddenSetting.class),
            f -> f.withMarshaller(CreateStreamForbiddenRequest::getBody, CreateStreamForbiddenRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStreamForbiddenOnceRequest, CreateStreamForbiddenOnceResponse> createStreamForbiddenOnce =
        genForCreateStreamForbiddenOnce();

    private static HttpRequestDef<CreateStreamForbiddenOnceRequest, CreateStreamForbiddenOnceResponse> genForCreateStreamForbiddenOnce() {
        // basic
        HttpRequestDef.Builder<CreateStreamForbiddenOnceRequest, CreateStreamForbiddenOnceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateStreamForbiddenOnceRequest.class,
                    CreateStreamForbiddenOnceResponse.class)
                .withName("CreateStreamForbiddenOnce")
                .withUri("/v1/{project_id}/stream/block-once")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<StreamForbiddenOnceSetting>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StreamForbiddenOnceSetting.class),
            f -> f.withMarshaller(CreateStreamForbiddenOnceRequest::getBody,
                CreateStreamForbiddenOnceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse> createTranscodingsTemplate =
        genForCreateTranscodingsTemplate();

    private static HttpRequestDef<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse> genForCreateTranscodingsTemplate() {
        // basic
        HttpRequestDef.Builder<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateTranscodingsTemplateRequest.class,
                    CreateTranscodingsTemplateResponse.class)
                .withName("CreateTranscodingsTemplate")
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<StreamTranscodingTemplate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StreamTranscodingTemplate.class),
            f -> f.withMarshaller(CreateTranscodingsTemplateRequest::getBody,
                CreateTranscodingsTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUrlAuthchainRequest, CreateUrlAuthchainResponse> createUrlAuthchain =
        genForCreateUrlAuthchain();

    private static HttpRequestDef<CreateUrlAuthchainRequest, CreateUrlAuthchainResponse> genForCreateUrlAuthchain() {
        // basic
        HttpRequestDef.Builder<CreateUrlAuthchainRequest, CreateUrlAuthchainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateUrlAuthchainRequest.class, CreateUrlAuthchainResponse.class)
                .withName("CreateUrlAuthchain")
                .withUri("/v1/{project_id}/auth/chain")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<CreateUrlAuthchainReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateUrlAuthchainReq.class),
            f -> f.withMarshaller(CreateUrlAuthchainRequest::getBody, CreateUrlAuthchainRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWatermarkRuleRequest, CreateWatermarkRuleResponse> createWatermarkRule =
        genForCreateWatermarkRule();

    private static HttpRequestDef<CreateWatermarkRuleRequest, CreateWatermarkRuleResponse> genForCreateWatermarkRule() {
        // basic
        HttpRequestDef.Builder<CreateWatermarkRuleRequest, CreateWatermarkRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWatermarkRuleRequest.class, CreateWatermarkRuleResponse.class)
                .withName("CreateWatermarkRule")
                .withUri("/v1/{project_id}/watermark/rules")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<WatermarkRule>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WatermarkRule.class),
            f -> f.withMarshaller(CreateWatermarkRuleRequest::getBody, CreateWatermarkRuleRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateWatermarkRuleResponse::getXRequestId,
                CreateWatermarkRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> createWatermarkTemplate =
        genForCreateWatermarkTemplate();

    private static HttpRequestDef<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> genForCreateWatermarkTemplate() {
        // basic
        HttpRequestDef.Builder<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateWatermarkTemplateRequest.class, CreateWatermarkTemplateResponse.class)
            .withName("CreateWatermarkTemplate")
            .withUri("/v1/{project_id}/watermark/templates")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<WatermarkTemplate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WatermarkTemplate.class),
            f -> f.withMarshaller(CreateWatermarkTemplateRequest::getBody, CreateWatermarkTemplateRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateWatermarkTemplateResponse::getXRequestId,
                CreateWatermarkTemplateResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> deleteDomain = genForDeleteDomain();

    private static HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> genForDeleteDomain() {
        // basic
        HttpRequestDef.Builder<DeleteDomainRequest, DeleteDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDomainRequest.class, DeleteDomainResponse.class)
                .withName("DeleteDomain")
                .withUri("/v1/{project_id}/domain")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainRequest::getDomain, DeleteDomainRequest::setDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainKeyChainRequest, DeleteDomainKeyChainResponse> deleteDomainKeyChain =
        genForDeleteDomainKeyChain();

    private static HttpRequestDef<DeleteDomainKeyChainRequest, DeleteDomainKeyChainResponse> genForDeleteDomainKeyChain() {
        // basic
        HttpRequestDef.Builder<DeleteDomainKeyChainRequest, DeleteDomainKeyChainResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDomainKeyChainRequest.class, DeleteDomainKeyChainResponse.class)
            .withName("DeleteDomainKeyChain")
            .withUri("/v1/{project_id}/guard/key-chain")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainKeyChainRequest::getDomain, DeleteDomainKeyChainRequest::setDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainMappingRequest, DeleteDomainMappingResponse> deleteDomainMapping =
        genForDeleteDomainMapping();

    private static HttpRequestDef<DeleteDomainMappingRequest, DeleteDomainMappingResponse> genForDeleteDomainMapping() {
        // basic
        HttpRequestDef.Builder<DeleteDomainMappingRequest, DeleteDomainMappingResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDomainMappingRequest.class, DeleteDomainMappingResponse.class)
            .withName("DeleteDomainMapping")
            .withUri("/v1/{project_id}/domains_mapping")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pull_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainMappingRequest::getPullDomain,
                DeleteDomainMappingRequest::setPullDomain));
        builder.<String>withRequestField("push_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainMappingRequest::getPushDomain,
                DeleteDomainMappingRequest::setPushDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFlowRequest, DeleteFlowResponse> deleteFlow = genForDeleteFlow();

    private static HttpRequestDef<DeleteFlowRequest, DeleteFlowResponse> genForDeleteFlow() {
        // basic
        HttpRequestDef.Builder<DeleteFlowRequest, DeleteFlowResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFlowRequest.class, DeleteFlowResponse.class)
                .withName("DeleteFlow")
                .withUri("/v1/{project_id}/flows")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("flow_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFlowRequest::getFlowId, DeleteFlowRequest::setFlowId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFlowOutputRequest, DeleteFlowOutputResponse> deleteFlowOutput =
        genForDeleteFlowOutput();

    private static HttpRequestDef<DeleteFlowOutputRequest, DeleteFlowOutputResponse> genForDeleteFlowOutput() {
        // basic
        HttpRequestDef.Builder<DeleteFlowOutputRequest, DeleteFlowOutputResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFlowOutputRequest.class, DeleteFlowOutputResponse.class)
                .withName("DeleteFlowOutput")
                .withUri("/v1/{project_id}/flows/outputs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("flow_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFlowOutputRequest::getFlowId, DeleteFlowOutputRequest::setFlowId));
        builder.<String>withRequestField("output_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFlowOutputRequest::getOutputName, DeleteFlowOutputRequest::setOutputName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePublishTemplateRequest, DeletePublishTemplateResponse> deletePublishTemplate =
        genForDeletePublishTemplate();

    private static HttpRequestDef<DeletePublishTemplateRequest, DeletePublishTemplateResponse> genForDeletePublishTemplate() {
        // basic
        HttpRequestDef.Builder<DeletePublishTemplateRequest, DeletePublishTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePublishTemplateRequest.class, DeletePublishTemplateResponse.class)
            .withName("DeletePublishTemplate")
            .withUri("/v1/{project_id}/notifications/publish")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePublishTemplateRequest::getDomain, DeletePublishTemplateRequest::setDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePullTaskRequest, DeletePullTaskResponse> deletePullTask =
        genForDeletePullTask();

    private static HttpRequestDef<DeletePullTaskRequest, DeletePullTaskResponse> genForDeletePullTask() {
        // basic
        HttpRequestDef.Builder<DeletePullTaskRequest, DeletePullTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePullTaskRequest.class, DeletePullTaskResponse.class)
                .withName("DeletePullTask")
                .withUri("/v1/{project_id}/pull/stream/task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePullTaskRequest::getRegion, DeletePullTaskRequest::setRegion));
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePullTaskRequest::getTaskId, DeletePullTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRecordCallbackConfigRequest, DeleteRecordCallbackConfigResponse> deleteRecordCallbackConfig =
        genForDeleteRecordCallbackConfig();

    private static HttpRequestDef<DeleteRecordCallbackConfigRequest, DeleteRecordCallbackConfigResponse> genForDeleteRecordCallbackConfig() {
        // basic
        HttpRequestDef.Builder<DeleteRecordCallbackConfigRequest, DeleteRecordCallbackConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteRecordCallbackConfigRequest.class,
                    DeleteRecordCallbackConfigResponse.class)
                .withName("DeleteRecordCallbackConfig")
                .withUri("/v1/{project_id}/record/callbacks/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordCallbackConfigRequest::getId, DeleteRecordCallbackConfigRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRecordRuleRequest, DeleteRecordRuleResponse> deleteRecordRule =
        genForDeleteRecordRule();

    private static HttpRequestDef<DeleteRecordRuleRequest, DeleteRecordRuleResponse> genForDeleteRecordRule() {
        // basic
        HttpRequestDef.Builder<DeleteRecordRuleRequest, DeleteRecordRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRecordRuleRequest.class, DeleteRecordRuleResponse.class)
                .withName("DeleteRecordRule")
                .withUri("/v1/{project_id}/record/rules/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordRuleRequest::getId, DeleteRecordRuleRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRefererChainRequest, DeleteRefererChainResponse> deleteRefererChain =
        genForDeleteRefererChain();

    private static HttpRequestDef<DeleteRefererChainRequest, DeleteRefererChainResponse> genForDeleteRefererChain() {
        // basic
        HttpRequestDef.Builder<DeleteRefererChainRequest, DeleteRefererChainResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRefererChainRequest.class, DeleteRefererChainResponse.class)
                .withName("DeleteRefererChain")
                .withUri("/v1/{project_id}/guard/referer-chain")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRefererChainRequest::getDomain, DeleteRefererChainRequest::setDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScheduleRecordTasksRequest, DeleteScheduleRecordTasksResponse> deleteScheduleRecordTasks =
        genForDeleteScheduleRecordTasks();

    private static HttpRequestDef<DeleteScheduleRecordTasksRequest, DeleteScheduleRecordTasksResponse> genForDeleteScheduleRecordTasks() {
        // basic
        HttpRequestDef.Builder<DeleteScheduleRecordTasksRequest, DeleteScheduleRecordTasksResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteScheduleRecordTasksRequest.class,
                    DeleteScheduleRecordTasksResponse.class)
                .withName("DeleteScheduleRecordTasks")
                .withUri("/v1/{project_id}/schedule/record/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScheduleRecordTasksRequest::getTaskId,
                DeleteScheduleRecordTasksRequest::setTaskId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteScheduleRecordTasksResponse::getXRequestId,
                DeleteScheduleRecordTasksResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteSnapshotConfigRequest, DeleteSnapshotConfigResponse> deleteSnapshotConfig =
        genForDeleteSnapshotConfig();

    private static HttpRequestDef<DeleteSnapshotConfigRequest, DeleteSnapshotConfigResponse> genForDeleteSnapshotConfig() {
        // basic
        HttpRequestDef.Builder<DeleteSnapshotConfigRequest, DeleteSnapshotConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSnapshotConfigRequest.class, DeleteSnapshotConfigResponse.class)
            .withName("DeleteSnapshotConfig")
            .withUri("/v1/{project_id}/stream/snapshot")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSnapshotConfigRequest::getDomain, DeleteSnapshotConfigRequest::setDomain));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSnapshotConfigRequest::getAppName, DeleteSnapshotConfigRequest::setAppName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse> deleteStreamForbidden =
        genForDeleteStreamForbidden();

    private static HttpRequestDef<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse> genForDeleteStreamForbidden() {
        // basic
        HttpRequestDef.Builder<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteStreamForbiddenRequest.class, DeleteStreamForbiddenResponse.class)
            .withName("DeleteStreamForbidden")
            .withUri("/v1/{project_id}/stream/blocks")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStreamForbiddenRequest::getDomain, DeleteStreamForbiddenRequest::setDomain));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStreamForbiddenRequest::getAppName, DeleteStreamForbiddenRequest::setAppName));
        builder.<String>withRequestField("stream_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStreamForbiddenRequest::getStreamName,
                DeleteStreamForbiddenRequest::setStreamName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse> deleteTranscodingsTemplate =
        genForDeleteTranscodingsTemplate();

    private static HttpRequestDef<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse> genForDeleteTranscodingsTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteTranscodingsTemplateRequest.class,
                    DeleteTranscodingsTemplateResponse.class)
                .withName("DeleteTranscodingsTemplate")
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTranscodingsTemplateRequest::getDomain,
                DeleteTranscodingsTemplateRequest::setDomain));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTranscodingsTemplateRequest::getAppName,
                DeleteTranscodingsTemplateRequest::setAppName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWatermarkRuleRequest, DeleteWatermarkRuleResponse> deleteWatermarkRule =
        genForDeleteWatermarkRule();

    private static HttpRequestDef<DeleteWatermarkRuleRequest, DeleteWatermarkRuleResponse> genForDeleteWatermarkRule() {
        // basic
        HttpRequestDef.Builder<DeleteWatermarkRuleRequest, DeleteWatermarkRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteWatermarkRuleRequest.class, DeleteWatermarkRuleResponse.class)
            .withName("DeleteWatermarkRule")
            .withUri("/v1/{project_id}/watermark/rules/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWatermarkRuleRequest::getId, DeleteWatermarkRuleRequest::setId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteWatermarkRuleResponse::getXRequestId,
                DeleteWatermarkRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> deleteWatermarkTemplate =
        genForDeleteWatermarkTemplate();

    private static HttpRequestDef<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> genForDeleteWatermarkTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteWatermarkTemplateRequest.class, DeleteWatermarkTemplateResponse.class)
            .withName("DeleteWatermarkTemplate")
            .withUri("/v1/{project_id}/watermark/templates/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWatermarkTemplateRequest::getId, DeleteWatermarkTemplateRequest::setId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteWatermarkTemplateResponse::getXRequestId,
                DeleteWatermarkTemplateResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListDelayConfigRequest, ListDelayConfigResponse> listDelayConfig =
        genForListDelayConfig();

    private static HttpRequestDef<ListDelayConfigRequest, ListDelayConfigResponse> genForListDelayConfig() {
        // basic
        HttpRequestDef.Builder<ListDelayConfigRequest, ListDelayConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDelayConfigRequest.class, ListDelayConfigResponse.class)
                .withName("ListDelayConfig")
                .withUri("/v1/{project_id}/domain/delay")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("play_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDelayConfigRequest::getPlayDomain, ListDelayConfigRequest::setPlayDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlowsRequest, ListFlowsResponse> listFlows = genForListFlows();

    private static HttpRequestDef<ListFlowsRequest, ListFlowsResponse> genForListFlows() {
        // basic
        HttpRequestDef.Builder<ListFlowsRequest, ListFlowsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlowsRequest.class, ListFlowsResponse.class)
                .withName("ListFlows")
                .withUri("/v1/{project_id}/flows")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlowsRequest::getLimit, ListFlowsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlowsRequest::getOffset, ListFlowsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGeoBlockingConfigRequest, ListGeoBlockingConfigResponse> listGeoBlockingConfig =
        genForListGeoBlockingConfig();

    private static HttpRequestDef<ListGeoBlockingConfigRequest, ListGeoBlockingConfigResponse> genForListGeoBlockingConfig() {
        // basic
        HttpRequestDef.Builder<ListGeoBlockingConfigRequest, ListGeoBlockingConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGeoBlockingConfigRequest.class, ListGeoBlockingConfigResponse.class)
            .withName("ListGeoBlockingConfig")
            .withUri("/v1/{project_id}/domain/geo-blocking")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("play_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGeoBlockingConfigRequest::getPlayDomain,
                ListGeoBlockingConfigRequest::setPlayDomain));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListGeoBlockingConfigResponse::getXRequestId,
                ListGeoBlockingConfigResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListHlsConfigRequest, ListHlsConfigResponse> listHlsConfig =
        genForListHlsConfig();

    private static HttpRequestDef<ListHlsConfigRequest, ListHlsConfigResponse> genForListHlsConfig() {
        // basic
        HttpRequestDef.Builder<ListHlsConfigRequest, ListHlsConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHlsConfigRequest.class, ListHlsConfigResponse.class)
                .withName("ListHlsConfig")
                .withUri("/v1/{project_id}/domain/hls")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("push_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHlsConfigRequest::getPushDomain, ListHlsConfigRequest::setPushDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIpAuthListRequest, ListIpAuthListResponse> listIpAuthList =
        genForListIpAuthList();

    private static HttpRequestDef<ListIpAuthListRequest, ListIpAuthListResponse> genForListIpAuthList() {
        // basic
        HttpRequestDef.Builder<ListIpAuthListRequest, ListIpAuthListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIpAuthListRequest.class, ListIpAuthListResponse.class)
                .withName("ListIpAuthList")
                .withUri("/v1/{project_id}/guard/ip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpAuthListRequest::getDomain, ListIpAuthListRequest::setDomain));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIpAuthListResponse::getXRequestId, ListIpAuthListResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse> listLiveSampleLogs =
        genForListLiveSampleLogs();

    private static HttpRequestDef<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse> genForListLiveSampleLogs() {
        // basic
        HttpRequestDef.Builder<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLiveSampleLogsRequest.class, ListLiveSampleLogsResponse.class)
                .withName("ListLiveSampleLogs")
                .withUri("/v1/{project_id}/logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("play_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveSampleLogsRequest::getPlayDomain, ListLiveSampleLogsRequest::setPlayDomain));
        builder.<OffsetDateTime>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListLiveSampleLogsRequest::getStartTime, ListLiveSampleLogsRequest::setStartTime));
        builder.<OffsetDateTime>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListLiveSampleLogsRequest::getEndTime, ListLiveSampleLogsRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse> listLiveStreamsOnline =
        genForListLiveStreamsOnline();

    private static HttpRequestDef<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse> genForListLiveStreamsOnline() {
        // basic
        HttpRequestDef.Builder<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListLiveStreamsOnlineRequest.class, ListLiveStreamsOnlineResponse.class)
            .withName("ListLiveStreamsOnline")
            .withUri("/v1/{project_id}/realtime/streams")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publish_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveStreamsOnlineRequest::getPublishDomain,
                ListLiveStreamsOnlineRequest::setPublishDomain));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveStreamsOnlineRequest::getApp, ListLiveStreamsOnlineRequest::setApp));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLiveStreamsOnlineRequest::getOffset, ListLiveStreamsOnlineRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLiveStreamsOnlineRequest::getLimit, ListLiveStreamsOnlineRequest::setLimit));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveStreamsOnlineRequest::getStream, ListLiveStreamsOnlineRequest::setStream));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublishTemplateRequest, ListPublishTemplateResponse> listPublishTemplate =
        genForListPublishTemplate();

    private static HttpRequestDef<ListPublishTemplateRequest, ListPublishTemplateResponse> genForListPublishTemplate() {
        // basic
        HttpRequestDef.Builder<ListPublishTemplateRequest, ListPublishTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPublishTemplateRequest.class, ListPublishTemplateResponse.class)
                .withName("ListPublishTemplate")
                .withUri("/v1/{project_id}/notifications/publish")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublishTemplateRequest::getDomain, ListPublishTemplateRequest::setDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPullTasksRequest, ListPullTasksResponse> listPullTasks =
        genForListPullTasks();

    private static HttpRequestDef<ListPullTasksRequest, ListPullTasksResponse> genForListPullTasks() {
        // basic
        HttpRequestDef.Builder<ListPullTasksRequest, ListPullTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPullTasksRequest.class, ListPullTasksResponse.class)
                .withName("ListPullTasks")
                .withUri("/v1/{project_id}/pull/stream/task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPullTasksRequest::getRegion, ListPullTasksRequest::setRegion));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPullTasksRequest::getOffset, ListPullTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPullTasksRequest::getLimit, ListPullTasksRequest::setLimit));
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPullTasksRequest::getTaskId, ListPullTasksRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecordCallbackConfigsRequest, ListRecordCallbackConfigsResponse> listRecordCallbackConfigs =
        genForListRecordCallbackConfigs();

    private static HttpRequestDef<ListRecordCallbackConfigsRequest, ListRecordCallbackConfigsResponse> genForListRecordCallbackConfigs() {
        // basic
        HttpRequestDef.Builder<ListRecordCallbackConfigsRequest, ListRecordCallbackConfigsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRecordCallbackConfigsRequest.class,
                    ListRecordCallbackConfigsResponse.class)
                .withName("ListRecordCallbackConfigs")
                .withUri("/v1/{project_id}/record/callbacks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publish_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordCallbackConfigsRequest::getPublishDomain,
                ListRecordCallbackConfigsRequest::setPublishDomain));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordCallbackConfigsRequest::getApp, ListRecordCallbackConfigsRequest::setApp));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordCallbackConfigsRequest::getOffset,
                ListRecordCallbackConfigsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordCallbackConfigsRequest::getLimit,
                ListRecordCallbackConfigsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecordContentsRequest, ListRecordContentsResponse> listRecordContents =
        genForListRecordContents();

    private static HttpRequestDef<ListRecordContentsRequest, ListRecordContentsResponse> genForListRecordContents() {
        // basic
        HttpRequestDef.Builder<ListRecordContentsRequest, ListRecordContentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRecordContentsRequest.class, ListRecordContentsResponse.class)
                .withName("ListRecordContents")
                .withUri("/v1/{project_id}/record/contents")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publish_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordContentsRequest::getPublishDomain,
                ListRecordContentsRequest::setPublishDomain));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordContentsRequest::getApp, ListRecordContentsRequest::setApp));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordContentsRequest::getStream, ListRecordContentsRequest::setStream));
        builder.<ListRecordContentsRequest.RecordTypeEnum>withRequestField("record_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRecordContentsRequest.RecordTypeEnum.class),
            f -> f.withMarshaller(ListRecordContentsRequest::getRecordType, ListRecordContentsRequest::setRecordType));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordContentsRequest::getStartTime, ListRecordContentsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordContentsRequest::getEndTime, ListRecordContentsRequest::setEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordContentsRequest::getOffset, ListRecordContentsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordContentsRequest::getLimit, ListRecordContentsRequest::setLimit));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRecordContentsResponse::getXRequestId,
                ListRecordContentsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRecordRulesRequest, ListRecordRulesResponse> listRecordRules =
        genForListRecordRules();

    private static HttpRequestDef<ListRecordRulesRequest, ListRecordRulesResponse> genForListRecordRules() {
        // basic
        HttpRequestDef.Builder<ListRecordRulesRequest, ListRecordRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRecordRulesRequest.class, ListRecordRulesResponse.class)
                .withName("ListRecordRules")
                .withUri("/v1/{project_id}/record/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publish_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getPublishDomain, ListRecordRulesRequest::setPublishDomain));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getApp, ListRecordRulesRequest::setApp));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getStream, ListRecordRulesRequest::setStream));
        builder.<ListRecordRulesRequest.RecordTypeEnum>withRequestField("record_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRecordRulesRequest.RecordTypeEnum.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getRecordType, ListRecordRulesRequest::setRecordType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getOffset, ListRecordRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getLimit, ListRecordRulesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScheduleRecordTasksRequest, ListScheduleRecordTasksResponse> listScheduleRecordTasks =
        genForListScheduleRecordTasks();

    private static HttpRequestDef<ListScheduleRecordTasksRequest, ListScheduleRecordTasksResponse> genForListScheduleRecordTasks() {
        // basic
        HttpRequestDef.Builder<ListScheduleRecordTasksRequest, ListScheduleRecordTasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListScheduleRecordTasksRequest.class, ListScheduleRecordTasksResponse.class)
            .withName("ListScheduleRecordTasks")
            .withUri("/v1/{project_id}/schedule/record/tasks")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListScheduleRecordTasksRequest::getStartTime,
                ListScheduleRecordTasksRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListScheduleRecordTasksRequest::getEndTime,
                ListScheduleRecordTasksRequest::setEndTime));
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleRecordTasksRequest::getDomain,
                ListScheduleRecordTasksRequest::setDomain));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleRecordTasksRequest::getApp, ListScheduleRecordTasksRequest::setApp));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleRecordTasksRequest::getStream,
                ListScheduleRecordTasksRequest::setStream));
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleRecordTasksRequest::getTaskId,
                ListScheduleRecordTasksRequest::setTaskId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScheduleRecordTasksRequest::getOffset,
                ListScheduleRecordTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScheduleRecordTasksRequest::getLimit, ListScheduleRecordTasksRequest::setLimit));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListScheduleRecordTasksResponse::getXRequestId,
                ListScheduleRecordTasksResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotConfigsRequest, ListSnapshotConfigsResponse> listSnapshotConfigs =
        genForListSnapshotConfigs();

    private static HttpRequestDef<ListSnapshotConfigsRequest, ListSnapshotConfigsResponse> genForListSnapshotConfigs() {
        // basic
        HttpRequestDef.Builder<ListSnapshotConfigsRequest, ListSnapshotConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotConfigsRequest.class, ListSnapshotConfigsResponse.class)
                .withName("ListSnapshotConfigs")
                .withUri("/v1/{project_id}/stream/snapshot")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotConfigsRequest::getDomain, ListSnapshotConfigsRequest::setDomain));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotConfigsRequest::getAppName, ListSnapshotConfigsRequest::setAppName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotConfigsRequest::getLimit, ListSnapshotConfigsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotConfigsRequest::getOffset, ListSnapshotConfigsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStreamForbiddenRequest, ListStreamForbiddenResponse> listStreamForbidden =
        genForListStreamForbidden();

    private static HttpRequestDef<ListStreamForbiddenRequest, ListStreamForbiddenResponse> genForListStreamForbidden() {
        // basic
        HttpRequestDef.Builder<ListStreamForbiddenRequest, ListStreamForbiddenResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStreamForbiddenRequest.class, ListStreamForbiddenResponse.class)
                .withName("ListStreamForbidden")
                .withUri("/v1/{project_id}/stream/blocks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStreamForbiddenRequest::getDomain, ListStreamForbiddenRequest::setDomain));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStreamForbiddenRequest::getAppName, ListStreamForbiddenRequest::setAppName));
        builder.<String>withRequestField("stream_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStreamForbiddenRequest::getStreamName,
                ListStreamForbiddenRequest::setStreamName));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStreamForbiddenRequest::getPage, ListStreamForbiddenRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStreamForbiddenRequest::getSize, ListStreamForbiddenRequest::setSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWatermarkRuleRequest, ListWatermarkRuleResponse> listWatermarkRule =
        genForListWatermarkRule();

    private static HttpRequestDef<ListWatermarkRuleRequest, ListWatermarkRuleResponse> genForListWatermarkRule() {
        // basic
        HttpRequestDef.Builder<ListWatermarkRuleRequest, ListWatermarkRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWatermarkRuleRequest.class, ListWatermarkRuleResponse.class)
                .withName("ListWatermarkRule")
                .withUri("/v1/{project_id}/watermark/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWatermarkRuleRequest::getTemplateId, ListWatermarkRuleRequest::setTemplateId));
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWatermarkRuleRequest::getDomain, ListWatermarkRuleRequest::setDomain));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWatermarkRuleRequest::getApp, ListWatermarkRuleRequest::setApp));
        builder.<String>withRequestField("channel_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWatermarkRuleRequest::getChannelId, ListWatermarkRuleRequest::setChannelId));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWatermarkRuleRequest::getStream, ListWatermarkRuleRequest::setStream));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWatermarkRuleRequest::getOffset, ListWatermarkRuleRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWatermarkRuleRequest::getLimit, ListWatermarkRuleRequest::setLimit));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListWatermarkRuleResponse::getXRequestId, ListWatermarkRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> listWatermarkTemplate =
        genForListWatermarkTemplate();

    private static HttpRequestDef<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> genForListWatermarkTemplate() {
        // basic
        HttpRequestDef.Builder<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListWatermarkTemplateRequest.class, ListWatermarkTemplateResponse.class)
            .withName("ListWatermarkTemplate")
            .withUri("/v1/{project_id}/watermark/templates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getName, ListWatermarkTemplateRequest::setName));
        builder.<ListWatermarkTemplateRequest.SceneEnum>withRequestField("scene",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWatermarkTemplateRequest.SceneEnum.class),
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getScene, ListWatermarkTemplateRequest::setScene));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getOffset, ListWatermarkTemplateRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getLimit, ListWatermarkTemplateRequest::setLimit));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListWatermarkTemplateResponse::getXRequestId,
                ListWatermarkTemplateResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ModifyFlowOutputRequest, ModifyFlowOutputResponse> modifyFlowOutput =
        genForModifyFlowOutput();

    private static HttpRequestDef<ModifyFlowOutputRequest, ModifyFlowOutputResponse> genForModifyFlowOutput() {
        // basic
        HttpRequestDef.Builder<ModifyFlowOutputRequest, ModifyFlowOutputResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyFlowOutputRequest.class, ModifyFlowOutputResponse.class)
                .withName("ModifyFlowOutput")
                .withUri("/v1/{project_id}/flows/outputs")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("flow_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyFlowOutputRequest::getFlowId, ModifyFlowOutputRequest::setFlowId));
        builder.<String>withRequestField("output_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyFlowOutputRequest::getOutputName, ModifyFlowOutputRequest::setOutputName));
        builder.<UpdateFlowOutputRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFlowOutputRequestBody.class),
            f -> f.withMarshaller(ModifyFlowOutputRequest::getBody, ModifyFlowOutputRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyFlowSourcesRequest, ModifyFlowSourcesResponse> modifyFlowSources =
        genForModifyFlowSources();

    private static HttpRequestDef<ModifyFlowSourcesRequest, ModifyFlowSourcesResponse> genForModifyFlowSources() {
        // basic
        HttpRequestDef.Builder<ModifyFlowSourcesRequest, ModifyFlowSourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyFlowSourcesRequest.class, ModifyFlowSourcesResponse.class)
                .withName("ModifyFlowSources")
                .withUri("/v1/{project_id}/flows/sources")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("flow_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyFlowSourcesRequest::getFlowId, ModifyFlowSourcesRequest::setFlowId));
        builder.<String>withRequestField("source_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyFlowSourcesRequest::getSourceName, ModifyFlowSourcesRequest::setSourceName));
        builder.<ModifyFlowSourcesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyFlowSourcesRequestBody.class),
            f -> f.withMarshaller(ModifyFlowSourcesRequest::getBody, ModifyFlowSourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyFlowStartRequest, ModifyFlowStartResponse> modifyFlowStart =
        genForModifyFlowStart();

    private static HttpRequestDef<ModifyFlowStartRequest, ModifyFlowStartResponse> genForModifyFlowStart() {
        // basic
        HttpRequestDef.Builder<ModifyFlowStartRequest, ModifyFlowStartResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyFlowStartRequest.class, ModifyFlowStartResponse.class)
                .withName("ModifyFlowStart")
                .withUri("/v1/{project_id}/flows/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("flow_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyFlowStartRequest::getFlowId, ModifyFlowStartRequest::setFlowId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyFlowStopRequest, ModifyFlowStopResponse> modifyFlowStop =
        genForModifyFlowStop();

    private static HttpRequestDef<ModifyFlowStopRequest, ModifyFlowStopResponse> genForModifyFlowStop() {
        // basic
        HttpRequestDef.Builder<ModifyFlowStopRequest, ModifyFlowStopResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyFlowStopRequest.class, ModifyFlowStopResponse.class)
                .withName("ModifyFlowStop")
                .withUri("/v1/{project_id}/flows/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("flow_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyFlowStopRequest::getFlowId, ModifyFlowStopRequest::setFlowId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyPullTaskRequest, ModifyPullTaskResponse> modifyPullTask =
        genForModifyPullTask();

    private static HttpRequestDef<ModifyPullTaskRequest, ModifyPullTaskResponse> genForModifyPullTask() {
        // basic
        HttpRequestDef.Builder<ModifyPullTaskRequest, ModifyPullTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyPullTaskRequest.class, ModifyPullTaskResponse.class)
                .withName("ModifyPullTask")
                .withUri("/v1/{project_id}/pull/stream/task")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<ModifyLivePullStreamTask>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyLivePullStreamTask.class),
            f -> f.withMarshaller(ModifyPullTaskRequest::getBody, ModifyPullTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunRecordRequest, RunRecordResponse> runRecord = genForRunRecord();

    private static HttpRequestDef<RunRecordRequest, RunRecordResponse> genForRunRecord() {
        // basic
        HttpRequestDef.Builder<RunRecordRequest, RunRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunRecordRequest.class, RunRecordResponse.class)
                .withName("RunRecord")
                .withUri("/v1/{project_id}/record/control")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<RunRecordRequest.ActionEnum>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunRecordRequest.ActionEnum.class),
            f -> f.withMarshaller(RunRecordRequest::getAction, RunRecordRequest::setAction));
        builder.<RecordControlInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecordControlInfo.class),
            f -> f.withMarshaller(RunRecordRequest::getBody, RunRecordRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RunRecordResponse::getXRequestId, RunRecordResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<SetRefererChainRequest, SetRefererChainResponse> setRefererChain =
        genForSetRefererChain();

    private static HttpRequestDef<SetRefererChainRequest, SetRefererChainResponse> genForSetRefererChain() {
        // basic
        HttpRequestDef.Builder<SetRefererChainRequest, SetRefererChainResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetRefererChainRequest.class, SetRefererChainResponse.class)
                .withName("SetRefererChain")
                .withUri("/v1/{project_id}/guard/referer-chain")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<SetRefererChainInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetRefererChainInfo.class),
            f -> f.withMarshaller(SetRefererChainRequest::getBody, SetRefererChainRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainRequest, ShowDomainResponse> showDomain = genForShowDomain();

    private static HttpRequestDef<ShowDomainRequest, ShowDomainResponse> genForShowDomain() {
        // basic
        HttpRequestDef.Builder<ShowDomainRequest, ShowDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainRequest.class, ShowDomainResponse.class)
                .withName("ShowDomain")
                .withUri("/v1/{project_id}/domain")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainRequest::getDomain, ShowDomainRequest::setDomain));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainRequest::getEnterpriseProjectId,
                ShowDomainRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainKeyChainRequest, ShowDomainKeyChainResponse> showDomainKeyChain =
        genForShowDomainKeyChain();

    private static HttpRequestDef<ShowDomainKeyChainRequest, ShowDomainKeyChainResponse> genForShowDomainKeyChain() {
        // basic
        HttpRequestDef.Builder<ShowDomainKeyChainRequest, ShowDomainKeyChainResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainKeyChainRequest.class, ShowDomainKeyChainResponse.class)
                .withName("ShowDomainKeyChain")
                .withUri("/v1/{project_id}/guard/key-chain")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainKeyChainRequest::getDomain, ShowDomainKeyChainRequest::setDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainVerificationRequest, ShowDomainVerificationResponse> showDomainVerification =
        genForShowDomainVerification();

    private static HttpRequestDef<ShowDomainVerificationRequest, ShowDomainVerificationResponse> genForShowDomainVerification() {
        // basic
        HttpRequestDef.Builder<ShowDomainVerificationRequest, ShowDomainVerificationResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDomainVerificationRequest.class, ShowDomainVerificationResponse.class)
            .withName("ShowDomainVerification")
            .withUri("/v1/{project_id}/domain/verification")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainVerificationRequest::getDomain, ShowDomainVerificationRequest::setDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlowDetailRequest, ShowFlowDetailResponse> showFlowDetail =
        genForShowFlowDetail();

    private static HttpRequestDef<ShowFlowDetailRequest, ShowFlowDetailResponse> genForShowFlowDetail() {
        // basic
        HttpRequestDef.Builder<ShowFlowDetailRequest, ShowFlowDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFlowDetailRequest.class, ShowFlowDetailResponse.class)
                .withName("ShowFlowDetail")
                .withUri("/v1/{project_id}/flows/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("flow_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlowDetailRequest::getFlowId, ShowFlowDetailRequest::setFlowId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOutputInfoRequest, ShowOutputInfoResponse> showOutputInfo =
        genForShowOutputInfo();

    private static HttpRequestDef<ShowOutputInfoRequest, ShowOutputInfoResponse> genForShowOutputInfo() {
        // basic
        HttpRequestDef.Builder<ShowOutputInfoRequest, ShowOutputInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOutputInfoRequest.class, ShowOutputInfoResponse.class)
                .withName("ShowOutputInfo")
                .withUri("/v1/{project_id}/flows/outputs")
                .withContentType("application/json");

        // requests
        builder.<ShowOutputInfoRequest.DataDisplayEnum>withRequestField("data_display",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowOutputInfoRequest.DataDisplayEnum.class),
            f -> f.withMarshaller(ShowOutputInfoRequest::getDataDisplay, ShowOutputInfoRequest::setDataDisplay));
        builder.<String>withRequestField("flow_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOutputInfoRequest::getFlowId, ShowOutputInfoRequest::setFlowId));
        builder.<String>withRequestField("output_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOutputInfoRequest::getOutputName, ShowOutputInfoRequest::setOutputName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPullSourcesConfigRequest, ShowPullSourcesConfigResponse> showPullSourcesConfig =
        genForShowPullSourcesConfig();

    private static HttpRequestDef<ShowPullSourcesConfigRequest, ShowPullSourcesConfigResponse> genForShowPullSourcesConfig() {
        // basic
        HttpRequestDef.Builder<ShowPullSourcesConfigRequest, ShowPullSourcesConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPullSourcesConfigRequest.class, ShowPullSourcesConfigResponse.class)
            .withName("ShowPullSourcesConfig")
            .withUri("/v1/{project_id}/domain/pull-sources")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("play_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPullSourcesConfigRequest::getPlayDomain,
                ShowPullSourcesConfigRequest::setPlayDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordCallbackConfigRequest, ShowRecordCallbackConfigResponse> showRecordCallbackConfig =
        genForShowRecordCallbackConfig();

    private static HttpRequestDef<ShowRecordCallbackConfigRequest, ShowRecordCallbackConfigResponse> genForShowRecordCallbackConfig() {
        // basic
        HttpRequestDef.Builder<ShowRecordCallbackConfigRequest, ShowRecordCallbackConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowRecordCallbackConfigRequest.class, ShowRecordCallbackConfigResponse.class)
                .withName("ShowRecordCallbackConfig")
                .withUri("/v1/{project_id}/record/callbacks/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordCallbackConfigRequest::getId, ShowRecordCallbackConfigRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordRuleRequest, ShowRecordRuleResponse> showRecordRule =
        genForShowRecordRule();

    private static HttpRequestDef<ShowRecordRuleRequest, ShowRecordRuleResponse> genForShowRecordRule() {
        // basic
        HttpRequestDef.Builder<ShowRecordRuleRequest, ShowRecordRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecordRuleRequest.class, ShowRecordRuleResponse.class)
                .withName("ShowRecordRule")
                .withUri("/v1/{project_id}/record/rules/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordRuleRequest::getId, ShowRecordRuleRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRefererChainRequest, ShowRefererChainResponse> showRefererChain =
        genForShowRefererChain();

    private static HttpRequestDef<ShowRefererChainRequest, ShowRefererChainResponse> genForShowRefererChain() {
        // basic
        HttpRequestDef.Builder<ShowRefererChainRequest, ShowRefererChainResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRefererChainRequest.class, ShowRefererChainResponse.class)
                .withName("ShowRefererChain")
                .withUri("/v1/{project_id}/guard/referer-chain")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRefererChainRequest::getDomain, ShowRefererChainRequest::setDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse> showTranscodingsTemplate =
        genForShowTranscodingsTemplate();

    private static HttpRequestDef<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse> genForShowTranscodingsTemplate() {
        // basic
        HttpRequestDef.Builder<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowTranscodingsTemplateRequest.class, ShowTranscodingsTemplateResponse.class)
                .withName("ShowTranscodingsTemplate")
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTranscodingsTemplateRequest::getDomain,
                ShowTranscodingsTemplateRequest::setDomain));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTranscodingsTemplateRequest::getAppName,
                ShowTranscodingsTemplateRequest::setAppName));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTranscodingsTemplateRequest::getPage, ShowTranscodingsTemplateRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTranscodingsTemplateRequest::getSize, ShowTranscodingsTemplateRequest::setSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWatermarkRuleRequest, ShowWatermarkRuleResponse> showWatermarkRule =
        genForShowWatermarkRule();

    private static HttpRequestDef<ShowWatermarkRuleRequest, ShowWatermarkRuleResponse> genForShowWatermarkRule() {
        // basic
        HttpRequestDef.Builder<ShowWatermarkRuleRequest, ShowWatermarkRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWatermarkRuleRequest.class, ShowWatermarkRuleResponse.class)
                .withName("ShowWatermarkRule")
                .withUri("/v1/{project_id}/watermark/rules/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWatermarkRuleRequest::getId, ShowWatermarkRuleRequest::setId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowWatermarkRuleResponse::getXRequestId, ShowWatermarkRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowWatermarkTemplateRequest, ShowWatermarkTemplateResponse> showWatermarkTemplate =
        genForShowWatermarkTemplate();

    private static HttpRequestDef<ShowWatermarkTemplateRequest, ShowWatermarkTemplateResponse> genForShowWatermarkTemplate() {
        // basic
        HttpRequestDef.Builder<ShowWatermarkTemplateRequest, ShowWatermarkTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowWatermarkTemplateRequest.class, ShowWatermarkTemplateResponse.class)
            .withName("ShowWatermarkTemplate")
            .withUri("/v1/{project_id}/watermark/templates/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWatermarkTemplateRequest::getId, ShowWatermarkTemplateRequest::setId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowWatermarkTemplateResponse::getXRequestId,
                ShowWatermarkTemplateResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateDelayConfigRequest, UpdateDelayConfigResponse> updateDelayConfig =
        genForUpdateDelayConfig();

    private static HttpRequestDef<UpdateDelayConfigRequest, UpdateDelayConfigResponse> genForUpdateDelayConfig() {
        // basic
        HttpRequestDef.Builder<UpdateDelayConfigRequest, UpdateDelayConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDelayConfigRequest.class, UpdateDelayConfigResponse.class)
                .withName("UpdateDelayConfig")
                .withUri("/v1/{project_id}/domain/delay")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<ModifyDelayConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyDelayConfig.class),
            f -> f.withMarshaller(UpdateDelayConfigRequest::getBody, UpdateDelayConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainRequest, UpdateDomainResponse> updateDomain = genForUpdateDomain();

    private static HttpRequestDef<UpdateDomainRequest, UpdateDomainResponse> genForUpdateDomain() {
        // basic
        HttpRequestDef.Builder<UpdateDomainRequest, UpdateDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDomainRequest.class, UpdateDomainResponse.class)
                .withName("UpdateDomain")
                .withUri("/v1/{project_id}/domain")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<LiveDomainModifyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LiveDomainModifyReq.class),
            f -> f.withMarshaller(UpdateDomainRequest::getBody, UpdateDomainRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainIp6SwitchRequest, UpdateDomainIp6SwitchResponse> updateDomainIp6Switch =
        genForUpdateDomainIp6Switch();

    private static HttpRequestDef<UpdateDomainIp6SwitchRequest, UpdateDomainIp6SwitchResponse> genForUpdateDomainIp6Switch() {
        // basic
        HttpRequestDef.Builder<UpdateDomainIp6SwitchRequest, UpdateDomainIp6SwitchResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDomainIp6SwitchRequest.class, UpdateDomainIp6SwitchResponse.class)
            .withName("UpdateDomainIp6Switch")
            .withUri("/v1/{project_id}/domain/ipv6-switch")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<DomainIpv6SwitchReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DomainIpv6SwitchReq.class),
            f -> f.withMarshaller(UpdateDomainIp6SwitchRequest::getBody, UpdateDomainIp6SwitchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainKeyChainRequest, UpdateDomainKeyChainResponse> updateDomainKeyChain =
        genForUpdateDomainKeyChain();

    private static HttpRequestDef<UpdateDomainKeyChainRequest, UpdateDomainKeyChainResponse> genForUpdateDomainKeyChain() {
        // basic
        HttpRequestDef.Builder<UpdateDomainKeyChainRequest, UpdateDomainKeyChainResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDomainKeyChainRequest.class, UpdateDomainKeyChainResponse.class)
            .withName("UpdateDomainKeyChain")
            .withUri("/v1/{project_id}/guard/key-chain")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainKeyChainRequest::getDomain, UpdateDomainKeyChainRequest::setDomain));
        builder.<KeyChainInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(KeyChainInfo.class),
            f -> f.withMarshaller(UpdateDomainKeyChainRequest::getBody, UpdateDomainKeyChainRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGeoBlockingConfigRequest, UpdateGeoBlockingConfigResponse> updateGeoBlockingConfig =
        genForUpdateGeoBlockingConfig();

    private static HttpRequestDef<UpdateGeoBlockingConfigRequest, UpdateGeoBlockingConfigResponse> genForUpdateGeoBlockingConfig() {
        // basic
        HttpRequestDef.Builder<UpdateGeoBlockingConfigRequest, UpdateGeoBlockingConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateGeoBlockingConfigRequest.class, UpdateGeoBlockingConfigResponse.class)
            .withName("UpdateGeoBlockingConfig")
            .withUri("/v1/{project_id}/domain/geo-blocking")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("play_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGeoBlockingConfigRequest::getPlayDomain,
                UpdateGeoBlockingConfigRequest::setPlayDomain));
        builder.<GeoBlockingConfigInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GeoBlockingConfigInfo.class),
            f -> f.withMarshaller(UpdateGeoBlockingConfigRequest::getBody, UpdateGeoBlockingConfigRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateGeoBlockingConfigResponse::getXRequestId,
                UpdateGeoBlockingConfigResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateHlsConfigRequest, UpdateHlsConfigResponse> updateHlsConfig =
        genForUpdateHlsConfig();

    private static HttpRequestDef<UpdateHlsConfigRequest, UpdateHlsConfigResponse> genForUpdateHlsConfig() {
        // basic
        HttpRequestDef.Builder<UpdateHlsConfigRequest, UpdateHlsConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHlsConfigRequest.class, UpdateHlsConfigResponse.class)
                .withName("UpdateHlsConfig")
                .withUri("/v1/{project_id}/domain/hls")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<ModifyHlsConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyHlsConfig.class),
            f -> f.withMarshaller(UpdateHlsConfigRequest::getBody, UpdateHlsConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIpAuthListRequest, UpdateIpAuthListResponse> updateIpAuthList =
        genForUpdateIpAuthList();

    private static HttpRequestDef<UpdateIpAuthListRequest, UpdateIpAuthListResponse> genForUpdateIpAuthList() {
        // basic
        HttpRequestDef.Builder<UpdateIpAuthListRequest, UpdateIpAuthListResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIpAuthListRequest.class, UpdateIpAuthListResponse.class)
                .withName("UpdateIpAuthList")
                .withUri("/v1/{project_id}/guard/ip")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<IPAuthInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IPAuthInfo.class),
            f -> f.withMarshaller(UpdateIpAuthListRequest::getBody, UpdateIpAuthListRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateIpAuthListResponse::getXRequestId, UpdateIpAuthListResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdatePublishTemplateRequest, UpdatePublishTemplateResponse> updatePublishTemplate =
        genForUpdatePublishTemplate();

    private static HttpRequestDef<UpdatePublishTemplateRequest, UpdatePublishTemplateResponse> genForUpdatePublishTemplate() {
        // basic
        HttpRequestDef.Builder<UpdatePublishTemplateRequest, UpdatePublishTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePublishTemplateRequest.class, UpdatePublishTemplateResponse.class)
            .withName("UpdatePublishTemplate")
            .withUri("/v1/{project_id}/notifications/publish")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePublishTemplateRequest::getDomain, UpdatePublishTemplateRequest::setDomain));
        builder.<CallbackUrl>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CallbackUrl.class),
            f -> f.withMarshaller(UpdatePublishTemplateRequest::getBody, UpdatePublishTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePullSourcesConfigRequest, UpdatePullSourcesConfigResponse> updatePullSourcesConfig =
        genForUpdatePullSourcesConfig();

    private static HttpRequestDef<UpdatePullSourcesConfigRequest, UpdatePullSourcesConfigResponse> genForUpdatePullSourcesConfig() {
        // basic
        HttpRequestDef.Builder<UpdatePullSourcesConfigRequest, UpdatePullSourcesConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePullSourcesConfigRequest.class, UpdatePullSourcesConfigResponse.class)
            .withName("UpdatePullSourcesConfig")
            .withUri("/v1/{project_id}/domain/pull-sources")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<ModifyPullSourcesConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyPullSourcesConfig.class),
            f -> f.withMarshaller(UpdatePullSourcesConfigRequest::getBody, UpdatePullSourcesConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecordCallbackConfigRequest, UpdateRecordCallbackConfigResponse> updateRecordCallbackConfig =
        genForUpdateRecordCallbackConfig();

    private static HttpRequestDef<UpdateRecordCallbackConfigRequest, UpdateRecordCallbackConfigResponse> genForUpdateRecordCallbackConfig() {
        // basic
        HttpRequestDef.Builder<UpdateRecordCallbackConfigRequest, UpdateRecordCallbackConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateRecordCallbackConfigRequest.class,
                    UpdateRecordCallbackConfigResponse.class)
                .withName("UpdateRecordCallbackConfig")
                .withUri("/v1/{project_id}/record/callbacks/{id}")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordCallbackConfigRequest::getId, UpdateRecordCallbackConfigRequest::setId));
        builder.<RecordCallbackConfigRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecordCallbackConfigRequest.class),
            f -> f.withMarshaller(UpdateRecordCallbackConfigRequest::getBody,
                UpdateRecordCallbackConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecordRuleRequest, UpdateRecordRuleResponse> updateRecordRule =
        genForUpdateRecordRule();

    private static HttpRequestDef<UpdateRecordRuleRequest, UpdateRecordRuleResponse> genForUpdateRecordRule() {
        // basic
        HttpRequestDef.Builder<UpdateRecordRuleRequest, UpdateRecordRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRecordRuleRequest.class, UpdateRecordRuleResponse.class)
                .withName("UpdateRecordRule")
                .withUri("/v1/{project_id}/record/rules/{id}")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordRuleRequest::getId, UpdateRecordRuleRequest::setId));
        builder.<RecordRuleRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecordRuleRequest.class),
            f -> f.withMarshaller(UpdateRecordRuleRequest::getBody, UpdateRecordRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSnapshotConfigRequest, UpdateSnapshotConfigResponse> updateSnapshotConfig =
        genForUpdateSnapshotConfig();

    private static HttpRequestDef<UpdateSnapshotConfigRequest, UpdateSnapshotConfigResponse> genForUpdateSnapshotConfig() {
        // basic
        HttpRequestDef.Builder<UpdateSnapshotConfigRequest, UpdateSnapshotConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateSnapshotConfigRequest.class, UpdateSnapshotConfigResponse.class)
            .withName("UpdateSnapshotConfig")
            .withUri("/v1/{project_id}/stream/snapshot")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<LiveSnapshotConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LiveSnapshotConfig.class),
            f -> f.withMarshaller(UpdateSnapshotConfigRequest::getBody, UpdateSnapshotConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse> updateStreamForbidden =
        genForUpdateStreamForbidden();

    private static HttpRequestDef<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse> genForUpdateStreamForbidden() {
        // basic
        HttpRequestDef.Builder<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateStreamForbiddenRequest.class, UpdateStreamForbiddenResponse.class)
            .withName("UpdateStreamForbidden")
            .withUri("/v1/{project_id}/stream/blocks")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<StreamForbiddenSetting>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StreamForbiddenSetting.class),
            f -> f.withMarshaller(UpdateStreamForbiddenRequest::getBody, UpdateStreamForbiddenRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse> updateTranscodingsTemplate =
        genForUpdateTranscodingsTemplate();

    private static HttpRequestDef<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse> genForUpdateTranscodingsTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateTranscodingsTemplateRequest.class,
                    UpdateTranscodingsTemplateResponse.class)
                .withName("UpdateTranscodingsTemplate")
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<StreamTranscodingTemplate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StreamTranscodingTemplate.class),
            f -> f.withMarshaller(UpdateTranscodingsTemplateRequest::getBody,
                UpdateTranscodingsTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWatermarkRuleRequest, UpdateWatermarkRuleResponse> updateWatermarkRule =
        genForUpdateWatermarkRule();

    private static HttpRequestDef<UpdateWatermarkRuleRequest, UpdateWatermarkRuleResponse> genForUpdateWatermarkRule() {
        // basic
        HttpRequestDef.Builder<UpdateWatermarkRuleRequest, UpdateWatermarkRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWatermarkRuleRequest.class, UpdateWatermarkRuleResponse.class)
                .withName("UpdateWatermarkRule")
                .withUri("/v1/{project_id}/watermark/rules/{id}")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWatermarkRuleRequest::getId, UpdateWatermarkRuleRequest::setId));
        builder.<ModifyWatermarkRule>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyWatermarkRule.class),
            f -> f.withMarshaller(UpdateWatermarkRuleRequest::getBody, UpdateWatermarkRuleRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateWatermarkRuleResponse::getXRequestId,
                UpdateWatermarkRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> updateWatermarkTemplate =
        genForUpdateWatermarkTemplate();

    private static HttpRequestDef<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> genForUpdateWatermarkTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateWatermarkTemplateRequest.class, UpdateWatermarkTemplateResponse.class)
            .withName("UpdateWatermarkTemplate")
            .withUri("/v1/{project_id}/watermark/templates/{id}")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWatermarkTemplateRequest::getId, UpdateWatermarkTemplateRequest::setId));
        builder.<WatermarkTemplate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WatermarkTemplate.class),
            f -> f.withMarshaller(UpdateWatermarkTemplateRequest::getBody, UpdateWatermarkTemplateRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateWatermarkTemplateResponse::getXRequestId,
                UpdateWatermarkTemplateResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListCesDimsInfoRequest, ListCesDimsInfoResponse> listCesDimsInfo =
        genForListCesDimsInfo();

    private static HttpRequestDef<ListCesDimsInfoRequest, ListCesDimsInfoResponse> genForListCesDimsInfo() {
        // basic
        HttpRequestDef.Builder<ListCesDimsInfoRequest, ListCesDimsInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCesDimsInfoRequest.class, ListCesDimsInfoResponse.class)
                .withName("ListCesDimsInfo")
                .withUri("/v1/{project_id}/ott/dims-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCesDimsInfoRequest::getNamespace, ListCesDimsInfoRequest::setNamespace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCesInstanceRequest, ListCesInstanceResponse> listCesInstance =
        genForListCesInstance();

    private static HttpRequestDef<ListCesInstanceRequest, ListCesInstanceResponse> genForListCesInstance() {
        // basic
        HttpRequestDef.Builder<ListCesInstanceRequest, ListCesInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListCesInstanceRequest.class, ListCesInstanceResponse.class)
                .withName("ListCesInstance")
                .withUri("/v1/{project_id}/ott/instances")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<ListCesInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListCesInstanceRequestBody.class),
            f -> f.withMarshaller(ListCesInstanceRequest::getBody, ListCesInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainHttpsCertRequest, DeleteDomainHttpsCertResponse> deleteDomainHttpsCert =
        genForDeleteDomainHttpsCert();

    private static HttpRequestDef<DeleteDomainHttpsCertRequest, DeleteDomainHttpsCertResponse> genForDeleteDomainHttpsCert() {
        // basic
        HttpRequestDef.Builder<DeleteDomainHttpsCertRequest, DeleteDomainHttpsCertResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDomainHttpsCertRequest.class, DeleteDomainHttpsCertResponse.class)
            .withName("DeleteDomainHttpsCert")
            .withUri("/v1/{project_id}/guard/https-cert")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainHttpsCertRequest::getDomain, DeleteDomainHttpsCertRequest::setDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateInfoRequest, ShowCertificateInfoResponse> showCertificateInfo =
        genForShowCertificateInfo();

    private static HttpRequestDef<ShowCertificateInfoRequest, ShowCertificateInfoResponse> genForShowCertificateInfo() {
        // basic
        HttpRequestDef.Builder<ShowCertificateInfoRequest, ShowCertificateInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCertificateInfoRequest.class, ShowCertificateInfoResponse.class)
                .withName("ShowCertificateInfo")
                .withUri("/v2/{project_id}/certificates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("play_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificateInfoRequest::getPlayDomain,
                ShowCertificateInfoRequest::setPlayDomain));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCertificateInfoRequest::getOffset, ShowCertificateInfoRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCertificateInfoRequest::getLimit, ShowCertificateInfoRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainHttpsCertRequest, ShowDomainHttpsCertResponse> showDomainHttpsCert =
        genForShowDomainHttpsCert();

    private static HttpRequestDef<ShowDomainHttpsCertRequest, ShowDomainHttpsCertResponse> genForShowDomainHttpsCert() {
        // basic
        HttpRequestDef.Builder<ShowDomainHttpsCertRequest, ShowDomainHttpsCertResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainHttpsCertRequest.class, ShowDomainHttpsCertResponse.class)
                .withName("ShowDomainHttpsCert")
                .withUri("/v1/{project_id}/guard/https-cert")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainHttpsCertRequest::getDomain, ShowDomainHttpsCertRequest::setDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainHttpsCertRequest, UpdateDomainHttpsCertResponse> updateDomainHttpsCert =
        genForUpdateDomainHttpsCert();

    private static HttpRequestDef<UpdateDomainHttpsCertRequest, UpdateDomainHttpsCertResponse> genForUpdateDomainHttpsCert() {
        // basic
        HttpRequestDef.Builder<UpdateDomainHttpsCertRequest, UpdateDomainHttpsCertResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDomainHttpsCertRequest.class, UpdateDomainHttpsCertResponse.class)
            .withName("UpdateDomainHttpsCert")
            .withUri("/v1/{project_id}/guard/https-cert")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainHttpsCertRequest::getDomain, UpdateDomainHttpsCertRequest::setDomain));
        builder.<DomainHttpsCertInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DomainHttpsCertInfo.class),
            f -> f.withMarshaller(UpdateDomainHttpsCertRequest::getBody, UpdateDomainHttpsCertRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHarvestTaskRequest, CreateHarvestTaskResponse> createHarvestTask =
        genForCreateHarvestTask();

    private static HttpRequestDef<CreateHarvestTaskRequest, CreateHarvestTaskResponse> genForCreateHarvestTask() {
        // basic
        HttpRequestDef.Builder<CreateHarvestTaskRequest, CreateHarvestTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHarvestTaskRequest.class, CreateHarvestTaskResponse.class)
                .withName("CreateHarvestTask")
                .withUri("/v1/{project_id}/ott/harvest/task")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("Access-Control-Allow-Internal",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHarvestTaskRequest::getAccessControlAllowInternal,
                CreateHarvestTaskRequest::setAccessControlAllowInternal));
        builder.<String>withRequestField("Access-Control-Allow-External",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHarvestTaskRequest::getAccessControlAllowExternal,
                CreateHarvestTaskRequest::setAccessControlAllowExternal));
        builder.<CreateHarvestTaskInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHarvestTaskInfoReq.class),
            f -> f.withMarshaller(CreateHarvestTaskRequest::getBody, CreateHarvestTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHarvestTaskRequest, DeleteHarvestTaskResponse> deleteHarvestTask =
        genForDeleteHarvestTask();

    private static HttpRequestDef<DeleteHarvestTaskRequest, DeleteHarvestTaskResponse> genForDeleteHarvestTask() {
        // basic
        HttpRequestDef.Builder<DeleteHarvestTaskRequest, DeleteHarvestTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHarvestTaskRequest.class, DeleteHarvestTaskResponse.class)
                .withName("DeleteHarvestTask")
                .withUri("/v1/{project_id}/ott/harvest/task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHarvestTaskRequest::getJobId, DeleteHarvestTaskRequest::setJobId));
        builder.<String>withRequestField("Access-Control-Allow-Internal",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHarvestTaskRequest::getAccessControlAllowInternal,
                DeleteHarvestTaskRequest::setAccessControlAllowInternal));
        builder.<String>withRequestField("Access-Control-Allow-External",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHarvestTaskRequest::getAccessControlAllowExternal,
                DeleteHarvestTaskRequest::setAccessControlAllowExternal));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHarvestTaskRequest, ListHarvestTaskResponse> listHarvestTask =
        genForListHarvestTask();

    private static HttpRequestDef<ListHarvestTaskRequest, ListHarvestTaskResponse> genForListHarvestTask() {
        // basic
        HttpRequestDef.Builder<ListHarvestTaskRequest, ListHarvestTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHarvestTaskRequest.class, ListHarvestTaskResponse.class)
                .withName("ListHarvestTask")
                .withUri("/v1/{project_id}/ott/harvest/task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHarvestTaskRequest::getDomain, ListHarvestTaskRequest::setDomain));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHarvestTaskRequest::getAppName, ListHarvestTaskRequest::setAppName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHarvestTaskRequest::getId, ListHarvestTaskRequest::setId));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHarvestTaskRequest::getJobId, ListHarvestTaskRequest::setJobId));
        builder.<Integer>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHarvestTaskRequest::getStartTime, ListHarvestTaskRequest::setStartTime));
        builder.<Integer>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHarvestTaskRequest::getEndTime, ListHarvestTaskRequest::setEndTime));
        builder.<String>withRequestField("event_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHarvestTaskRequest::getEventName, ListHarvestTaskRequest::setEventName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHarvestTaskRequest::getLimit, ListHarvestTaskRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHarvestTaskRequest::getOffset, ListHarvestTaskRequest::setOffset));
        builder.<String>withRequestField("Access-Control-Allow-Internal",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHarvestTaskRequest::getAccessControlAllowInternal,
                ListHarvestTaskRequest::setAccessControlAllowInternal));
        builder.<String>withRequestField("Access-Control-Allow-External",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHarvestTaskRequest::getAccessControlAllowExternal,
                ListHarvestTaskRequest::setAccessControlAllowExternal));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyHarvestTaskRequest, ModifyHarvestTaskResponse> modifyHarvestTask =
        genForModifyHarvestTask();

    private static HttpRequestDef<ModifyHarvestTaskRequest, ModifyHarvestTaskResponse> genForModifyHarvestTask() {
        // basic
        HttpRequestDef.Builder<ModifyHarvestTaskRequest, ModifyHarvestTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyHarvestTaskRequest.class, ModifyHarvestTaskResponse.class)
                .withName("ModifyHarvestTask")
                .withUri("/v1/{project_id}/ott/harvest/task")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("Access-Control-Allow-Internal",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyHarvestTaskRequest::getAccessControlAllowInternal,
                ModifyHarvestTaskRequest::setAccessControlAllowInternal));
        builder.<String>withRequestField("Access-Control-Allow-External",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyHarvestTaskRequest::getAccessControlAllowExternal,
                ModifyHarvestTaskRequest::setAccessControlAllowExternal));
        builder.<ModifyHarvestTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyHarvestTaskRequestBody.class),
            f -> f.withMarshaller(ModifyHarvestTaskRequest::getBody, ModifyHarvestTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHarvestJobStatusRequest, UpdateHarvestJobStatusResponse> updateHarvestJobStatus =
        genForUpdateHarvestJobStatus();

    private static HttpRequestDef<UpdateHarvestJobStatusRequest, UpdateHarvestJobStatusResponse> genForUpdateHarvestJobStatus() {
        // basic
        HttpRequestDef.Builder<UpdateHarvestJobStatusRequest, UpdateHarvestJobStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateHarvestJobStatusRequest.class, UpdateHarvestJobStatusResponse.class)
            .withName("UpdateHarvestJobStatus")
            .withUri("/v1/{project_id}/ott/harvest/task/status")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("Access-Control-Allow-Internal",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHarvestJobStatusRequest::getAccessControlAllowInternal,
                UpdateHarvestJobStatusRequest::setAccessControlAllowInternal));
        builder.<String>withRequestField("Access-Control-Allow-External",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHarvestJobStatusRequest::getAccessControlAllowExternal,
                UpdateHarvestJobStatusRequest::setAccessControlAllowExternal));
        builder.<UpdateHarvestJobStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHarvestJobStatusRequestBody.class),
            f -> f.withMarshaller(UpdateHarvestJobStatusRequest::getBody, UpdateHarvestJobStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateObsBucketAuthorityPublicRequest, UpdateObsBucketAuthorityPublicResponse> updateObsBucketAuthorityPublic =
        genForUpdateObsBucketAuthorityPublic();

    private static HttpRequestDef<UpdateObsBucketAuthorityPublicRequest, UpdateObsBucketAuthorityPublicResponse> genForUpdateObsBucketAuthorityPublic() {
        // basic
        HttpRequestDef.Builder<UpdateObsBucketAuthorityPublicRequest, UpdateObsBucketAuthorityPublicResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateObsBucketAuthorityPublicRequest.class,
                    UpdateObsBucketAuthorityPublicResponse.class)
                .withName("UpdateObsBucketAuthorityPublic")
                .withUri("/v1/{project_id}/obs/authority")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<ObsAuthorityConfigV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ObsAuthorityConfigV2.class),
            f -> f.withMarshaller(UpdateObsBucketAuthorityPublicRequest::getBody,
                UpdateObsBucketAuthorityPublicRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOttChannelInfoRequest, CreateOttChannelInfoResponse> createOttChannelInfo =
        genForCreateOttChannelInfo();

    private static HttpRequestDef<CreateOttChannelInfoRequest, CreateOttChannelInfoResponse> genForCreateOttChannelInfo() {
        // basic
        HttpRequestDef.Builder<CreateOttChannelInfoRequest, CreateOttChannelInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateOttChannelInfoRequest.class, CreateOttChannelInfoResponse.class)
            .withName("CreateOttChannelInfo")
            .withUri("/v1/{project_id}/ott/channels")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("Access-Control-Allow-Internal",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOttChannelInfoRequest::getAccessControlAllowInternal,
                CreateOttChannelInfoRequest::setAccessControlAllowInternal));
        builder.<String>withRequestField("Access-Control-Allow-External",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOttChannelInfoRequest::getAccessControlAllowExternal,
                CreateOttChannelInfoRequest::setAccessControlAllowExternal));
        builder.<CreateOttChannelInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOttChannelInfoReq.class),
            f -> f.withMarshaller(CreateOttChannelInfoRequest::getBody, CreateOttChannelInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteOttChannelInfoRequest, DeleteOttChannelInfoResponse> deleteOttChannelInfo =
        genForDeleteOttChannelInfo();

    private static HttpRequestDef<DeleteOttChannelInfoRequest, DeleteOttChannelInfoResponse> genForDeleteOttChannelInfo() {
        // basic
        HttpRequestDef.Builder<DeleteOttChannelInfoRequest, DeleteOttChannelInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteOttChannelInfoRequest.class, DeleteOttChannelInfoResponse.class)
            .withName("DeleteOttChannelInfo")
            .withUri("/v1/{project_id}/ott/channels")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOttChannelInfoRequest::getDomain, DeleteOttChannelInfoRequest::setDomain));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOttChannelInfoRequest::getAppName, DeleteOttChannelInfoRequest::setAppName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOttChannelInfoRequest::getId, DeleteOttChannelInfoRequest::setId));
        builder.<String>withRequestField("Access-Control-Allow-Internal",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOttChannelInfoRequest::getAccessControlAllowInternal,
                DeleteOttChannelInfoRequest::setAccessControlAllowInternal));
        builder.<String>withRequestField("Access-Control-Allow-External",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOttChannelInfoRequest::getAccessControlAllowExternal,
                DeleteOttChannelInfoRequest::setAccessControlAllowExternal));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOttChannelInfoRequest, ListOttChannelInfoResponse> listOttChannelInfo =
        genForListOttChannelInfo();

    private static HttpRequestDef<ListOttChannelInfoRequest, ListOttChannelInfoResponse> genForListOttChannelInfo() {
        // basic
        HttpRequestDef.Builder<ListOttChannelInfoRequest, ListOttChannelInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOttChannelInfoRequest.class, ListOttChannelInfoResponse.class)
                .withName("ListOttChannelInfo")
                .withUri("/v1/{project_id}/ott/channels")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOttChannelInfoRequest::getDomain, ListOttChannelInfoRequest::setDomain));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOttChannelInfoRequest::getAppName, ListOttChannelInfoRequest::setAppName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOttChannelInfoRequest::getId, ListOttChannelInfoRequest::setId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOttChannelInfoRequest::getLimit, ListOttChannelInfoRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOttChannelInfoRequest::getOffset, ListOttChannelInfoRequest::setOffset));
        builder.<String>withRequestField("Access-Control-Allow-Internal",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOttChannelInfoRequest::getAccessControlAllowInternal,
                ListOttChannelInfoRequest::setAccessControlAllowInternal));
        builder.<String>withRequestField("Access-Control-Allow-External",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOttChannelInfoRequest::getAccessControlAllowExternal,
                ListOttChannelInfoRequest::setAccessControlAllowExternal));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyOttChannelInfoEncoderSettingsRequest, ModifyOttChannelInfoEncoderSettingsResponse> modifyOttChannelInfoEncoderSettings =
        genForModifyOttChannelInfoEncoderSettings();

    private static HttpRequestDef<ModifyOttChannelInfoEncoderSettingsRequest, ModifyOttChannelInfoEncoderSettingsResponse> genForModifyOttChannelInfoEncoderSettings() {
        // basic
        HttpRequestDef.Builder<ModifyOttChannelInfoEncoderSettingsRequest, ModifyOttChannelInfoEncoderSettingsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ModifyOttChannelInfoEncoderSettingsRequest.class,
                    ModifyOttChannelInfoEncoderSettingsResponse.class)
                .withName("ModifyOttChannelInfoEncoderSettings")
                .withUri("/v1/{project_id}/ott/channels/encorder-settings")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("Access-Control-Allow-Internal",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyOttChannelInfoEncoderSettingsRequest::getAccessControlAllowInternal,
                ModifyOttChannelInfoEncoderSettingsRequest::setAccessControlAllowInternal));
        builder.<String>withRequestField("Access-Control-Allow-External",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyOttChannelInfoEncoderSettingsRequest::getAccessControlAllowExternal,
                ModifyOttChannelInfoEncoderSettingsRequest::setAccessControlAllowExternal));
        builder.<ModifyOttChannelEncoderSettings>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyOttChannelEncoderSettings.class),
            f -> f.withMarshaller(ModifyOttChannelInfoEncoderSettingsRequest::getBody,
                ModifyOttChannelInfoEncoderSettingsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyOttChannelInfoEndPointsRequest, ModifyOttChannelInfoEndPointsResponse> modifyOttChannelInfoEndPoints =
        genForModifyOttChannelInfoEndPoints();

    private static HttpRequestDef<ModifyOttChannelInfoEndPointsRequest, ModifyOttChannelInfoEndPointsResponse> genForModifyOttChannelInfoEndPoints() {
        // basic
        HttpRequestDef.Builder<ModifyOttChannelInfoEndPointsRequest, ModifyOttChannelInfoEndPointsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ModifyOttChannelInfoEndPointsRequest.class,
                    ModifyOttChannelInfoEndPointsResponse.class)
                .withName("ModifyOttChannelInfoEndPoints")
                .withUri("/v1/{project_id}/ott/channels/endpoints")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("Access-Control-Allow-Internal",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyOttChannelInfoEndPointsRequest::getAccessControlAllowInternal,
                ModifyOttChannelInfoEndPointsRequest::setAccessControlAllowInternal));
        builder.<String>withRequestField("Access-Control-Allow-External",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyOttChannelInfoEndPointsRequest::getAccessControlAllowExternal,
                ModifyOttChannelInfoEndPointsRequest::setAccessControlAllowExternal));
        builder.<ModifyOttChannelEndPointsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyOttChannelEndPointsReq.class),
            f -> f.withMarshaller(ModifyOttChannelInfoEndPointsRequest::getBody,
                ModifyOttChannelInfoEndPointsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyOttChannelInfoGeneralRequest, ModifyOttChannelInfoGeneralResponse> modifyOttChannelInfoGeneral =
        genForModifyOttChannelInfoGeneral();

    private static HttpRequestDef<ModifyOttChannelInfoGeneralRequest, ModifyOttChannelInfoGeneralResponse> genForModifyOttChannelInfoGeneral() {
        // basic
        HttpRequestDef.Builder<ModifyOttChannelInfoGeneralRequest, ModifyOttChannelInfoGeneralResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ModifyOttChannelInfoGeneralRequest.class,
                    ModifyOttChannelInfoGeneralResponse.class)
                .withName("ModifyOttChannelInfoGeneral")
                .withUri("/v1/{project_id}/ott/channels/general")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("Access-Control-Allow-Internal",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyOttChannelInfoGeneralRequest::getAccessControlAllowInternal,
                ModifyOttChannelInfoGeneralRequest::setAccessControlAllowInternal));
        builder.<String>withRequestField("Access-Control-Allow-External",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyOttChannelInfoGeneralRequest::getAccessControlAllowExternal,
                ModifyOttChannelInfoGeneralRequest::setAccessControlAllowExternal));
        builder.<ModifyOttChannelGeneral>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyOttChannelGeneral.class),
            f -> f.withMarshaller(ModifyOttChannelInfoGeneralRequest::getBody,
                ModifyOttChannelInfoGeneralRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyOttChannelInfoInputRequest, ModifyOttChannelInfoInputResponse> modifyOttChannelInfoInput =
        genForModifyOttChannelInfoInput();

    private static HttpRequestDef<ModifyOttChannelInfoInputRequest, ModifyOttChannelInfoInputResponse> genForModifyOttChannelInfoInput() {
        // basic
        HttpRequestDef.Builder<ModifyOttChannelInfoInputRequest, ModifyOttChannelInfoInputResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ModifyOttChannelInfoInputRequest.class,
                    ModifyOttChannelInfoInputResponse.class)
                .withName("ModifyOttChannelInfoInput")
                .withUri("/v1/{project_id}/ott/channels/input")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("Access-Control-Allow-Internal",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyOttChannelInfoInputRequest::getAccessControlAllowInternal,
                ModifyOttChannelInfoInputRequest::setAccessControlAllowInternal));
        builder.<String>withRequestField("Access-Control-Allow-External",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyOttChannelInfoInputRequest::getAccessControlAllowExternal,
                ModifyOttChannelInfoInputRequest::setAccessControlAllowExternal));
        builder.<ModifyOttChannelInputReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyOttChannelInputReq.class),
            f -> f.withMarshaller(ModifyOttChannelInfoInputRequest::getBody,
                ModifyOttChannelInfoInputRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyOttChannelInfoRecordSettingsRequest, ModifyOttChannelInfoRecordSettingsResponse> modifyOttChannelInfoRecordSettings =
        genForModifyOttChannelInfoRecordSettings();

    private static HttpRequestDef<ModifyOttChannelInfoRecordSettingsRequest, ModifyOttChannelInfoRecordSettingsResponse> genForModifyOttChannelInfoRecordSettings() {
        // basic
        HttpRequestDef.Builder<ModifyOttChannelInfoRecordSettingsRequest, ModifyOttChannelInfoRecordSettingsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ModifyOttChannelInfoRecordSettingsRequest.class,
                    ModifyOttChannelInfoRecordSettingsResponse.class)
                .withName("ModifyOttChannelInfoRecordSettings")
                .withUri("/v1/{project_id}/ott/channels/record-settings")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("Access-Control-Allow-Internal",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyOttChannelInfoRecordSettingsRequest::getAccessControlAllowInternal,
                ModifyOttChannelInfoRecordSettingsRequest::setAccessControlAllowInternal));
        builder.<String>withRequestField("Access-Control-Allow-External",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyOttChannelInfoRecordSettingsRequest::getAccessControlAllowExternal,
                ModifyOttChannelInfoRecordSettingsRequest::setAccessControlAllowExternal));
        builder.<ModifyOttChannelRecordSettings>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyOttChannelRecordSettings.class),
            f -> f.withMarshaller(ModifyOttChannelInfoRecordSettingsRequest::getBody,
                ModifyOttChannelInfoRecordSettingsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyOttChannelInfoStatsRequest, ModifyOttChannelInfoStatsResponse> modifyOttChannelInfoStats =
        genForModifyOttChannelInfoStats();

    private static HttpRequestDef<ModifyOttChannelInfoStatsRequest, ModifyOttChannelInfoStatsResponse> genForModifyOttChannelInfoStats() {
        // basic
        HttpRequestDef.Builder<ModifyOttChannelInfoStatsRequest, ModifyOttChannelInfoStatsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ModifyOttChannelInfoStatsRequest.class,
                    ModifyOttChannelInfoStatsResponse.class)
                .withName("ModifyOttChannelInfoStats")
                .withUri("/v1/{project_id}/ott/channels/state")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("Access-Control-Allow-Internal",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyOttChannelInfoStatsRequest::getAccessControlAllowInternal,
                ModifyOttChannelInfoStatsRequest::setAccessControlAllowInternal));
        builder.<String>withRequestField("Access-Control-Allow-External",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyOttChannelInfoStatsRequest::getAccessControlAllowExternal,
                ModifyOttChannelInfoStatsRequest::setAccessControlAllowExternal));
        builder.<ModifyOttChannelState>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyOttChannelState.class),
            f -> f.withMarshaller(ModifyOttChannelInfoStatsRequest::getBody,
                ModifyOttChannelInfoStatsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowChannelStatisticRequest, ShowChannelStatisticResponse> showChannelStatistic =
        genForShowChannelStatistic();

    private static HttpRequestDef<ShowChannelStatisticRequest, ShowChannelStatisticResponse> genForShowChannelStatistic() {
        // basic
        HttpRequestDef.Builder<ShowChannelStatisticRequest, ShowChannelStatisticResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowChannelStatisticRequest.class, ShowChannelStatisticResponse.class)
            .withName("ShowChannelStatistic")
            .withUri("/v1/{project_id}/ott/channels/statistic")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowChannelStatisticRequest::getLimit, ShowChannelStatisticRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowChannelStatisticRequest::getOffset, ShowChannelStatisticRequest::setOffset));
        builder.<String>withRequestField("Access-Control-Allow-Internal",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowChannelStatisticRequest::getAccessControlAllowInternal,
                ShowChannelStatisticRequest::setAccessControlAllowInternal));
        builder.<String>withRequestField("Access-Control-Allow-External",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowChannelStatisticRequest::getAccessControlAllowExternal,
                ShowChannelStatisticRequest::setAccessControlAllowExternal));
        builder.<ShowChannelStatisticReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowChannelStatisticReq.class),
            f -> f.withMarshaller(ShowChannelStatisticRequest::getBody, ShowChannelStatisticRequest::setBody));

        // response

        return builder.build();
    }

}
