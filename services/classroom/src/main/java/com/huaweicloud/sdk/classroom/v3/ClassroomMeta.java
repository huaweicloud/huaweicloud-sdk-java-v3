package com.huaweicloud.sdk.classroom.v3;

import com.huaweicloud.sdk.classroom.v3.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class ClassroomMeta {

    public static final HttpRequestDef<ApplyJudgementRequest, ApplyJudgementResponse> applyJudgement =
        genForapplyJudgement();

    private static HttpRequestDef<ApplyJudgementRequest, ApplyJudgementResponse> genForapplyJudgement() {
        // basic
        HttpRequestDef.Builder<ApplyJudgementRequest, ApplyJudgementResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ApplyJudgementRequest.class, ApplyJudgementResponse.class)
                .withName("ApplyJudgement")
                .withUri("/v1/enablement/judgements")
                .withContentType("application/json");

        // requests
        builder.<JudgementTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JudgementTaskRequestBody.class),
            f -> f.withMarshaller(ApplyJudgementRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJudgementDetailRequest, ShowJudgementDetailResponse> showJudgementDetail =
        genForshowJudgementDetail();

    private static HttpRequestDef<ShowJudgementDetailRequest, ShowJudgementDetailResponse> genForshowJudgementDetail() {
        // basic
        HttpRequestDef.Builder<ShowJudgementDetailRequest, ShowJudgementDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJudgementDetailRequest.class, ShowJudgementDetailResponse.class)
                .withName("ShowJudgementDetail")
                .withUri("/v1/enablement/judgements/{judgement_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("judgement_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJudgementDetailRequest::getJudgementId, (req, v) -> {
                req.setJudgementId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJudgementFileRequest, ShowJudgementFileResponse> showJudgementFile =
        genForshowJudgementFile();

    private static HttpRequestDef<ShowJudgementFileRequest, ShowJudgementFileResponse> genForshowJudgementFile() {
        // basic
        HttpRequestDef.Builder<ShowJudgementFileRequest, ShowJudgementFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJudgementFileRequest.class, ShowJudgementFileResponse.class)
                .withName("ShowJudgementFile")
                .withUri("/v1/enablement/judgement/files/{file_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("file_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJudgementFileRequest::getFileId, (req, v) -> {
                req.setFileId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClassroomMembersRequest, ListClassroomMembersResponse> listClassroomMembers =
        genForlistClassroomMembers();

    private static HttpRequestDef<ListClassroomMembersRequest, ListClassroomMembersResponse> genForlistClassroomMembers() {
        // basic
        HttpRequestDef.Builder<ListClassroomMembersRequest, ListClassroomMembersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListClassroomMembersRequest.class, ListClassroomMembersResponse.class)
            .withName("ListClassroomMembers")
            .withUri("/v3/classrooms/{classroom_id}/members")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("classroom_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClassroomMembersRequest::getClassroomId, (req, v) -> {
                req.setClassroomId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClassroomMembersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClassroomMembersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClassroomMembersRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClassroomsRequest, ListClassroomsResponse> listClassrooms =
        genForlistClassrooms();

    private static HttpRequestDef<ListClassroomsRequest, ListClassroomsResponse> genForlistClassrooms() {
        // basic
        HttpRequestDef.Builder<ListClassroomsRequest, ListClassroomsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClassroomsRequest.class, ListClassroomsResponse.class)
                .withName("ListClassrooms")
                .withUri("/v3/classrooms")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClassroomsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClassroomsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("query_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClassroomsRequest::getQueryType, (req, v) -> {
                req.setQueryType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClassroomDetailRequest, ShowClassroomDetailResponse> showClassroomDetail =
        genForshowClassroomDetail();

    private static HttpRequestDef<ShowClassroomDetailRequest, ShowClassroomDetailResponse> genForshowClassroomDetail() {
        // basic
        HttpRequestDef.Builder<ShowClassroomDetailRequest, ShowClassroomDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClassroomDetailRequest.class, ShowClassroomDetailResponse.class)
                .withName("ShowClassroomDetail")
                .withUri("/v3/classrooms/{classroom_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("classroom_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClassroomDetailRequest::getClassroomId, (req, v) -> {
                req.setClassroomId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClassroomMemberJobsRequest, ListClassroomMemberJobsResponse> listClassroomMemberJobs =
        genForlistClassroomMemberJobs();

    private static HttpRequestDef<ListClassroomMemberJobsRequest, ListClassroomMemberJobsResponse> genForlistClassroomMemberJobs() {
        // basic
        HttpRequestDef.Builder<ListClassroomMemberJobsRequest, ListClassroomMemberJobsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListClassroomMemberJobsRequest.class, ListClassroomMemberJobsResponse.class)
            .withName("ListClassroomMemberJobs")
            .withUri("/v3/classrooms/{classroom_id}/jobs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("classroom_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClassroomMemberJobsRequest::getClassroomId, (req, v) -> {
                req.setClassroomId(v);
            }));
        builder.<String>withRequestField("member_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClassroomMemberJobsRequest::getMemberId, (req, v) -> {
                req.setMemberId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClassroomMemberJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClassroomMemberJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobsRequest, ListJobsResponse> listJobs = genForlistJobs();

    private static HttpRequestDef<ListJobsRequest, ListJobsResponse> genForlistJobs() {
        // basic
        HttpRequestDef.Builder<ListJobsRequest, ListJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobsRequest.class, ListJobsResponse.class)
                .withName("ListJobs")
                .withUri("/v3/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getSourceFrom, (req, v) -> {
                req.setSourceFrom(v);
            }));
        builder.<String>withRequestField("source_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getSourceId, (req, v) -> {
                req.setSourceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMemberJobRecordsRequest, ListMemberJobRecordsResponse> listMemberJobRecords =
        genForlistMemberJobRecords();

    private static HttpRequestDef<ListMemberJobRecordsRequest, ListMemberJobRecordsResponse> genForlistMemberJobRecords() {
        // basic
        HttpRequestDef.Builder<ListMemberJobRecordsRequest, ListMemberJobRecordsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMemberJobRecordsRequest.class, ListMemberJobRecordsResponse.class)
            .withName("ListMemberJobRecords")
            .withUri("/v3/jobs/{job_id}/exercises/{exercise_id}/records")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMemberJobRecordsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("exercise_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMemberJobRecordsRequest::getExerciseId, (req, v) -> {
                req.setExerciseId(v);
            }));
        builder.<String>withRequestField("member_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMemberJobRecordsRequest::getMemberId, (req, v) -> {
                req.setMemberId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMemberJobRecordsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMemberJobRecordsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetail =
        genForshowJobDetail();

    private static HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> genForshowJobDetail() {
        // basic
        HttpRequestDef.Builder<ShowJobDetailRequest, ShowJobDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobDetailRequest.class, ShowJobDetailResponse.class)
                .withName("ShowJobDetail")
                .withUri("/v3/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobExercisesRequest, ShowJobExercisesResponse> showJobExercises =
        genForshowJobExercises();

    private static HttpRequestDef<ShowJobExercisesRequest, ShowJobExercisesResponse> genForshowJobExercises() {
        // basic
        HttpRequestDef.Builder<ShowJobExercisesRequest, ShowJobExercisesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobExercisesRequest.class, ShowJobExercisesResponse.class)
                .withName("ShowJobExercises")
                .withUri("/v3/jobs/{job_id}/exercises")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExercisesRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("source_from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExercisesRequest::getSourceFrom, (req, v) -> {
                req.setSourceFrom(v);
            }));
        builder.<String>withRequestField("source_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExercisesRequest::getSourceId, (req, v) -> {
                req.setSourceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobExercisesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobExercisesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

}
