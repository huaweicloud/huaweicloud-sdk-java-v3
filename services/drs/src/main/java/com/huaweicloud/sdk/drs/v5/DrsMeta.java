package com.huaweicloud.sdk.drs.v5;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.drs.v5.model.BatchAddTagReq;
import com.huaweicloud.sdk.drs.v5.model.BatchAsyncCreateJobReq;
import com.huaweicloud.sdk.drs.v5.model.BatchAsyncUpdateJobReq;
import com.huaweicloud.sdk.drs.v5.model.BatchCreateJobsAsyncRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchCreateJobsAsyncResponse;
import com.huaweicloud.sdk.drs.v5.model.BatchCreateTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchCreateTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.BatchDealResourceTagReq;
import com.huaweicloud.sdk.drs.v5.model.BatchDeleteJobReq;
import com.huaweicloud.sdk.drs.v5.model.BatchDeleteJobsByIdRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchDeleteJobsByIdResponse;
import com.huaweicloud.sdk.drs.v5.model.BatchDeleteTagReq;
import com.huaweicloud.sdk.drs.v5.model.BatchDeleteTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchDeleteTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.BatchExecuteJobActionsRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchExecuteJobActionsResponse;
import com.huaweicloud.sdk.drs.v5.model.BatchJobActionReq;
import com.huaweicloud.sdk.drs.v5.model.BatchStopJobActionReq;
import com.huaweicloud.sdk.drs.v5.model.BatchStopJobsActionRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchStopJobsActionResponse;
import com.huaweicloud.sdk.drs.v5.model.BatchTagActionRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchTagActionResponse;
import com.huaweicloud.sdk.drs.v5.model.CheckDataFilterRequest;
import com.huaweicloud.sdk.drs.v5.model.CheckDataFilterResponse;
import com.huaweicloud.sdk.drs.v5.model.CheckJobNameReq;
import com.huaweicloud.sdk.drs.v5.model.CloneJobReq;
import com.huaweicloud.sdk.drs.v5.model.CollectColumnsRequest;
import com.huaweicloud.sdk.drs.v5.model.CollectColumnsResponse;
import com.huaweicloud.sdk.drs.v5.model.CollectDbObjectsAsyncRequest;
import com.huaweicloud.sdk.drs.v5.model.CollectDbObjectsAsyncResponse;
import com.huaweicloud.sdk.drs.v5.model.CollectDbObjectsInfoRequest;
import com.huaweicloud.sdk.drs.v5.model.CollectDbObjectsInfoResponse;
import com.huaweicloud.sdk.drs.v5.model.CollectPositionAsyncRequest;
import com.huaweicloud.sdk.drs.v5.model.CollectPositionAsyncResponse;
import com.huaweicloud.sdk.drs.v5.model.CommitAsyncJobRequest;
import com.huaweicloud.sdk.drs.v5.model.CommitAsyncJobResponse;
import com.huaweicloud.sdk.drs.v5.model.CopyJobRequest;
import com.huaweicloud.sdk.drs.v5.model.CopyJobResponse;
import com.huaweicloud.sdk.drs.v5.model.CountInstanceByTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.CountInstanceByTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.CreateJobRequest;
import com.huaweicloud.sdk.drs.v5.model.CreateJobResponse;
import com.huaweicloud.sdk.drs.v5.model.DataProcessReq;
import com.huaweicloud.sdk.drs.v5.model.DeleteDriverReq;
import com.huaweicloud.sdk.drs.v5.model.DeleteJdbcDriverRequest;
import com.huaweicloud.sdk.drs.v5.model.DeleteJdbcDriverResponse;
import com.huaweicloud.sdk.drs.v5.model.DeleteJobRequest;
import com.huaweicloud.sdk.drs.v5.model.DeleteJobResponse;
import com.huaweicloud.sdk.drs.v5.model.DownloadBatchCreateTemplateRequest;
import com.huaweicloud.sdk.drs.v5.model.DownloadBatchCreateTemplateResponse;
import com.huaweicloud.sdk.drs.v5.model.DownloadDbObjectTemplateRequest;
import com.huaweicloud.sdk.drs.v5.model.DownloadDbObjectTemplateResponse;
import com.huaweicloud.sdk.drs.v5.model.ExecuteJobActionRequest;
import com.huaweicloud.sdk.drs.v5.model.ExecuteJobActionResponse;
import com.huaweicloud.sdk.drs.v5.model.ExportOperationInfoRequest;
import com.huaweicloud.sdk.drs.v5.model.ExportOperationInfoResponse;
import com.huaweicloud.sdk.drs.v5.model.ImportBatchCreateJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.ImportBatchCreateJobsRequestBody;
import com.huaweicloud.sdk.drs.v5.model.ImportBatchCreateJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.JobActionReq;
import com.huaweicloud.sdk.drs.v5.model.ListAsyncJobDetailRequest;
import com.huaweicloud.sdk.drs.v5.model.ListAsyncJobDetailResponse;
import com.huaweicloud.sdk.drs.v5.model.ListAsyncJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListAsyncJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListDbObjectsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListDbObjectsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListInstanceByTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListInstanceByTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListJdbcDriversRequest;
import com.huaweicloud.sdk.drs.v5.model.ListJdbcDriversResponse;
import com.huaweicloud.sdk.drs.v5.model.ListJobHistoryParametersRequest;
import com.huaweicloud.sdk.drs.v5.model.ListJobHistoryParametersResponse;
import com.huaweicloud.sdk.drs.v5.model.ListJobParametersRequest;
import com.huaweicloud.sdk.drs.v5.model.ListJobParametersResponse;
import com.huaweicloud.sdk.drs.v5.model.ListJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListLinksRequest;
import com.huaweicloud.sdk.drs.v5.model.ListLinksResponse;
import com.huaweicloud.sdk.drs.v5.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.ModifyParameterReq;
import com.huaweicloud.sdk.drs.v5.model.ModifyStartPositionReq;
import com.huaweicloud.sdk.drs.v5.model.QueryColumnReq;
import com.huaweicloud.sdk.drs.v5.model.QueryDbPositionReq;
import com.huaweicloud.sdk.drs.v5.model.QueryInstanceByTagReq;
import com.huaweicloud.sdk.drs.v5.model.QuerySelectObjectInfoReq;
import com.huaweicloud.sdk.drs.v5.model.QueryUserSelectedObjectInfoReq;
import com.huaweicloud.sdk.drs.v5.model.ShowActionsRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowActionsResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowColumnInfoResultRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowColumnInfoResultResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowComparePolicyRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowComparePolicyResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDataFilteringResultRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDataFilteringResultResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDataProcessingRulesResultRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDataProcessingRulesResultResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDataProgressRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDataProgressResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectCollectionStatusRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectCollectionStatusResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectTemplateProgressRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectTemplateProgressResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectTemplateResultRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectTemplateResultResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectsListRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectsListResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDirtyDataRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDirtyDataResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowEnterpriseProjectRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowEnterpriseProjectResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowHealthCompareJobListRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowHealthCompareJobListResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowIncrementComponentsDetailRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowIncrementComponentsDetailResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowInstanceTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowInstanceTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowJobDetailRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowJobDetailResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowMeteringRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowMeteringResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowMonitorDataRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowMonitorDataResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowObjectMappingRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowObjectMappingResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowPositionResultRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowPositionResultResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowProgressDataRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowProgressDataResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowSupportObjectTypeRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowSupportObjectTypeResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowUpdateObjectSavingStatusRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowUpdateObjectSavingStatusResponse;
import com.huaweicloud.sdk.drs.v5.model.SingleCreateJobReq;
import com.huaweicloud.sdk.drs.v5.model.SingleUpdateJobReq;
import com.huaweicloud.sdk.drs.v5.model.StopJobActionReq;
import com.huaweicloud.sdk.drs.v5.model.StopJobActionRequest;
import com.huaweicloud.sdk.drs.v5.model.StopJobActionResponse;
import com.huaweicloud.sdk.drs.v5.model.SyncJdbcDriverRequest;
import com.huaweicloud.sdk.drs.v5.model.SyncJdbcDriverResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateBatchAsyncJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateBatchAsyncJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateDataProgressRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateDataProgressResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateDriverReq;
import com.huaweicloud.sdk.drs.v5.model.UpdateJobConfigurationsRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateJobConfigurationsResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateJobRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateJobResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateStartPositionRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateStartPositionResponse;
import com.huaweicloud.sdk.drs.v5.model.UploadDbObjectTemplateRequest;
import com.huaweicloud.sdk.drs.v5.model.UploadDbObjectTemplateRequestBody;
import com.huaweicloud.sdk.drs.v5.model.UploadDbObjectTemplateResponse;
import com.huaweicloud.sdk.drs.v5.model.UploadJdbcDriverRequest;
import com.huaweicloud.sdk.drs.v5.model.UploadJdbcDriverRequestBody;
import com.huaweicloud.sdk.drs.v5.model.UploadJdbcDriverResponse;
import com.huaweicloud.sdk.drs.v5.model.ValidateJobNameRequest;
import com.huaweicloud.sdk.drs.v5.model.ValidateJobNameResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class DrsMeta {

    public static final HttpRequestDef<BatchCreateJobsAsyncRequest, BatchCreateJobsAsyncResponse> batchCreateJobsAsync =
        genForbatchCreateJobsAsync();

    private static HttpRequestDef<BatchCreateJobsAsyncRequest, BatchCreateJobsAsyncResponse> genForbatchCreateJobsAsync() {
        // basic
        HttpRequestDef.Builder<BatchCreateJobsAsyncRequest, BatchCreateJobsAsyncResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateJobsAsyncRequest.class, BatchCreateJobsAsyncResponse.class)
            .withName("BatchCreateJobsAsync")
            .withUri("/v5/{project_id}/jobs/batch-async-create")
            .withContentType("application/json");

        // requests
        builder.<BatchCreateJobsAsyncRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchCreateJobsAsyncRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchCreateJobsAsyncRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<BatchAsyncCreateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAsyncCreateJobReq.class),
            f -> f.withMarshaller(BatchCreateJobsAsyncRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateTagsRequest, BatchCreateTagsResponse> batchCreateTags =
        genForbatchCreateTags();

    private static HttpRequestDef<BatchCreateTagsRequest, BatchCreateTagsResponse> genForbatchCreateTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateTagsRequest, BatchCreateTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateTagsRequest.class, BatchCreateTagsResponse.class)
                .withName("BatchCreateTags")
                .withUri("/v5/{project_id}/{resource_type}/{resource_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<BatchCreateTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<BatchCreateTagsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchCreateTagsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<BatchAddTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddTagReq.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteJobsByIdRequest, BatchDeleteJobsByIdResponse> batchDeleteJobsById =
        genForbatchDeleteJobsById();

    private static HttpRequestDef<BatchDeleteJobsByIdRequest, BatchDeleteJobsByIdResponse> genForbatchDeleteJobsById() {
        // basic
        HttpRequestDef.Builder<BatchDeleteJobsByIdRequest, BatchDeleteJobsByIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteJobsByIdRequest.class, BatchDeleteJobsByIdResponse.class)
            .withName("BatchDeleteJobsById")
            .withUri("/v5/{project_id}/jobs")
            .withContentType("application/json");

        // requests
        builder.<BatchDeleteJobsByIdRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchDeleteJobsByIdRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchDeleteJobsByIdRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<BatchDeleteJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteJobReq.class),
            f -> f.withMarshaller(BatchDeleteJobsByIdRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTags =
        genForbatchDeleteTags();

    private static HttpRequestDef<BatchDeleteTagsRequest, BatchDeleteTagsResponse> genForbatchDeleteTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteTagsRequest, BatchDeleteTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteTagsRequest.class, BatchDeleteTagsResponse.class)
                .withName("BatchDeleteTags")
                .withUri("/v5/{project_id}/{resource_type}/{resource_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<BatchDeleteTagsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchDeleteTagsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<BatchDeleteTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteTagReq.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchExecuteJobActionsRequest, BatchExecuteJobActionsResponse> batchExecuteJobActions =
        genForbatchExecuteJobActions();

    private static HttpRequestDef<BatchExecuteJobActionsRequest, BatchExecuteJobActionsResponse> genForbatchExecuteJobActions() {
        // basic
        HttpRequestDef.Builder<BatchExecuteJobActionsRequest, BatchExecuteJobActionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchExecuteJobActionsRequest.class, BatchExecuteJobActionsResponse.class)
            .withName("BatchExecuteJobActions")
            .withUri("/v5/{project_id}/jobs/action")
            .withContentType("application/json");

        // requests
        builder.<BatchExecuteJobActionsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchExecuteJobActionsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchExecuteJobActionsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<BatchJobActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchJobActionReq.class),
            f -> f.withMarshaller(BatchExecuteJobActionsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStopJobsActionRequest, BatchStopJobsActionResponse> batchStopJobsAction =
        genForbatchStopJobsAction();

    private static HttpRequestDef<BatchStopJobsActionRequest, BatchStopJobsActionResponse> genForbatchStopJobsAction() {
        // basic
        HttpRequestDef.Builder<BatchStopJobsActionRequest, BatchStopJobsActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchStopJobsActionRequest.class, BatchStopJobsActionResponse.class)
                .withName("BatchStopJobsAction")
                .withUri("/v5/{project_id}/jobs/batch-stop")
                .withContentType("application/json");

        // requests
        builder.<BatchStopJobsActionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchStopJobsActionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchStopJobsActionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<BatchStopJobActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchStopJobActionReq.class),
            f -> f.withMarshaller(BatchStopJobsActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchTagActionRequest, BatchTagActionResponse> batchTagAction =
        genForbatchTagAction();

    private static HttpRequestDef<BatchTagActionRequest, BatchTagActionResponse> genForbatchTagAction() {
        // basic
        HttpRequestDef.Builder<BatchTagActionRequest, BatchTagActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchTagActionRequest.class, BatchTagActionResponse.class)
                .withName("BatchTagAction")
                .withUri("/v5/{project_id}/jobs/{resource_type}/{job_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchTagActionRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchTagActionRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<BatchTagActionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchTagActionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchTagActionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<BatchDealResourceTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDealResourceTagReq.class),
            f -> f.withMarshaller(BatchTagActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckDataFilterRequest, CheckDataFilterResponse> checkDataFilter =
        genForcheckDataFilter();

    private static HttpRequestDef<CheckDataFilterRequest, CheckDataFilterResponse> genForcheckDataFilter() {
        // basic
        HttpRequestDef.Builder<CheckDataFilterRequest, CheckDataFilterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckDataFilterRequest.class, CheckDataFilterResponse.class)
                .withName("CheckDataFilter")
                .withUri("/v5/{project_id}/job/{job_id}/data-filtering/check")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDataFilterRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<CheckDataFilterRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CheckDataFilterRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CheckDataFilterRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<DataProcessReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DataProcessReq.class),
            f -> f.withMarshaller(CheckDataFilterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CollectColumnsRequest, CollectColumnsResponse> collectColumns =
        genForcollectColumns();

    private static HttpRequestDef<CollectColumnsRequest, CollectColumnsResponse> genForcollectColumns() {
        // basic
        HttpRequestDef.Builder<CollectColumnsRequest, CollectColumnsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CollectColumnsRequest.class, CollectColumnsResponse.class)
                .withName("CollectColumns")
                .withUri("/v5/{project_id}/job/{job_id}/columns/collect")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectColumnsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<CollectColumnsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CollectColumnsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CollectColumnsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<QueryColumnReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryColumnReq.class),
            f -> f.withMarshaller(CollectColumnsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CollectDbObjectsAsyncRequest, CollectDbObjectsAsyncResponse> collectDbObjectsAsync =
        genForcollectDbObjectsAsync();

    private static HttpRequestDef<CollectDbObjectsAsyncRequest, CollectDbObjectsAsyncResponse> genForcollectDbObjectsAsync() {
        // basic
        HttpRequestDef.Builder<CollectDbObjectsAsyncRequest, CollectDbObjectsAsyncResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CollectDbObjectsAsyncRequest.class, CollectDbObjectsAsyncResponse.class)
            .withName("CollectDbObjectsAsync")
            .withUri("/v5/{project_id}/jobs/{job_id}/db-objects/collect")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectDbObjectsAsyncRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CollectDbObjectsAsyncRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CollectDbObjectsAsyncRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<CollectDbObjectsAsyncRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CollectDbObjectsAsyncRequest.TypeEnum.class),
            f -> f.withMarshaller(CollectDbObjectsAsyncRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<Boolean>withRequestField("is_refresh",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(CollectDbObjectsAsyncRequest::getIsRefresh, (req, v) -> {
                req.setIsRefresh(v);
            }));
        builder.<List<String>>withRequestField("db_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CollectDbObjectsAsyncRequest::getDbNames, (req, v) -> {
                req.setDbNames(v);
            }));
        builder.<CollectDbObjectsAsyncRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CollectDbObjectsAsyncRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CollectDbObjectsAsyncRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CollectDbObjectsInfoRequest, CollectDbObjectsInfoResponse> collectDbObjectsInfo =
        genForcollectDbObjectsInfo();

    private static HttpRequestDef<CollectDbObjectsInfoRequest, CollectDbObjectsInfoResponse> genForcollectDbObjectsInfo() {
        // basic
        HttpRequestDef.Builder<CollectDbObjectsInfoRequest, CollectDbObjectsInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CollectDbObjectsInfoRequest.class, CollectDbObjectsInfoResponse.class)
            .withName("CollectDbObjectsInfo")
            .withUri("/v5.1/{project_id}/jobs/{job_id}/db-objects/collect")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectDbObjectsInfoRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<CollectDbObjectsInfoRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CollectDbObjectsInfoRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CollectDbObjectsInfoRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<QuerySelectObjectInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QuerySelectObjectInfoReq.class),
            f -> f.withMarshaller(CollectDbObjectsInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CollectPositionAsyncRequest, CollectPositionAsyncResponse> collectPositionAsync =
        genForcollectPositionAsync();

    private static HttpRequestDef<CollectPositionAsyncRequest, CollectPositionAsyncResponse> genForcollectPositionAsync() {
        // basic
        HttpRequestDef.Builder<CollectPositionAsyncRequest, CollectPositionAsyncResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CollectPositionAsyncRequest.class, CollectPositionAsyncResponse.class)
            .withName("CollectPositionAsync")
            .withUri("/v5/{project_id}/jobs/{job_id}/collect-db-position")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectPositionAsyncRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<CollectPositionAsyncRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CollectPositionAsyncRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CollectPositionAsyncRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<QueryDbPositionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryDbPositionReq.class),
            f -> f.withMarshaller(CollectPositionAsyncRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CommitAsyncJobRequest, CommitAsyncJobResponse> commitAsyncJob =
        genForcommitAsyncJob();

    private static HttpRequestDef<CommitAsyncJobRequest, CommitAsyncJobResponse> genForcommitAsyncJob() {
        // basic
        HttpRequestDef.Builder<CommitAsyncJobRequest, CommitAsyncJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CommitAsyncJobRequest.class, CommitAsyncJobResponse.class)
                .withName("CommitAsyncJob")
                .withUri("/v5/{project_id}/batch-async-jobs/{async_job_id}/commit")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("async_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CommitAsyncJobRequest::getAsyncJobId, (req, v) -> {
                req.setAsyncJobId(v);
            }));
        builder.<CommitAsyncJobRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CommitAsyncJobRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CommitAsyncJobRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyJobRequest, CopyJobResponse> copyJob = genForcopyJob();

    private static HttpRequestDef<CopyJobRequest, CopyJobResponse> genForcopyJob() {
        // basic
        HttpRequestDef.Builder<CopyJobRequest, CopyJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyJobRequest.class, CopyJobResponse.class)
                .withName("CopyJob")
                .withUri("/v5/{project_id}/jobs/clone")
                .withContentType("application/json");

        // requests
        builder.<CopyJobRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CopyJobRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CopyJobRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CloneJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CloneJobReq.class),
            f -> f.withMarshaller(CopyJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountInstanceByTagsRequest, CountInstanceByTagsResponse> countInstanceByTags =
        genForcountInstanceByTags();

    private static HttpRequestDef<CountInstanceByTagsRequest, CountInstanceByTagsResponse> genForcountInstanceByTags() {
        // basic
        HttpRequestDef.Builder<CountInstanceByTagsRequest, CountInstanceByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CountInstanceByTagsRequest.class, CountInstanceByTagsResponse.class)
                .withName("CountInstanceByTags")
                .withUri("/v5/{project_id}/{resource_type}/resource-instances/count")
                .withContentType("application/json");

        // requests
        builder.<CountInstanceByTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CountInstanceByTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(CountInstanceByTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<CountInstanceByTagsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CountInstanceByTagsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CountInstanceByTagsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<QueryInstanceByTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryInstanceByTagReq.class),
            f -> f.withMarshaller(CountInstanceByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateJobRequest, CreateJobResponse> createJob = genForcreateJob();

    private static HttpRequestDef<CreateJobRequest, CreateJobResponse> genForcreateJob() {
        // basic
        HttpRequestDef.Builder<CreateJobRequest, CreateJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateJobRequest.class, CreateJobResponse.class)
                .withName("CreateJob")
                .withUri("/v5/{project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<CreateJobRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateJobRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateJobRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SingleCreateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SingleCreateJobReq.class),
            f -> f.withMarshaller(CreateJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteJdbcDriverRequest, DeleteJdbcDriverResponse> deleteJdbcDriver =
        genFordeleteJdbcDriver();

    private static HttpRequestDef<DeleteJdbcDriverRequest, DeleteJdbcDriverResponse> genFordeleteJdbcDriver() {
        // basic
        HttpRequestDef.Builder<DeleteJdbcDriverRequest, DeleteJdbcDriverResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteJdbcDriverRequest.class, DeleteJdbcDriverResponse.class)
                .withName("DeleteJdbcDriver")
                .withUri("/v5/{project_id}/jdbc-drivers")
                .withContentType("application/json");

        // requests
        builder.<DeleteJdbcDriverRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteJdbcDriverRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DeleteJdbcDriverRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<DeleteDriverReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteDriverReq.class),
            f -> f.withMarshaller(DeleteJdbcDriverRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteJobRequest, DeleteJobResponse> deleteJob = genFordeleteJob();

    private static HttpRequestDef<DeleteJobRequest, DeleteJobResponse> genFordeleteJob() {
        // basic
        HttpRequestDef.Builder<DeleteJobRequest, DeleteJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteJobRequest.class, DeleteJobResponse.class)
                .withName("DeleteJob")
                .withUri("/v5/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<DeleteJobRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteJobRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DeleteJobRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadBatchCreateTemplateRequest, DownloadBatchCreateTemplateResponse> downloadBatchCreateTemplate =
        genFordownloadBatchCreateTemplate();

    private static HttpRequestDef<DownloadBatchCreateTemplateRequest, DownloadBatchCreateTemplateResponse> genFordownloadBatchCreateTemplate() {
        // basic
        HttpRequestDef.Builder<DownloadBatchCreateTemplateRequest, DownloadBatchCreateTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    DownloadBatchCreateTemplateRequest.class,
                    DownloadBatchCreateTemplateResponse.class)
                .withName("DownloadBatchCreateTemplate")
                .withUri("/v5/{project_id}/jobs/template")
                .withContentType("application/json");

        // requests
        builder.<DownloadBatchCreateTemplateRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DownloadBatchCreateTemplateRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DownloadBatchCreateTemplateRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadDbObjectTemplateRequest, DownloadDbObjectTemplateResponse> downloadDbObjectTemplate =
        genFordownloadDbObjectTemplate();

    private static HttpRequestDef<DownloadDbObjectTemplateRequest, DownloadDbObjectTemplateResponse> genFordownloadDbObjectTemplate() {
        // basic
        HttpRequestDef.Builder<DownloadDbObjectTemplateRequest, DownloadDbObjectTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, DownloadDbObjectTemplateRequest.class, DownloadDbObjectTemplateResponse.class)
                .withName("DownloadDbObjectTemplate")
                .withUri("/v5/{project_id}/jobs/{job_id}/db-object/template")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadDbObjectTemplateRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<DownloadDbObjectTemplateRequest.FileImportDbLevelEnum>withRequestField("file_import_db_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DownloadDbObjectTemplateRequest.FileImportDbLevelEnum.class),
            f -> f.withMarshaller(DownloadDbObjectTemplateRequest::getFileImportDbLevel, (req, v) -> {
                req.setFileImportDbLevel(v);
            }));
        builder.<DownloadDbObjectTemplateRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DownloadDbObjectTemplateRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DownloadDbObjectTemplateRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteJobActionRequest, ExecuteJobActionResponse> executeJobAction =
        genForexecuteJobAction();

    private static HttpRequestDef<ExecuteJobActionRequest, ExecuteJobActionResponse> genForexecuteJobAction() {
        // basic
        HttpRequestDef.Builder<ExecuteJobActionRequest, ExecuteJobActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteJobActionRequest.class, ExecuteJobActionResponse.class)
                .withName("ExecuteJobAction")
                .withUri("/v5/{project_id}/jobs/{job_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteJobActionRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<ExecuteJobActionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExecuteJobActionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExecuteJobActionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<JobActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobActionReq.class),
            f -> f.withMarshaller(ExecuteJobActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportOperationInfoRequest, ExportOperationInfoResponse> exportOperationInfo =
        genForexportOperationInfo();

    private static HttpRequestDef<ExportOperationInfoRequest, ExportOperationInfoResponse> genForexportOperationInfo() {
        // basic
        HttpRequestDef.Builder<ExportOperationInfoRequest, ExportOperationInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportOperationInfoRequest.class, ExportOperationInfoResponse.class)
                .withName("ExportOperationInfo")
                .withUri("/v5/{project_id}/jobs/{job_id}/operation-statistics/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportOperationInfoRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<ExportOperationInfoRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportOperationInfoRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExportOperationInfoRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ExportOperationInfoResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ImportBatchCreateJobsRequest, ImportBatchCreateJobsResponse> importBatchCreateJobs =
        genForimportBatchCreateJobs();

    private static HttpRequestDef<ImportBatchCreateJobsRequest, ImportBatchCreateJobsResponse> genForimportBatchCreateJobs() {
        // basic
        HttpRequestDef.Builder<ImportBatchCreateJobsRequest, ImportBatchCreateJobsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ImportBatchCreateJobsRequest.class, ImportBatchCreateJobsResponse.class)
            .withName("ImportBatchCreateJobs")
            .withUri("/v5/{project_id}/jobs/template")
            .withContentType("multipart/form-data");

        // requests
        builder.<ImportBatchCreateJobsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ImportBatchCreateJobsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ImportBatchCreateJobsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ImportBatchCreateJobsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportBatchCreateJobsRequestBody.class),
            f -> f.withMarshaller(ImportBatchCreateJobsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAsyncJobDetailRequest, ListAsyncJobDetailResponse> listAsyncJobDetail =
        genForlistAsyncJobDetail();

    private static HttpRequestDef<ListAsyncJobDetailRequest, ListAsyncJobDetailResponse> genForlistAsyncJobDetail() {
        // basic
        HttpRequestDef.Builder<ListAsyncJobDetailRequest, ListAsyncJobDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAsyncJobDetailRequest.class, ListAsyncJobDetailResponse.class)
                .withName("ListAsyncJobDetail")
                .withUri("/v5/{project_id}/batch-async-jobs/{async_job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("async_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncJobDetailRequest::getAsyncJobId, (req, v) -> {
                req.setAsyncJobId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAsyncJobDetailRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAsyncJobDetailRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListAsyncJobDetailRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAsyncJobDetailRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListAsyncJobDetailRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAsyncJobsRequest, ListAsyncJobsResponse> listAsyncJobs =
        genForlistAsyncJobs();

    private static HttpRequestDef<ListAsyncJobsRequest, ListAsyncJobsResponse> genForlistAsyncJobs() {
        // basic
        HttpRequestDef.Builder<ListAsyncJobsRequest, ListAsyncJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAsyncJobsRequest.class, ListAsyncJobsResponse.class)
                .withName("ListAsyncJobs")
                .withUri("/v5/{project_id}/batch-async-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("async_job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncJobsRequest::getAsyncJobId, (req, v) -> {
                req.setAsyncJobId(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncJobsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncJobsRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncJobsRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAsyncJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAsyncJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncJobsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncJobsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<ListAsyncJobsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAsyncJobsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListAsyncJobsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDbObjectsRequest, ListDbObjectsResponse> listDbObjects =
        genForlistDbObjects();

    private static HttpRequestDef<ListDbObjectsRequest, ListDbObjectsResponse> genForlistDbObjects() {
        // basic
        HttpRequestDef.Builder<ListDbObjectsRequest, ListDbObjectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDbObjectsRequest.class, ListDbObjectsResponse.class)
                .withName("ListDbObjects")
                .withUri("/v5/{project_id}/jobs/{job_id}/db-objects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbObjectsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbObjectsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbObjectsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbObjectsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<List<String>>withRequestField("db_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDbObjectsRequest::getDbNames, (req, v) -> {
                req.setDbNames(v);
            }));
        builder.<ListDbObjectsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDbObjectsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListDbObjectsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceByTagsRequest, ListInstanceByTagsResponse> listInstanceByTags =
        genForlistInstanceByTags();

    private static HttpRequestDef<ListInstanceByTagsRequest, ListInstanceByTagsResponse> genForlistInstanceByTags() {
        // basic
        HttpRequestDef.Builder<ListInstanceByTagsRequest, ListInstanceByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListInstanceByTagsRequest.class, ListInstanceByTagsResponse.class)
                .withName("ListInstanceByTags")
                .withUri("/v5/{project_id}/{resource_type}/resource-instances/filter")
                .withContentType("application/json");

        // requests
        builder.<ListInstanceByTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstanceByTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListInstanceByTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceByTagsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceByTagsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<ListInstanceByTagsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceByTagsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListInstanceByTagsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<QueryInstanceByTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryInstanceByTagReq.class),
            f -> f.withMarshaller(ListInstanceByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTags =
        genForlistInstanceTags();

    private static HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> genForlistInstanceTags() {
        // basic
        HttpRequestDef.Builder<ListInstanceTagsRequest, ListInstanceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceTagsRequest.class, ListInstanceTagsResponse.class)
                .withName("ListInstanceTags")
                .withUri("/v5/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListInstanceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstanceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<ListInstanceTagsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceTagsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJdbcDriversRequest, ListJdbcDriversResponse> listJdbcDrivers =
        genForlistJdbcDrivers();

    private static HttpRequestDef<ListJdbcDriversRequest, ListJdbcDriversResponse> genForlistJdbcDrivers() {
        // basic
        HttpRequestDef.Builder<ListJdbcDriversRequest, ListJdbcDriversResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJdbcDriversRequest.class, ListJdbcDriversResponse.class)
                .withName("ListJdbcDrivers")
                .withUri("/v5/{project_id}/jdbc-drivers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJdbcDriversRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJdbcDriversRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<ListJdbcDriversRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListJdbcDriversRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListJdbcDriversRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobHistoryParametersRequest, ListJobHistoryParametersResponse> listJobHistoryParameters =
        genForlistJobHistoryParameters();

    private static HttpRequestDef<ListJobHistoryParametersRequest, ListJobHistoryParametersResponse> genForlistJobHistoryParameters() {
        // basic
        HttpRequestDef.Builder<ListJobHistoryParametersRequest, ListJobHistoryParametersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListJobHistoryParametersRequest.class, ListJobHistoryParametersResponse.class)
                .withName("ListJobHistoryParameters")
                .withUri("/v5/{project_id}/jobs/{job_id}/configuration-histories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobHistoryParametersRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobHistoryParametersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobHistoryParametersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobHistoryParametersRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobHistoryParametersRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobHistoryParametersRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobHistoryParametersRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobParametersRequest, ListJobParametersResponse> listJobParameters =
        genForlistJobParameters();

    private static HttpRequestDef<ListJobParametersRequest, ListJobParametersResponse> genForlistJobParameters() {
        // basic
        HttpRequestDef.Builder<ListJobParametersRequest, ListJobParametersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobParametersRequest.class, ListJobParametersResponse.class)
                .withName("ListJobParameters")
                .withUri("/v5/{project_id}/jobs/{job_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobParametersRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobParametersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobParametersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobParametersRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobParametersRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
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
                .withUri("/v5/{project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<ListJobsRequest.JobTypeEnum>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListJobsRequest.JobTypeEnum.class),
            f -> f.withMarshaller(ListJobsRequest::getJobType, (req, v) -> {
                req.setJobType(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<ListJobsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListJobsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListJobsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<ListJobsRequest.EngineTypeEnum>withRequestField("engine_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListJobsRequest.EngineTypeEnum.class),
            f -> f.withMarshaller(ListJobsRequest::getEngineType, (req, v) -> {
                req.setEngineType(v);
            }));
        builder.<ListJobsRequest.NetTypeEnum>withRequestField("net_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListJobsRequest.NetTypeEnum.class),
            f -> f.withMarshaller(ListJobsRequest::getNetType, (req, v) -> {
                req.setNetType(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
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
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<List<String>>withRequestField("instance_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListJobsRequest::getInstanceIds, (req, v) -> {
                req.setInstanceIds(v);
            }));
        builder.<String>withRequestField("instance_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getInstanceIp, (req, v) -> {
                req.setInstanceIp(v);
            }));
        builder.<ListJobsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListJobsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListJobsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLinksRequest, ListLinksResponse> listLinks = genForlistLinks();

    private static HttpRequestDef<ListLinksRequest, ListLinksResponse> genForlistLinks() {
        // basic
        HttpRequestDef.Builder<ListLinksRequest, ListLinksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLinksRequest.class, ListLinksResponse.class)
                .withName("ListLinks")
                .withUri("/v5/{project_id}/links")
                .withContentType("application/json");

        // requests
        builder.<ListLinksRequest.JobTypeEnum>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListLinksRequest.JobTypeEnum.class),
            f -> f.withMarshaller(ListLinksRequest::getJobType, (req, v) -> {
                req.setJobType(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLinksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLinksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListLinksRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListLinksRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListLinksRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTags =
        genForlistProjectTags();

    private static HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> genForlistProjectTags() {
        // basic
        HttpRequestDef.Builder<ListProjectTagsRequest, ListProjectTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectTagsRequest.class, ListProjectTagsResponse.class)
                .withName("ListProjectTags")
                .withUri("/v5/{project_id}/jobs/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListProjectTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListProjectTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<ListProjectTagsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProjectTagsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForlistTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForlistTags() {
        // basic
        HttpRequestDef.Builder<ListTagsRequest, ListTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsRequest.class, ListTagsResponse.class)
                .withName("ListTags")
                .withUri("/v5/{project_id}/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<ListTagsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTagsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListTagsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowActionsRequest, ShowActionsResponse> showActions = genForshowActions();

    private static HttpRequestDef<ShowActionsRequest, ShowActionsResponse> genForshowActions() {
        // basic
        HttpRequestDef.Builder<ShowActionsRequest, ShowActionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowActionsRequest.class, ShowActionsResponse.class)
                .withName("ShowActions")
                .withUri("/v5/{project_id}/jobs/{job_id}/actions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowActionsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<ShowActionsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowActionsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowActionsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowColumnInfoResultRequest, ShowColumnInfoResultResponse> showColumnInfoResult =
        genForshowColumnInfoResult();

    private static HttpRequestDef<ShowColumnInfoResultRequest, ShowColumnInfoResultResponse> genForshowColumnInfoResult() {
        // basic
        HttpRequestDef.Builder<ShowColumnInfoResultRequest, ShowColumnInfoResultResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowColumnInfoResultRequest.class, ShowColumnInfoResultResponse.class)
            .withName("ShowColumnInfoResult")
            .withUri("/v5/{project_id}/job/{job_id}/columns")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowColumnInfoResultRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("query_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowColumnInfoResultRequest::getQueryId, (req, v) -> {
                req.setQueryId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowColumnInfoResultRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowColumnInfoResultRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ShowColumnInfoResultRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowColumnInfoResultRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowColumnInfoResultRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComparePolicyRequest, ShowComparePolicyResponse> showComparePolicy =
        genForshowComparePolicy();

    private static HttpRequestDef<ShowComparePolicyRequest, ShowComparePolicyResponse> genForshowComparePolicy() {
        // basic
        HttpRequestDef.Builder<ShowComparePolicyRequest, ShowComparePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowComparePolicyRequest.class, ShowComparePolicyResponse.class)
                .withName("ShowComparePolicy")
                .withUri("/v5/{project_id}/jobs/{job_id}/compare-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComparePolicyRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<ShowComparePolicyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowComparePolicyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowComparePolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataFilteringResultRequest, ShowDataFilteringResultResponse> showDataFilteringResult =
        genForshowDataFilteringResult();

    private static HttpRequestDef<ShowDataFilteringResultRequest, ShowDataFilteringResultResponse> genForshowDataFilteringResult() {
        // basic
        HttpRequestDef.Builder<ShowDataFilteringResultRequest, ShowDataFilteringResultResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDataFilteringResultRequest.class, ShowDataFilteringResultResponse.class)
            .withName("ShowDataFilteringResult")
            .withUri("/v5/{project_id}/job/{job_id}/data-filtering/result")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataFilteringResultRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("query_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataFilteringResultRequest::getQueryId, (req, v) -> {
                req.setQueryId(v);
            }));
        builder.<ShowDataFilteringResultRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDataFilteringResultRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowDataFilteringResultRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataProcessingRulesResultRequest, ShowDataProcessingRulesResultResponse> showDataProcessingRulesResult =
        genForshowDataProcessingRulesResult();

    private static HttpRequestDef<ShowDataProcessingRulesResultRequest, ShowDataProcessingRulesResultResponse> genForshowDataProcessingRulesResult() {
        // basic
        HttpRequestDef.Builder<ShowDataProcessingRulesResultRequest, ShowDataProcessingRulesResultResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDataProcessingRulesResultRequest.class,
                    ShowDataProcessingRulesResultResponse.class)
                .withName("ShowDataProcessingRulesResult")
                .withUri("/v5/{project_id}/jobs/{job_id}/data-processing-rules/result")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataProcessingRulesResultRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("query_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataProcessingRulesResultRequest::getQueryId, (req, v) -> {
                req.setQueryId(v);
            }));
        builder.<ShowDataProcessingRulesResultRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDataProcessingRulesResultRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowDataProcessingRulesResultRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataProgressRequest, ShowDataProgressResponse> showDataProgress =
        genForshowDataProgress();

    private static HttpRequestDef<ShowDataProgressRequest, ShowDataProgressResponse> genForshowDataProgress() {
        // basic
        HttpRequestDef.Builder<ShowDataProgressRequest, ShowDataProgressResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDataProgressRequest.class, ShowDataProgressResponse.class)
                .withName("ShowDataProgress")
                .withUri("/v5/{project_id}/jobs/{job_id}/data-processing-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataProgressRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDataProgressRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDataProgressRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ShowDataProgressRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDataProgressRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowDataProgressRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDbObjectCollectionStatusRequest, ShowDbObjectCollectionStatusResponse> showDbObjectCollectionStatus =
        genForshowDbObjectCollectionStatus();

    private static HttpRequestDef<ShowDbObjectCollectionStatusRequest, ShowDbObjectCollectionStatusResponse> genForshowDbObjectCollectionStatus() {
        // basic
        HttpRequestDef.Builder<ShowDbObjectCollectionStatusRequest, ShowDbObjectCollectionStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDbObjectCollectionStatusRequest.class,
                    ShowDbObjectCollectionStatusResponse.class)
                .withName("ShowDbObjectCollectionStatus")
                .withUri("/v5/{project_id}/jobs/{job_id}/db-objects/collection-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDbObjectCollectionStatusRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("query_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDbObjectCollectionStatusRequest::getQueryId, (req, v) -> {
                req.setQueryId(v);
            }));
        builder.<ShowDbObjectCollectionStatusRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDbObjectCollectionStatusRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowDbObjectCollectionStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDbObjectTemplateProgressRequest, ShowDbObjectTemplateProgressResponse> showDbObjectTemplateProgress =
        genForshowDbObjectTemplateProgress();

    private static HttpRequestDef<ShowDbObjectTemplateProgressRequest, ShowDbObjectTemplateProgressResponse> genForshowDbObjectTemplateProgress() {
        // basic
        HttpRequestDef.Builder<ShowDbObjectTemplateProgressRequest, ShowDbObjectTemplateProgressResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDbObjectTemplateProgressRequest.class,
                    ShowDbObjectTemplateProgressResponse.class)
                .withName("ShowDbObjectTemplateProgress")
                .withUri("/v5/{project_id}/jobs/{job_id}/db-object/template/progress")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDbObjectTemplateProgressRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDbObjectTemplateProgressRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDbObjectTemplateProgressRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ShowDbObjectTemplateProgressRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDbObjectTemplateProgressRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowDbObjectTemplateProgressRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDbObjectTemplateResultRequest, ShowDbObjectTemplateResultResponse> showDbObjectTemplateResult =
        genForshowDbObjectTemplateResult();

    private static HttpRequestDef<ShowDbObjectTemplateResultRequest, ShowDbObjectTemplateResultResponse> genForshowDbObjectTemplateResult() {
        // basic
        HttpRequestDef.Builder<ShowDbObjectTemplateResultRequest, ShowDbObjectTemplateResultResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDbObjectTemplateResultRequest.class,
                    ShowDbObjectTemplateResultResponse.class)
                .withName("ShowDbObjectTemplateResult")
                .withUri("/v5/{project_id}/jobs/{job_id}/db-object/template/result")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDbObjectTemplateResultRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<ShowDbObjectTemplateResultRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowDbObjectTemplateResultRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowDbObjectTemplateResultRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<ShowDbObjectTemplateResultRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDbObjectTemplateResultRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowDbObjectTemplateResultRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDbObjectsListRequest, ShowDbObjectsListResponse> showDbObjectsList =
        genForshowDbObjectsList();

    private static HttpRequestDef<ShowDbObjectsListRequest, ShowDbObjectsListResponse> genForshowDbObjectsList() {
        // basic
        HttpRequestDef.Builder<ShowDbObjectsListRequest, ShowDbObjectsListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDbObjectsListRequest.class, ShowDbObjectsListResponse.class)
                .withName("ShowDbObjectsList")
                .withUri("/v5.1/{project_id}/jobs/{job_id}/db-object")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDbObjectsListRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDbObjectsListRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<ShowDbObjectsListRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDbObjectsListRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowDbObjectsListRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDirtyDataRequest, ShowDirtyDataResponse> showDirtyData =
        genForshowDirtyData();

    private static HttpRequestDef<ShowDirtyDataRequest, ShowDirtyDataResponse> genForshowDirtyData() {
        // basic
        HttpRequestDef.Builder<ShowDirtyDataRequest, ShowDirtyDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDirtyDataRequest.class, ShowDirtyDataResponse.class)
                .withName("ShowDirtyData")
                .withUri("/v5/{project_id}/jobs/{job_id}/dirty-data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDirtyDataRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDirtyDataRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDirtyDataRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDirtyDataRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDirtyDataRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ShowDirtyDataRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDirtyDataRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowDirtyDataRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse> showEnterpriseProject =
        genForshowEnterpriseProject();

    private static HttpRequestDef<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse> genForshowEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEnterpriseProjectRequest.class, ShowEnterpriseProjectResponse.class)
            .withName("ShowEnterpriseProject")
            .withUri("/v5/{project_id}/enterprise-projects")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowEnterpriseProjectRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowEnterpriseProjectRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnterpriseProjectRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnterpriseProjectRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<ShowEnterpriseProjectRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowEnterpriseProjectRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowEnterpriseProjectRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHealthCompareJobListRequest, ShowHealthCompareJobListResponse> showHealthCompareJobList =
        genForshowHealthCompareJobList();

    private static HttpRequestDef<ShowHealthCompareJobListRequest, ShowHealthCompareJobListResponse> genForshowHealthCompareJobList() {
        // basic
        HttpRequestDef.Builder<ShowHealthCompareJobListRequest, ShowHealthCompareJobListResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowHealthCompareJobListRequest.class, ShowHealthCompareJobListResponse.class)
                .withName("ShowHealthCompareJobList")
                .withUri("/v5/{project_id}/jobs/{job_id}/health-compare-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHealthCompareJobListRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<ShowHealthCompareJobListRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowHealthCompareJobListRequest.StatusEnum.class),
            f -> f.withMarshaller(ShowHealthCompareJobListRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHealthCompareJobListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHealthCompareJobListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ShowHealthCompareJobListRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowHealthCompareJobListRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowHealthCompareJobListRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIncrementComponentsDetailRequest, ShowIncrementComponentsDetailResponse> showIncrementComponentsDetail =
        genForshowIncrementComponentsDetail();

    private static HttpRequestDef<ShowIncrementComponentsDetailRequest, ShowIncrementComponentsDetailResponse> genForshowIncrementComponentsDetail() {
        // basic
        HttpRequestDef.Builder<ShowIncrementComponentsDetailRequest, ShowIncrementComponentsDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowIncrementComponentsDetailRequest.class,
                    ShowIncrementComponentsDetailResponse.class)
                .withName("ShowIncrementComponentsDetail")
                .withUri("/v5/{project_id}/jobs/{job_id}/increment-components-detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIncrementComponentsDetailRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<ShowIncrementComponentsDetailRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowIncrementComponentsDetailRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowIncrementComponentsDetailRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceTagsRequest, ShowInstanceTagsResponse> showInstanceTags =
        genForshowInstanceTags();

    private static HttpRequestDef<ShowInstanceTagsRequest, ShowInstanceTagsResponse> genForshowInstanceTags() {
        // basic
        HttpRequestDef.Builder<ShowInstanceTagsRequest, ShowInstanceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceTagsRequest.class, ShowInstanceTagsResponse.class)
                .withName("ShowInstanceTags")
                .withUri("/v5/{project_id}/jobs/{resource_type}/{job_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<ShowInstanceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowInstanceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ShowInstanceTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceTagsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<ShowInstanceTagsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowInstanceTagsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowInstanceTagsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
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
                .withUri("/v5/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<ShowJobDetailRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowJobDetailRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("query_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getQueryId, (req, v) -> {
                req.setQueryId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ShowJobDetailRequest.CompareTypeEnum>withRequestField("compare_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobDetailRequest.CompareTypeEnum.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getCompareType, (req, v) -> {
                req.setCompareType(v);
            }));
        builder.<ShowJobDetailRequest.QueryTypeEnum>withRequestField("query_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobDetailRequest.QueryTypeEnum.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getQueryType, (req, v) -> {
                req.setQueryType(v);
            }));
        builder.<ShowJobDetailRequest.ObjectTypeEnum>withRequestField("object_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobDetailRequest.ObjectTypeEnum.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getObjectType, (req, v) -> {
                req.setObjectType(v);
            }));
        builder.<String>withRequestField("compare_task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getCompareTaskId, (req, v) -> {
                req.setCompareTaskId(v);
            }));
        builder.<String>withRequestField("source_db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getSourceDbName, (req, v) -> {
                req.setSourceDbName(v);
            }));
        builder.<String>withRequestField("target_db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getTargetDbName, (req, v) -> {
                req.setTargetDbName(v);
            }));
        builder.<ShowJobDetailRequest.CompareDetailTypeEnum>withRequestField("compare_detail_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobDetailRequest.CompareDetailTypeEnum.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getCompareDetailType, (req, v) -> {
                req.setCompareDetailType(v);
            }));
        builder.<ShowJobDetailRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobDetailRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMeteringRequest, ShowMeteringResponse> showMetering = genForshowMetering();

    private static HttpRequestDef<ShowMeteringRequest, ShowMeteringResponse> genForshowMetering() {
        // basic
        HttpRequestDef.Builder<ShowMeteringRequest, ShowMeteringResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMeteringRequest.class, ShowMeteringResponse.class)
                .withName("ShowMetering")
                .withUri("/v5/{project_id}/jobs/{job_id}/metering")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeteringRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<ShowMeteringRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowMeteringRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowMeteringRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMonitorDataRequest, ShowMonitorDataResponse> showMonitorData =
        genForshowMonitorData();

    private static HttpRequestDef<ShowMonitorDataRequest, ShowMonitorDataResponse> genForshowMonitorData() {
        // basic
        HttpRequestDef.Builder<ShowMonitorDataRequest, ShowMonitorDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMonitorDataRequest.class, ShowMonitorDataResponse.class)
                .withName("ShowMonitorData")
                .withUri("/v5/{project_id}/jobs/{job_id}/monitor-data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMonitorDataRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<ShowMonitorDataRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowMonitorDataRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowMonitorDataRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowObjectMappingRequest, ShowObjectMappingResponse> showObjectMapping =
        genForshowObjectMapping();

    private static HttpRequestDef<ShowObjectMappingRequest, ShowObjectMappingResponse> genForshowObjectMapping() {
        // basic
        HttpRequestDef.Builder<ShowObjectMappingRequest, ShowObjectMappingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowObjectMappingRequest.class, ShowObjectMappingResponse.class)
                .withName("ShowObjectMapping")
                .withUri("/v5/{project_id}/jobs/{job_id}/object-mappings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowObjectMappingRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<ShowObjectMappingRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowObjectMappingRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowObjectMappingRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<QueryUserSelectedObjectInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryUserSelectedObjectInfoReq.class),
            f -> f.withMarshaller(ShowObjectMappingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPositionResultRequest, ShowPositionResultResponse> showPositionResult =
        genForshowPositionResult();

    private static HttpRequestDef<ShowPositionResultRequest, ShowPositionResultResponse> genForshowPositionResult() {
        // basic
        HttpRequestDef.Builder<ShowPositionResultRequest, ShowPositionResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPositionResultRequest.class, ShowPositionResultResponse.class)
                .withName("ShowPositionResult")
                .withUri("/v5/{project_id}/jobs/{job_id}/db-position")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPositionResultRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("query_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPositionResultRequest::getQueryId, (req, v) -> {
                req.setQueryId(v);
            }));
        builder.<ShowPositionResultRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowPositionResultRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowPositionResultRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProgressDataRequest, ShowProgressDataResponse> showProgressData =
        genForshowProgressData();

    private static HttpRequestDef<ShowProgressDataRequest, ShowProgressDataResponse> genForshowProgressData() {
        // basic
        HttpRequestDef.Builder<ShowProgressDataRequest, ShowProgressDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProgressDataRequest.class, ShowProgressDataResponse.class)
                .withName("ShowProgressData")
                .withUri("/v5/{project_id}/jobs/{job_id}/progress-data/{type}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProgressDataRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProgressDataRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProgressDataRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProgressDataRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ShowProgressDataRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowProgressDataRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowProgressDataRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSupportObjectTypeRequest, ShowSupportObjectTypeResponse> showSupportObjectType =
        genForshowSupportObjectType();

    private static HttpRequestDef<ShowSupportObjectTypeRequest, ShowSupportObjectTypeResponse> genForshowSupportObjectType() {
        // basic
        HttpRequestDef.Builder<ShowSupportObjectTypeRequest, ShowSupportObjectTypeResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSupportObjectTypeRequest.class, ShowSupportObjectTypeResponse.class)
            .withName("ShowSupportObjectType")
            .withUri("/v5/{project_id}/jobs/{job_id}/object/support")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSupportObjectTypeRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<ShowSupportObjectTypeRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowSupportObjectTypeRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowSupportObjectTypeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUpdateObjectSavingStatusRequest, ShowUpdateObjectSavingStatusResponse> showUpdateObjectSavingStatus =
        genForshowUpdateObjectSavingStatus();

    private static HttpRequestDef<ShowUpdateObjectSavingStatusRequest, ShowUpdateObjectSavingStatusResponse> genForshowUpdateObjectSavingStatus() {
        // basic
        HttpRequestDef.Builder<ShowUpdateObjectSavingStatusRequest, ShowUpdateObjectSavingStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowUpdateObjectSavingStatusRequest.class,
                    ShowUpdateObjectSavingStatusResponse.class)
                .withName("ShowUpdateObjectSavingStatus")
                .withUri("/v5/{project_id}/jobs/{job_id}/db-objects/saving-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpdateObjectSavingStatusRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("query_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpdateObjectSavingStatusRequest::getQueryId, (req, v) -> {
                req.setQueryId(v);
            }));
        builder.<ShowUpdateObjectSavingStatusRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowUpdateObjectSavingStatusRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowUpdateObjectSavingStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopJobActionRequest, StopJobActionResponse> stopJobAction =
        genForstopJobAction();

    private static HttpRequestDef<StopJobActionRequest, StopJobActionResponse> genForstopJobAction() {
        // basic
        HttpRequestDef.Builder<StopJobActionRequest, StopJobActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopJobActionRequest.class, StopJobActionResponse.class)
                .withName("StopJobAction")
                .withUri("/v5/{project_id}/jobs/{job_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopJobActionRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<StopJobActionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StopJobActionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StopJobActionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<StopJobActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StopJobActionReq.class),
            f -> f.withMarshaller(StopJobActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SyncJdbcDriverRequest, SyncJdbcDriverResponse> syncJdbcDriver =
        genForsyncJdbcDriver();

    private static HttpRequestDef<SyncJdbcDriverRequest, SyncJdbcDriverResponse> genForsyncJdbcDriver() {
        // basic
        HttpRequestDef.Builder<SyncJdbcDriverRequest, SyncJdbcDriverResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SyncJdbcDriverRequest.class, SyncJdbcDriverResponse.class)
                .withName("SyncJdbcDriver")
                .withUri("/v5/{project_id}/jobs/{job_id}/update-jdbc-driver")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SyncJdbcDriverRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<SyncJdbcDriverRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SyncJdbcDriverRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SyncJdbcDriverRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpdateDriverReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDriverReq.class),
            f -> f.withMarshaller(SyncJdbcDriverRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBatchAsyncJobsRequest, UpdateBatchAsyncJobsResponse> updateBatchAsyncJobs =
        genForupdateBatchAsyncJobs();

    private static HttpRequestDef<UpdateBatchAsyncJobsRequest, UpdateBatchAsyncJobsResponse> genForupdateBatchAsyncJobs() {
        // basic
        HttpRequestDef.Builder<UpdateBatchAsyncJobsRequest, UpdateBatchAsyncJobsResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateBatchAsyncJobsRequest.class, UpdateBatchAsyncJobsResponse.class)
            .withName("UpdateBatchAsyncJobs")
            .withUri("/v5/{project_id}/batch-async-jobs/{async_job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("async_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBatchAsyncJobsRequest::getAsyncJobId, (req, v) -> {
                req.setAsyncJobId(v);
            }));
        builder.<UpdateBatchAsyncJobsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateBatchAsyncJobsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateBatchAsyncJobsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<BatchAsyncUpdateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAsyncUpdateJobReq.class),
            f -> f.withMarshaller(UpdateBatchAsyncJobsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataProgressRequest, UpdateDataProgressResponse> updateDataProgress =
        genForupdateDataProgress();

    private static HttpRequestDef<UpdateDataProgressRequest, UpdateDataProgressResponse> genForupdateDataProgress() {
        // basic
        HttpRequestDef.Builder<UpdateDataProgressRequest, UpdateDataProgressResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDataProgressRequest.class, UpdateDataProgressResponse.class)
                .withName("UpdateDataProgress")
                .withUri("/v5/{project_id}/jobs/{job_id}/data-processing-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataProgressRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<UpdateDataProgressRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDataProgressRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateDataProgressRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<DataProcessReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DataProcessReq.class),
            f -> f.withMarshaller(UpdateDataProgressRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateJobRequest, UpdateJobResponse> updateJob = genForupdateJob();

    private static HttpRequestDef<UpdateJobRequest, UpdateJobResponse> genForupdateJob() {
        // basic
        HttpRequestDef.Builder<UpdateJobRequest, UpdateJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateJobRequest.class, UpdateJobResponse.class)
                .withName("UpdateJob")
                .withUri("/v5/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<UpdateJobRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateJobRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateJobRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SingleUpdateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SingleUpdateJobReq.class),
            f -> f.withMarshaller(UpdateJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateJobConfigurationsRequest, UpdateJobConfigurationsResponse> updateJobConfigurations =
        genForupdateJobConfigurations();

    private static HttpRequestDef<UpdateJobConfigurationsRequest, UpdateJobConfigurationsResponse> genForupdateJobConfigurations() {
        // basic
        HttpRequestDef.Builder<UpdateJobConfigurationsRequest, UpdateJobConfigurationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateJobConfigurationsRequest.class, UpdateJobConfigurationsResponse.class)
            .withName("UpdateJobConfigurations")
            .withUri("/v5/{project_id}/jobs/{job_id}/modify-configuration")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateJobConfigurationsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateJobConfigurationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifyParameterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyParameterReq.class),
            f -> f.withMarshaller(UpdateJobConfigurationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStartPositionRequest, UpdateStartPositionResponse> updateStartPosition =
        genForupdateStartPosition();

    private static HttpRequestDef<UpdateStartPositionRequest, UpdateStartPositionResponse> genForupdateStartPosition() {
        // basic
        HttpRequestDef.Builder<UpdateStartPositionRequest, UpdateStartPositionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateStartPositionRequest.class, UpdateStartPositionResponse.class)
                .withName("UpdateStartPosition")
                .withUri("/v5/{project_id}/jobs/{job_id}/start-position")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStartPositionRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<UpdateStartPositionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateStartPositionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateStartPositionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifyStartPositionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyStartPositionReq.class),
            f -> f.withMarshaller(UpdateStartPositionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadDbObjectTemplateRequest, UploadDbObjectTemplateResponse> uploadDbObjectTemplate =
        genForuploadDbObjectTemplate();

    private static HttpRequestDef<UploadDbObjectTemplateRequest, UploadDbObjectTemplateResponse> genForuploadDbObjectTemplate() {
        // basic
        HttpRequestDef.Builder<UploadDbObjectTemplateRequest, UploadDbObjectTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UploadDbObjectTemplateRequest.class, UploadDbObjectTemplateResponse.class)
            .withName("UploadDbObjectTemplate")
            .withUri("/v5/{project_id}/jobs/{job_id}/db-object/template")
            .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadDbObjectTemplateRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<UploadDbObjectTemplateRequest.FileImportDbLevelEnum>withRequestField("file_import_db_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UploadDbObjectTemplateRequest.FileImportDbLevelEnum.class),
            f -> f.withMarshaller(UploadDbObjectTemplateRequest::getFileImportDbLevel, (req, v) -> {
                req.setFileImportDbLevel(v);
            }));
        builder.<UploadDbObjectTemplateRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UploadDbObjectTemplateRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UploadDbObjectTemplateRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UploadDbObjectTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadDbObjectTemplateRequestBody.class),
            f -> f.withMarshaller(UploadDbObjectTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadJdbcDriverRequest, UploadJdbcDriverResponse> uploadJdbcDriver =
        genForuploadJdbcDriver();

    private static HttpRequestDef<UploadJdbcDriverRequest, UploadJdbcDriverResponse> genForuploadJdbcDriver() {
        // basic
        HttpRequestDef.Builder<UploadJdbcDriverRequest, UploadJdbcDriverResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadJdbcDriverRequest.class, UploadJdbcDriverResponse.class)
                .withName("UploadJdbcDriver")
                .withUri("/v5/{project_id}/jdbc-driver")
                .withContentType("multipart/form-data");

        // requests
        builder.<UploadJdbcDriverRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UploadJdbcDriverRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UploadJdbcDriverRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UploadJdbcDriverRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadJdbcDriverRequestBody.class),
            f -> f.withMarshaller(UploadJdbcDriverRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateJobNameRequest, ValidateJobNameResponse> validateJobName =
        genForvalidateJobName();

    private static HttpRequestDef<ValidateJobNameRequest, ValidateJobNameResponse> genForvalidateJobName() {
        // basic
        HttpRequestDef.Builder<ValidateJobNameRequest, ValidateJobNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ValidateJobNameRequest.class, ValidateJobNameResponse.class)
                .withName("ValidateJobName")
                .withUri("/v5/{project_id}/jobs/name-validation")
                .withContentType("application/json");

        // requests
        builder.<ValidateJobNameRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ValidateJobNameRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ValidateJobNameRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CheckJobNameReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckJobNameReq.class),
            f -> f.withMarshaller(ValidateJobNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
