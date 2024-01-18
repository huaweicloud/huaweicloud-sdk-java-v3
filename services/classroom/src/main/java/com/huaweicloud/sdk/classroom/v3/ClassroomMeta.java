package com.huaweicloud.sdk.classroom.v3;

import com.huaweicloud.sdk.classroom.v3.model.ApplyJudgementRequest;
import com.huaweicloud.sdk.classroom.v3.model.ApplyJudgementResponse;
import com.huaweicloud.sdk.classroom.v3.model.ExecuteExerciseRequest;
import com.huaweicloud.sdk.classroom.v3.model.ExecuteExerciseResponse;
import com.huaweicloud.sdk.classroom.v3.model.ExercisesListRequestBody;
import com.huaweicloud.sdk.classroom.v3.model.JudgementTaskRequestBody;
import com.huaweicloud.sdk.classroom.v3.model.KnowledgePointsListRequestBody;
import com.huaweicloud.sdk.classroom.v3.model.ListAllDifficultsRequest;
import com.huaweicloud.sdk.classroom.v3.model.ListAllDifficultsResponse;
import com.huaweicloud.sdk.classroom.v3.model.ListClassroomMemberJobsRequest;
import com.huaweicloud.sdk.classroom.v3.model.ListClassroomMemberJobsResponse;
import com.huaweicloud.sdk.classroom.v3.model.ListClassroomMembersRequest;
import com.huaweicloud.sdk.classroom.v3.model.ListClassroomMembersResponse;
import com.huaweicloud.sdk.classroom.v3.model.ListClassroomsRequest;
import com.huaweicloud.sdk.classroom.v3.model.ListClassroomsResponse;
import com.huaweicloud.sdk.classroom.v3.model.ListExercisesRequest;
import com.huaweicloud.sdk.classroom.v3.model.ListExercisesResponse;
import com.huaweicloud.sdk.classroom.v3.model.ListJobsRequest;
import com.huaweicloud.sdk.classroom.v3.model.ListJobsResponse;
import com.huaweicloud.sdk.classroom.v3.model.ListMemberJobRecordsRequest;
import com.huaweicloud.sdk.classroom.v3.model.ListMemberJobRecordsResponse;
import com.huaweicloud.sdk.classroom.v3.model.ListMyKnowledgePointsRequest;
import com.huaweicloud.sdk.classroom.v3.model.ListMyKnowledgePointsResponse;
import com.huaweicloud.sdk.classroom.v3.model.ListPackagesRequest;
import com.huaweicloud.sdk.classroom.v3.model.ListPackagesResponse;
import com.huaweicloud.sdk.classroom.v3.model.PackageExerciseJudgeRequestBody;
import com.huaweicloud.sdk.classroom.v3.model.PackagesListRequestBody;
import com.huaweicloud.sdk.classroom.v3.model.ShowClassroomDetailRequest;
import com.huaweicloud.sdk.classroom.v3.model.ShowClassroomDetailResponse;
import com.huaweicloud.sdk.classroom.v3.model.ShowExerciseDetailRequest;
import com.huaweicloud.sdk.classroom.v3.model.ShowExerciseDetailResponse;
import com.huaweicloud.sdk.classroom.v3.model.ShowJobDetailRequest;
import com.huaweicloud.sdk.classroom.v3.model.ShowJobDetailResponse;
import com.huaweicloud.sdk.classroom.v3.model.ShowJobExercisesRequest;
import com.huaweicloud.sdk.classroom.v3.model.ShowJobExercisesResponse;
import com.huaweicloud.sdk.classroom.v3.model.ShowJudgementDetailRequest;
import com.huaweicloud.sdk.classroom.v3.model.ShowJudgementDetailResponse;
import com.huaweicloud.sdk.classroom.v3.model.ShowJudgementFileRequest;
import com.huaweicloud.sdk.classroom.v3.model.ShowJudgementFileResponse;
import com.huaweicloud.sdk.classroom.v3.model.ShowPackageDetailRequest;
import com.huaweicloud.sdk.classroom.v3.model.ShowPackageDetailResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class ClassroomMeta {

    public static final HttpRequestDef<ApplyJudgementRequest, ApplyJudgementResponse> applyJudgement =
        genForApplyJudgement();

    private static HttpRequestDef<ApplyJudgementRequest, ApplyJudgementResponse> genForApplyJudgement() {
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
            f -> f.withMarshaller(ApplyJudgementRequest::getBody, ApplyJudgementRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJudgementDetailRequest, ShowJudgementDetailResponse> showJudgementDetail =
        genForShowJudgementDetail();

    private static HttpRequestDef<ShowJudgementDetailRequest, ShowJudgementDetailResponse> genForShowJudgementDetail() {
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
            f -> f.withMarshaller(ShowJudgementDetailRequest::getJudgementId,
                ShowJudgementDetailRequest::setJudgementId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJudgementFileRequest, ShowJudgementFileResponse> showJudgementFile =
        genForShowJudgementFile();

    private static HttpRequestDef<ShowJudgementFileRequest, ShowJudgementFileResponse> genForShowJudgementFile() {
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
            f -> f.withMarshaller(ShowJudgementFileRequest::getFileId, ShowJudgementFileRequest::setFileId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteExerciseRequest, ExecuteExerciseResponse> executeExercise =
        genForExecuteExercise();

    private static HttpRequestDef<ExecuteExerciseRequest, ExecuteExerciseResponse> genForExecuteExercise() {
        // basic
        HttpRequestDef.Builder<ExecuteExerciseRequest, ExecuteExerciseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteExerciseRequest.class, ExecuteExerciseResponse.class)
                .withName("ExecuteExercise")
                .withUri("/v1/assemble/exercise/{exercise_id}/judge")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("exercise_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteExerciseRequest::getExerciseId, ExecuteExerciseRequest::setExerciseId));
        builder.<String>withRequestField("user-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteExerciseRequest::getUserToken, ExecuteExerciseRequest::setUserToken));
        builder.<PackageExerciseJudgeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PackageExerciseJudgeRequestBody.class),
            f -> f.withMarshaller(ExecuteExerciseRequest::getBody, ExecuteExerciseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListExercisesRequest, ListExercisesResponse> listExercises =
        genForListExercises();

    private static HttpRequestDef<ListExercisesRequest, ListExercisesResponse> genForListExercises() {
        // basic
        HttpRequestDef.Builder<ListExercisesRequest, ListExercisesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListExercisesRequest.class, ListExercisesResponse.class)
                .withName("ListExercises")
                .withUri("/v1/assemble/package/{package_id}/exercise/list")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("package_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExercisesRequest::getPackageId, ListExercisesRequest::setPackageId));
        builder.<ExercisesListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExercisesListRequestBody.class),
            f -> f.withMarshaller(ListExercisesRequest::getBody, ListExercisesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPackagesRequest, ListPackagesResponse> listPackages = genForListPackages();

    private static HttpRequestDef<ListPackagesRequest, ListPackagesResponse> genForListPackages() {
        // basic
        HttpRequestDef.Builder<ListPackagesRequest, ListPackagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListPackagesRequest.class, ListPackagesResponse.class)
                .withName("ListPackages")
                .withUri("/v1/assemble/package/list")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<PackagesListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PackagesListRequestBody.class),
            f -> f.withMarshaller(ListPackagesRequest::getBody, ListPackagesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExerciseDetailRequest, ShowExerciseDetailResponse> showExerciseDetail =
        genForShowExerciseDetail();

    private static HttpRequestDef<ShowExerciseDetailRequest, ShowExerciseDetailResponse> genForShowExerciseDetail() {
        // basic
        HttpRequestDef.Builder<ShowExerciseDetailRequest, ShowExerciseDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowExerciseDetailRequest.class, ShowExerciseDetailResponse.class)
                .withName("ShowExerciseDetail")
                .withUri("/v1/assemble/exercise/{exercise_id}/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("exercise_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExerciseDetailRequest::getExerciseId, ShowExerciseDetailRequest::setExerciseId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPackageDetailRequest, ShowPackageDetailResponse> showPackageDetail =
        genForShowPackageDetail();

    private static HttpRequestDef<ShowPackageDetailRequest, ShowPackageDetailResponse> genForShowPackageDetail() {
        // basic
        HttpRequestDef.Builder<ShowPackageDetailRequest, ShowPackageDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPackageDetailRequest.class, ShowPackageDetailResponse.class)
                .withName("ShowPackageDetail")
                .withUri("/v1/assemble/package/{package_id}/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("package_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPackageDetailRequest::getPackageId, ShowPackageDetailRequest::setPackageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllDifficultsRequest, ListAllDifficultsResponse> listAllDifficults =
        genForListAllDifficults();

    private static HttpRequestDef<ListAllDifficultsRequest, ListAllDifficultsResponse> genForListAllDifficults() {
        // basic
        HttpRequestDef.Builder<ListAllDifficultsRequest, ListAllDifficultsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllDifficultsRequest.class, ListAllDifficultsResponse.class)
                .withName("ListAllDifficults")
                .withUri("/v1/baseresource/extend-resource/difficult/all")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMyKnowledgePointsRequest, ListMyKnowledgePointsResponse> listMyKnowledgePoints =
        genForListMyKnowledgePoints();

    private static HttpRequestDef<ListMyKnowledgePointsRequest, ListMyKnowledgePointsResponse> genForListMyKnowledgePoints() {
        // basic
        HttpRequestDef.Builder<ListMyKnowledgePointsRequest, ListMyKnowledgePointsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListMyKnowledgePointsRequest.class, ListMyKnowledgePointsResponse.class)
            .withName("ListMyKnowledgePoints")
            .withUri("/v1/baseresource/extend-resource/knowledge-point/mine")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<KnowledgePointsListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KnowledgePointsListRequestBody.class),
            f -> f.withMarshaller(ListMyKnowledgePointsRequest::getBody, ListMyKnowledgePointsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClassroomMembersRequest, ListClassroomMembersResponse> listClassroomMembers =
        genForListClassroomMembers();

    private static HttpRequestDef<ListClassroomMembersRequest, ListClassroomMembersResponse> genForListClassroomMembers() {
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
            f -> f.withMarshaller(ListClassroomMembersRequest::getClassroomId,
                ListClassroomMembersRequest::setClassroomId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClassroomMembersRequest::getOffset, ListClassroomMembersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClassroomMembersRequest::getLimit, ListClassroomMembersRequest::setLimit));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClassroomMembersRequest::getFilter, ListClassroomMembersRequest::setFilter));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClassroomsRequest, ListClassroomsResponse> listClassrooms =
        genForListClassrooms();

    private static HttpRequestDef<ListClassroomsRequest, ListClassroomsResponse> genForListClassrooms() {
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
            f -> f.withMarshaller(ListClassroomsRequest::getOffset, ListClassroomsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClassroomsRequest::getLimit, ListClassroomsRequest::setLimit));
        builder.<String>withRequestField("query_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClassroomsRequest::getQueryType, ListClassroomsRequest::setQueryType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClassroomDetailRequest, ShowClassroomDetailResponse> showClassroomDetail =
        genForShowClassroomDetail();

    private static HttpRequestDef<ShowClassroomDetailRequest, ShowClassroomDetailResponse> genForShowClassroomDetail() {
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
            f -> f.withMarshaller(ShowClassroomDetailRequest::getClassroomId,
                ShowClassroomDetailRequest::setClassroomId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClassroomMemberJobsRequest, ListClassroomMemberJobsResponse> listClassroomMemberJobs =
        genForListClassroomMemberJobs();

    private static HttpRequestDef<ListClassroomMemberJobsRequest, ListClassroomMemberJobsResponse> genForListClassroomMemberJobs() {
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
            f -> f.withMarshaller(ListClassroomMemberJobsRequest::getClassroomId,
                ListClassroomMemberJobsRequest::setClassroomId));
        builder.<String>withRequestField("member_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClassroomMemberJobsRequest::getMemberId,
                ListClassroomMemberJobsRequest::setMemberId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClassroomMemberJobsRequest::getOffset,
                ListClassroomMemberJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClassroomMemberJobsRequest::getLimit, ListClassroomMemberJobsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobsRequest, ListJobsResponse> listJobs = genForListJobs();

    private static HttpRequestDef<ListJobsRequest, ListJobsResponse> genForListJobs() {
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
            f -> f.withMarshaller(ListJobsRequest::getSourceFrom, ListJobsRequest::setSourceFrom));
        builder.<String>withRequestField("source_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getSourceId, ListJobsRequest::setSourceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobsRequest::getOffset, ListJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobsRequest::getLimit, ListJobsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMemberJobRecordsRequest, ListMemberJobRecordsResponse> listMemberJobRecords =
        genForListMemberJobRecords();

    private static HttpRequestDef<ListMemberJobRecordsRequest, ListMemberJobRecordsResponse> genForListMemberJobRecords() {
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
            f -> f.withMarshaller(ListMemberJobRecordsRequest::getJobId, ListMemberJobRecordsRequest::setJobId));
        builder.<String>withRequestField("exercise_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMemberJobRecordsRequest::getExerciseId,
                ListMemberJobRecordsRequest::setExerciseId));
        builder.<String>withRequestField("member_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMemberJobRecordsRequest::getMemberId, ListMemberJobRecordsRequest::setMemberId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMemberJobRecordsRequest::getOffset, ListMemberJobRecordsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMemberJobRecordsRequest::getLimit, ListMemberJobRecordsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetail =
        genForShowJobDetail();

    private static HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> genForShowJobDetail() {
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
            f -> f.withMarshaller(ShowJobDetailRequest::getJobId, ShowJobDetailRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobExercisesRequest, ShowJobExercisesResponse> showJobExercises =
        genForShowJobExercises();

    private static HttpRequestDef<ShowJobExercisesRequest, ShowJobExercisesResponse> genForShowJobExercises() {
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
            f -> f.withMarshaller(ShowJobExercisesRequest::getJobId, ShowJobExercisesRequest::setJobId));
        builder.<String>withRequestField("source_from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExercisesRequest::getSourceFrom, ShowJobExercisesRequest::setSourceFrom));
        builder.<String>withRequestField("source_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExercisesRequest::getSourceId, ShowJobExercisesRequest::setSourceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobExercisesRequest::getOffset, ShowJobExercisesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobExercisesRequest::getLimit, ShowJobExercisesRequest::setLimit));

        // response

        return builder.build();
    }

}
