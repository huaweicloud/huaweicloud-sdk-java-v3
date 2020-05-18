package com.huaweicloud.sdk.classroom.v3;

import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.core.http.HttpMethod;

import com.huaweicloud.sdk.classroom.v3.model.*;

@SuppressWarnings("unchecked")
public class ClassroomMeta {

    public static final HttpRequestDef<ListClassroomMembersRequest, ListClassroomMembersResponse> listClassroomMembers = genForlistClassroomMembers();

    private static HttpRequestDef<ListClassroomMembersRequest, ListClassroomMembersResponse> genForlistClassroomMembers() {
        // basic
        HttpRequestDef.Builder<ListClassroomMembersRequest, ListClassroomMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClassroomMembersRequest.class, ListClassroomMembersResponse.class)
                .withUri("/v3/classrooms/{classroom_id}/members");

        // requests
        builder.withRequestField("classroom_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListClassroomMembersRequest::getClassroomId, (req, v) -> {
                    req.setClassroomId(v);
                })
        );
        builder.withRequestField("offset",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListClassroomMembersRequest::getOffset, (req, v) -> {
                    req.setOffset(v);
                })
        );
        builder.withRequestField("limit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListClassroomMembersRequest::getLimit, (req, v) -> {
                    req.setLimit(v);
                })
        );
        builder.withRequestField("filter",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListClassroomMembersRequest::getFilter, (req, v) -> {
                    req.setFilter(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListClassroomsRequest, ListClassroomsResponse> listClassrooms = genForlistClassrooms();

    private static HttpRequestDef<ListClassroomsRequest, ListClassroomsResponse> genForlistClassrooms() {
        // basic
        HttpRequestDef.Builder<ListClassroomsRequest, ListClassroomsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClassroomsRequest.class, ListClassroomsResponse.class)
                .withUri("/v3/classrooms");

        // requests
        builder.withRequestField("offset",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListClassroomsRequest::getOffset, (req, v) -> {
                    req.setOffset(v);
                })
        );
        builder.withRequestField("limit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListClassroomsRequest::getLimit, (req, v) -> {
                    req.setLimit(v);
                })
        );
        builder.withRequestField("query_type",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListClassroomsRequest::getQueryType, (req, v) -> {
                    req.setQueryType(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ShowClassroomDetailRequest, ShowClassroomDetailResponse> showClassroomDetail = genForshowClassroomDetail();

    private static HttpRequestDef<ShowClassroomDetailRequest, ShowClassroomDetailResponse> genForshowClassroomDetail() {
        // basic
        HttpRequestDef.Builder<ShowClassroomDetailRequest, ShowClassroomDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClassroomDetailRequest.class, ShowClassroomDetailResponse.class)
                .withUri("/v3/classrooms/{classroom_id}");

        // requests
        builder.withRequestField("classroom_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowClassroomDetailRequest::getClassroomId, (req, v) -> {
                    req.setClassroomId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListClassroomMemberJobsRequest, ListClassroomMemberJobsResponse> listClassroomMemberJobs = genForlistClassroomMemberJobs();

    private static HttpRequestDef<ListClassroomMemberJobsRequest, ListClassroomMemberJobsResponse> genForlistClassroomMemberJobs() {
        // basic
        HttpRequestDef.Builder<ListClassroomMemberJobsRequest, ListClassroomMemberJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClassroomMemberJobsRequest.class, ListClassroomMemberJobsResponse.class)
                .withUri("/v3/classrooms/{classroom_id}/jobs");

        // requests
        builder.withRequestField("classroom_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListClassroomMemberJobsRequest::getClassroomId, (req, v) -> {
                    req.setClassroomId(v);
                })
        );
        builder.withRequestField("member_id",
                LocationType.Query,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListClassroomMemberJobsRequest::getMemberId, (req, v) -> {
                    req.setMemberId(v);
                })
        );
        builder.withRequestField("offset",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListClassroomMemberJobsRequest::getOffset, (req, v) -> {
                    req.setOffset(v);
                })
        );
        builder.withRequestField("limit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListClassroomMemberJobsRequest::getLimit, (req, v) -> {
                    req.setLimit(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListJobsRequest, ListJobsResponse> listJobs = genForlistJobs();

    private static HttpRequestDef<ListJobsRequest, ListJobsResponse> genForlistJobs() {
        // basic
        HttpRequestDef.Builder<ListJobsRequest, ListJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobsRequest.class, ListJobsResponse.class)
                .withUri("/v3/jobs");

        // requests
        builder.withRequestField("source_from",
                LocationType.Query,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListJobsRequest::getSourceFrom, (req, v) -> {
                    req.setSourceFrom(v);
                })
        );
        builder.withRequestField("source_id",
                LocationType.Query,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListJobsRequest::getSourceId, (req, v) -> {
                    req.setSourceId(v);
                })
        );
        builder.withRequestField("offset",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListJobsRequest::getOffset, (req, v) -> {
                    req.setOffset(v);
                })
        );
        builder.withRequestField("limit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListJobsRequest::getLimit, (req, v) -> {
                    req.setLimit(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListMemberJobRecordsRequest, ListMemberJobRecordsResponse> listMemberJobRecords = genForlistMemberJobRecords();

    private static HttpRequestDef<ListMemberJobRecordsRequest, ListMemberJobRecordsResponse> genForlistMemberJobRecords() {
        // basic
        HttpRequestDef.Builder<ListMemberJobRecordsRequest, ListMemberJobRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMemberJobRecordsRequest.class, ListMemberJobRecordsResponse.class)
                .withUri("/v3/jobs/{job_id}/exercises/{exercise_id}/records");

        // requests
        builder.withRequestField("job_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListMemberJobRecordsRequest::getJobId, (req, v) -> {
                    req.setJobId(v);
                })
        );
        builder.withRequestField("exercise_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListMemberJobRecordsRequest::getExerciseId, (req, v) -> {
                    req.setExerciseId(v);
                })
        );
        builder.withRequestField("member_id",
                LocationType.Query,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListMemberJobRecordsRequest::getMemberId, (req, v) -> {
                    req.setMemberId(v);
                })
        );
        builder.withRequestField("offset",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListMemberJobRecordsRequest::getOffset, (req, v) -> {
                    req.setOffset(v);
                })
        );
        builder.withRequestField("limit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListMemberJobRecordsRequest::getLimit, (req, v) -> {
                    req.setLimit(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetail = genForshowJobDetail();

    private static HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> genForshowJobDetail() {
        // basic
        HttpRequestDef.Builder<ShowJobDetailRequest, ShowJobDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobDetailRequest.class, ShowJobDetailResponse.class)
                .withUri("/v3/jobs/{job_id}");

        // requests
        builder.withRequestField("job_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowJobDetailRequest::getJobId, (req, v) -> {
                    req.setJobId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ShowJobExercisesRequest, ShowJobExercisesResponse> showJobExercises = genForshowJobExercises();

    private static HttpRequestDef<ShowJobExercisesRequest, ShowJobExercisesResponse> genForshowJobExercises() {
        // basic
        HttpRequestDef.Builder<ShowJobExercisesRequest, ShowJobExercisesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobExercisesRequest.class, ShowJobExercisesResponse.class)
                .withUri("/v3/jobs/{job_id}/exercises");

        // requests
        builder.withRequestField("job_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowJobExercisesRequest::getJobId, (req, v) -> {
                    req.setJobId(v);
                })
        );
        builder.withRequestField("source_from",
                LocationType.Query,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowJobExercisesRequest::getSourceFrom, (req, v) -> {
                    req.setSourceFrom(v);
                })
        );
        builder.withRequestField("source_id",
                LocationType.Query,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowJobExercisesRequest::getSourceId, (req, v) -> {
                    req.setSourceId(v);
                })
        );
        builder.withRequestField("offset",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ShowJobExercisesRequest::getOffset, (req, v) -> {
                    req.setOffset(v);
                })
        );
        builder.withRequestField("limit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ShowJobExercisesRequest::getLimit, (req, v) -> {
                    req.setLimit(v);
                })
        );

        // response

        return builder.build();

    }

}

