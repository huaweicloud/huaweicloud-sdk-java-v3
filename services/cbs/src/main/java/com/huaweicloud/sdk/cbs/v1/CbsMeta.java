package com.huaweicloud.sdk.cbs.v1;

import com.huaweicloud.sdk.cbs.v1.model.CollectHotQuestionsRequest;
import com.huaweicloud.sdk.cbs.v1.model.CollectHotQuestionsResponse;
import com.huaweicloud.sdk.cbs.v1.model.CollectKeyWordsRequest;
import com.huaweicloud.sdk.cbs.v1.model.CollectKeyWordsResponse;
import com.huaweicloud.sdk.cbs.v1.model.CollectReplyRatesRequest;
import com.huaweicloud.sdk.cbs.v1.model.CollectReplyRatesResponse;
import com.huaweicloud.sdk.cbs.v1.model.CollectSessionStatsRequest;
import com.huaweicloud.sdk.cbs.v1.model.CollectSessionStatsResponse;
import com.huaweicloud.sdk.cbs.v1.model.CreateSessionRequest;
import com.huaweicloud.sdk.cbs.v1.model.CreateSessionResponse;
import com.huaweicloud.sdk.cbs.v1.model.CreateVideoReq;
import com.huaweicloud.sdk.cbs.v1.model.DeleteSessionRequest;
import com.huaweicloud.sdk.cbs.v1.model.DeleteSessionResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteComposeVideoOndemandRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteComposeVideoOndemandResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteComposeVideoRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteComposeVideoResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteCreateVideoRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteCreateVideoResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteDeleteVideoByIdRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteDeleteVideoByIdResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteDeleteimageByIdRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteDeleteimageByIdResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetCharacterInfoByIdRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetCharacterInfoByIdResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetCharactersRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetCharactersResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetFramsListByImagesIdRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetFramsListByImagesIdResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetImagesListRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetImagesListResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetVideoInfoByIdRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetVideoInfoByIdResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetVideosListRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetVideosListResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecutePostCreateImagesRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecutePostCreateImagesResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteQaChatRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteQaChatResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteSessionRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteSessionResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUpdateImageNameRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUpdateImageNameResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUpdateVideoByIdRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUpdateVideoByIdResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUpdateVideoInfoByIdRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUpdateVideoInfoByIdResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUploadImageRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUploadImageRequestBody;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUploadImageResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUploadPptRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUploadPptRequestBody;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUploadPptResponse;
import com.huaweicloud.sdk.cbs.v1.model.ListSuggestionsRequest;
import com.huaweicloud.sdk.cbs.v1.model.ListSuggestionsResponse;
import com.huaweicloud.sdk.cbs.v1.model.PostImagesReq;
import com.huaweicloud.sdk.cbs.v1.model.PostOldRequestsReq;
import com.huaweicloud.sdk.cbs.v1.model.PostQaSessionReq;
import com.huaweicloud.sdk.cbs.v1.model.PostRequestsReq;
import com.huaweicloud.sdk.cbs.v1.model.PostRequestsRequest;
import com.huaweicloud.sdk.cbs.v1.model.PostRequestsResponse;
import com.huaweicloud.sdk.cbs.v1.model.PostSatisfactionReq;
import com.huaweicloud.sdk.cbs.v1.model.PostSuggestionsReq;
import com.huaweicloud.sdk.cbs.v1.model.PutVideoInfo;
import com.huaweicloud.sdk.cbs.v1.model.TagLaborRequest;
import com.huaweicloud.sdk.cbs.v1.model.TagLaborResponse;
import com.huaweicloud.sdk.cbs.v1.model.TagSatisfactionRequest;
import com.huaweicloud.sdk.cbs.v1.model.TagSatisfactionResponse;
import com.huaweicloud.sdk.cbs.v1.model.UpdateImageNameReq;
import com.huaweicloud.sdk.cbs.v1.model.UpdateReq;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CbsMeta {

    public static final HttpRequestDef<CollectHotQuestionsRequest, CollectHotQuestionsResponse> collectHotQuestions =
        genForcollectHotQuestions();

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
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectHotQuestionsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectHotQuestionsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CollectHotQuestionsRequest::getTop, (req, v) -> {
                req.setTop(v);
            }));
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectHotQuestionsRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            }));
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectHotQuestionsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<Boolean>withRequestField("exclude",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(CollectHotQuestionsRequest::getExclude, (req, v) -> {
                req.setExclude(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CollectKeyWordsRequest, CollectKeyWordsResponse> collectKeyWords =
        genForcollectKeyWords();

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
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectKeyWordsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectKeyWordsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CollectKeyWordsRequest::getTop, (req, v) -> {
                req.setTop(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CollectReplyRatesRequest, CollectReplyRatesResponse> collectReplyRates =
        genForcollectReplyRates();

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
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectReplyRatesRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectReplyRatesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<CollectReplyRatesRequest.IntervalEnum>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CollectReplyRatesRequest.IntervalEnum.class),
            f -> f.withMarshaller(CollectReplyRatesRequest::getInterval, (req, v) -> {
                req.setInterval(v);
            }));
        builder.<String>withRequestField("time_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectReplyRatesRequest::getTimeZone, (req, v) -> {
                req.setTimeZone(v);
            }));
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectReplyRatesRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CollectSessionStatsRequest, CollectSessionStatsResponse> collectSessionStats =
        genForcollectSessionStats();

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
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectSessionStatsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectSessionStatsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<CollectSessionStatsRequest.IntervalEnum>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CollectSessionStatsRequest.IntervalEnum.class),
            f -> f.withMarshaller(CollectSessionStatsRequest::getInterval, (req, v) -> {
                req.setInterval(v);
            }));
        builder.<String>withRequestField("time_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectSessionStatsRequest::getTimeZone, (req, v) -> {
                req.setTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSessionRequest, CreateSessionResponse> createSession =
        genForcreateSession();

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
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSessionRequest, DeleteSessionResponse> deleteSession =
        genFordeleteSession();

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
            }));
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSessionRequest::getSessionId, (req, v) -> {
                req.setSessionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteComposeVideoRequest, ExecuteComposeVideoResponse> executeComposeVideo =
        genForexecuteComposeVideo();

    private static HttpRequestDef<ExecuteComposeVideoRequest, ExecuteComposeVideoResponse> genForexecuteComposeVideo() {
        // basic
        HttpRequestDef.Builder<ExecuteComposeVideoRequest, ExecuteComposeVideoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteComposeVideoRequest.class, ExecuteComposeVideoResponse.class)
                .withName("ExecuteComposeVideo")
                .withUri("/v1/{project_id}/digital-human/video/{video_id}/compose")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("video_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteComposeVideoRequest::getVideoId, (req, v) -> {
                req.setVideoId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteComposeVideoOndemandRequest, ExecuteComposeVideoOndemandResponse> executeComposeVideoOndemand =
        genForexecuteComposeVideoOndemand();

    private static HttpRequestDef<ExecuteComposeVideoOndemandRequest, ExecuteComposeVideoOndemandResponse> genForexecuteComposeVideoOndemand() {
        // basic
        HttpRequestDef.Builder<ExecuteComposeVideoOndemandRequest, ExecuteComposeVideoOndemandResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteComposeVideoOndemandRequest.class,
                    ExecuteComposeVideoOndemandResponse.class)
                .withName("ExecuteComposeVideoOndemand")
                .withUri("/v1/{project_id}/digital-human/video/{video_id}/compose/on-demand")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("video_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteComposeVideoOndemandRequest::getVideoId, (req, v) -> {
                req.setVideoId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteCreateVideoRequest, ExecuteCreateVideoResponse> executeCreateVideo =
        genForexecuteCreateVideo();

    private static HttpRequestDef<ExecuteCreateVideoRequest, ExecuteCreateVideoResponse> genForexecuteCreateVideo() {
        // basic
        HttpRequestDef.Builder<ExecuteCreateVideoRequest, ExecuteCreateVideoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteCreateVideoRequest.class, ExecuteCreateVideoResponse.class)
                .withName("ExecuteCreateVideo")
                .withUri("/v1/{project_id}/digital-human/video")
                .withContentType("application/json");

        // requests
        builder.<CreateVideoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateVideoReq.class),
            f -> f.withMarshaller(ExecuteCreateVideoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteDeleteVideoByIdRequest, ExecuteDeleteVideoByIdResponse> executeDeleteVideoById =
        genForexecuteDeleteVideoById();

    private static HttpRequestDef<ExecuteDeleteVideoByIdRequest, ExecuteDeleteVideoByIdResponse> genForexecuteDeleteVideoById() {
        // basic
        HttpRequestDef.Builder<ExecuteDeleteVideoByIdRequest, ExecuteDeleteVideoByIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, ExecuteDeleteVideoByIdRequest.class, ExecuteDeleteVideoByIdResponse.class)
            .withName("ExecuteDeleteVideoById")
            .withUri("/v1/{project_id}/digital-human/video/{video_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("video_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteDeleteVideoByIdRequest::getVideoId, (req, v) -> {
                req.setVideoId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteDeleteimageByIdRequest, ExecuteDeleteimageByIdResponse> executeDeleteimageById =
        genForexecuteDeleteimageById();

    private static HttpRequestDef<ExecuteDeleteimageByIdRequest, ExecuteDeleteimageByIdResponse> genForexecuteDeleteimageById() {
        // basic
        HttpRequestDef.Builder<ExecuteDeleteimageByIdRequest, ExecuteDeleteimageByIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, ExecuteDeleteimageByIdRequest.class, ExecuteDeleteimageByIdResponse.class)
            .withName("ExecuteDeleteimageById")
            .withUri("/v1/{project_id}/digital-human/images/{image_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteDeleteimageByIdRequest::getImageId, (req, v) -> {
                req.setImageId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteGetCharacterInfoByIdRequest, ExecuteGetCharacterInfoByIdResponse> executeGetCharacterInfoById =
        genForexecuteGetCharacterInfoById();

    private static HttpRequestDef<ExecuteGetCharacterInfoByIdRequest, ExecuteGetCharacterInfoByIdResponse> genForexecuteGetCharacterInfoById() {
        // basic
        HttpRequestDef.Builder<ExecuteGetCharacterInfoByIdRequest, ExecuteGetCharacterInfoByIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ExecuteGetCharacterInfoByIdRequest.class,
                    ExecuteGetCharacterInfoByIdResponse.class)
                .withName("ExecuteGetCharacterInfoById")
                .withUri("/v1/{project_id}/digital-human/characters/{character_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("character_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteGetCharacterInfoByIdRequest::getCharacterId, (req, v) -> {
                req.setCharacterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteGetCharactersRequest, ExecuteGetCharactersResponse> executeGetCharacters =
        genForexecuteGetCharacters();

    private static HttpRequestDef<ExecuteGetCharactersRequest, ExecuteGetCharactersResponse> genForexecuteGetCharacters() {
        // basic
        HttpRequestDef.Builder<ExecuteGetCharactersRequest, ExecuteGetCharactersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ExecuteGetCharactersRequest.class, ExecuteGetCharactersResponse.class)
            .withName("ExecuteGetCharacters")
            .withUri("/v1/{project_id}/digital-human/characters")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteGetCharactersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteGetCharactersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExecuteGetCharactersRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<Integer>withRequestField("train_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExecuteGetCharactersRequest::getTrainStatus, (req, v) -> {
                req.setTrainStatus(v);
            }));
        builder.<String>withRequestField("character_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteGetCharactersRequest::getCharacterName, (req, v) -> {
                req.setCharacterName(v);
            }));
        builder.<Boolean>withRequestField("support_interact",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ExecuteGetCharactersRequest::getSupportInteract, (req, v) -> {
                req.setSupportInteract(v);
            }));
        builder.<String>withRequestField("gender",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteGetCharactersRequest::getGender, (req, v) -> {
                req.setGender(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteGetFramsListByImagesIdRequest, ExecuteGetFramsListByImagesIdResponse> executeGetFramsListByImagesId =
        genForexecuteGetFramsListByImagesId();

    private static HttpRequestDef<ExecuteGetFramsListByImagesIdRequest, ExecuteGetFramsListByImagesIdResponse> genForexecuteGetFramsListByImagesId() {
        // basic
        HttpRequestDef.Builder<ExecuteGetFramsListByImagesIdRequest, ExecuteGetFramsListByImagesIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ExecuteGetFramsListByImagesIdRequest.class,
                    ExecuteGetFramsListByImagesIdResponse.class)
                .withName("ExecuteGetFramsListByImagesId")
                .withUri("/v1/{project_id}/digital-human/image-frames")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteGetFramsListByImagesIdRequest::getImageId, (req, v) -> {
                req.setImageId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExecuteGetFramsListByImagesIdRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExecuteGetFramsListByImagesIdRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteGetImagesListRequest, ExecuteGetImagesListResponse> executeGetImagesList =
        genForexecuteGetImagesList();

    private static HttpRequestDef<ExecuteGetImagesListRequest, ExecuteGetImagesListResponse> genForexecuteGetImagesList() {
        // basic
        HttpRequestDef.Builder<ExecuteGetImagesListRequest, ExecuteGetImagesListResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ExecuteGetImagesListRequest.class, ExecuteGetImagesListResponse.class)
            .withName("ExecuteGetImagesList")
            .withUri("/v1/{project_id}/digital-human/images")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExecuteGetImagesListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExecuteGetImagesListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("resolution_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExecuteGetImagesListRequest::getResolutionType, (req, v) -> {
                req.setResolutionType(v);
            }));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExecuteGetImagesListRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteGetVideoInfoByIdRequest, ExecuteGetVideoInfoByIdResponse> executeGetVideoInfoById =
        genForexecuteGetVideoInfoById();

    private static HttpRequestDef<ExecuteGetVideoInfoByIdRequest, ExecuteGetVideoInfoByIdResponse> genForexecuteGetVideoInfoById() {
        // basic
        HttpRequestDef.Builder<ExecuteGetVideoInfoByIdRequest, ExecuteGetVideoInfoByIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ExecuteGetVideoInfoByIdRequest.class, ExecuteGetVideoInfoByIdResponse.class)
            .withName("ExecuteGetVideoInfoById")
            .withUri("/v1/{project_id}/digital-human/video/{video_id}/info")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("video_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteGetVideoInfoByIdRequest::getVideoId, (req, v) -> {
                req.setVideoId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteGetVideosListRequest, ExecuteGetVideosListResponse> executeGetVideosList =
        genForexecuteGetVideosList();

    private static HttpRequestDef<ExecuteGetVideosListRequest, ExecuteGetVideosListResponse> genForexecuteGetVideosList() {
        // basic
        HttpRequestDef.Builder<ExecuteGetVideosListRequest, ExecuteGetVideosListResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ExecuteGetVideosListRequest.class, ExecuteGetVideosListResponse.class)
            .withName("ExecuteGetVideosList")
            .withUri("/v1/{project_id}/digital-human/video")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExecuteGetVideosListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteGetVideosListRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExecuteGetVideosListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecutePostCreateImagesRequest, ExecutePostCreateImagesResponse> executePostCreateImages =
        genForexecutePostCreateImages();

    private static HttpRequestDef<ExecutePostCreateImagesRequest, ExecutePostCreateImagesResponse> genForexecutePostCreateImages() {
        // basic
        HttpRequestDef.Builder<ExecutePostCreateImagesRequest, ExecutePostCreateImagesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExecutePostCreateImagesRequest.class, ExecutePostCreateImagesResponse.class)
            .withName("ExecutePostCreateImages")
            .withUri("/v1/{project_id}/digital-human/images")
            .withContentType("multipart/form-data");

        // requests
        builder.<PostImagesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostImagesReq.class),
            f -> f.withMarshaller(ExecutePostCreateImagesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteQaChatRequest, ExecuteQaChatResponse> executeQaChat =
        genForexecuteQaChat();

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
            }));
        builder.<PostRequestsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostRequestsReq.class),
            f -> f.withMarshaller(ExecuteQaChatRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteSessionRequest, ExecuteSessionResponse> executeSession =
        genForexecuteSession();

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
            }));
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteSessionRequest::getSessionId, (req, v) -> {
                req.setSessionId(v);
            }));
        builder.<PostQaSessionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostQaSessionReq.class),
            f -> f.withMarshaller(ExecuteSessionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteUpdateImageNameRequest, ExecuteUpdateImageNameResponse> executeUpdateImageName =
        genForexecuteUpdateImageName();

    private static HttpRequestDef<ExecuteUpdateImageNameRequest, ExecuteUpdateImageNameResponse> genForexecuteUpdateImageName() {
        // basic
        HttpRequestDef.Builder<ExecuteUpdateImageNameRequest, ExecuteUpdateImageNameResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ExecuteUpdateImageNameRequest.class, ExecuteUpdateImageNameResponse.class)
            .withName("ExecuteUpdateImageName")
            .withUri("/v1/{project_id}/digital-human/images/{image_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteUpdateImageNameRequest::getImageId, (req, v) -> {
                req.setImageId(v);
            }));
        builder.<UpdateImageNameReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateImageNameReq.class),
            f -> f.withMarshaller(ExecuteUpdateImageNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteUpdateVideoByIdRequest, ExecuteUpdateVideoByIdResponse> executeUpdateVideoById =
        genForexecuteUpdateVideoById();

    private static HttpRequestDef<ExecuteUpdateVideoByIdRequest, ExecuteUpdateVideoByIdResponse> genForexecuteUpdateVideoById() {
        // basic
        HttpRequestDef.Builder<ExecuteUpdateVideoByIdRequest, ExecuteUpdateVideoByIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ExecuteUpdateVideoByIdRequest.class, ExecuteUpdateVideoByIdResponse.class)
            .withName("ExecuteUpdateVideoById")
            .withUri("/v1/{project_id}/digital-human/video/{video_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("video_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteUpdateVideoByIdRequest::getVideoId, (req, v) -> {
                req.setVideoId(v);
            }));
        builder.<UpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateReq.class),
            f -> f.withMarshaller(ExecuteUpdateVideoByIdRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteUpdateVideoInfoByIdRequest, ExecuteUpdateVideoInfoByIdResponse> executeUpdateVideoInfoById =
        genForexecuteUpdateVideoInfoById();

    private static HttpRequestDef<ExecuteUpdateVideoInfoByIdRequest, ExecuteUpdateVideoInfoByIdResponse> genForexecuteUpdateVideoInfoById() {
        // basic
        HttpRequestDef.Builder<ExecuteUpdateVideoInfoByIdRequest, ExecuteUpdateVideoInfoByIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ExecuteUpdateVideoInfoByIdRequest.class,
                    ExecuteUpdateVideoInfoByIdResponse.class)
                .withName("ExecuteUpdateVideoInfoById")
                .withUri("/v1/{project_id}/digital-human/video/{video_id}/info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("video_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteUpdateVideoInfoByIdRequest::getVideoId, (req, v) -> {
                req.setVideoId(v);
            }));
        builder.<PutVideoInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PutVideoInfo.class),
            f -> f.withMarshaller(ExecuteUpdateVideoInfoByIdRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteUploadImageRequest, ExecuteUploadImageResponse> executeUploadImage =
        genForexecuteUploadImage();

    private static HttpRequestDef<ExecuteUploadImageRequest, ExecuteUploadImageResponse> genForexecuteUploadImage() {
        // basic
        HttpRequestDef.Builder<ExecuteUploadImageRequest, ExecuteUploadImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteUploadImageRequest.class, ExecuteUploadImageResponse.class)
                .withName("ExecuteUploadImage")
                .withUri("/v1/{project_id}/digital-human/video/{video_id}/upload/image")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("video_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteUploadImageRequest::getVideoId, (req, v) -> {
                req.setVideoId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteUploadImageRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<ExecuteUploadImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteUploadImageRequestBody.class),
            f -> f.withMarshaller(ExecuteUploadImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteUploadPptRequest, ExecuteUploadPptResponse> executeUploadPpt =
        genForexecuteUploadPpt();

    private static HttpRequestDef<ExecuteUploadPptRequest, ExecuteUploadPptResponse> genForexecuteUploadPpt() {
        // basic
        HttpRequestDef.Builder<ExecuteUploadPptRequest, ExecuteUploadPptResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteUploadPptRequest.class, ExecuteUploadPptResponse.class)
                .withName("ExecuteUploadPpt")
                .withUri("/v1/{project_id}/digital-human/video/{video_id}/upload/ppt")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("video_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteUploadPptRequest::getVideoId, (req, v) -> {
                req.setVideoId(v);
            }));
        builder.<ExecuteUploadPptRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteUploadPptRequestBody.class),
            f -> f.withMarshaller(ExecuteUploadPptRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSuggestionsRequest, ListSuggestionsResponse> listSuggestions =
        genForlistSuggestions();

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
            }));
        builder.<PostSuggestionsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostSuggestionsReq.class),
            f -> f.withMarshaller(ListSuggestionsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
            }));
        builder.<String>withRequestField("request_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(TagLaborRequest::getRequestId, (req, v) -> {
                req.setRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TagSatisfactionRequest, TagSatisfactionResponse> tagSatisfaction =
        genFortagSatisfaction();

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
            }));
        builder.<String>withRequestField("request_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(TagSatisfactionRequest::getRequestId, (req, v) -> {
                req.setRequestId(v);
            }));
        builder.<PostSatisfactionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostSatisfactionReq.class),
            f -> f.withMarshaller(TagSatisfactionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PostRequestsRequest, PostRequestsResponse> postRequests = genForpostRequests();

    private static HttpRequestDef<PostRequestsRequest, PostRequestsResponse> genForpostRequests() {
        // basic
        HttpRequestDef.Builder<PostRequestsRequest, PostRequestsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PostRequestsRequest.class, PostRequestsResponse.class)
                .withName("PostRequests")
                .withUri("/v1/{project_id}/qabots/{qabot_id}/requests")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("qabot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PostRequestsRequest::getQabotId, (req, v) -> {
                req.setQabotId(v);
            }));
        builder.<PostOldRequestsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PostOldRequestsReq.class),
            f -> f.withMarshaller(PostRequestsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
