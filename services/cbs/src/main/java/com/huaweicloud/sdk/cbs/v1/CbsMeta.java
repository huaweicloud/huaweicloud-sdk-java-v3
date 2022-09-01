package com.huaweicloud.sdk.cbs.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.cbs.v1.model.*;

import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class CbsMeta {

    public static final HttpRequestDef<CollectHotQuestionsRequest, CollectHotQuestionsResponse> collectHotQuestions = genForcollectHotQuestions();

    private static HttpRequestDef<CollectHotQuestionsRequest, CollectHotQuestionsResponse> genForcollectHotQuestions() {
        // basic
        HttpRequestDef.Builder<CollectHotQuestionsRequest, CollectHotQuestionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CollectHotQuestionsRequest.class, CollectHotQuestionsResponse.class)
                .withName("CollectHotQuestions")
                .withUri("/v1/{project_id}/qabots/{qabot_id}/qa-pairs/hots")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("qabot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectHotQuestionsRequest::getQabotId, (req, v) -> {
                req.setQabotId(v);
            })
        );
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectHotQuestionsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectHotQuestionsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.<Integer>withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CollectHotQuestionsRequest::getTop, (req, v) -> {
                req.setTop(v);
            })
        );
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectHotQuestionsRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectHotQuestionsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.<Boolean>withRequestField("exclude",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(CollectHotQuestionsRequest::getExclude, (req, v) -> {
                req.setExclude(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<CollectKeyWordsRequest, CollectKeyWordsResponse> collectKeyWords = genForcollectKeyWords();

    private static HttpRequestDef<CollectKeyWordsRequest, CollectKeyWordsResponse> genForcollectKeyWords() {
        // basic
        HttpRequestDef.Builder<CollectKeyWordsRequest, CollectKeyWordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CollectKeyWordsRequest.class, CollectKeyWordsResponse.class)
                .withName("CollectKeyWords")
                .withUri("/v1/{project_id}/qabots/{qabot_id}/requests/keywords")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("qabot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectKeyWordsRequest::getQabotId, (req, v) -> {
                req.setQabotId(v);
            })
        );
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectKeyWordsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectKeyWordsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.<Integer>withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CollectKeyWordsRequest::getTop, (req, v) -> {
                req.setTop(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<CollectReplyRatesRequest, CollectReplyRatesResponse> collectReplyRates = genForcollectReplyRates();

    private static HttpRequestDef<CollectReplyRatesRequest, CollectReplyRatesResponse> genForcollectReplyRates() {
        // basic
        HttpRequestDef.Builder<CollectReplyRatesRequest, CollectReplyRatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CollectReplyRatesRequest.class, CollectReplyRatesResponse.class)
                .withName("CollectReplyRates")
                .withUri("/v1/{project_id}/qabots/{qabot_id}/requests/reply-rates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("qabot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectReplyRatesRequest::getQabotId, (req, v) -> {
                req.setQabotId(v);
            })
        );
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectReplyRatesRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectReplyRatesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.<CollectReplyRatesRequest.IntervalEnum>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CollectReplyRatesRequest.IntervalEnum.class),
            f -> f.withMarshaller(CollectReplyRatesRequest::getInterval, (req, v) -> {
                req.setInterval(v);
            })
        );
        builder.<String>withRequestField("time_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectReplyRatesRequest::getTimeZone, (req, v) -> {
                req.setTimeZone(v);
            })
        );
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectReplyRatesRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<CollectSessionStatsRequest, CollectSessionStatsResponse> collectSessionStats = genForcollectSessionStats();

    private static HttpRequestDef<CollectSessionStatsRequest, CollectSessionStatsResponse> genForcollectSessionStats() {
        // basic
        HttpRequestDef.Builder<CollectSessionStatsRequest, CollectSessionStatsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CollectSessionStatsRequest.class, CollectSessionStatsResponse.class)
                .withName("CollectSessionStats")
                .withUri("/v1/{project_id}/qabots/{qabot_id}/requests/session-stats")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("qabot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectSessionStatsRequest::getQabotId, (req, v) -> {
                req.setQabotId(v);
            })
        );
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectSessionStatsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectSessionStatsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.<CollectSessionStatsRequest.IntervalEnum>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CollectSessionStatsRequest.IntervalEnum.class),
            f -> f.withMarshaller(CollectSessionStatsRequest::getInterval, (req, v) -> {
                req.setInterval(v);
            })
        );
        builder.<String>withRequestField("time_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectSessionStatsRequest::getTimeZone, (req, v) -> {
                req.setTimeZone(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<CreateSessionRequest, CreateSessionResponse> createSession = genForcreateSession();

    private static HttpRequestDef<CreateSessionRequest, CreateSessionResponse> genForcreateSession() {
        // basic
        HttpRequestDef.Builder<CreateSessionRequest, CreateSessionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSessionRequest.class, CreateSessionResponse.class)
                .withName("CreateSession")
                .withUri("/v1/{project_id}/qabots/{qabot_id}/sessions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("qabot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSessionRequest::getQabotId, (req, v) -> {
                req.setQabotId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<DeleteSessionRequest, DeleteSessionResponse> deleteSession = genFordeleteSession();

    private static HttpRequestDef<DeleteSessionRequest, DeleteSessionResponse> genFordeleteSession() {
        // basic
        HttpRequestDef.Builder<DeleteSessionRequest, DeleteSessionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSessionRequest.class, DeleteSessionResponse.class)
                .withName("DeleteSession")
                .withUri("/v1/{project_id}/qabots/{qabot_id}/sessions/{session_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("qabot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSessionRequest::getQabotId, (req, v) -> {
                req.setQabotId(v);
            })
        );
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSessionRequest::getSessionId, (req, v) -> {
                req.setSessionId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ExecuteQaChatRequest, ExecuteQaChatResponse> executeQaChat = genForexecuteQaChat();

    private static HttpRequestDef<ExecuteQaChatRequest, ExecuteQaChatResponse> genForexecuteQaChat() {
        // basic
        HttpRequestDef.Builder<ExecuteQaChatRequest, ExecuteQaChatResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteQaChatRequest.class, ExecuteQaChatResponse.class)
                .withName("ExecuteQaChat")
                .withUri("/v1/{project_id}/qabots/{qabot_id}/chat")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("qabot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteQaChatRequest::getQabotId, (req, v) -> {
                req.setQabotId(v);
            })
        );
        builder.<PostRequestsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostRequestsReq.class),
            f -> f.withMarshaller(ExecuteQaChatRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ExecuteSessionRequest, ExecuteSessionResponse> executeSession = genForexecuteSession();

    private static HttpRequestDef<ExecuteSessionRequest, ExecuteSessionResponse> genForexecuteSession() {
        // basic
        HttpRequestDef.Builder<ExecuteSessionRequest, ExecuteSessionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteSessionRequest.class, ExecuteSessionResponse.class)
                .withName("ExecuteSession")
                .withUri("/v1/{project_id}/qabots/{qabot_id}/sessions/{session_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("qabot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteSessionRequest::getQabotId, (req, v) -> {
                req.setQabotId(v);
            })
        );
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteSessionRequest::getSessionId, (req, v) -> {
                req.setSessionId(v);
            })
        );
        builder.<PostQaSessionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostQaSessionReq.class),
            f -> f.withMarshaller(ExecuteSessionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListSuggestionsRequest, ListSuggestionsResponse> listSuggestions = genForlistSuggestions();

    private static HttpRequestDef<ListSuggestionsRequest, ListSuggestionsResponse> genForlistSuggestions() {
        // basic
        HttpRequestDef.Builder<ListSuggestionsRequest, ListSuggestionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListSuggestionsRequest.class, ListSuggestionsResponse.class)
                .withName("ListSuggestions")
                .withUri("/v1/{project_id}/qabots/{qabot_id}/suggestions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("qabot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSuggestionsRequest::getQabotId, (req, v) -> {
                req.setQabotId(v);
            })
        );
        builder.<PostSuggestionsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostSuggestionsReq.class),
            f -> f.withMarshaller(ListSuggestionsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<TagLaborRequest, TagLaborResponse> tagLabor = genFortagLabor();

    private static HttpRequestDef<TagLaborRequest, TagLaborResponse> genFortagLabor() {
        // basic
        HttpRequestDef.Builder<TagLaborRequest, TagLaborResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, TagLaborRequest.class, TagLaborResponse.class)
                .withName("TagLabor")
                .withUri("/v1/{project_id}/qabots/{qabot_id}/requests/{request_id}/labor")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("qabot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(TagLaborRequest::getQabotId, (req, v) -> {
                req.setQabotId(v);
            })
        );
        builder.<String>withRequestField("request_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(TagLaborRequest::getRequestId, (req, v) -> {
                req.setRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<TagSatisfactionRequest, TagSatisfactionResponse> tagSatisfaction = genFortagSatisfaction();

    private static HttpRequestDef<TagSatisfactionRequest, TagSatisfactionResponse> genFortagSatisfaction() {
        // basic
        HttpRequestDef.Builder<TagSatisfactionRequest, TagSatisfactionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, TagSatisfactionRequest.class, TagSatisfactionResponse.class)
                .withName("TagSatisfaction")
                .withUri("/v1/{project_id}/qabots/{qabot_id}/requests/{request_id}/satisfaction")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("qabot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(TagSatisfactionRequest::getQabotId, (req, v) -> {
                req.setQabotId(v);
            })
        );
        builder.<String>withRequestField("request_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(TagSatisfactionRequest::getRequestId, (req, v) -> {
                req.setRequestId(v);
            })
        );
        builder.<PostSatisfactionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostSatisfactionReq.class),
            f -> f.withMarshaller(TagSatisfactionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

}
