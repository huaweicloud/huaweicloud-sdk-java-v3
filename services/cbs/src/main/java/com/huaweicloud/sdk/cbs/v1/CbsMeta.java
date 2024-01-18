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
        genForCollectHotQuestions();

    private static HttpRequestDef<CollectHotQuestionsRequest, CollectHotQuestionsResponse> genForCollectHotQuestions() {
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
            f -> f.withMarshaller(CollectHotQuestionsRequest::getQabotId, CollectHotQuestionsRequest::setQabotId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectHotQuestionsRequest::getStartTime, CollectHotQuestionsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectHotQuestionsRequest::getEndTime, CollectHotQuestionsRequest::setEndTime));
        builder.<Integer>withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CollectHotQuestionsRequest::getTop, CollectHotQuestionsRequest::setTop));
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectHotQuestionsRequest::getDomain, CollectHotQuestionsRequest::setDomain));
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectHotQuestionsRequest::getDomainId, CollectHotQuestionsRequest::setDomainId));
        builder.<Boolean>withRequestField("exclude",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(CollectHotQuestionsRequest::getExclude, CollectHotQuestionsRequest::setExclude));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CollectKeyWordsRequest, CollectKeyWordsResponse> collectKeyWords =
        genForCollectKeyWords();

    private static HttpRequestDef<CollectKeyWordsRequest, CollectKeyWordsResponse> genForCollectKeyWords() {
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
            f -> f.withMarshaller(CollectKeyWordsRequest::getQabotId, CollectKeyWordsRequest::setQabotId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectKeyWordsRequest::getStartTime, CollectKeyWordsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectKeyWordsRequest::getEndTime, CollectKeyWordsRequest::setEndTime));
        builder.<Integer>withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CollectKeyWordsRequest::getTop, CollectKeyWordsRequest::setTop));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CollectReplyRatesRequest, CollectReplyRatesResponse> collectReplyRates =
        genForCollectReplyRates();

    private static HttpRequestDef<CollectReplyRatesRequest, CollectReplyRatesResponse> genForCollectReplyRates() {
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
            f -> f.withMarshaller(CollectReplyRatesRequest::getQabotId, CollectReplyRatesRequest::setQabotId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectReplyRatesRequest::getStartTime, CollectReplyRatesRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectReplyRatesRequest::getEndTime, CollectReplyRatesRequest::setEndTime));
        builder.<CollectReplyRatesRequest.IntervalEnum>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CollectReplyRatesRequest.IntervalEnum.class),
            f -> f.withMarshaller(CollectReplyRatesRequest::getInterval, CollectReplyRatesRequest::setInterval));
        builder.<String>withRequestField("time_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectReplyRatesRequest::getTimeZone, CollectReplyRatesRequest::setTimeZone));
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectReplyRatesRequest::getDomain, CollectReplyRatesRequest::setDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CollectSessionStatsRequest, CollectSessionStatsResponse> collectSessionStats =
        genForCollectSessionStats();

    private static HttpRequestDef<CollectSessionStatsRequest, CollectSessionStatsResponse> genForCollectSessionStats() {
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
            f -> f.withMarshaller(CollectSessionStatsRequest::getQabotId, CollectSessionStatsRequest::setQabotId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectSessionStatsRequest::getStartTime, CollectSessionStatsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectSessionStatsRequest::getEndTime, CollectSessionStatsRequest::setEndTime));
        builder.<CollectSessionStatsRequest.IntervalEnum>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CollectSessionStatsRequest.IntervalEnum.class),
            f -> f.withMarshaller(CollectSessionStatsRequest::getInterval, CollectSessionStatsRequest::setInterval));
        builder.<String>withRequestField("time_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectSessionStatsRequest::getTimeZone, CollectSessionStatsRequest::setTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSessionRequest, CreateSessionResponse> createSession =
        genForCreateSession();

    private static HttpRequestDef<CreateSessionRequest, CreateSessionResponse> genForCreateSession() {
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
            f -> f.withMarshaller(CreateSessionRequest::getQabotId, CreateSessionRequest::setQabotId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSessionRequest, DeleteSessionResponse> deleteSession =
        genForDeleteSession();

    private static HttpRequestDef<DeleteSessionRequest, DeleteSessionResponse> genForDeleteSession() {
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
            f -> f.withMarshaller(DeleteSessionRequest::getQabotId, DeleteSessionRequest::setQabotId));
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSessionRequest::getSessionId, DeleteSessionRequest::setSessionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteComposeVideoRequest, ExecuteComposeVideoResponse> executeComposeVideo =
        genForExecuteComposeVideo();

    private static HttpRequestDef<ExecuteComposeVideoRequest, ExecuteComposeVideoResponse> genForExecuteComposeVideo() {
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
            f -> f.withMarshaller(ExecuteComposeVideoRequest::getVideoId, ExecuteComposeVideoRequest::setVideoId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteComposeVideoOndemandRequest, ExecuteComposeVideoOndemandResponse> executeComposeVideoOndemand =
        genForExecuteComposeVideoOndemand();

    private static HttpRequestDef<ExecuteComposeVideoOndemandRequest, ExecuteComposeVideoOndemandResponse> genForExecuteComposeVideoOndemand() {
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
            f -> f.withMarshaller(ExecuteComposeVideoOndemandRequest::getVideoId,
                ExecuteComposeVideoOndemandRequest::setVideoId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteCreateVideoRequest, ExecuteCreateVideoResponse> executeCreateVideo =
        genForExecuteCreateVideo();

    private static HttpRequestDef<ExecuteCreateVideoRequest, ExecuteCreateVideoResponse> genForExecuteCreateVideo() {
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
            f -> f.withMarshaller(ExecuteCreateVideoRequest::getBody, ExecuteCreateVideoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteDeleteVideoByIdRequest, ExecuteDeleteVideoByIdResponse> executeDeleteVideoById =
        genForExecuteDeleteVideoById();

    private static HttpRequestDef<ExecuteDeleteVideoByIdRequest, ExecuteDeleteVideoByIdResponse> genForExecuteDeleteVideoById() {
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
            f -> f.withMarshaller(ExecuteDeleteVideoByIdRequest::getVideoId,
                ExecuteDeleteVideoByIdRequest::setVideoId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteDeleteimageByIdRequest, ExecuteDeleteimageByIdResponse> executeDeleteimageById =
        genForExecuteDeleteimageById();

    private static HttpRequestDef<ExecuteDeleteimageByIdRequest, ExecuteDeleteimageByIdResponse> genForExecuteDeleteimageById() {
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
            f -> f.withMarshaller(ExecuteDeleteimageByIdRequest::getImageId,
                ExecuteDeleteimageByIdRequest::setImageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteGetCharacterInfoByIdRequest, ExecuteGetCharacterInfoByIdResponse> executeGetCharacterInfoById =
        genForExecuteGetCharacterInfoById();

    private static HttpRequestDef<ExecuteGetCharacterInfoByIdRequest, ExecuteGetCharacterInfoByIdResponse> genForExecuteGetCharacterInfoById() {
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
            f -> f.withMarshaller(ExecuteGetCharacterInfoByIdRequest::getCharacterId,
                ExecuteGetCharacterInfoByIdRequest::setCharacterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteGetCharactersRequest, ExecuteGetCharactersResponse> executeGetCharacters =
        genForExecuteGetCharacters();

    private static HttpRequestDef<ExecuteGetCharactersRequest, ExecuteGetCharactersResponse> genForExecuteGetCharacters() {
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
            f -> f.withMarshaller(ExecuteGetCharactersRequest::getOffset, ExecuteGetCharactersRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteGetCharactersRequest::getLimit, ExecuteGetCharactersRequest::setLimit));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExecuteGetCharactersRequest::getType, ExecuteGetCharactersRequest::setType));
        builder.<Integer>withRequestField("train_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExecuteGetCharactersRequest::getTrainStatus,
                ExecuteGetCharactersRequest::setTrainStatus));
        builder.<String>withRequestField("character_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteGetCharactersRequest::getCharacterName,
                ExecuteGetCharactersRequest::setCharacterName));
        builder.<Boolean>withRequestField("support_interact",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ExecuteGetCharactersRequest::getSupportInteract,
                ExecuteGetCharactersRequest::setSupportInteract));
        builder.<String>withRequestField("gender",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteGetCharactersRequest::getGender, ExecuteGetCharactersRequest::setGender));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteGetFramsListByImagesIdRequest, ExecuteGetFramsListByImagesIdResponse> executeGetFramsListByImagesId =
        genForExecuteGetFramsListByImagesId();

    private static HttpRequestDef<ExecuteGetFramsListByImagesIdRequest, ExecuteGetFramsListByImagesIdResponse> genForExecuteGetFramsListByImagesId() {
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
            f -> f.withMarshaller(ExecuteGetFramsListByImagesIdRequest::getImageId,
                ExecuteGetFramsListByImagesIdRequest::setImageId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExecuteGetFramsListByImagesIdRequest::getOffset,
                ExecuteGetFramsListByImagesIdRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExecuteGetFramsListByImagesIdRequest::getLimit,
                ExecuteGetFramsListByImagesIdRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteGetImagesListRequest, ExecuteGetImagesListResponse> executeGetImagesList =
        genForExecuteGetImagesList();

    private static HttpRequestDef<ExecuteGetImagesListRequest, ExecuteGetImagesListResponse> genForExecuteGetImagesList() {
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
            f -> f.withMarshaller(ExecuteGetImagesListRequest::getLimit, ExecuteGetImagesListRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExecuteGetImagesListRequest::getOffset, ExecuteGetImagesListRequest::setOffset));
        builder.<Integer>withRequestField("resolution_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExecuteGetImagesListRequest::getResolutionType,
                ExecuteGetImagesListRequest::setResolutionType));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExecuteGetImagesListRequest::getType, ExecuteGetImagesListRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteGetVideoInfoByIdRequest, ExecuteGetVideoInfoByIdResponse> executeGetVideoInfoById =
        genForExecuteGetVideoInfoById();

    private static HttpRequestDef<ExecuteGetVideoInfoByIdRequest, ExecuteGetVideoInfoByIdResponse> genForExecuteGetVideoInfoById() {
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
            f -> f.withMarshaller(ExecuteGetVideoInfoByIdRequest::getVideoId,
                ExecuteGetVideoInfoByIdRequest::setVideoId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteGetVideosListRequest, ExecuteGetVideosListResponse> executeGetVideosList =
        genForExecuteGetVideosList();

    private static HttpRequestDef<ExecuteGetVideosListRequest, ExecuteGetVideosListResponse> genForExecuteGetVideosList() {
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
            f -> f.withMarshaller(ExecuteGetVideosListRequest::getLimit, ExecuteGetVideosListRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteGetVideosListRequest::getName, ExecuteGetVideosListRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExecuteGetVideosListRequest::getOffset, ExecuteGetVideosListRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecutePostCreateImagesRequest, ExecutePostCreateImagesResponse> executePostCreateImages =
        genForExecutePostCreateImages();

    private static HttpRequestDef<ExecutePostCreateImagesRequest, ExecutePostCreateImagesResponse> genForExecutePostCreateImages() {
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
            f -> f.withMarshaller(ExecutePostCreateImagesRequest::getBody, ExecutePostCreateImagesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteQaChatRequest, ExecuteQaChatResponse> executeQaChat =
        genForExecuteQaChat();

    private static HttpRequestDef<ExecuteQaChatRequest, ExecuteQaChatResponse> genForExecuteQaChat() {
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
            f -> f.withMarshaller(ExecuteQaChatRequest::getQabotId, ExecuteQaChatRequest::setQabotId));
        builder.<PostRequestsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostRequestsReq.class),
            f -> f.withMarshaller(ExecuteQaChatRequest::getBody, ExecuteQaChatRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteSessionRequest, ExecuteSessionResponse> executeSession =
        genForExecuteSession();

    private static HttpRequestDef<ExecuteSessionRequest, ExecuteSessionResponse> genForExecuteSession() {
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
            f -> f.withMarshaller(ExecuteSessionRequest::getQabotId, ExecuteSessionRequest::setQabotId));
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteSessionRequest::getSessionId, ExecuteSessionRequest::setSessionId));
        builder.<PostQaSessionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostQaSessionReq.class),
            f -> f.withMarshaller(ExecuteSessionRequest::getBody, ExecuteSessionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteUpdateImageNameRequest, ExecuteUpdateImageNameResponse> executeUpdateImageName =
        genForExecuteUpdateImageName();

    private static HttpRequestDef<ExecuteUpdateImageNameRequest, ExecuteUpdateImageNameResponse> genForExecuteUpdateImageName() {
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
            f -> f.withMarshaller(ExecuteUpdateImageNameRequest::getImageId,
                ExecuteUpdateImageNameRequest::setImageId));
        builder.<UpdateImageNameReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateImageNameReq.class),
            f -> f.withMarshaller(ExecuteUpdateImageNameRequest::getBody, ExecuteUpdateImageNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteUpdateVideoByIdRequest, ExecuteUpdateVideoByIdResponse> executeUpdateVideoById =
        genForExecuteUpdateVideoById();

    private static HttpRequestDef<ExecuteUpdateVideoByIdRequest, ExecuteUpdateVideoByIdResponse> genForExecuteUpdateVideoById() {
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
            f -> f.withMarshaller(ExecuteUpdateVideoByIdRequest::getVideoId,
                ExecuteUpdateVideoByIdRequest::setVideoId));
        builder.<UpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateReq.class),
            f -> f.withMarshaller(ExecuteUpdateVideoByIdRequest::getBody, ExecuteUpdateVideoByIdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteUpdateVideoInfoByIdRequest, ExecuteUpdateVideoInfoByIdResponse> executeUpdateVideoInfoById =
        genForExecuteUpdateVideoInfoById();

    private static HttpRequestDef<ExecuteUpdateVideoInfoByIdRequest, ExecuteUpdateVideoInfoByIdResponse> genForExecuteUpdateVideoInfoById() {
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
            f -> f.withMarshaller(ExecuteUpdateVideoInfoByIdRequest::getVideoId,
                ExecuteUpdateVideoInfoByIdRequest::setVideoId));
        builder.<PutVideoInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PutVideoInfo.class),
            f -> f.withMarshaller(ExecuteUpdateVideoInfoByIdRequest::getBody,
                ExecuteUpdateVideoInfoByIdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteUploadImageRequest, ExecuteUploadImageResponse> executeUploadImage =
        genForExecuteUploadImage();

    private static HttpRequestDef<ExecuteUploadImageRequest, ExecuteUploadImageResponse> genForExecuteUploadImage() {
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
            f -> f.withMarshaller(ExecuteUploadImageRequest::getVideoId, ExecuteUploadImageRequest::setVideoId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteUploadImageRequest::getName, ExecuteUploadImageRequest::setName));
        builder.<ExecuteUploadImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteUploadImageRequestBody.class),
            f -> f.withMarshaller(ExecuteUploadImageRequest::getBody, ExecuteUploadImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteUploadPptRequest, ExecuteUploadPptResponse> executeUploadPpt =
        genForExecuteUploadPpt();

    private static HttpRequestDef<ExecuteUploadPptRequest, ExecuteUploadPptResponse> genForExecuteUploadPpt() {
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
            f -> f.withMarshaller(ExecuteUploadPptRequest::getVideoId, ExecuteUploadPptRequest::setVideoId));
        builder.<ExecuteUploadPptRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteUploadPptRequestBody.class),
            f -> f.withMarshaller(ExecuteUploadPptRequest::getBody, ExecuteUploadPptRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSuggestionsRequest, ListSuggestionsResponse> listSuggestions =
        genForListSuggestions();

    private static HttpRequestDef<ListSuggestionsRequest, ListSuggestionsResponse> genForListSuggestions() {
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
            f -> f.withMarshaller(ListSuggestionsRequest::getQabotId, ListSuggestionsRequest::setQabotId));
        builder.<PostSuggestionsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostSuggestionsReq.class),
            f -> f.withMarshaller(ListSuggestionsRequest::getBody, ListSuggestionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TagLaborRequest, TagLaborResponse> tagLabor = genForTagLabor();

    private static HttpRequestDef<TagLaborRequest, TagLaborResponse> genForTagLabor() {
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
            f -> f.withMarshaller(TagLaborRequest::getQabotId, TagLaborRequest::setQabotId));
        builder.<String>withRequestField("request_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(TagLaborRequest::getRequestId, TagLaborRequest::setRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TagSatisfactionRequest, TagSatisfactionResponse> tagSatisfaction =
        genForTagSatisfaction();

    private static HttpRequestDef<TagSatisfactionRequest, TagSatisfactionResponse> genForTagSatisfaction() {
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
            f -> f.withMarshaller(TagSatisfactionRequest::getQabotId, TagSatisfactionRequest::setQabotId));
        builder.<String>withRequestField("request_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(TagSatisfactionRequest::getRequestId, TagSatisfactionRequest::setRequestId));
        builder.<PostSatisfactionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostSatisfactionReq.class),
            f -> f.withMarshaller(TagSatisfactionRequest::getBody, TagSatisfactionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PostRequestsRequest, PostRequestsResponse> postRequests = genForPostRequests();

    private static HttpRequestDef<PostRequestsRequest, PostRequestsResponse> genForPostRequests() {
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
            f -> f.withMarshaller(PostRequestsRequest::getQabotId, PostRequestsRequest::setQabotId));
        builder.<PostOldRequestsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PostOldRequestsReq.class),
            f -> f.withMarshaller(PostRequestsRequest::getBody, PostRequestsRequest::setBody));

        // response

        return builder.build();
    }

}
