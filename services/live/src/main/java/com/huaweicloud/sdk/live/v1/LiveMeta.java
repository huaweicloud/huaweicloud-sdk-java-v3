package com.huaweicloud.sdk.live.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.live.v1.model.BatchShowIpBelongsRequest;
import com.huaweicloud.sdk.live.v1.model.BatchShowIpBelongsResponse;
import com.huaweicloud.sdk.live.v1.model.CallbackUrl;
import com.huaweicloud.sdk.live.v1.model.CreateDomainMappingRequest;
import com.huaweicloud.sdk.live.v1.model.CreateDomainMappingResponse;
import com.huaweicloud.sdk.live.v1.model.CreateDomainRequest;
import com.huaweicloud.sdk.live.v1.model.CreateDomainResponse;
import com.huaweicloud.sdk.live.v1.model.CreateOttChannelInfoReq;
import com.huaweicloud.sdk.live.v1.model.CreateOttChannelInfoRequest;
import com.huaweicloud.sdk.live.v1.model.CreateOttChannelInfoResponse;
import com.huaweicloud.sdk.live.v1.model.CreateRecordCallbackConfigRequest;
import com.huaweicloud.sdk.live.v1.model.CreateRecordCallbackConfigResponse;
import com.huaweicloud.sdk.live.v1.model.CreateRecordIndexRequest;
import com.huaweicloud.sdk.live.v1.model.CreateRecordIndexResponse;
import com.huaweicloud.sdk.live.v1.model.CreateRecordRuleRequest;
import com.huaweicloud.sdk.live.v1.model.CreateRecordRuleResponse;
import com.huaweicloud.sdk.live.v1.model.CreateSnapshotConfigRequest;
import com.huaweicloud.sdk.live.v1.model.CreateSnapshotConfigResponse;
import com.huaweicloud.sdk.live.v1.model.CreateStreamForbiddenRequest;
import com.huaweicloud.sdk.live.v1.model.CreateStreamForbiddenResponse;
import com.huaweicloud.sdk.live.v1.model.CreateTranscodingsTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.CreateTranscodingsTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.CreateUrlAuthchainReq;
import com.huaweicloud.sdk.live.v1.model.CreateUrlAuthchainRequest;
import com.huaweicloud.sdk.live.v1.model.CreateUrlAuthchainResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainHttpsCertRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainHttpsCertResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainKeyChainRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainKeyChainResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainMappingRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainMappingResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteOttChannelInfoRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteOttChannelInfoResponse;
import com.huaweicloud.sdk.live.v1.model.DeletePublishTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.DeletePublishTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteRecordCallbackConfigRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteRecordCallbackConfigResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteRecordRuleRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteRecordRuleResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteSnapshotConfigRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteSnapshotConfigResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteStreamForbiddenRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteStreamForbiddenResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteTranscodingsTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteTranscodingsTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.DomainHttpsCertInfo;
import com.huaweicloud.sdk.live.v1.model.DomainIpv6SwitchReq;
import com.huaweicloud.sdk.live.v1.model.DomainMapping;
import com.huaweicloud.sdk.live.v1.model.GeoBlockingConfigInfo;
import com.huaweicloud.sdk.live.v1.model.IPAuthInfo;
import com.huaweicloud.sdk.live.v1.model.KeyChainInfo;
import com.huaweicloud.sdk.live.v1.model.ListDelayConfigRequest;
import com.huaweicloud.sdk.live.v1.model.ListDelayConfigResponse;
import com.huaweicloud.sdk.live.v1.model.ListGeoBlockingConfigRequest;
import com.huaweicloud.sdk.live.v1.model.ListGeoBlockingConfigResponse;
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
import com.huaweicloud.sdk.live.v1.model.ListRecordCallbackConfigsRequest;
import com.huaweicloud.sdk.live.v1.model.ListRecordCallbackConfigsResponse;
import com.huaweicloud.sdk.live.v1.model.ListRecordContentsRequest;
import com.huaweicloud.sdk.live.v1.model.ListRecordContentsResponse;
import com.huaweicloud.sdk.live.v1.model.ListRecordRulesRequest;
import com.huaweicloud.sdk.live.v1.model.ListRecordRulesResponse;
import com.huaweicloud.sdk.live.v1.model.ListSnapshotConfigsRequest;
import com.huaweicloud.sdk.live.v1.model.ListSnapshotConfigsResponse;
import com.huaweicloud.sdk.live.v1.model.ListStreamForbiddenRequest;
import com.huaweicloud.sdk.live.v1.model.ListStreamForbiddenResponse;
import com.huaweicloud.sdk.live.v1.model.LiveDomainCreateReq;
import com.huaweicloud.sdk.live.v1.model.LiveDomainModifyReq;
import com.huaweicloud.sdk.live.v1.model.LiveSnapshotConfig;
import com.huaweicloud.sdk.live.v1.model.ModifyDelayConfig;
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
import com.huaweicloud.sdk.live.v1.model.ObsAuthorityConfigV2;
import com.huaweicloud.sdk.live.v1.model.RecordCallbackConfigRequest;
import com.huaweicloud.sdk.live.v1.model.RecordControlInfo;
import com.huaweicloud.sdk.live.v1.model.RecordIndexRequestBody;
import com.huaweicloud.sdk.live.v1.model.RecordRuleRequest;
import com.huaweicloud.sdk.live.v1.model.RunRecordRequest;
import com.huaweicloud.sdk.live.v1.model.RunRecordResponse;
import com.huaweicloud.sdk.live.v1.model.ShowDomainHttpsCertRequest;
import com.huaweicloud.sdk.live.v1.model.ShowDomainHttpsCertResponse;
import com.huaweicloud.sdk.live.v1.model.ShowDomainKeyChainRequest;
import com.huaweicloud.sdk.live.v1.model.ShowDomainKeyChainResponse;
import com.huaweicloud.sdk.live.v1.model.ShowDomainRequest;
import com.huaweicloud.sdk.live.v1.model.ShowDomainResponse;
import com.huaweicloud.sdk.live.v1.model.ShowPullSourcesConfigRequest;
import com.huaweicloud.sdk.live.v1.model.ShowPullSourcesConfigResponse;
import com.huaweicloud.sdk.live.v1.model.ShowRecordCallbackConfigRequest;
import com.huaweicloud.sdk.live.v1.model.ShowRecordCallbackConfigResponse;
import com.huaweicloud.sdk.live.v1.model.ShowRecordRuleRequest;
import com.huaweicloud.sdk.live.v1.model.ShowRecordRuleResponse;
import com.huaweicloud.sdk.live.v1.model.ShowTranscodingsTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.ShowTranscodingsTemplateResponse;
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
import com.huaweicloud.sdk.live.v1.model.UpdateGeoBlockingConfigRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateGeoBlockingConfigResponse;
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

}
