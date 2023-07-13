package com.huaweicloud.sdk.codecraft.v5;

import com.huaweicloud.sdk.codecraft.v5.model.CreateCompetitionScoreRequest;
import com.huaweicloud.sdk.codecraft.v5.model.CreateCompetitionScoreResponse;
import com.huaweicloud.sdk.codecraft.v5.model.CreateScoresRequestModel;
import com.huaweicloud.sdk.codecraft.v5.model.ListCompetitionWorksRequest;
import com.huaweicloud.sdk.codecraft.v5.model.ListCompetitionWorksResponse;
import com.huaweicloud.sdk.codecraft.v5.model.RegisterCompetitionInfoRequest;
import com.huaweicloud.sdk.codecraft.v5.model.RegisterCompetitionInfoResponse;
import com.huaweicloud.sdk.codecraft.v5.model.RegisterInfoRequestModel;
import com.huaweicloud.sdk.codecraft.v5.model.UpdateCompetitionScoreRequest;
import com.huaweicloud.sdk.codecraft.v5.model.UpdateCompetitionScoreResponse;
import com.huaweicloud.sdk.codecraft.v5.model.UpdateScoreRequestModel;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CodeCraftMeta {

    public static final HttpRequestDef<CreateCompetitionScoreRequest, CreateCompetitionScoreResponse> createCompetitionScore =
        genForcreateCompetitionScore();

    private static HttpRequestDef<CreateCompetitionScoreRequest, CreateCompetitionScoreResponse> genForcreateCompetitionScore() {
        // basic
        HttpRequestDef.Builder<CreateCompetitionScoreRequest, CreateCompetitionScoreResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateCompetitionScoreRequest.class, CreateCompetitionScoreResponse.class)
            .withName("CreateCompetitionScore")
            .withUri("/v5/competitions/score-infos")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateScoresRequestModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateScoresRequestModel.class),
            f -> f.withMarshaller(CreateCompetitionScoreRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCompetitionWorksRequest, ListCompetitionWorksResponse> listCompetitionWorks =
        genForlistCompetitionWorks();

    private static HttpRequestDef<ListCompetitionWorksRequest, ListCompetitionWorksResponse> genForlistCompetitionWorks() {
        // basic
        HttpRequestDef.Builder<ListCompetitionWorksRequest, ListCompetitionWorksResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCompetitionWorksRequest.class, ListCompetitionWorksResponse.class)
            .withName("ListCompetitionWorks")
            .withUri("/v5/competitions/works")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("competition_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCompetitionWorksRequest::getCompetitionId, (req, v) -> {
                req.setCompetitionId(v);
            }));
        builder.<Integer>withRequestField("stage_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCompetitionWorksRequest::getStageId, (req, v) -> {
                req.setStageId(v);
            }));
        builder.<String>withRequestField("read_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompetitionWorksRequest::getReadTime, (req, v) -> {
                req.setReadTime(v);
            }));
        builder.<ListCompetitionWorksRequest.TimeUnitEnum>withRequestField("time_unit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCompetitionWorksRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(ListCompetitionWorksRequest::getTimeUnit, (req, v) -> {
                req.setTimeUnit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCompetitionWorksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCompetitionWorksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompetitionWorksRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<ListCompetitionWorksRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCompetitionWorksRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListCompetitionWorksRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterCompetitionInfoRequest, RegisterCompetitionInfoResponse> registerCompetitionInfo =
        genForregisterCompetitionInfo();

    private static HttpRequestDef<RegisterCompetitionInfoRequest, RegisterCompetitionInfoResponse> genForregisterCompetitionInfo() {
        // basic
        HttpRequestDef.Builder<RegisterCompetitionInfoRequest, RegisterCompetitionInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RegisterCompetitionInfoRequest.class, RegisterCompetitionInfoResponse.class)
            .withName("RegisterCompetitionInfo")
            .withUri("/v5/competitions/registrations")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<RegisterInfoRequestModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RegisterInfoRequestModel.class),
            f -> f.withMarshaller(RegisterCompetitionInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCompetitionScoreRequest, UpdateCompetitionScoreResponse> updateCompetitionScore =
        genForupdateCompetitionScore();

    private static HttpRequestDef<UpdateCompetitionScoreRequest, UpdateCompetitionScoreResponse> genForupdateCompetitionScore() {
        // basic
        HttpRequestDef.Builder<UpdateCompetitionScoreRequest, UpdateCompetitionScoreResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateCompetitionScoreRequest.class, UpdateCompetitionScoreResponse.class)
            .withName("UpdateCompetitionScore")
            .withUri("/v5/competitions/scores")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UpdateScoreRequestModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateScoreRequestModel.class),
            f -> f.withMarshaller(UpdateCompetitionScoreRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
