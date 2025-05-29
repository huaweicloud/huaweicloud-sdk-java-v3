package com.huaweicloud.sdk.lts.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.lts.v2.model.AomMappingRequestInfo;
import com.huaweicloud.sdk.lts.v2.model.AomMappingRuleResp;
import com.huaweicloud.sdk.lts.v2.model.ChangeAlarmRuleStatus;
import com.huaweicloud.sdk.lts.v2.model.ConsumerCheckpointInfo;
import com.huaweicloud.sdk.lts.v2.model.ConsumerGroupHeartBeatRequest;
import com.huaweicloud.sdk.lts.v2.model.ConsumerGroupHeartBeatResponse;
import com.huaweicloud.sdk.lts.v2.model.ConsumerGroupInfo;
import com.huaweicloud.sdk.lts.v2.model.ConsumerShardCheckpointInfo;
import com.huaweicloud.sdk.lts.v2.model.CreateAccessConfigRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateAccessConfigRequestBody;
import com.huaweicloud.sdk.lts.v2.model.CreateAccessConfigResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateAgencyAccessRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateAgencyAccessResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateAomMappingRulesRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateAomMappingRulesResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateConsumerGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateConsumerGroupResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateDashBoardReqBody;
import com.huaweicloud.sdk.lts.v2.model.CreateDashBoardRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateDashBoardResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateDashboardGroupReq;
import com.huaweicloud.sdk.lts.v2.model.CreateDashboardGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateDashboardGroupResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateHostGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateHostGroupRequestBody;
import com.huaweicloud.sdk.lts.v2.model.CreateHostGroupResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateKeywordsAlarmRuleRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateKeywordsAlarmRuleRequestBody;
import com.huaweicloud.sdk.lts.v2.model.CreateKeywordsAlarmRuleResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateLogDumpObsRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateLogDumpObsRequestBody;
import com.huaweicloud.sdk.lts.v2.model.CreateLogDumpObsResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateLogGroupParams;
import com.huaweicloud.sdk.lts.v2.model.CreateLogGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateLogGroupResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateLogStreamIndexRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateLogStreamIndexResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateLogStreamParams;
import com.huaweicloud.sdk.lts.v2.model.CreateLogStreamRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateLogStreamResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateNotificationTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateNotificationTemplateRequestBody;
import com.huaweicloud.sdk.lts.v2.model.CreateNotificationTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateSearchCriteriasBody;
import com.huaweicloud.sdk.lts.v2.model.CreateSearchCriteriasRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateSearchCriteriasResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateSqlAlarmRuleRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateSqlAlarmRuleRequestBody;
import com.huaweicloud.sdk.lts.v2.model.CreateSqlAlarmRuleResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateStructConfigRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateStructConfigResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateStructTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateStructTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateTagsReqbody;
import com.huaweicloud.sdk.lts.v2.model.CreateTagsRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateTagsResponse;
import com.huaweicloud.sdk.lts.v2.model.CreateTransferRequest;
import com.huaweicloud.sdk.lts.v2.model.CreateTransferRequestBody;
import com.huaweicloud.sdk.lts.v2.model.CreateTransferResponse;
import com.huaweicloud.sdk.lts.v2.model.CreatefavoriteReqbody;
import com.huaweicloud.sdk.lts.v2.model.CreatefavoriteRequest;
import com.huaweicloud.sdk.lts.v2.model.CreatefavoriteResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteAccessConfigRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteAccessConfigRequestBody;
import com.huaweicloud.sdk.lts.v2.model.DeleteAccessConfigResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteActiveAlarmsRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteActiveAlarmsRequestBody;
import com.huaweicloud.sdk.lts.v2.model.DeleteActiveAlarmsResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteAomMappingRulesRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteAomMappingRulesResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteConsumerGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteConsumerGroupResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteDashboardRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteDashboardResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteHostGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteHostGroupRequestBody;
import com.huaweicloud.sdk.lts.v2.model.DeleteHostGroupResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteKeywordsAlarmRuleRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteKeywordsAlarmRuleResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteLogGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteLogGroupResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteLogStreamRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteLogStreamResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteNotificationTemplateBody;
import com.huaweicloud.sdk.lts.v2.model.DeleteNotificationTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteNotificationTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteSearchCriterias;
import com.huaweicloud.sdk.lts.v2.model.DeleteSearchCriteriasRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteSearchCriteriasResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteSqlAlarmRuleRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteSqlAlarmRuleResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteStructTemplateReqBody;
import com.huaweicloud.sdk.lts.v2.model.DeleteStructTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteStructTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.DeleteTransferRequest;
import com.huaweicloud.sdk.lts.v2.model.DeleteTransferResponse;
import com.huaweicloud.sdk.lts.v2.model.DeletefavoriteRequest;
import com.huaweicloud.sdk.lts.v2.model.DeletefavoriteResponse;
import com.huaweicloud.sdk.lts.v2.model.DisableLogCollectionRequest;
import com.huaweicloud.sdk.lts.v2.model.DisableLogCollectionResponse;
import com.huaweicloud.sdk.lts.v2.model.EnableLogCollectionRequest;
import com.huaweicloud.sdk.lts.v2.model.EnableLogCollectionResponse;
import com.huaweicloud.sdk.lts.v2.model.GetAccessConfigListRequestBody;
import com.huaweicloud.sdk.lts.v2.model.GetHostGroupListRequestBody;
import com.huaweicloud.sdk.lts.v2.model.GetHostListRequestBody;
import com.huaweicloud.sdk.lts.v2.model.LTSAccessConfigInfoRespon200;
import com.huaweicloud.sdk.lts.v2.model.LTSIndexConfigInfo;
import com.huaweicloud.sdk.lts.v2.model.ListAccessConfigRequest;
import com.huaweicloud.sdk.lts.v2.model.ListAccessConfigResponse;
import com.huaweicloud.sdk.lts.v2.model.ListActiveOrHistoryAlarmsRequest;
import com.huaweicloud.sdk.lts.v2.model.ListActiveOrHistoryAlarmsRequestBody;
import com.huaweicloud.sdk.lts.v2.model.ListActiveOrHistoryAlarmsResponse;
import com.huaweicloud.sdk.lts.v2.model.ListBreifStructTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.ListBreifStructTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.ListChartsRequest;
import com.huaweicloud.sdk.lts.v2.model.ListChartsResponse;
import com.huaweicloud.sdk.lts.v2.model.ListConsumerGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.ListConsumerGroupResponse;
import com.huaweicloud.sdk.lts.v2.model.ListCriteriasRequest;
import com.huaweicloud.sdk.lts.v2.model.ListCriteriasResponse;
import com.huaweicloud.sdk.lts.v2.model.ListDetailsConsumerGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.ListDetailsConsumerGroupResponse;
import com.huaweicloud.sdk.lts.v2.model.ListHistorySqlRequest;
import com.huaweicloud.sdk.lts.v2.model.ListHistorySqlResponse;
import com.huaweicloud.sdk.lts.v2.model.ListHostGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.ListHostGroupResponse;
import com.huaweicloud.sdk.lts.v2.model.ListHostRequest;
import com.huaweicloud.sdk.lts.v2.model.ListHostResponse;
import com.huaweicloud.sdk.lts.v2.model.ListKeywordsAlarmRulesRequest;
import com.huaweicloud.sdk.lts.v2.model.ListKeywordsAlarmRulesResponse;
import com.huaweicloud.sdk.lts.v2.model.ListLogContextRequest;
import com.huaweicloud.sdk.lts.v2.model.ListLogContextRequestBody;
import com.huaweicloud.sdk.lts.v2.model.ListLogContextResponse;
import com.huaweicloud.sdk.lts.v2.model.ListLogGroupsRequest;
import com.huaweicloud.sdk.lts.v2.model.ListLogGroupsResponse;
import com.huaweicloud.sdk.lts.v2.model.ListLogHistogramRequest;
import com.huaweicloud.sdk.lts.v2.model.ListLogHistogramResponse;
import com.huaweicloud.sdk.lts.v2.model.ListLogStreamRequest;
import com.huaweicloud.sdk.lts.v2.model.ListLogStreamResponse;
import com.huaweicloud.sdk.lts.v2.model.ListLogStreamsRequest;
import com.huaweicloud.sdk.lts.v2.model.ListLogStreamsResponse;
import com.huaweicloud.sdk.lts.v2.model.ListLogsRequest;
import com.huaweicloud.sdk.lts.v2.model.ListLogsResponse;
import com.huaweicloud.sdk.lts.v2.model.ListNotificationTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.ListNotificationTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.ListNotificationTemplatesRequest;
import com.huaweicloud.sdk.lts.v2.model.ListNotificationTemplatesResponse;
import com.huaweicloud.sdk.lts.v2.model.ListNotificationTopicsRequest;
import com.huaweicloud.sdk.lts.v2.model.ListNotificationTopicsResponse;
import com.huaweicloud.sdk.lts.v2.model.ListQueryAllSearchCriteriasRequest;
import com.huaweicloud.sdk.lts.v2.model.ListQueryAllSearchCriteriasResponse;
import com.huaweicloud.sdk.lts.v2.model.ListQueryStructuredLogsRequest;
import com.huaweicloud.sdk.lts.v2.model.ListQueryStructuredLogsResponse;
import com.huaweicloud.sdk.lts.v2.model.ListSqlAlarmRulesRequest;
import com.huaweicloud.sdk.lts.v2.model.ListSqlAlarmRulesResponse;
import com.huaweicloud.sdk.lts.v2.model.ListStructTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.ListStructTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.ListStructuredLogsWithTimeRangeRequest;
import com.huaweicloud.sdk.lts.v2.model.ListStructuredLogsWithTimeRangeResponse;
import com.huaweicloud.sdk.lts.v2.model.ListTimeLineTrafficStatisticsRequest;
import com.huaweicloud.sdk.lts.v2.model.ListTimeLineTrafficStatisticsResponse;
import com.huaweicloud.sdk.lts.v2.model.ListTopnTrafficStatisticsRequest;
import com.huaweicloud.sdk.lts.v2.model.ListTopnTrafficStatisticsResponse;
import com.huaweicloud.sdk.lts.v2.model.ListTransfersRequest;
import com.huaweicloud.sdk.lts.v2.model.ListTransfersResponse;
import com.huaweicloud.sdk.lts.v2.model.LtsStructTemplateInfo;
import com.huaweicloud.sdk.lts.v2.model.PreviewAgencyLogAccessReqListBody;
import com.huaweicloud.sdk.lts.v2.model.PreviewTemplateBody;
import com.huaweicloud.sdk.lts.v2.model.QueryLogKeyWordCountRequestBody;
import com.huaweicloud.sdk.lts.v2.model.QueryLtsLogParams;
import com.huaweicloud.sdk.lts.v2.model.QueryLtsStructLogParams;
import com.huaweicloud.sdk.lts.v2.model.QueryLtsStructLogParamsNew;
import com.huaweicloud.sdk.lts.v2.model.RegisterDmsKafkaInstanceRequest;
import com.huaweicloud.sdk.lts.v2.model.RegisterDmsKafkaInstanceRequestBody;
import com.huaweicloud.sdk.lts.v2.model.RegisterDmsKafkaInstanceResponse;
import com.huaweicloud.sdk.lts.v2.model.ShowAdminConfigRequest;
import com.huaweicloud.sdk.lts.v2.model.ShowAdminConfigResponse;
import com.huaweicloud.sdk.lts.v2.model.ShowAomMappingRuleRequest;
import com.huaweicloud.sdk.lts.v2.model.ShowAomMappingRuleResponse;
import com.huaweicloud.sdk.lts.v2.model.ShowAomMappingRulesRequest;
import com.huaweicloud.sdk.lts.v2.model.ShowAomMappingRulesResponse;
import com.huaweicloud.sdk.lts.v2.model.ShowCursorByTimeRequest;
import com.huaweicloud.sdk.lts.v2.model.ShowCursorByTimeResponse;
import com.huaweicloud.sdk.lts.v2.model.ShowCursorTimeRequest;
import com.huaweicloud.sdk.lts.v2.model.ShowCursorTimeResponse;
import com.huaweicloud.sdk.lts.v2.model.ShowLogConvergeConfigRequest;
import com.huaweicloud.sdk.lts.v2.model.ShowLogConvergeConfigResponse;
import com.huaweicloud.sdk.lts.v2.model.ShowLogStreamShardsRequest;
import com.huaweicloud.sdk.lts.v2.model.ShowLogStreamShardsResponse;
import com.huaweicloud.sdk.lts.v2.model.ShowMemberGroupAndStreamRequest;
import com.huaweicloud.sdk.lts.v2.model.ShowMemberGroupAndStreamResponse;
import com.huaweicloud.sdk.lts.v2.model.ShowNotificationTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.ShowNotificationTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.ShowStructTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.ShowStructTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.StructConfig;
import com.huaweicloud.sdk.lts.v2.model.TimelineTrafficStatisticsRequestBody;
import com.huaweicloud.sdk.lts.v2.model.TopnRequstBody;
import com.huaweicloud.sdk.lts.v2.model.UpdateAccessConfigRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateAccessConfigRequestBody;
import com.huaweicloud.sdk.lts.v2.model.UpdateAccessConfigResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateAlarmRuleStatusRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateAlarmRuleStatusResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateAomMappingRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateAomMappingRulesRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateAomMappingRulesResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateCheckPointRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateCheckPointResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateHostGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateHostGroupRequestBody;
import com.huaweicloud.sdk.lts.v2.model.UpdateHostGroupResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateKeywordsAlarmRuleRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateKeywordsAlarmRuleRequestBody;
import com.huaweicloud.sdk.lts.v2.model.UpdateKeywordsAlarmRuleResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateLogConvergeConfigRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateLogConvergeConfigResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateLogGroupParams;
import com.huaweicloud.sdk.lts.v2.model.UpdateLogGroupRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateLogGroupResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateLogStreamParams;
import com.huaweicloud.sdk.lts.v2.model.UpdateLogStreamRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateLogStreamResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateNotificationTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateNotificationTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateSqlAlarmRuleRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateSqlAlarmRuleRequestBody;
import com.huaweicloud.sdk.lts.v2.model.UpdateSqlAlarmRuleResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateStructConfigRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateStructConfigResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateStructTemplateRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateStructTemplateResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateSwitchRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateSwitchResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdateTransferRequest;
import com.huaweicloud.sdk.lts.v2.model.UpdateTransferRequestBody;
import com.huaweicloud.sdk.lts.v2.model.UpdateTransferResponse;
import com.huaweicloud.sdk.lts.v2.model.UpdatelogConvergeConfig;

