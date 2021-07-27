package com.huaweicloud.sdk.live.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.live.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class LiveMeta {

    public static final HttpRequestDef<CreateDomainRequest, CreateDomainResponse> createDomain = genForcreateDomain();

    private static HttpRequestDef<CreateDomainRequest, CreateDomainResponse> genForcreateDomain() {
        // basic
        HttpRequestDef.Builder<CreateDomainRequest, CreateDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDomainRequest.class, CreateDomainResponse.class)
                .withName("CreateDomain")
                .withUri("/v1/{project_id}/domain")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            LiveDomainCreateReq.class,
            f -> f.withMarshaller(CreateDomainRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateDomainMappingRequest, CreateDomainMappingResponse> createDomainMapping = genForcreateDomainMapping();

    private static HttpRequestDef<CreateDomainMappingRequest, CreateDomainMappingResponse> genForcreateDomainMapping() {
        // basic
        HttpRequestDef.Builder<CreateDomainMappingRequest, CreateDomainMappingResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CreateDomainMappingRequest.class, CreateDomainMappingResponse.class)
                .withName("CreateDomainMapping")
                .withUri("/v1/{project_id}/domains_mapping")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.withRequestField("specify_project",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDomainMappingRequest::getSpecifyProject, (req, v) -> {
                req.setSpecifyProject(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DomainMapping.class,
            f -> f.withMarshaller(CreateDomainMappingRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordCallbackConfigRequest, CreateRecordCallbackConfigResponse> createRecordCallbackConfig = genForcreateRecordCallbackConfig();

    private static HttpRequestDef<CreateRecordCallbackConfigRequest, CreateRecordCallbackConfigResponse> genForcreateRecordCallbackConfig() {
        // basic
        HttpRequestDef.Builder<CreateRecordCallbackConfigRequest, CreateRecordCallbackConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRecordCallbackConfigRequest.class, CreateRecordCallbackConfigResponse.class)
                .withName("CreateRecordCallbackConfig")
                .withUri("/v1/{project_id}/record/callbacks")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RecordCallbackConfigRequest.class,
            f -> f.withMarshaller(CreateRecordCallbackConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordRuleRequest, CreateRecordRuleResponse> createRecordRule = genForcreateRecordRule();

    private static HttpRequestDef<CreateRecordRuleRequest, CreateRecordRuleResponse> genForcreateRecordRule() {
        // basic
        HttpRequestDef.Builder<CreateRecordRuleRequest, CreateRecordRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRecordRuleRequest.class, CreateRecordRuleResponse.class)
                .withName("CreateRecordRule")
                .withUri("/v1/{project_id}/record/rules")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RecordRuleRequest.class,
            f -> f.withMarshaller(CreateRecordRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse> createStreamForbidden = genForcreateStreamForbidden();

    private static HttpRequestDef<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse> genForcreateStreamForbidden() {
        // basic
        HttpRequestDef.Builder<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateStreamForbiddenRequest.class, CreateStreamForbiddenResponse.class)
                .withName("CreateStreamForbidden")
                .withUri("/v1/{project_id}/stream/blocks")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.withRequestField("specify_project",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateStreamForbiddenRequest::getSpecifyProject, (req, v) -> {
                req.setSpecifyProject(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            StreamForbiddenSetting.class,
            f -> f.withMarshaller(CreateStreamForbiddenRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse> createTranscodingsTemplate = genForcreateTranscodingsTemplate();

    private static HttpRequestDef<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse> genForcreateTranscodingsTemplate() {
        // basic
        HttpRequestDef.Builder<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTranscodingsTemplateRequest.class, CreateTranscodingsTemplateResponse.class)
                .withName("CreateTranscodingsTemplate")
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            StreamTranscodingTemplate.class,
            f -> f.withMarshaller(CreateTranscodingsTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> deleteDomain = genFordeleteDomain();

    private static HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> genFordeleteDomain() {
        // basic
        HttpRequestDef.Builder<DeleteDomainRequest, DeleteDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDomainRequest.class, DeleteDomainResponse.class)
                .withName("DeleteDomain")
                .withUri("/v1/{project_id}/domain")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDomainRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainMappingRequest, DeleteDomainMappingResponse> deleteDomainMapping = genFordeleteDomainMapping();

    private static HttpRequestDef<DeleteDomainMappingRequest, DeleteDomainMappingResponse> genFordeleteDomainMapping() {
        // basic
        HttpRequestDef.Builder<DeleteDomainMappingRequest, DeleteDomainMappingResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDomainMappingRequest.class, DeleteDomainMappingResponse.class)
                .withName("DeleteDomainMapping")
                .withUri("/v1/{project_id}/domains_mapping")
                .withContentType("application/json");

        // requests
        builder.withRequestField("specify_project",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDomainMappingRequest::getSpecifyProject, (req, v) -> {
                req.setSpecifyProject(v);
            })
        );
        builder.withRequestField("pull_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDomainMappingRequest::getPullDomain, (req, v) -> {
                req.setPullDomain(v);
            })
        );
        builder.withRequestField("push_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDomainMappingRequest::getPushDomain, (req, v) -> {
                req.setPushDomain(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteRecordCallbackConfigRequest, DeleteRecordCallbackConfigResponse> deleteRecordCallbackConfig = genFordeleteRecordCallbackConfig();

    private static HttpRequestDef<DeleteRecordCallbackConfigRequest, DeleteRecordCallbackConfigResponse> genFordeleteRecordCallbackConfig() {
        // basic
        HttpRequestDef.Builder<DeleteRecordCallbackConfigRequest, DeleteRecordCallbackConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRecordCallbackConfigRequest.class, DeleteRecordCallbackConfigResponse.class)
                .withName("DeleteRecordCallbackConfig")
                .withUri("/v1/{project_id}/record/callbacks/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRecordCallbackConfigRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteRecordRuleRequest, DeleteRecordRuleResponse> deleteRecordRule = genFordeleteRecordRule();

    private static HttpRequestDef<DeleteRecordRuleRequest, DeleteRecordRuleResponse> genFordeleteRecordRule() {
        // basic
        HttpRequestDef.Builder<DeleteRecordRuleRequest, DeleteRecordRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRecordRuleRequest.class, DeleteRecordRuleResponse.class)
                .withName("DeleteRecordRule")
                .withUri("/v1/{project_id}/record/rules/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRecordRuleRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse> deleteStreamForbidden = genFordeleteStreamForbidden();

    private static HttpRequestDef<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse> genFordeleteStreamForbidden() {
        // basic
        HttpRequestDef.Builder<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteStreamForbiddenRequest.class, DeleteStreamForbiddenResponse.class)
                .withName("DeleteStreamForbidden")
                .withUri("/v1/{project_id}/stream/blocks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("specify_project",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteStreamForbiddenRequest::getSpecifyProject, (req, v) -> {
                req.setSpecifyProject(v);
            })
        );
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteStreamForbiddenRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteStreamForbiddenRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            })
        );
        builder.withRequestField("stream_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteStreamForbiddenRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse> deleteTranscodingsTemplate = genFordeleteTranscodingsTemplate();

    private static HttpRequestDef<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse> genFordeleteTranscodingsTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTranscodingsTemplateRequest.class, DeleteTranscodingsTemplateResponse.class)
                .withName("DeleteTranscodingsTemplate")
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteTranscodingsTemplateRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteTranscodingsTemplateRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse> listLiveSampleLogs = genForlistLiveSampleLogs();

    private static HttpRequestDef<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse> genForlistLiveSampleLogs() {
        // basic
        HttpRequestDef.Builder<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLiveSampleLogsRequest.class, ListLiveSampleLogsResponse.class)
                .withName("ListLiveSampleLogs")
                .withUri("/v1/{project_id}/logs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("play_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListLiveSampleLogsRequest::getPlayDomain, (req, v) -> {
                req.setPlayDomain(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            OffsetDateTime.class,
            f -> f.withMarshaller(ListLiveSampleLogsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            OffsetDateTime.class,
            f -> f.withMarshaller(ListLiveSampleLogsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse> listLiveStreamsOnline = genForlistLiveStreamsOnline();

    private static HttpRequestDef<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse> genForlistLiveStreamsOnline() {
        // basic
        HttpRequestDef.Builder<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLiveStreamsOnlineRequest.class, ListLiveStreamsOnlineResponse.class)
                .withName("ListLiveStreamsOnline")
                .withUri("/v1/{project_id}/realtime/streams")
                .withContentType("application/json");

        // requests
        builder.withRequestField("publish_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListLiveStreamsOnlineRequest::getPublishDomain, (req, v) -> {
                req.setPublishDomain(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLiveStreamsOnlineRequest::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListLiveStreamsOnlineRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListLiveStreamsOnlineRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLiveStreamsOnlineRequest::getStream, (req, v) -> {
                req.setStream(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListRecordCallbackConfigsRequest, ListRecordCallbackConfigsResponse> listRecordCallbackConfigs = genForlistRecordCallbackConfigs();

    private static HttpRequestDef<ListRecordCallbackConfigsRequest, ListRecordCallbackConfigsResponse> genForlistRecordCallbackConfigs() {
        // basic
        HttpRequestDef.Builder<ListRecordCallbackConfigsRequest, ListRecordCallbackConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRecordCallbackConfigsRequest.class, ListRecordCallbackConfigsResponse.class)
                .withName("ListRecordCallbackConfigs")
                .withUri("/v1/{project_id}/record/callbacks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("publish_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRecordCallbackConfigsRequest::getPublishDomain, (req, v) -> {
                req.setPublishDomain(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRecordCallbackConfigsRequest::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRecordCallbackConfigsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRecordCallbackConfigsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListRecordRulesRequest, ListRecordRulesResponse> listRecordRules = genForlistRecordRules();

    private static HttpRequestDef<ListRecordRulesRequest, ListRecordRulesResponse> genForlistRecordRules() {
        // basic
        HttpRequestDef.Builder<ListRecordRulesRequest, ListRecordRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRecordRulesRequest.class, ListRecordRulesResponse.class)
                .withName("ListRecordRules")
                .withUri("/v1/{project_id}/record/rules")
                .withContentType("application/json");

        // requests
        builder.withRequestField("publish_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRecordRulesRequest::getPublishDomain, (req, v) -> {
                req.setPublishDomain(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRecordRulesRequest::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRecordRulesRequest::getStream, (req, v) -> {
                req.setStream(v);
            })
        );
        builder.withRequestField("record_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListRecordRulesRequest.RecordTypeEnum.class,
            f -> f.withMarshaller(ListRecordRulesRequest::getRecordType, (req, v) -> {
                req.setRecordType(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRecordRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRecordRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListStreamForbiddenRequest, ListStreamForbiddenResponse> listStreamForbidden = genForlistStreamForbidden();

    private static HttpRequestDef<ListStreamForbiddenRequest, ListStreamForbiddenResponse> genForlistStreamForbidden() {
        // basic
        HttpRequestDef.Builder<ListStreamForbiddenRequest, ListStreamForbiddenResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStreamForbiddenRequest.class, ListStreamForbiddenResponse.class)
                .withName("ListStreamForbidden")
                .withUri("/v1/{project_id}/stream/blocks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("specify_project",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStreamForbiddenRequest::getSpecifyProject, (req, v) -> {
                req.setSpecifyProject(v);
            })
        );
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListStreamForbiddenRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStreamForbiddenRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            })
        );
        builder.withRequestField("stream_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStreamForbiddenRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListStreamForbiddenRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListStreamForbiddenRequest::getSize, (req, v) -> {
                req.setSize(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainRequest, ShowDomainResponse> showDomain = genForshowDomain();

    private static HttpRequestDef<ShowDomainRequest, ShowDomainResponse> genForshowDomain() {
        // basic
        HttpRequestDef.Builder<ShowDomainRequest, ShowDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainRequest.class, ShowDomainResponse.class)
                .withName("ShowDomain")
                .withUri("/v1/{project_id}/domain")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDomainRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordCallbackConfigRequest, ShowRecordCallbackConfigResponse> showRecordCallbackConfig = genForshowRecordCallbackConfig();

    private static HttpRequestDef<ShowRecordCallbackConfigRequest, ShowRecordCallbackConfigResponse> genForshowRecordCallbackConfig() {
        // basic
        HttpRequestDef.Builder<ShowRecordCallbackConfigRequest, ShowRecordCallbackConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecordCallbackConfigRequest.class, ShowRecordCallbackConfigResponse.class)
                .withName("ShowRecordCallbackConfig")
                .withUri("/v1/{project_id}/record/callbacks/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRecordCallbackConfigRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordRuleRequest, ShowRecordRuleResponse> showRecordRule = genForshowRecordRule();

    private static HttpRequestDef<ShowRecordRuleRequest, ShowRecordRuleResponse> genForshowRecordRule() {
        // basic
        HttpRequestDef.Builder<ShowRecordRuleRequest, ShowRecordRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecordRuleRequest.class, ShowRecordRuleResponse.class)
                .withName("ShowRecordRule")
                .withUri("/v1/{project_id}/record/rules/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRecordRuleRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse> showTranscodingsTemplate = genForshowTranscodingsTemplate();

    private static HttpRequestDef<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse> genForshowTranscodingsTemplate() {
        // basic
        HttpRequestDef.Builder<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTranscodingsTemplateRequest.class, ShowTranscodingsTemplateResponse.class)
                .withName("ShowTranscodingsTemplate")
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTranscodingsTemplateRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowTranscodingsTemplateRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowTranscodingsTemplateRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowTranscodingsTemplateRequest::getSize, (req, v) -> {
                req.setSize(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainRequest, UpdateDomainResponse> updateDomain = genForupdateDomain();

    private static HttpRequestDef<UpdateDomainRequest, UpdateDomainResponse> genForupdateDomain() {
        // basic
        HttpRequestDef.Builder<UpdateDomainRequest, UpdateDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDomainRequest.class, UpdateDomainResponse.class)
                .withName("UpdateDomain")
                .withUri("/v1/{project_id}/domain")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            LiveDomainModifyReq.class,
            f -> f.withMarshaller(UpdateDomainRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecordCallbackConfigRequest, UpdateRecordCallbackConfigResponse> updateRecordCallbackConfig = genForupdateRecordCallbackConfig();

    private static HttpRequestDef<UpdateRecordCallbackConfigRequest, UpdateRecordCallbackConfigResponse> genForupdateRecordCallbackConfig() {
        // basic
        HttpRequestDef.Builder<UpdateRecordCallbackConfigRequest, UpdateRecordCallbackConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRecordCallbackConfigRequest.class, UpdateRecordCallbackConfigResponse.class)
                .withName("UpdateRecordCallbackConfig")
                .withUri("/v1/{project_id}/record/callbacks/{id}")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRecordCallbackConfigRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RecordCallbackConfigRequest.class,
            f -> f.withMarshaller(UpdateRecordCallbackConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecordRuleRequest, UpdateRecordRuleResponse> updateRecordRule = genForupdateRecordRule();

    private static HttpRequestDef<UpdateRecordRuleRequest, UpdateRecordRuleResponse> genForupdateRecordRule() {
        // basic
        HttpRequestDef.Builder<UpdateRecordRuleRequest, UpdateRecordRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRecordRuleRequest.class, UpdateRecordRuleResponse.class)
                .withName("UpdateRecordRule")
                .withUri("/v1/{project_id}/record/rules/{id}")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRecordRuleRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RecordRuleRequest.class,
            f -> f.withMarshaller(UpdateRecordRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse> updateStreamForbidden = genForupdateStreamForbidden();

    private static HttpRequestDef<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse> genForupdateStreamForbidden() {
        // basic
        HttpRequestDef.Builder<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateStreamForbiddenRequest.class, UpdateStreamForbiddenResponse.class)
                .withName("UpdateStreamForbidden")
                .withUri("/v1/{project_id}/stream/blocks")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.withRequestField("specify_project",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateStreamForbiddenRequest::getSpecifyProject, (req, v) -> {
                req.setSpecifyProject(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            StreamForbiddenSetting.class,
            f -> f.withMarshaller(UpdateStreamForbiddenRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse> updateTranscodingsTemplate = genForupdateTranscodingsTemplate();

    private static HttpRequestDef<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse> genForupdateTranscodingsTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTranscodingsTemplateRequest.class, UpdateTranscodingsTemplateResponse.class)
                .withName("UpdateTranscodingsTemplate")
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            StreamTranscodingTemplate.class,
            f -> f.withMarshaller(UpdateTranscodingsTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}