import java.util.List;

@SuppressWarnings("unchecked")
public class LtsMeta {

    public static final HttpRequestDef<CreateAccessConfigRequest, CreateAccessConfigResponse> createAccessConfig =
        genForCreateAccessConfig();

    private static HttpRequestDef<CreateAccessConfigRequest, CreateAccessConfigResponse> genForCreateAccessConfig() {
        // basic
        HttpRequestDef.Builder<CreateAccessConfigRequest, CreateAccessConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAccessConfigRequest.class, CreateAccessConfigResponse.class)
                .withName("CreateAccessConfig")
                .withUri("/v3/{project_id}/lts/access-config")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateAccessConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAccessConfigRequestBody.class),
            f -> f.withMarshaller(CreateAccessConfigRequest::getBody, CreateAccessConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAgencyAccessRequest, CreateAgencyAccessResponse> createAgencyAccess =
        genForCreateAgencyAccess();

    private static HttpRequestDef<CreateAgencyAccessRequest, CreateAgencyAccessResponse> genForCreateAgencyAccess() {
        // basic
        HttpRequestDef.Builder<CreateAgencyAccessRequest, CreateAgencyAccessResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAgencyAccessRequest.class, CreateAgencyAccessResponse.class)
                .withName("CreateAgencyAccess")
                .withUri("/v2.0/{project_id}/lts/createAgencyAccess")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<PreviewAgencyLogAccessReqListBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PreviewAgencyLogAccessReqListBody.class),
            f -> f.withMarshaller(CreateAgencyAccessRequest::getBody, CreateAgencyAccessRequest::setBody));

        // response
        builder.<List<LTSAccessConfigInfoRespon200>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateAgencyAccessResponse::getBody, CreateAgencyAccessResponse::setBody)
                .withInnerContainerType(LTSAccessConfigInfoRespon200.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateDashBoardRequest, CreateDashBoardResponse> createDashBoard =
        genForCreateDashBoard();

    private static HttpRequestDef<CreateDashBoardRequest, CreateDashBoardResponse> genForCreateDashBoard() {
        // basic
        HttpRequestDef.Builder<CreateDashBoardRequest, CreateDashBoardResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDashBoardRequest.class, CreateDashBoardResponse.class)
                .withName("CreateDashBoard")
                .withUri("/v2/{project_id}/dashboard")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateDashBoardReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDashBoardReqBody.class),
            f -> f.withMarshaller(CreateDashBoardRequest::getBody, CreateDashBoardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDashboardGroupRequest, CreateDashboardGroupResponse> createDashboardGroup =
        genForCreateDashboardGroup();

    private static HttpRequestDef<CreateDashboardGroupRequest, CreateDashboardGroupResponse> genForCreateDashboardGroup() {
        // basic
        HttpRequestDef.Builder<CreateDashboardGroupRequest, CreateDashboardGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDashboardGroupRequest.class, CreateDashboardGroupResponse.class)
            .withName("CreateDashboardGroup")
            .withUri("/v2/{project_id}/lts/dashboard-group")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateDashboardGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDashboardGroupReq.class),
            f -> f.withMarshaller(CreateDashboardGroupRequest::getBody, CreateDashboardGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHostGroupRequest, CreateHostGroupResponse> createHostGroup =
        genForCreateHostGroup();

    private static HttpRequestDef<CreateHostGroupRequest, CreateHostGroupResponse> genForCreateHostGroup() {
        // basic
        HttpRequestDef.Builder<CreateHostGroupRequest, CreateHostGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHostGroupRequest.class, CreateHostGroupResponse.class)
                .withName("CreateHostGroup")
                .withUri("/v3/{project_id}/lts/host-group")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateHostGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHostGroupRequestBody.class),
            f -> f.withMarshaller(CreateHostGroupRequest::getBody, CreateHostGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse> createKeywordsAlarmRule =
        genForCreateKeywordsAlarmRule();

    private static HttpRequestDef<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse> genForCreateKeywordsAlarmRule() {
        // basic
        HttpRequestDef.Builder<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateKeywordsAlarmRuleRequest.class, CreateKeywordsAlarmRuleResponse.class)
            .withName("CreateKeywordsAlarmRule")
            .withUri("/v2/{project_id}/lts/alarms/keywords-alarm-rule")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateKeywordsAlarmRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateKeywordsAlarmRuleRequestBody.class),
            f -> f.withMarshaller(CreateKeywordsAlarmRuleRequest::getBody, CreateKeywordsAlarmRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLogDumpObsRequest, CreateLogDumpObsResponse> createLogDumpObs =
        genForCreateLogDumpObs();

    private static HttpRequestDef<CreateLogDumpObsRequest, CreateLogDumpObsResponse> genForCreateLogDumpObs() {
        // basic
        HttpRequestDef.Builder<CreateLogDumpObsRequest, CreateLogDumpObsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLogDumpObsRequest.class, CreateLogDumpObsResponse.class)
                .withName("CreateLogDumpObs")
                .withUri("/v2/{project_id}/log-dump/obs")
                .withContentType("application/json");

        // requests
        builder.<CreateLogDumpObsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLogDumpObsRequestBody.class),
            f -> f.withMarshaller(CreateLogDumpObsRequest::getBody, CreateLogDumpObsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLogGroupRequest, CreateLogGroupResponse> createLogGroup =
        genForCreateLogGroup();

    private static HttpRequestDef<CreateLogGroupRequest, CreateLogGroupResponse> genForCreateLogGroup() {
        // basic
        HttpRequestDef.Builder<CreateLogGroupRequest, CreateLogGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLogGroupRequest.class, CreateLogGroupResponse.class)
                .withName("CreateLogGroup")
                .withUri("/v2/{project_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<CreateLogGroupParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLogGroupParams.class),
            f -> f.withMarshaller(CreateLogGroupRequest::getBody, CreateLogGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLogStreamRequest, CreateLogStreamResponse> createLogStream =
        genForCreateLogStream();

    private static HttpRequestDef<CreateLogStreamRequest, CreateLogStreamResponse> genForCreateLogStream() {
        // basic
        HttpRequestDef.Builder<CreateLogStreamRequest, CreateLogStreamResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLogStreamRequest.class, CreateLogStreamResponse.class)
                .withName("CreateLogStream")
                .withUri("/v2/{project_id}/groups/{log_group_id}/streams")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLogStreamRequest::getLogGroupId, CreateLogStreamRequest::setLogGroupId));
        builder.<CreateLogStreamParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLogStreamParams.class),
            f -> f.withMarshaller(CreateLogStreamRequest::getBody, CreateLogStreamRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLogStreamIndexRequest, CreateLogStreamIndexResponse> createLogStreamIndex =
        genForCreateLogStreamIndex();

    private static HttpRequestDef<CreateLogStreamIndexRequest, CreateLogStreamIndexResponse> genForCreateLogStreamIndex() {
        // basic
        HttpRequestDef.Builder<CreateLogStreamIndexRequest, CreateLogStreamIndexResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateLogStreamIndexRequest.class, CreateLogStreamIndexResponse.class)
            .withName("CreateLogStreamIndex")
            .withUri("/v1.0/{project_id}/groups/{group_id}/stream/{stream_id}/index/config")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLogStreamIndexRequest::getGroupId, CreateLogStreamIndexRequest::setGroupId));
        builder.<String>withRequestField("stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLogStreamIndexRequest::getStreamId, CreateLogStreamIndexRequest::setStreamId));
        builder.<LTSIndexConfigInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LTSIndexConfigInfo.class),
            f -> f.withMarshaller(CreateLogStreamIndexRequest::getBody, CreateLogStreamIndexRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNotificationTemplateRequest, CreateNotificationTemplateResponse> createNotificationTemplate =
        genForCreateNotificationTemplate();

    private static HttpRequestDef<CreateNotificationTemplateRequest, CreateNotificationTemplateResponse> genForCreateNotificationTemplate() {
        // basic
        HttpRequestDef.Builder<CreateNotificationTemplateRequest, CreateNotificationTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateNotificationTemplateRequest.class,
                    CreateNotificationTemplateResponse.class)
                .withName("CreateNotificationTemplate")
                .withUri("/v2/{project_id}/{domain_id}/lts/events/notification/templates")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNotificationTemplateRequest::getDomainId,
                CreateNotificationTemplateRequest::setDomainId));
        builder.<CreateNotificationTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNotificationTemplateRequestBody.class),
            f -> f.withMarshaller(CreateNotificationTemplateRequest::getBody,
                CreateNotificationTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSearchCriteriasRequest, CreateSearchCriteriasResponse> createSearchCriterias =
        genForCreateSearchCriterias();

    private static HttpRequestDef<CreateSearchCriteriasRequest, CreateSearchCriteriasResponse> genForCreateSearchCriterias() {
        // basic
        HttpRequestDef.Builder<CreateSearchCriteriasRequest, CreateSearchCriteriasResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSearchCriteriasRequest.class, CreateSearchCriteriasResponse.class)
            .withName("CreateSearchCriterias")
            .withUri("/v1.0/{project_id}/groups/{group_id}/topics/{topic_id}/search-criterias")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSearchCriteriasRequest::getGroupId, CreateSearchCriteriasRequest::setGroupId));
        builder.<String>withRequestField("topic_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSearchCriteriasRequest::getTopicId, CreateSearchCriteriasRequest::setTopicId));
        builder.<CreateSearchCriteriasBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateSearchCriteriasBody.class),
            f -> f.withMarshaller(CreateSearchCriteriasRequest::getBody, CreateSearchCriteriasRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStructConfigRequest, CreateStructConfigResponse> createStructConfig =
        genForCreateStructConfig();

    private static HttpRequestDef<CreateStructConfigRequest, CreateStructConfigResponse> genForCreateStructConfig() {
        // basic
        HttpRequestDef.Builder<CreateStructConfigRequest, CreateStructConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateStructConfigRequest.class, CreateStructConfigResponse.class)
                .withName("CreateStructConfig")
                .withUri("/v3/{project_id}/lts/struct/template")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<StructConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StructConfig.class),
            f -> f.withMarshaller(CreateStructConfigRequest::getBody, CreateStructConfigRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateStructConfigResponse::getBody, CreateStructConfigResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateStructTemplateRequest, CreateStructTemplateResponse> createStructTemplate =
        genForCreateStructTemplate();

    private static HttpRequestDef<CreateStructTemplateRequest, CreateStructTemplateResponse> genForCreateStructTemplate() {
        // basic
        HttpRequestDef.Builder<CreateStructTemplateRequest, CreateStructTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateStructTemplateRequest.class, CreateStructTemplateResponse.class)
            .withName("CreateStructTemplate")
            .withUri("/v2/{project_id}/lts/struct/template")
            .withContentType("application/json");

        // requests
        builder.<LtsStructTemplateInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LtsStructTemplateInfo.class),
            f -> f.withMarshaller(CreateStructTemplateRequest::getBody, CreateStructTemplateRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateStructTemplateResponse::getBody, CreateStructTemplateResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagsRequest, CreateTagsResponse> createTags = genForCreateTags();

    private static HttpRequestDef<CreateTagsRequest, CreateTagsResponse> genForCreateTags() {
        // basic
        HttpRequestDef.Builder<CreateTagsRequest, CreateTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagsRequest.class, CreateTagsResponse.class)
                .withName("CreateTags")
                .withUri("/v1/{project_id}/{resource_type}/{resource_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagsRequest::getResourceType, CreateTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagsRequest::getResourceId, CreateTagsRequest::setResourceId));
        builder.<CreateTagsReqbody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateTagsReqbody.class),
            f -> f.withMarshaller(CreateTagsRequest::getBody, CreateTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTransferRequest, CreateTransferResponse> createTransfer =
        genForCreateTransfer();

    private static HttpRequestDef<CreateTransferRequest, CreateTransferResponse> genForCreateTransfer() {
        // basic
        HttpRequestDef.Builder<CreateTransferRequest, CreateTransferResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTransferRequest.class, CreateTransferResponse.class)
                .withName("CreateTransfer")
                .withUri("/v2/{project_id}/transfers")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateTransferRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTransferRequestBody.class),
            f -> f.withMarshaller(CreateTransferRequest::getBody, CreateTransferRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatefavoriteRequest, CreatefavoriteResponse> createfavorite =
        genForCreatefavorite();

    private static HttpRequestDef<CreatefavoriteRequest, CreatefavoriteResponse> genForCreatefavorite() {
        // basic
        HttpRequestDef.Builder<CreatefavoriteRequest, CreatefavoriteResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatefavoriteRequest.class, CreatefavoriteResponse.class)
                .withName("Createfavorite")
                .withUri("/v1.0/{project_id}/lts/favorite")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreatefavoriteReqbody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreatefavoriteReqbody.class),
            f -> f.withMarshaller(CreatefavoriteRequest::getBody, CreatefavoriteRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAccessConfigRequest, DeleteAccessConfigResponse> deleteAccessConfig =
        genForDeleteAccessConfig();

    private static HttpRequestDef<DeleteAccessConfigRequest, DeleteAccessConfigResponse> genForDeleteAccessConfig() {
        // basic
        HttpRequestDef.Builder<DeleteAccessConfigRequest, DeleteAccessConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAccessConfigRequest.class, DeleteAccessConfigResponse.class)
                .withName("DeleteAccessConfig")
                .withUri("/v3/{project_id}/lts/access-config")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DeleteAccessConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAccessConfigRequestBody.class),
            f -> f.withMarshaller(DeleteAccessConfigRequest::getBody, DeleteAccessConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse> deleteActiveAlarms =
        genForDeleteActiveAlarms();

    private static HttpRequestDef<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse> genForDeleteActiveAlarms() {
        // basic
        HttpRequestDef.Builder<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteActiveAlarmsRequest.class, DeleteActiveAlarmsResponse.class)
                .withName("DeleteActiveAlarms")
                .withUri("/v2/{project_id}/{domain_id}/lts/alarms/sql-alarm/clear")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteActiveAlarmsRequest::getDomainId, DeleteActiveAlarmsRequest::setDomainId));
        builder.<DeleteActiveAlarmsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteActiveAlarmsRequestBody.class),
            f -> f.withMarshaller(DeleteActiveAlarmsRequest::getBody, DeleteActiveAlarmsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDashboardRequest, DeleteDashboardResponse> deleteDashboard =
        genForDeleteDashboard();

    private static HttpRequestDef<DeleteDashboardRequest, DeleteDashboardResponse> genForDeleteDashboard() {
        // basic
        HttpRequestDef.Builder<DeleteDashboardRequest, DeleteDashboardResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDashboardRequest.class, DeleteDashboardResponse.class)
                .withName("DeleteDashboard")
                .withUri("/v2/{project_id}/dashboard")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDashboardRequest::getId, DeleteDashboardRequest::setId));
        builder.<Boolean>withRequestField("is_delete_charts",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDashboardRequest::getIsDeleteCharts,
                DeleteDashboardRequest::setIsDeleteCharts));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHostGroupRequest, DeleteHostGroupResponse> deleteHostGroup =
        genForDeleteHostGroup();

    private static HttpRequestDef<DeleteHostGroupRequest, DeleteHostGroupResponse> genForDeleteHostGroup() {
        // basic
        HttpRequestDef.Builder<DeleteHostGroupRequest, DeleteHostGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHostGroupRequest.class, DeleteHostGroupResponse.class)
                .withName("DeleteHostGroup")
                .withUri("/v3/{project_id}/lts/host-group")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DeleteHostGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteHostGroupRequestBody.class),
            f -> f.withMarshaller(DeleteHostGroupRequest::getBody, DeleteHostGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse> deleteKeywordsAlarmRule =
        genForDeleteKeywordsAlarmRule();

    private static HttpRequestDef<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse> genForDeleteKeywordsAlarmRule() {
        // basic
        HttpRequestDef.Builder<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteKeywordsAlarmRuleRequest.class, DeleteKeywordsAlarmRuleResponse.class)
            .withName("DeleteKeywordsAlarmRule")
            .withUri("/v2/{project_id}/lts/alarms/keywords-alarm-rule/{keywords_alarm_rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keywords_alarm_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKeywordsAlarmRuleRequest::getKeywordsAlarmRuleId,
                DeleteKeywordsAlarmRuleRequest::setKeywordsAlarmRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLogGroupRequest, DeleteLogGroupResponse> deleteLogGroup =
        genForDeleteLogGroup();

    private static HttpRequestDef<DeleteLogGroupRequest, DeleteLogGroupResponse> genForDeleteLogGroup() {
        // basic
        HttpRequestDef.Builder<DeleteLogGroupRequest, DeleteLogGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLogGroupRequest.class, DeleteLogGroupResponse.class)
                .withName("DeleteLogGroup")
                .withUri("/v2/{project_id}/groups/{log_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogGroupRequest::getLogGroupId, DeleteLogGroupRequest::setLogGroupId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteLogGroupResponse::getBody, DeleteLogGroupResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLogStreamRequest, DeleteLogStreamResponse> deleteLogStream =
        genForDeleteLogStream();

    private static HttpRequestDef<DeleteLogStreamRequest, DeleteLogStreamResponse> genForDeleteLogStream() {
        // basic
        HttpRequestDef.Builder<DeleteLogStreamRequest, DeleteLogStreamResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLogStreamRequest.class, DeleteLogStreamResponse.class)
                .withName("DeleteLogStream")
                .withUri("/v2/{project_id}/groups/{log_group_id}/streams/{log_stream_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogStreamRequest::getLogGroupId, DeleteLogStreamRequest::setLogGroupId));
        builder.<String>withRequestField("log_stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogStreamRequest::getLogStreamId, DeleteLogStreamRequest::setLogStreamId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteLogStreamResponse::getBody, DeleteLogStreamResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNotificationTemplateRequest, DeleteNotificationTemplateResponse> deleteNotificationTemplate =
        genForDeleteNotificationTemplate();

    private static HttpRequestDef<DeleteNotificationTemplateRequest, DeleteNotificationTemplateResponse> genForDeleteNotificationTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteNotificationTemplateRequest, DeleteNotificationTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteNotificationTemplateRequest.class,
                    DeleteNotificationTemplateResponse.class)
                .withName("DeleteNotificationTemplate")
                .withUri("/v2/{project_id}/{domain_id}/lts/events/notification/templates")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNotificationTemplateRequest::getDomainId,
                DeleteNotificationTemplateRequest::setDomainId));
        builder.<DeleteNotificationTemplateBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteNotificationTemplateBody.class),
            f -> f.withMarshaller(DeleteNotificationTemplateRequest::getBody,
                DeleteNotificationTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSearchCriteriasRequest, DeleteSearchCriteriasResponse> deleteSearchCriterias =
        genForDeleteSearchCriterias();

    private static HttpRequestDef<DeleteSearchCriteriasRequest, DeleteSearchCriteriasResponse> genForDeleteSearchCriterias() {
        // basic
        HttpRequestDef.Builder<DeleteSearchCriteriasRequest, DeleteSearchCriteriasResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSearchCriteriasRequest.class, DeleteSearchCriteriasResponse.class)
            .withName("DeleteSearchCriterias")
            .withUri("/v1.0/{project_id}/groups/{group_id}/topics/{topic_id}/search-criterias")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSearchCriteriasRequest::getGroupId, DeleteSearchCriteriasRequest::setGroupId));
        builder.<String>withRequestField("topic_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSearchCriteriasRequest::getTopicId, DeleteSearchCriteriasRequest::setTopicId));
        builder.<DeleteSearchCriterias>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteSearchCriterias.class),
            f -> f.withMarshaller(DeleteSearchCriteriasRequest::getBody, DeleteSearchCriteriasRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStructTemplateRequest, DeleteStructTemplateResponse> deleteStructTemplate =
        genForDeleteStructTemplate();

    private static HttpRequestDef<DeleteStructTemplateRequest, DeleteStructTemplateResponse> genForDeleteStructTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteStructTemplateRequest, DeleteStructTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteStructTemplateRequest.class, DeleteStructTemplateResponse.class)
            .withName("DeleteStructTemplate")
            .withUri("/v2/{project_id}/lts/struct/template")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DeleteStructTemplateReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteStructTemplateReqBody.class),
            f -> f.withMarshaller(DeleteStructTemplateRequest::getBody, DeleteStructTemplateRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteStructTemplateResponse::getBody, DeleteStructTemplateResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTransferRequest, DeleteTransferResponse> deleteTransfer =
        genForDeleteTransfer();

    private static HttpRequestDef<DeleteTransferRequest, DeleteTransferResponse> genForDeleteTransfer() {
        // basic
        HttpRequestDef.Builder<DeleteTransferRequest, DeleteTransferResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTransferRequest.class, DeleteTransferResponse.class)
                .withName("DeleteTransfer")
                .withUri("/v2/{project_id}/transfers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_transfer_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTransferRequest::getLogTransferId, DeleteTransferRequest::setLogTransferId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletefavoriteRequest, DeletefavoriteResponse> deletefavorite =
        genForDeletefavorite();

    private static HttpRequestDef<DeletefavoriteRequest, DeletefavoriteResponse> genForDeletefavorite() {
        // basic
        HttpRequestDef.Builder<DeletefavoriteRequest, DeletefavoriteResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletefavoriteRequest.class, DeletefavoriteResponse.class)
                .withName("Deletefavorite")
                .withUri("/v1.0/{project_id}/lts/favorite/{fav_res_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fav_res_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletefavoriteRequest::getFavResId, DeletefavoriteRequest::setFavResId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableLogCollectionRequest, DisableLogCollectionResponse> disableLogCollection =
        genForDisableLogCollection();

    private static HttpRequestDef<DisableLogCollectionRequest, DisableLogCollectionResponse> genForDisableLogCollection() {
        // basic
        HttpRequestDef.Builder<DisableLogCollectionRequest, DisableLogCollectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DisableLogCollectionRequest.class, DisableLogCollectionResponse.class)
            .withName("DisableLogCollection")
            .withUri("/v2/{project_id}/collection/disable")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableLogCollectionRequest, EnableLogCollectionResponse> enableLogCollection =
        genForEnableLogCollection();

    private static HttpRequestDef<EnableLogCollectionRequest, EnableLogCollectionResponse> genForEnableLogCollection() {
        // basic
        HttpRequestDef.Builder<EnableLogCollectionRequest, EnableLogCollectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableLogCollectionRequest.class, EnableLogCollectionResponse.class)
                .withName("EnableLogCollection")
                .withUri("/v2/{project_id}/collection/enable")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessConfigRequest, ListAccessConfigResponse> listAccessConfig =
        genForListAccessConfig();

    private static HttpRequestDef<ListAccessConfigRequest, ListAccessConfigResponse> genForListAccessConfig() {
        // basic
        HttpRequestDef.Builder<ListAccessConfigRequest, ListAccessConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAccessConfigRequest.class, ListAccessConfigResponse.class)
                .withName("ListAccessConfig")
                .withUri("/v3/{project_id}/lts/access-config-list")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<GetAccessConfigListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetAccessConfigListRequestBody.class),
            f -> f.withMarshaller(ListAccessConfigRequest::getBody, ListAccessConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse> listActiveOrHistoryAlarms =
        genForListActiveOrHistoryAlarms();

    private static HttpRequestDef<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse> genForListActiveOrHistoryAlarms() {
        // basic
        HttpRequestDef.Builder<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListActiveOrHistoryAlarmsRequest.class,
                    ListActiveOrHistoryAlarmsResponse.class)
                .withName("ListActiveOrHistoryAlarms")
                .withUri("/v2/{project_id}/{domain_id}/lts/alarms/sql-alarm/query")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActiveOrHistoryAlarmsRequest::getDomainId,
                ListActiveOrHistoryAlarmsRequest::setDomainId));
        builder.<ListActiveOrHistoryAlarmsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListActiveOrHistoryAlarmsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListActiveOrHistoryAlarmsRequest::getType,
                ListActiveOrHistoryAlarmsRequest::setType));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActiveOrHistoryAlarmsRequest::getMarker,
                ListActiveOrHistoryAlarmsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListActiveOrHistoryAlarmsRequest::getLimit,
                ListActiveOrHistoryAlarmsRequest::setLimit));
        builder.<ListActiveOrHistoryAlarmsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListActiveOrHistoryAlarmsRequestBody.class),
            f -> f.withMarshaller(ListActiveOrHistoryAlarmsRequest::getBody,
                ListActiveOrHistoryAlarmsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBreifStructTemplateRequest, ListBreifStructTemplateResponse> listBreifStructTemplate =
        genForListBreifStructTemplate();

    private static HttpRequestDef<ListBreifStructTemplateRequest, ListBreifStructTemplateResponse> genForListBreifStructTemplate() {
        // basic
        HttpRequestDef.Builder<ListBreifStructTemplateRequest, ListBreifStructTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListBreifStructTemplateRequest.class, ListBreifStructTemplateResponse.class)
            .withName("ListBreifStructTemplate")
            .withUri("/v3/{project_id}/lts/struct/customtemplate/list")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListChartsRequest, ListChartsResponse> listCharts = genForListCharts();

    private static HttpRequestDef<ListChartsRequest, ListChartsResponse> genForListCharts() {
        // basic
        HttpRequestDef.Builder<ListChartsRequest, ListChartsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListChartsRequest.class, ListChartsResponse.class)
                .withName("ListCharts")
                .withUri("/v2/{project_id}/groups/{log_group_id}/streams/{log_stream_id}/charts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListChartsRequest::getLogGroupId, ListChartsRequest::setLogGroupId));
        builder.<String>withRequestField("log_stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListChartsRequest::getLogStreamId, ListChartsRequest::setLogStreamId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListChartsRequest::getOffset, ListChartsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListChartsRequest::getLimit, ListChartsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCriteriasRequest, ListCriteriasResponse> listCriterias =
        genForListCriterias();

    private static HttpRequestDef<ListCriteriasRequest, ListCriteriasResponse> genForListCriterias() {
        // basic
        HttpRequestDef.Builder<ListCriteriasRequest, ListCriteriasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCriteriasRequest.class, ListCriteriasResponse.class)
                .withName("ListCriterias")
                .withUri("/v1.0/{project_id}/groups/{group_id}/topics/{topic_id}/search-criterias")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCriteriasRequest::getGroupId, ListCriteriasRequest::setGroupId));
        builder.<String>withRequestField("topic_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCriteriasRequest::getTopicId, ListCriteriasRequest::setTopicId));
        builder.<String>withRequestField("search_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCriteriasRequest::getSearchType, ListCriteriasRequest::setSearchType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistorySqlRequest, ListHistorySqlResponse> listHistorySql =
        genForListHistorySql();

    private static HttpRequestDef<ListHistorySqlRequest, ListHistorySqlResponse> genForListHistorySql() {
        // basic
        HttpRequestDef.Builder<ListHistorySqlRequest, ListHistorySqlResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHistorySqlRequest.class, ListHistorySqlResponse.class)
                .withName("ListHistorySql")
                .withUri("/v2/{project_id}/lts/history-sql")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistorySqlRequest::getLogGroupId, ListHistorySqlRequest::setLogGroupId));
        builder.<String>withRequestField("log_stream_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistorySqlRequest::getLogStreamId, ListHistorySqlRequest::setLogStreamId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostRequest, ListHostResponse> listHost = genForListHost();

    private static HttpRequestDef<ListHostRequest, ListHostResponse> genForListHost() {
        // basic
        HttpRequestDef.Builder<ListHostRequest, ListHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListHostRequest.class, ListHostResponse.class)
                .withName("ListHost")
                .withUri("/v3/{project_id}/lts/host-list")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<GetHostListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetHostListRequestBody.class),
            f -> f.withMarshaller(ListHostRequest::getBody, ListHostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostGroupRequest, ListHostGroupResponse> listHostGroup =
        genForListHostGroup();

    private static HttpRequestDef<ListHostGroupRequest, ListHostGroupResponse> genForListHostGroup() {
        // basic
        HttpRequestDef.Builder<ListHostGroupRequest, ListHostGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListHostGroupRequest.class, ListHostGroupResponse.class)
                .withName("ListHostGroup")
                .withUri("/v3/{project_id}/lts/host-group-list")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<GetHostGroupListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetHostGroupListRequestBody.class),
            f -> f.withMarshaller(ListHostGroupRequest::getBody, ListHostGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse> listKeywordsAlarmRules =
        genForListKeywordsAlarmRules();

    private static HttpRequestDef<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse> genForListKeywordsAlarmRules() {
        // basic
        HttpRequestDef.Builder<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListKeywordsAlarmRulesRequest.class, ListKeywordsAlarmRulesResponse.class)
            .withName("ListKeywordsAlarmRules")
            .withUri("/v2/{project_id}/lts/alarms/keywords-alarm-rule")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogContextRequest, ListLogContextResponse> listLogContext =
        genForListLogContext();

    private static HttpRequestDef<ListLogContextRequest, ListLogContextResponse> genForListLogContext() {
        // basic
        HttpRequestDef.Builder<ListLogContextRequest, ListLogContextResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListLogContextRequest.class, ListLogContextResponse.class)
                .withName("ListLogContext")
                .withUri("/v2/{project_id}/groups/{log_group_id}/streams/{log_stream_id}/context")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogContextRequest::getLogGroupId, ListLogContextRequest::setLogGroupId));
        builder.<String>withRequestField("log_stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogContextRequest::getLogStreamId, ListLogContextRequest::setLogStreamId));
        builder.<ListLogContextRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListLogContextRequestBody.class),
            f -> f.withMarshaller(ListLogContextRequest::getBody, ListLogContextRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogGroupsRequest, ListLogGroupsResponse> listLogGroups =
        genForListLogGroups();

    private static HttpRequestDef<ListLogGroupsRequest, ListLogGroupsResponse> genForListLogGroups() {
        // basic
        HttpRequestDef.Builder<ListLogGroupsRequest, ListLogGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLogGroupsRequest.class, ListLogGroupsResponse.class)
                .withName("ListLogGroups")
                .withUri("/v2/{project_id}/groups")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogHistogramRequest, ListLogHistogramResponse> listLogHistogram =
        genForListLogHistogram();

    private static HttpRequestDef<ListLogHistogramRequest, ListLogHistogramResponse> genForListLogHistogram() {
        // basic
        HttpRequestDef.Builder<ListLogHistogramRequest, ListLogHistogramResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListLogHistogramRequest.class, ListLogHistogramResponse.class)
                .withName("ListLogHistogram")
                .withUri("/v2/{project_id}/lts/keyword-count")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<QueryLogKeyWordCountRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryLogKeyWordCountRequestBody.class),
            f -> f.withMarshaller(ListLogHistogramRequest::getBody, ListLogHistogramRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogStreamRequest, ListLogStreamResponse> listLogStream =
        genForListLogStream();

    private static HttpRequestDef<ListLogStreamRequest, ListLogStreamResponse> genForListLogStream() {
        // basic
        HttpRequestDef.Builder<ListLogStreamRequest, ListLogStreamResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLogStreamRequest.class, ListLogStreamResponse.class)
                .withName("ListLogStream")
                .withUri("/v2/{project_id}/groups/{log_group_id}/streams")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogStreamRequest::getLogGroupId, ListLogStreamRequest::setLogGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogStreamsRequest, ListLogStreamsResponse> listLogStreams =
        genForListLogStreams();

    private static HttpRequestDef<ListLogStreamsRequest, ListLogStreamsResponse> genForListLogStreams() {
        // basic
        HttpRequestDef.Builder<ListLogStreamsRequest, ListLogStreamsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLogStreamsRequest.class, ListLogStreamsResponse.class)
                .withName("ListLogStreams")
                .withUri("/v2/{project_id}/log-streams")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogStreamsRequest::getLogGroupName, ListLogStreamsRequest::setLogGroupName));
        builder.<String>withRequestField("log_stream_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogStreamsRequest::getLogStreamName, ListLogStreamsRequest::setLogStreamName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogsRequest, ListLogsResponse> listLogs = genForListLogs();

    private static HttpRequestDef<ListLogsRequest, ListLogsResponse> genForListLogs() {
        // basic
        HttpRequestDef.Builder<ListLogsRequest, ListLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListLogsRequest.class, ListLogsResponse.class)
                .withName("ListLogs")
                .withUri("/v2/{project_id}/groups/{log_group_id}/streams/{log_stream_id}/content/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogsRequest::getLogGroupId, ListLogsRequest::setLogGroupId));
        builder.<String>withRequestField("log_stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogsRequest::getLogStreamId, ListLogsRequest::setLogStreamId));
        builder.<QueryLtsLogParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryLtsLogParams.class),
            f -> f.withMarshaller(ListLogsRequest::getBody, ListLogsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotificationTemplateRequest, ListNotificationTemplateResponse> listNotificationTemplate =
        genForListNotificationTemplate();

    private static HttpRequestDef<ListNotificationTemplateRequest, ListNotificationTemplateResponse> genForListNotificationTemplate() {
        // basic
        HttpRequestDef.Builder<ListNotificationTemplateRequest, ListNotificationTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ListNotificationTemplateRequest.class, ListNotificationTemplateResponse.class)
                .withName("ListNotificationTemplate")
                .withUri("/v2/{project_id}/{domain_id}/lts/events/notification/templates/view")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotificationTemplateRequest::getDomainId,
                ListNotificationTemplateRequest::setDomainId));
        builder.<PreviewTemplateBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PreviewTemplateBody.class),
            f -> f.withMarshaller(ListNotificationTemplateRequest::getBody, ListNotificationTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotificationTemplatesRequest, ListNotificationTemplatesResponse> listNotificationTemplates =
        genForListNotificationTemplates();

    private static HttpRequestDef<ListNotificationTemplatesRequest, ListNotificationTemplatesResponse> genForListNotificationTemplates() {
        // basic
        HttpRequestDef.Builder<ListNotificationTemplatesRequest, ListNotificationTemplatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListNotificationTemplatesRequest.class,
                    ListNotificationTemplatesResponse.class)
                .withName("ListNotificationTemplates")
                .withUri("/v2/{project_id}/{domain_id}/lts/events/notification/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotificationTemplatesRequest::getDomainId,
                ListNotificationTemplatesRequest::setDomainId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotificationTemplatesRequest::getOffset,
                ListNotificationTemplatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotificationTemplatesRequest::getLimit,
                ListNotificationTemplatesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotificationTopicsRequest, ListNotificationTopicsResponse> listNotificationTopics =
        genForListNotificationTopics();

    private static HttpRequestDef<ListNotificationTopicsRequest, ListNotificationTopicsResponse> genForListNotificationTopics() {
        // basic
        HttpRequestDef.Builder<ListNotificationTopicsRequest, ListNotificationTopicsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListNotificationTopicsRequest.class, ListNotificationTopicsResponse.class)
            .withName("ListNotificationTopics")
            .withUri("/v2/{project_id}/lts/notifications/topics")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotificationTopicsRequest::getOffset, ListNotificationTopicsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotificationTopicsRequest::getLimit, ListNotificationTopicsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueryAllSearchCriteriasRequest, ListQueryAllSearchCriteriasResponse> listQueryAllSearchCriterias =
        genForListQueryAllSearchCriterias();

    private static HttpRequestDef<ListQueryAllSearchCriteriasRequest, ListQueryAllSearchCriteriasResponse> genForListQueryAllSearchCriterias() {
        // basic
        HttpRequestDef.Builder<ListQueryAllSearchCriteriasRequest, ListQueryAllSearchCriteriasResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListQueryAllSearchCriteriasRequest.class,
                    ListQueryAllSearchCriteriasResponse.class)
                .withName("ListQueryAllSearchCriterias")
                .withUri("/v1.0/{project_id}/lts/groups/{group_id}/search-criterias")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryAllSearchCriteriasRequest::getGroupId,
                ListQueryAllSearchCriteriasRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse> listQueryStructuredLogs =
        genForListQueryStructuredLogs();

    private static HttpRequestDef<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse> genForListQueryStructuredLogs() {
        // basic
        HttpRequestDef.Builder<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListQueryStructuredLogsRequest.class, ListQueryStructuredLogsResponse.class)
            .withName("ListQueryStructuredLogs")
            .withUri("/v2/{project_id}/groups/{log_group_id}/streams/{log_stream_id}/struct-content/query")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryStructuredLogsRequest::getLogGroupId,
                ListQueryStructuredLogsRequest::setLogGroupId));
        builder.<String>withRequestField("log_stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryStructuredLogsRequest::getLogStreamId,
                ListQueryStructuredLogsRequest::setLogStreamId));
        builder.<QueryLtsStructLogParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryLtsStructLogParams.class),
            f -> f.withMarshaller(ListQueryStructuredLogsRequest::getBody, ListQueryStructuredLogsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStructTemplateRequest, ListStructTemplateResponse> listStructTemplate =
        genForListStructTemplate();

    private static HttpRequestDef<ListStructTemplateRequest, ListStructTemplateResponse> genForListStructTemplate() {
        // basic
        HttpRequestDef.Builder<ListStructTemplateRequest, ListStructTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStructTemplateRequest.class, ListStructTemplateResponse.class)
                .withName("ListStructTemplate")
                .withUri("/v3/{project_id}/lts/struct/customtemplate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStructTemplateRequest::getId, ListStructTemplateRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse> listStructuredLogsWithTimeRange =
        genForListStructuredLogsWithTimeRange();

    private static HttpRequestDef<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse> genForListStructuredLogsWithTimeRange() {
        // basic
        HttpRequestDef.Builder<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListStructuredLogsWithTimeRangeRequest.class,
                    ListStructuredLogsWithTimeRangeResponse.class)
                .withName("ListStructuredLogsWithTimeRange")
                .withUri("/v2/{project_id}/streams/{log_stream_id}/struct-content/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStructuredLogsWithTimeRangeRequest::getLogStreamId,
                ListStructuredLogsWithTimeRangeRequest::setLogStreamId));
        builder.<QueryLtsStructLogParamsNew>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryLtsStructLogParamsNew.class),
            f -> f.withMarshaller(ListStructuredLogsWithTimeRangeRequest::getBody,
                ListStructuredLogsWithTimeRangeRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(ListStructuredLogsWithTimeRangeResponse::getBody,
                ListStructuredLogsWithTimeRangeResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListTimeLineTrafficStatisticsRequest, ListTimeLineTrafficStatisticsResponse> listTimeLineTrafficStatistics =
        genForListTimeLineTrafficStatistics();

    private static HttpRequestDef<ListTimeLineTrafficStatisticsRequest, ListTimeLineTrafficStatisticsResponse> genForListTimeLineTrafficStatistics() {
        // basic
        HttpRequestDef.Builder<ListTimeLineTrafficStatisticsRequest, ListTimeLineTrafficStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListTimeLineTrafficStatisticsRequest.class,
                    ListTimeLineTrafficStatisticsResponse.class)
                .withName("ListTimeLineTrafficStatistics")
                .withUri("/v2/{project_id}/lts/timeline-traffic-statistics")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("timezone",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTimeLineTrafficStatisticsRequest::getTimezone,
                ListTimeLineTrafficStatisticsRequest::setTimezone));
        builder.<TimelineTrafficStatisticsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TimelineTrafficStatisticsRequestBody.class),
            f -> f.withMarshaller(ListTimeLineTrafficStatisticsRequest::getBody,
                ListTimeLineTrafficStatisticsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopnTrafficStatisticsRequest, ListTopnTrafficStatisticsResponse> listTopnTrafficStatistics =
        genForListTopnTrafficStatistics();

    private static HttpRequestDef<ListTopnTrafficStatisticsRequest, ListTopnTrafficStatisticsResponse> genForListTopnTrafficStatistics() {
        // basic
        HttpRequestDef.Builder<ListTopnTrafficStatisticsRequest, ListTopnTrafficStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListTopnTrafficStatisticsRequest.class,
                    ListTopnTrafficStatisticsResponse.class)
                .withName("ListTopnTrafficStatistics")
                .withUri("/v2/{project_id}/lts/topn-traffic-statistics")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<TopnRequstBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TopnRequstBody.class),
            f -> f.withMarshaller(ListTopnTrafficStatisticsRequest::getBody,
                ListTopnTrafficStatisticsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTransfersRequest, ListTransfersResponse> listTransfers =
        genForListTransfers();

    private static HttpRequestDef<ListTransfersRequest, ListTransfersResponse> genForListTransfers() {
        // basic
        HttpRequestDef.Builder<ListTransfersRequest, ListTransfersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTransfersRequest.class, ListTransfersResponse.class)
                .withName("ListTransfers")
                .withUri("/v2/{project_id}/transfers")
                .withContentType("application/json");

        // requests
        builder.<ListTransfersRequest.LogTransferTypeEnum>withRequestField("log_transfer_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTransfersRequest.LogTransferTypeEnum.class),
            f -> f.withMarshaller(ListTransfersRequest::getLogTransferType, ListTransfersRequest::setLogTransferType));
        builder.<String>withRequestField("log_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTransfersRequest::getLogGroupName, ListTransfersRequest::setLogGroupName));
        builder.<String>withRequestField("log_stream_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTransfersRequest::getLogStreamName, ListTransfersRequest::setLogStreamName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterDmsKafkaInstanceRequest, RegisterDmsKafkaInstanceResponse> registerDmsKafkaInstance =
        genForRegisterDmsKafkaInstance();

    private static HttpRequestDef<RegisterDmsKafkaInstanceRequest, RegisterDmsKafkaInstanceResponse> genForRegisterDmsKafkaInstance() {
        // basic
        HttpRequestDef.Builder<RegisterDmsKafkaInstanceRequest, RegisterDmsKafkaInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, RegisterDmsKafkaInstanceRequest.class, RegisterDmsKafkaInstanceResponse.class)
                .withName("RegisterDmsKafkaInstance")
                .withUri("/v2/{project_id}/lts/dms/kafka-instance")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<RegisterDmsKafkaInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RegisterDmsKafkaInstanceRequestBody.class),
            f -> f.withMarshaller(RegisterDmsKafkaInstanceRequest::getBody, RegisterDmsKafkaInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAdminConfigRequest, ShowAdminConfigResponse> showAdminConfig =
        genForShowAdminConfig();

    private static HttpRequestDef<ShowAdminConfigRequest, ShowAdminConfigResponse> genForShowAdminConfig() {
        // basic
        HttpRequestDef.Builder<ShowAdminConfigRequest, ShowAdminConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAdminConfigRequest.class, ShowAdminConfigResponse.class)
                .withName("ShowAdminConfig")
                .withUri("/v1/{project_id}/lts/log-converge-config/switch")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLogConvergeConfigRequest, ShowLogConvergeConfigResponse> showLogConvergeConfig =
        genForShowLogConvergeConfig();

    private static HttpRequestDef<ShowLogConvergeConfigRequest, ShowLogConvergeConfigResponse> genForShowLogConvergeConfig() {
        // basic
        HttpRequestDef.Builder<ShowLogConvergeConfigRequest, ShowLogConvergeConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowLogConvergeConfigRequest.class, ShowLogConvergeConfigResponse.class)
            .withName("ShowLogConvergeConfig")
            .withUri("/v1/{project_id}/lts/log-converge-config/{member_account_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("member_account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogConvergeConfigRequest::getMemberAccountId,
                ShowLogConvergeConfigRequest::setMemberAccountId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMemberGroupAndStreamRequest, ShowMemberGroupAndStreamResponse> showMemberGroupAndStream =
        genForShowMemberGroupAndStream();

    private static HttpRequestDef<ShowMemberGroupAndStreamRequest, ShowMemberGroupAndStreamResponse> genForShowMemberGroupAndStream() {
        // basic
        HttpRequestDef.Builder<ShowMemberGroupAndStreamRequest, ShowMemberGroupAndStreamResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowMemberGroupAndStreamRequest.class, ShowMemberGroupAndStreamResponse.class)
                .withName("ShowMemberGroupAndStream")
                .withUri("/v1/{project_id}/lts/{member_account_id}/all-streams")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("member_account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMemberGroupAndStreamRequest::getMemberAccountId,
                ShowMemberGroupAndStreamRequest::setMemberAccountId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNotificationTemplateRequest, ShowNotificationTemplateResponse> showNotificationTemplate =
        genForShowNotificationTemplate();

    private static HttpRequestDef<ShowNotificationTemplateRequest, ShowNotificationTemplateResponse> genForShowNotificationTemplate() {
        // basic
        HttpRequestDef.Builder<ShowNotificationTemplateRequest, ShowNotificationTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowNotificationTemplateRequest.class, ShowNotificationTemplateResponse.class)
                .withName("ShowNotificationTemplate")
                .withUri("/v2/{project_id}/{domain_id}/lts/events/notification/template/{template_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNotificationTemplateRequest::getDomainId,
                ShowNotificationTemplateRequest::setDomainId));
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNotificationTemplateRequest::getTemplateName,
                ShowNotificationTemplateRequest::setTemplateName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStructTemplateRequest, ShowStructTemplateResponse> showStructTemplate =
        genForShowStructTemplate();

    private static HttpRequestDef<ShowStructTemplateRequest, ShowStructTemplateResponse> genForShowStructTemplate() {
        // basic
        HttpRequestDef.Builder<ShowStructTemplateRequest, ShowStructTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStructTemplateRequest.class, ShowStructTemplateResponse.class)
                .withName("ShowStructTemplate")
                .withUri("/v2/{project_id}/lts/struct/template")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("logGroupId",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStructTemplateRequest::getLogGroupId, ShowStructTemplateRequest::setLogGroupId));
        builder.<String>withRequestField("logStreamId",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStructTemplateRequest::getLogStreamId,
                ShowStructTemplateRequest::setLogStreamId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAccessConfigRequest, UpdateAccessConfigResponse> updateAccessConfig =
        genForUpdateAccessConfig();

    private static HttpRequestDef<UpdateAccessConfigRequest, UpdateAccessConfigResponse> genForUpdateAccessConfig() {
        // basic
        HttpRequestDef.Builder<UpdateAccessConfigRequest, UpdateAccessConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAccessConfigRequest.class, UpdateAccessConfigResponse.class)
                .withName("UpdateAccessConfig")
                .withUri("/v3/{project_id}/lts/access-config")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UpdateAccessConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAccessConfigRequestBody.class),
            f -> f.withMarshaller(UpdateAccessConfigRequest::getBody, UpdateAccessConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHostGroupRequest, UpdateHostGroupResponse> updateHostGroup =
        genForUpdateHostGroup();

    private static HttpRequestDef<UpdateHostGroupRequest, UpdateHostGroupResponse> genForUpdateHostGroup() {
        // basic
        HttpRequestDef.Builder<UpdateHostGroupRequest, UpdateHostGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHostGroupRequest.class, UpdateHostGroupResponse.class)
                .withName("UpdateHostGroup")
                .withUri("/v3/{project_id}/lts/host-group")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UpdateHostGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHostGroupRequestBody.class),
            f -> f.withMarshaller(UpdateHostGroupRequest::getBody, UpdateHostGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse> updateKeywordsAlarmRule =
        genForUpdateKeywordsAlarmRule();

    private static HttpRequestDef<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse> genForUpdateKeywordsAlarmRule() {
        // basic
        HttpRequestDef.Builder<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateKeywordsAlarmRuleRequest.class, UpdateKeywordsAlarmRuleResponse.class)
            .withName("UpdateKeywordsAlarmRule")
            .withUri("/v2/{project_id}/lts/alarms/keywords-alarm-rule")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UpdateKeywordsAlarmRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateKeywordsAlarmRuleRequestBody.class),
            f -> f.withMarshaller(UpdateKeywordsAlarmRuleRequest::getBody, UpdateKeywordsAlarmRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLogConvergeConfigRequest, UpdateLogConvergeConfigResponse> updateLogConvergeConfig =
        genForUpdateLogConvergeConfig();

    private static HttpRequestDef<UpdateLogConvergeConfigRequest, UpdateLogConvergeConfigResponse> genForUpdateLogConvergeConfig() {
        // basic
        HttpRequestDef.Builder<UpdateLogConvergeConfigRequest, UpdateLogConvergeConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateLogConvergeConfigRequest.class, UpdateLogConvergeConfigResponse.class)
            .withName("UpdateLogConvergeConfig")
            .withUri("/v1/{project_id}/lts/log-converge-config")
            .withContentType("application/json");

        // requests
        builder.<UpdatelogConvergeConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatelogConvergeConfig.class),
            f -> f.withMarshaller(UpdateLogConvergeConfigRequest::getBody, UpdateLogConvergeConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLogGroupRequest, UpdateLogGroupResponse> updateLogGroup =
        genForUpdateLogGroup();

    private static HttpRequestDef<UpdateLogGroupRequest, UpdateLogGroupResponse> genForUpdateLogGroup() {
        // basic
        HttpRequestDef.Builder<UpdateLogGroupRequest, UpdateLogGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateLogGroupRequest.class, UpdateLogGroupResponse.class)
                .withName("UpdateLogGroup")
                .withUri("/v2/{project_id}/groups/{log_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLogGroupRequest::getLogGroupId, UpdateLogGroupRequest::setLogGroupId));
        builder.<UpdateLogGroupParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLogGroupParams.class),
            f -> f.withMarshaller(UpdateLogGroupRequest::getBody, UpdateLogGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLogStreamRequest, UpdateLogStreamResponse> updateLogStream =
        genForUpdateLogStream();

    private static HttpRequestDef<UpdateLogStreamRequest, UpdateLogStreamResponse> genForUpdateLogStream() {
        // basic
        HttpRequestDef.Builder<UpdateLogStreamRequest, UpdateLogStreamResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLogStreamRequest.class, UpdateLogStreamResponse.class)
                .withName("UpdateLogStream")
                .withUri("/v2/{project_id}/groups/{log_group_id}/streams-ttl/{log_stream_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLogStreamRequest::getLogGroupId, UpdateLogStreamRequest::setLogGroupId));
        builder.<String>withRequestField("log_stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLogStreamRequest::getLogStreamId, UpdateLogStreamRequest::setLogStreamId));
        builder.<UpdateLogStreamParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLogStreamParams.class),
            f -> f.withMarshaller(UpdateLogStreamRequest::getBody, UpdateLogStreamRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNotificationTemplateRequest, UpdateNotificationTemplateResponse> updateNotificationTemplate =
        genForUpdateNotificationTemplate();

    private static HttpRequestDef<UpdateNotificationTemplateRequest, UpdateNotificationTemplateResponse> genForUpdateNotificationTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateNotificationTemplateRequest, UpdateNotificationTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateNotificationTemplateRequest.class,
                    UpdateNotificationTemplateResponse.class)
                .withName("UpdateNotificationTemplate")
                .withUri("/v2/{project_id}/{domain_id}/lts/events/notification/templates")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNotificationTemplateRequest::getDomainId,
                UpdateNotificationTemplateRequest::setDomainId));
        builder.<CreateNotificationTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNotificationTemplateRequestBody.class),
            f -> f.withMarshaller(UpdateNotificationTemplateRequest::getBody,
                UpdateNotificationTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStructConfigRequest, UpdateStructConfigResponse> updateStructConfig =
        genForUpdateStructConfig();

    private static HttpRequestDef<UpdateStructConfigRequest, UpdateStructConfigResponse> genForUpdateStructConfig() {
        // basic
        HttpRequestDef.Builder<UpdateStructConfigRequest, UpdateStructConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateStructConfigRequest.class, UpdateStructConfigResponse.class)
                .withName("UpdateStructConfig")
                .withUri("/v3/{project_id}/lts/struct/template")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<StructConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StructConfig.class),
            f -> f.withMarshaller(UpdateStructConfigRequest::getBody, UpdateStructConfigRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateStructConfigResponse::getBody, UpdateStructConfigResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStructTemplateRequest, UpdateStructTemplateResponse> updateStructTemplate =
        genForUpdateStructTemplate();

    private static HttpRequestDef<UpdateStructTemplateRequest, UpdateStructTemplateResponse> genForUpdateStructTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateStructTemplateRequest, UpdateStructTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateStructTemplateRequest.class, UpdateStructTemplateResponse.class)
            .withName("UpdateStructTemplate")
            .withUri("/v2/{project_id}/lts/struct/template")
            .withContentType("application/json");

        // requests
        builder.<LtsStructTemplateInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LtsStructTemplateInfo.class),
            f -> f.withMarshaller(UpdateStructTemplateRequest::getBody, UpdateStructTemplateRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateStructTemplateResponse::getBody, UpdateStructTemplateResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSwitchRequest, UpdateSwitchResponse> updateSwitch = genForUpdateSwitch();

    private static HttpRequestDef<UpdateSwitchRequest, UpdateSwitchResponse> genForUpdateSwitch() {
        // basic
        HttpRequestDef.Builder<UpdateSwitchRequest, UpdateSwitchResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSwitchRequest.class, UpdateSwitchResponse.class)
                .withName("UpdateSwitch")
                .withUri("/v1/{project_id}/lts/log-converge-config/switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_converge_switch",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSwitchRequest::getLogConvergeSwitch,
                UpdateSwitchRequest::setLogConvergeSwitch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTransferRequest, UpdateTransferResponse> updateTransfer =
        genForUpdateTransfer();

    private static HttpRequestDef<UpdateTransferRequest, UpdateTransferResponse> genForUpdateTransfer() {
        // basic
        HttpRequestDef.Builder<UpdateTransferRequest, UpdateTransferResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTransferRequest.class, UpdateTransferResponse.class)
                .withName("UpdateTransfer")
                .withUri("/v2/{project_id}/transfers")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UpdateTransferRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTransferRequestBody.class),
            f -> f.withMarshaller(UpdateTransferRequest::getBody, UpdateTransferRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse> createAomMappingRules =
        genForCreateAomMappingRules();

    private static HttpRequestDef<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse> genForCreateAomMappingRules() {
        // basic
        HttpRequestDef.Builder<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAomMappingRulesRequest.class, CreateAomMappingRulesResponse.class)
            .withName("CreateAomMappingRules")
            .withUri("/v2/{project_id}/lts/aom-mapping")
            .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("isBatch",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(CreateAomMappingRulesRequest::getIsBatch, CreateAomMappingRulesRequest::setIsBatch));
        builder.<AomMappingRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AomMappingRequestInfo.class),
            f -> f.withMarshaller(CreateAomMappingRulesRequest::getBody, CreateAomMappingRulesRequest::setBody));

        // response
        builder.<List<AomMappingRuleResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateAomMappingRulesResponse::getBody, CreateAomMappingRulesResponse::setBody)
                .withInnerContainerType(AomMappingRuleResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse> deleteAomMappingRules =
        genForDeleteAomMappingRules();

    private static HttpRequestDef<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse> genForDeleteAomMappingRules() {
        // basic
        HttpRequestDef.Builder<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAomMappingRulesRequest.class, DeleteAomMappingRulesResponse.class)
            .withName("DeleteAomMappingRules")
            .withUri("/v2/{project_id}/lts/aom-mapping")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAomMappingRulesRequest::getId, DeleteAomMappingRulesRequest::setId));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteAomMappingRulesResponse::getBody, DeleteAomMappingRulesResponse::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse> showAomMappingRule =
        genForShowAomMappingRule();

    private static HttpRequestDef<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse> genForShowAomMappingRule() {
        // basic
        HttpRequestDef.Builder<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAomMappingRuleRequest.class, ShowAomMappingRuleResponse.class)
                .withName("ShowAomMappingRule")
                .withUri("/v2/{project_id}/lts/aom-mapping/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAomMappingRuleRequest::getRuleId, ShowAomMappingRuleRequest::setRuleId));

        // response
        builder.<List<AomMappingRuleResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAomMappingRuleResponse::getBody, ShowAomMappingRuleResponse::setBody)
                .withInnerContainerType(AomMappingRuleResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse> showAomMappingRules =
        genForShowAomMappingRules();

    private static HttpRequestDef<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse> genForShowAomMappingRules() {
        // basic
        HttpRequestDef.Builder<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAomMappingRulesRequest.class, ShowAomMappingRulesResponse.class)
                .withName("ShowAomMappingRules")
                .withUri("/v2/{project_id}/lts/aom-mapping")
                .withContentType("application/json");

        // requests

        // response
        builder.<List<AomMappingRuleResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAomMappingRulesResponse::getBody, ShowAomMappingRulesResponse::setBody)
                .withInnerContainerType(AomMappingRuleResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse> updateAomMappingRules =
        genForUpdateAomMappingRules();

    private static HttpRequestDef<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse> genForUpdateAomMappingRules() {
        // basic
        HttpRequestDef.Builder<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAomMappingRulesRequest.class, UpdateAomMappingRulesResponse.class)
            .withName("UpdateAomMappingRules")
            .withUri("/v2/{project_id}/lts/aom-mapping")
            .withContentType("application/json");

        // requests
        builder.<UpdateAomMappingRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAomMappingRequest.class),
            f -> f.withMarshaller(UpdateAomMappingRulesRequest::getBody, UpdateAomMappingRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConsumerGroupHeartBeatRequest, ConsumerGroupHeartBeatResponse> consumerGroupHeartBeat =
        genForConsumerGroupHeartBeat();

    private static HttpRequestDef<ConsumerGroupHeartBeatRequest, ConsumerGroupHeartBeatResponse> genForConsumerGroupHeartBeat() {
        // basic
        HttpRequestDef.Builder<ConsumerGroupHeartBeatRequest, ConsumerGroupHeartBeatResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ConsumerGroupHeartBeatRequest.class, ConsumerGroupHeartBeatResponse.class)
            .withName("ConsumerGroupHeartBeat")
            .withUri(
                "/v1.0/{project_id}/groups/{group_id}/streams/{stream_id}/consumer-groups/{consumer_group_name}/heartbeat")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConsumerGroupHeartBeatRequest::getGroupId,
                ConsumerGroupHeartBeatRequest::setGroupId));
        builder.<String>withRequestField("stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConsumerGroupHeartBeatRequest::getStreamId,
                ConsumerGroupHeartBeatRequest::setStreamId));
        builder.<String>withRequestField("consumer_group_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConsumerGroupHeartBeatRequest::getConsumerGroupName,
                ConsumerGroupHeartBeatRequest::setConsumerGroupName));
        builder.<String>withRequestField("consumer_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConsumerGroupHeartBeatRequest::getConsumerName,
                ConsumerGroupHeartBeatRequest::setConsumerName));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ConsumerGroupHeartBeatRequest::getBody, ConsumerGroupHeartBeatRequest::setBody)
                .withInnerContainerType(String.class));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ConsumerGroupHeartBeatResponse::getBody, ConsumerGroupHeartBeatResponse::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateConsumerGroupRequest, CreateConsumerGroupResponse> createConsumerGroup =
        genForCreateConsumerGroup();

    private static HttpRequestDef<CreateConsumerGroupRequest, CreateConsumerGroupResponse> genForCreateConsumerGroup() {
        // basic
        HttpRequestDef.Builder<CreateConsumerGroupRequest, CreateConsumerGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateConsumerGroupRequest.class, CreateConsumerGroupResponse.class)
                .withName("CreateConsumerGroup")
                .withUri("/v1.0/{project_id}/groups/{group_id}/streams/{stream_id}/consumer-groups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConsumerGroupRequest::getGroupId, CreateConsumerGroupRequest::setGroupId));
        builder.<String>withRequestField("stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConsumerGroupRequest::getStreamId, CreateConsumerGroupRequest::setStreamId));
        builder.<ConsumerGroupInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConsumerGroupInfo.class),
            f -> f.withMarshaller(CreateConsumerGroupRequest::getBody, CreateConsumerGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse> deleteConsumerGroup =
        genForDeleteConsumerGroup();

    private static HttpRequestDef<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse> genForDeleteConsumerGroup() {
        // basic
        HttpRequestDef.Builder<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteConsumerGroupRequest.class, DeleteConsumerGroupResponse.class)
            .withName("DeleteConsumerGroup")
            .withUri("/v1.0/{project_id}/groups/{group_id}/streams/{stream_id}/consumer-groups/{consumer_group_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConsumerGroupRequest::getGroupId, DeleteConsumerGroupRequest::setGroupId));
        builder.<String>withRequestField("stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConsumerGroupRequest::getStreamId, DeleteConsumerGroupRequest::setStreamId));
        builder.<String>withRequestField("consumer_group_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConsumerGroupRequest::getConsumerGroupName,
                DeleteConsumerGroupRequest::setConsumerGroupName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConsumerGroupRequest, ListConsumerGroupResponse> listConsumerGroup =
        genForListConsumerGroup();

    private static HttpRequestDef<ListConsumerGroupRequest, ListConsumerGroupResponse> genForListConsumerGroup() {
        // basic
        HttpRequestDef.Builder<ListConsumerGroupRequest, ListConsumerGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConsumerGroupRequest.class, ListConsumerGroupResponse.class)
                .withName("ListConsumerGroup")
                .withUri("/v1.0/{project_id}/groups/{group_id}/streams/{stream_id}/consumer-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsumerGroupRequest::getGroupId, ListConsumerGroupRequest::setGroupId));
        builder.<String>withRequestField("stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsumerGroupRequest::getStreamId, ListConsumerGroupRequest::setStreamId));

        // response
        builder.<List<ConsumerGroupInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListConsumerGroupResponse::getBody, ListConsumerGroupResponse::setBody)
                .withInnerContainerType(ConsumerGroupInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListDetailsConsumerGroupRequest, ListDetailsConsumerGroupResponse> listDetailsConsumerGroup =
        genForListDetailsConsumerGroup();

    private static HttpRequestDef<ListDetailsConsumerGroupRequest, ListDetailsConsumerGroupResponse> genForListDetailsConsumerGroup() {
        // basic
        HttpRequestDef.Builder<ListDetailsConsumerGroupRequest, ListDetailsConsumerGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListDetailsConsumerGroupRequest.class, ListDetailsConsumerGroupResponse.class)
                .withName("ListDetailsConsumerGroup")
                .withUri(
                    "/v1.0/{project_id}/groups/{group_id}/streams/{stream_id}/consumer-groups/{consumer_group_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDetailsConsumerGroupRequest::getGroupId,
                ListDetailsConsumerGroupRequest::setGroupId));
        builder.<String>withRequestField("stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDetailsConsumerGroupRequest::getStreamId,
                ListDetailsConsumerGroupRequest::setStreamId));
        builder.<String>withRequestField("consumer_group_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDetailsConsumerGroupRequest::getConsumerGroupName,
                ListDetailsConsumerGroupRequest::setConsumerGroupName));

        // response
        builder.<List<ConsumerCheckpointInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDetailsConsumerGroupResponse::getBody, ListDetailsConsumerGroupResponse::setBody)
                .withInnerContainerType(ConsumerCheckpointInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowCursorByTimeRequest, ShowCursorByTimeResponse> showCursorByTime =
        genForShowCursorByTime();

    private static HttpRequestDef<ShowCursorByTimeRequest, ShowCursorByTimeResponse> genForShowCursorByTime() {
        // basic
        HttpRequestDef.Builder<ShowCursorByTimeRequest, ShowCursorByTimeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCursorByTimeRequest.class, ShowCursorByTimeResponse.class)
                .withName("ShowCursorByTime")
                .withUri("/v1.0/{project_id}/groups/{group_id}/streams/{stream_id}/shards/{shard_id}/cursor")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCursorByTimeRequest::getGroupId, ShowCursorByTimeRequest::setGroupId));
        builder.<String>withRequestField("stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCursorByTimeRequest::getStreamId, ShowCursorByTimeRequest::setStreamId));
        builder.<String>withRequestField("shard_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCursorByTimeRequest::getShardId, ShowCursorByTimeRequest::setShardId));
        builder.<String>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCursorByTimeRequest::getFrom, ShowCursorByTimeRequest::setFrom));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCursorTimeRequest, ShowCursorTimeResponse> showCursorTime =
        genForShowCursorTime();

    private static HttpRequestDef<ShowCursorTimeRequest, ShowCursorTimeResponse> genForShowCursorTime() {
        // basic
        HttpRequestDef.Builder<ShowCursorTimeRequest, ShowCursorTimeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCursorTimeRequest.class, ShowCursorTimeResponse.class)
                .withName("ShowCursorTime")
                .withUri("/v1.0/{project_id}/groups/{group_id}/streams/{stream_id}/shards/{shard_id}/time")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCursorTimeRequest::getGroupId, ShowCursorTimeRequest::setGroupId));
        builder.<String>withRequestField("stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCursorTimeRequest::getStreamId, ShowCursorTimeRequest::setStreamId));
        builder.<String>withRequestField("shard_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCursorTimeRequest::getShardId, ShowCursorTimeRequest::setShardId));
        builder.<String>withRequestField("cursor",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCursorTimeRequest::getCursor, ShowCursorTimeRequest::setCursor));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLogStreamShardsRequest, ShowLogStreamShardsResponse> showLogStreamShards =
        genForShowLogStreamShards();

    private static HttpRequestDef<ShowLogStreamShardsRequest, ShowLogStreamShardsResponse> genForShowLogStreamShards() {
        // basic
        HttpRequestDef.Builder<ShowLogStreamShardsRequest, ShowLogStreamShardsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLogStreamShardsRequest.class, ShowLogStreamShardsResponse.class)
                .withName("ShowLogStreamShards")
                .withUri("/v1.0/{project_id}/groups/{group_id}/streams/{stream_id}/shards")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogStreamShardsRequest::getGroupId, ShowLogStreamShardsRequest::setGroupId));
        builder.<String>withRequestField("stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogStreamShardsRequest::getStreamId, ShowLogStreamShardsRequest::setStreamId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCheckPointRequest, UpdateCheckPointResponse> updateCheckPoint =
        genForUpdateCheckPoint();

    private static HttpRequestDef<UpdateCheckPointRequest, UpdateCheckPointResponse> genForUpdateCheckPoint() {
        // basic
        HttpRequestDef.Builder<UpdateCheckPointRequest, UpdateCheckPointResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateCheckPointRequest.class, UpdateCheckPointResponse.class)
                .withName("UpdateCheckPoint")
                .withUri(
                    "/v1.0/{project_id}/groups/{group_id}/streams/{stream_id}/consumer-groups/{consumer_group_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCheckPointRequest::getGroupId, UpdateCheckPointRequest::setGroupId));
        builder.<String>withRequestField("stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCheckPointRequest::getStreamId, UpdateCheckPointRequest::setStreamId));
        builder.<String>withRequestField("consumer_group_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCheckPointRequest::getConsumerGroupName,
                UpdateCheckPointRequest::setConsumerGroupName));
        builder.<String>withRequestField("consumer_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCheckPointRequest::getConsumerName, UpdateCheckPointRequest::setConsumerName));
        builder.<List<ConsumerShardCheckpointInfo>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateCheckPointRequest::getBody, UpdateCheckPointRequest::setBody)
                .withInnerContainerType(ConsumerShardCheckpointInfo.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse> createSqlAlarmRule =
        genForCreateSqlAlarmRule();

    private static HttpRequestDef<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse> genForCreateSqlAlarmRule() {
        // basic
        HttpRequestDef.Builder<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSqlAlarmRuleRequest.class, CreateSqlAlarmRuleResponse.class)
                .withName("CreateSqlAlarmRule")
                .withUri("/v2/{project_id}/lts/alarms/sql-alarm-rule")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateSqlAlarmRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSqlAlarmRuleRequestBody.class),
            f -> f.withMarshaller(CreateSqlAlarmRuleRequest::getBody, CreateSqlAlarmRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse> deleteSqlAlarmRule =
        genForDeleteSqlAlarmRule();

    private static HttpRequestDef<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse> genForDeleteSqlAlarmRule() {
        // basic
        HttpRequestDef.Builder<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSqlAlarmRuleRequest.class, DeleteSqlAlarmRuleResponse.class)
                .withName("DeleteSqlAlarmRule")
                .withUri("/v2/{project_id}/lts/alarms/sql-alarm-rule/{sql_alarm_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sql_alarm_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlAlarmRuleRequest::getSqlAlarmRuleId,
                DeleteSqlAlarmRuleRequest::setSqlAlarmRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse> listSqlAlarmRules =
        genForListSqlAlarmRules();

    private static HttpRequestDef<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse> genForListSqlAlarmRules() {
        // basic
        HttpRequestDef.Builder<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSqlAlarmRulesRequest.class, ListSqlAlarmRulesResponse.class)
                .withName("ListSqlAlarmRules")
                .withUri("/v2/{project_id}/lts/alarms/sql-alarm-rule")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmRuleStatusRequest, UpdateAlarmRuleStatusResponse> updateAlarmRuleStatus =
        genForUpdateAlarmRuleStatus();

    private static HttpRequestDef<UpdateAlarmRuleStatusRequest, UpdateAlarmRuleStatusResponse> genForUpdateAlarmRuleStatus() {
        // basic
        HttpRequestDef.Builder<UpdateAlarmRuleStatusRequest, UpdateAlarmRuleStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAlarmRuleStatusRequest.class, UpdateAlarmRuleStatusResponse.class)
            .withName("UpdateAlarmRuleStatus")
            .withUri("/v2/{project_id}/lts/alarms/status")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ChangeAlarmRuleStatus>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeAlarmRuleStatus.class),
            f -> f.withMarshaller(UpdateAlarmRuleStatusRequest::getBody, UpdateAlarmRuleStatusRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateAlarmRuleStatusResponse::getBody, UpdateAlarmRuleStatusResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse> updateSqlAlarmRule =
        genForUpdateSqlAlarmRule();

    private static HttpRequestDef<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse> genForUpdateSqlAlarmRule() {
        // basic
        HttpRequestDef.Builder<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSqlAlarmRuleRequest.class, UpdateSqlAlarmRuleResponse.class)
                .withName("UpdateSqlAlarmRule")
                .withUri("/v2/{project_id}/lts/alarms/sql-alarm-rule")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UpdateSqlAlarmRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSqlAlarmRuleRequestBody.class),
            f -> f.withMarshaller(UpdateSqlAlarmRuleRequest::getBody, UpdateSqlAlarmRuleRequest::setBody));

        // response

        return builder.build();
    }

}
