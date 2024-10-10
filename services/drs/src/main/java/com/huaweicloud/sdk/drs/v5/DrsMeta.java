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
import com.huaweicloud.sdk.drs.v5.model.ChangeToPeriodRequest;
import com.huaweicloud.sdk.drs.v5.model.ChangeToPeriodResponse;
import com.huaweicloud.sdk.drs.v5.model.CheckDataFilterRequest;
import com.huaweicloud.sdk.drs.v5.model.CheckDataFilterResponse;
import com.huaweicloud.sdk.drs.v5.model.CheckJobNameReq;
import com.huaweicloud.sdk.drs.v5.model.CleanAlarmsRequest;
import com.huaweicloud.sdk.drs.v5.model.CleanAlarmsResponse;
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
import com.huaweicloud.sdk.drs.v5.model.CreateConnectionReq;
import com.huaweicloud.sdk.drs.v5.model.CreateConnectionRequest;
import com.huaweicloud.sdk.drs.v5.model.CreateConnectionResponse;
import com.huaweicloud.sdk.drs.v5.model.CreateJobRequest;
import com.huaweicloud.sdk.drs.v5.model.CreateJobResponse;
import com.huaweicloud.sdk.drs.v5.model.CreateOfflineTaskReq;
import com.huaweicloud.sdk.drs.v5.model.CreateReplicationJobRequest;
import com.huaweicloud.sdk.drs.v5.model.CreateReplicationJobResponse;
import com.huaweicloud.sdk.drs.v5.model.DataProcessReq;
import com.huaweicloud.sdk.drs.v5.model.DeleteConnectionRequest;
import com.huaweicloud.sdk.drs.v5.model.DeleteConnectionResponse;
import com.huaweicloud.sdk.drs.v5.model.DeleteDriverReq;
import com.huaweicloud.sdk.drs.v5.model.DeleteJdbcDriverRequest;
import com.huaweicloud.sdk.drs.v5.model.DeleteJdbcDriverResponse;
import com.huaweicloud.sdk.drs.v5.model.DeleteJobRequest;
import com.huaweicloud.sdk.drs.v5.model.DeleteJobResponse;
import com.huaweicloud.sdk.drs.v5.model.DeleteReplicationJobRequest;
import com.huaweicloud.sdk.drs.v5.model.DeleteReplicationJobResponse;
import com.huaweicloud.sdk.drs.v5.model.DeleteUserDriverReq;
import com.huaweicloud.sdk.drs.v5.model.DeleteUserJdbcDriverRequest;
import com.huaweicloud.sdk.drs.v5.model.DeleteUserJdbcDriverResponse;
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
import com.huaweicloud.sdk.drs.v5.model.ListConnectionsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListConnectionsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListDbObjectsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListDbObjectsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListInstanceByTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListInstanceByTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListJdbcDriversRequest;
import com.huaweicloud.sdk.drs.v5.model.ListJdbcDriversResponse;
import com.huaweicloud.sdk.drs.v5.model.ListJobDdlsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListJobDdlsResponse;
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
import com.huaweicloud.sdk.drs.v5.model.ListReplicationJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListReplicationJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListUserJdbcDriversRequest;
import com.huaweicloud.sdk.drs.v5.model.ListUserJdbcDriversResponse;
import com.huaweicloud.sdk.drs.v5.model.ListsAgencyPermissionsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListsAgencyPermissionsResponse;
import com.huaweicloud.sdk.drs.v5.model.ModifyComparePolicyReq;
import com.huaweicloud.sdk.drs.v5.model.ModifyConnectionRequest;
import com.huaweicloud.sdk.drs.v5.model.ModifyConnectionResponse;
import com.huaweicloud.sdk.drs.v5.model.ModifyOfflineTaskReq;
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
import com.huaweicloud.sdk.drs.v5.model.ShowHealthCompareJobDetailRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowHealthCompareJobDetailResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowHealthCompareJobListRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowHealthCompareJobListResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowHealthObjectCompareJobOverviewRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowHealthObjectCompareJobOverviewResponse;
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
import com.huaweicloud.sdk.drs.v5.model.ShowReplayResultsRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowReplayResultsResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowReplicationJobRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowReplicationJobResponse;
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
import com.huaweicloud.sdk.drs.v5.model.SyncUserJdbcDriverRequest;
import com.huaweicloud.sdk.drs.v5.model.SyncUserJdbcDriverResponse;
import com.huaweicloud.sdk.drs.v5.model.ToPeriodReq;
import com.huaweicloud.sdk.drs.v5.model.UpdateBatchAsyncJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateBatchAsyncJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateComparePolicyRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateComparePolicyResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateConnectionReq;
import com.huaweicloud.sdk.drs.v5.model.UpdateDataProgressRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateDataProgressResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateDriverReq;
import com.huaweicloud.sdk.drs.v5.model.UpdateJobConfigurationsRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateJobConfigurationsResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateJobRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateJobResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateReplicationJobRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateReplicationJobResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateStartPositionRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateStartPositionResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateUserDriverReq;
import com.huaweicloud.sdk.drs.v5.model.UploadDbObjectTemplateRequest;
import com.huaweicloud.sdk.drs.v5.model.UploadDbObjectTemplateRequestBody;
import com.huaweicloud.sdk.drs.v5.model.UploadDbObjectTemplateResponse;
import com.huaweicloud.sdk.drs.v5.model.UploadJdbcDriverRequest;
import com.huaweicloud.sdk.drs.v5.model.UploadJdbcDriverRequestBody;
import com.huaweicloud.sdk.drs.v5.model.UploadJdbcDriverResponse;
import com.huaweicloud.sdk.drs.v5.model.UploadUserJdbcDriverRequest;
import com.huaweicloud.sdk.drs.v5.model.UploadUserJdbcDriverRequestBody;
import com.huaweicloud.sdk.drs.v5.model.UploadUserJdbcDriverResponse;
import com.huaweicloud.sdk.drs.v5.model.ValidateJobNameRequest;
import com.huaweicloud.sdk.drs.v5.model.ValidateJobNameResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class DrsMeta {

    public static final HttpRequestDef<BatchCreateJobsAsyncRequest, BatchCreateJobsAsyncResponse> batchCreateJobsAsync =
        genForBatchCreateJobsAsync();

    private static HttpRequestDef<BatchCreateJobsAsyncRequest, BatchCreateJobsAsyncResponse> genForBatchCreateJobsAsync() {
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
            f -> f.withMarshaller(BatchCreateJobsAsyncRequest::getXLanguage,
                BatchCreateJobsAsyncRequest::setXLanguage));
        builder.<BatchAsyncCreateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAsyncCreateJobReq.class),
            f -> f.withMarshaller(BatchCreateJobsAsyncRequest::getBody, BatchCreateJobsAsyncRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateTagsRequest, BatchCreateTagsResponse> batchCreateTags =
        genForBatchCreateTags();

    private static HttpRequestDef<BatchCreateTagsRequest, BatchCreateTagsResponse> genForBatchCreateTags() {
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
            f -> f.withMarshaller(BatchCreateTagsRequest::getResourceType, BatchCreateTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getResourceId, BatchCreateTagsRequest::setResourceId));
        builder.<BatchCreateTagsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchCreateTagsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getXLanguage, BatchCreateTagsRequest::setXLanguage));
        builder.<BatchAddTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddTagReq.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getBody, BatchCreateTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteJobsByIdRequest, BatchDeleteJobsByIdResponse> batchDeleteJobsById =
        genForBatchDeleteJobsById();

    private static HttpRequestDef<BatchDeleteJobsByIdRequest, BatchDeleteJobsByIdResponse> genForBatchDeleteJobsById() {
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
            f -> f.withMarshaller(BatchDeleteJobsByIdRequest::getXLanguage, BatchDeleteJobsByIdRequest::setXLanguage));
        builder.<BatchDeleteJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteJobReq.class),
            f -> f.withMarshaller(BatchDeleteJobsByIdRequest::getBody, BatchDeleteJobsByIdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTags =
        genForBatchDeleteTags();

    private static HttpRequestDef<BatchDeleteTagsRequest, BatchDeleteTagsResponse> genForBatchDeleteTags() {
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
            f -> f.withMarshaller(BatchDeleteTagsRequest::getResourceType, BatchDeleteTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getResourceId, BatchDeleteTagsRequest::setResourceId));
        builder.<BatchDeleteTagsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchDeleteTagsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getXLanguage, BatchDeleteTagsRequest::setXLanguage));
        builder.<BatchDeleteTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteTagReq.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getBody, BatchDeleteTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchExecuteJobActionsRequest, BatchExecuteJobActionsResponse> batchExecuteJobActions =
        genForBatchExecuteJobActions();

    private static HttpRequestDef<BatchExecuteJobActionsRequest, BatchExecuteJobActionsResponse> genForBatchExecuteJobActions() {
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
            f -> f.withMarshaller(BatchExecuteJobActionsRequest::getXLanguage,
                BatchExecuteJobActionsRequest::setXLanguage));
        builder.<BatchJobActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchJobActionReq.class),
            f -> f.withMarshaller(BatchExecuteJobActionsRequest::getBody, BatchExecuteJobActionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStopJobsActionRequest, BatchStopJobsActionResponse> batchStopJobsAction =
        genForBatchStopJobsAction();

    private static HttpRequestDef<BatchStopJobsActionRequest, BatchStopJobsActionResponse> genForBatchStopJobsAction() {
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
            f -> f.withMarshaller(BatchStopJobsActionRequest::getXLanguage, BatchStopJobsActionRequest::setXLanguage));
        builder.<BatchStopJobActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchStopJobActionReq.class),
            f -> f.withMarshaller(BatchStopJobsActionRequest::getBody, BatchStopJobsActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchTagActionRequest, BatchTagActionResponse> batchTagAction =
        genForBatchTagAction();

    private static HttpRequestDef<BatchTagActionRequest, BatchTagActionResponse> genForBatchTagAction() {
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
            f -> f.withMarshaller(BatchTagActionRequest::getResourceType, BatchTagActionRequest::setResourceType));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchTagActionRequest::getJobId, BatchTagActionRequest::setJobId));
        builder.<BatchTagActionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchTagActionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(BatchTagActionRequest::getXLanguage, BatchTagActionRequest::setXLanguage));
        builder.<BatchDealResourceTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDealResourceTagReq.class),
            f -> f.withMarshaller(BatchTagActionRequest::getBody, BatchTagActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeToPeriodRequest, ChangeToPeriodResponse> changeToPeriod =
        genForChangeToPeriod();

    private static HttpRequestDef<ChangeToPeriodRequest, ChangeToPeriodResponse> genForChangeToPeriod() {
        // basic
        HttpRequestDef.Builder<ChangeToPeriodRequest, ChangeToPeriodResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeToPeriodRequest.class, ChangeToPeriodResponse.class)
                .withName("ChangeToPeriod")
                .withUri("/v5/{project_id}/job/{job_id}/change-to-period")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeToPeriodRequest::getJobId, ChangeToPeriodRequest::setJobId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeToPeriodRequest::getXLanguage, ChangeToPeriodRequest::setXLanguage));
        builder.<ToPeriodReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ToPeriodReq.class),
            f -> f.withMarshaller(ChangeToPeriodRequest::getBody, ChangeToPeriodRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckDataFilterRequest, CheckDataFilterResponse> checkDataFilter =
        genForCheckDataFilter();

    private static HttpRequestDef<CheckDataFilterRequest, CheckDataFilterResponse> genForCheckDataFilter() {
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
            f -> f.withMarshaller(CheckDataFilterRequest::getJobId, CheckDataFilterRequest::setJobId));
        builder.<CheckDataFilterRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CheckDataFilterRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CheckDataFilterRequest::getXLanguage, CheckDataFilterRequest::setXLanguage));
        builder.<DataProcessReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DataProcessReq.class),
            f -> f.withMarshaller(CheckDataFilterRequest::getBody, CheckDataFilterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CleanAlarmsRequest, CleanAlarmsResponse> cleanAlarms = genForCleanAlarms();

    private static HttpRequestDef<CleanAlarmsRequest, CleanAlarmsResponse> genForCleanAlarms() {
        // basic
        HttpRequestDef.Builder<CleanAlarmsRequest, CleanAlarmsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CleanAlarmsRequest.class, CleanAlarmsResponse.class)
                .withName("CleanAlarms")
                .withUri("/v5/{project_id}/jobs/{job_id}/alarms/{alarm_id}/clean")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CleanAlarmsRequest::getJobId, CleanAlarmsRequest::setJobId));
        builder.<String>withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CleanAlarmsRequest::getAlarmId, CleanAlarmsRequest::setAlarmId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CleanAlarmsRequest::getXLanguage, CleanAlarmsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CollectColumnsRequest, CollectColumnsResponse> collectColumns =
        genForCollectColumns();

    private static HttpRequestDef<CollectColumnsRequest, CollectColumnsResponse> genForCollectColumns() {
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
            f -> f.withMarshaller(CollectColumnsRequest::getJobId, CollectColumnsRequest::setJobId));
        builder.<CollectColumnsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CollectColumnsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CollectColumnsRequest::getXLanguage, CollectColumnsRequest::setXLanguage));
        builder.<QueryColumnReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryColumnReq.class),
            f -> f.withMarshaller(CollectColumnsRequest::getBody, CollectColumnsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CollectDbObjectsAsyncRequest, CollectDbObjectsAsyncResponse> collectDbObjectsAsync =
        genForCollectDbObjectsAsync();

    private static HttpRequestDef<CollectDbObjectsAsyncRequest, CollectDbObjectsAsyncResponse> genForCollectDbObjectsAsync() {
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
            f -> f.withMarshaller(CollectDbObjectsAsyncRequest::getJobId, CollectDbObjectsAsyncRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CollectDbObjectsAsyncRequest::getOffset, CollectDbObjectsAsyncRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CollectDbObjectsAsyncRequest::getLimit, CollectDbObjectsAsyncRequest::setLimit));
        builder.<CollectDbObjectsAsyncRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CollectDbObjectsAsyncRequest.TypeEnum.class),
            f -> f.withMarshaller(CollectDbObjectsAsyncRequest::getType, CollectDbObjectsAsyncRequest::setType));
        builder.<Boolean>withRequestField("is_refresh",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(CollectDbObjectsAsyncRequest::getIsRefresh,
                CollectDbObjectsAsyncRequest::setIsRefresh));
        builder.<List<String>>withRequestField("db_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CollectDbObjectsAsyncRequest::getDbNames, CollectDbObjectsAsyncRequest::setDbNames));
        builder.<CollectDbObjectsAsyncRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CollectDbObjectsAsyncRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CollectDbObjectsAsyncRequest::getXLanguage,
                CollectDbObjectsAsyncRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CollectDbObjectsInfoRequest, CollectDbObjectsInfoResponse> collectDbObjectsInfo =
        genForCollectDbObjectsInfo();

    private static HttpRequestDef<CollectDbObjectsInfoRequest, CollectDbObjectsInfoResponse> genForCollectDbObjectsInfo() {
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
            f -> f.withMarshaller(CollectDbObjectsInfoRequest::getJobId, CollectDbObjectsInfoRequest::setJobId));
        builder.<CollectDbObjectsInfoRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CollectDbObjectsInfoRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CollectDbObjectsInfoRequest::getXLanguage,
                CollectDbObjectsInfoRequest::setXLanguage));
        builder.<QuerySelectObjectInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QuerySelectObjectInfoReq.class),
            f -> f.withMarshaller(CollectDbObjectsInfoRequest::getBody, CollectDbObjectsInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CollectPositionAsyncRequest, CollectPositionAsyncResponse> collectPositionAsync =
        genForCollectPositionAsync();

    private static HttpRequestDef<CollectPositionAsyncRequest, CollectPositionAsyncResponse> genForCollectPositionAsync() {
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
            f -> f.withMarshaller(CollectPositionAsyncRequest::getJobId, CollectPositionAsyncRequest::setJobId));
        builder.<CollectPositionAsyncRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CollectPositionAsyncRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CollectPositionAsyncRequest::getXLanguage,
                CollectPositionAsyncRequest::setXLanguage));
        builder.<QueryDbPositionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryDbPositionReq.class),
            f -> f.withMarshaller(CollectPositionAsyncRequest::getBody, CollectPositionAsyncRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CommitAsyncJobRequest, CommitAsyncJobResponse> commitAsyncJob =
        genForCommitAsyncJob();

    private static HttpRequestDef<CommitAsyncJobRequest, CommitAsyncJobResponse> genForCommitAsyncJob() {
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
            f -> f.withMarshaller(CommitAsyncJobRequest::getAsyncJobId, CommitAsyncJobRequest::setAsyncJobId));
        builder.<CommitAsyncJobRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CommitAsyncJobRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CommitAsyncJobRequest::getXLanguage, CommitAsyncJobRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyJobRequest, CopyJobResponse> copyJob = genForCopyJob();

    private static HttpRequestDef<CopyJobRequest, CopyJobResponse> genForCopyJob() {
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
            f -> f.withMarshaller(CopyJobRequest::getXLanguage, CopyJobRequest::setXLanguage));
        builder.<CloneJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CloneJobReq.class),
            f -> f.withMarshaller(CopyJobRequest::getBody, CopyJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountInstanceByTagsRequest, CountInstanceByTagsResponse> countInstanceByTags =
        genForCountInstanceByTags();

    private static HttpRequestDef<CountInstanceByTagsRequest, CountInstanceByTagsResponse> genForCountInstanceByTags() {
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
            f -> f.withMarshaller(CountInstanceByTagsRequest::getResourceType,
                CountInstanceByTagsRequest::setResourceType));
        builder.<CountInstanceByTagsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CountInstanceByTagsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CountInstanceByTagsRequest::getXLanguage, CountInstanceByTagsRequest::setXLanguage));
        builder.<QueryInstanceByTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryInstanceByTagReq.class),
            f -> f.withMarshaller(CountInstanceByTagsRequest::getBody, CountInstanceByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConnectionRequest, CreateConnectionResponse> createConnection =
        genForCreateConnection();

    private static HttpRequestDef<CreateConnectionRequest, CreateConnectionResponse> genForCreateConnection() {
        // basic
        HttpRequestDef.Builder<CreateConnectionRequest, CreateConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateConnectionRequest.class, CreateConnectionResponse.class)
                .withName("CreateConnection")
                .withUri("/v5/{project_id}/connections")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConnectionRequest::getXLanguage, CreateConnectionRequest::setXLanguage));
        builder.<CreateConnectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateConnectionReq.class),
            f -> f.withMarshaller(CreateConnectionRequest::getBody, CreateConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateJobRequest, CreateJobResponse> createJob = genForCreateJob();

    private static HttpRequestDef<CreateJobRequest, CreateJobResponse> genForCreateJob() {
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
            f -> f.withMarshaller(CreateJobRequest::getXLanguage, CreateJobRequest::setXLanguage));
        builder.<SingleCreateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SingleCreateJobReq.class),
            f -> f.withMarshaller(CreateJobRequest::getBody, CreateJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateReplicationJobRequest, CreateReplicationJobResponse> createReplicationJob =
        genForCreateReplicationJob();

    private static HttpRequestDef<CreateReplicationJobRequest, CreateReplicationJobResponse> genForCreateReplicationJob() {
        // basic
        HttpRequestDef.Builder<CreateReplicationJobRequest, CreateReplicationJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateReplicationJobRequest.class, CreateReplicationJobResponse.class)
            .withName("CreateReplicationJob")
            .withUri("/v5/{project_id}/backup-migration-jobs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateReplicationJobRequest::getXLanguage,
                CreateReplicationJobRequest::setXLanguage));
        builder.<CreateOfflineTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOfflineTaskReq.class),
            f -> f.withMarshaller(CreateReplicationJobRequest::getBody, CreateReplicationJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConnectionRequest, DeleteConnectionResponse> deleteConnection =
        genForDeleteConnection();

    private static HttpRequestDef<DeleteConnectionRequest, DeleteConnectionResponse> genForDeleteConnection() {
        // basic
        HttpRequestDef.Builder<DeleteConnectionRequest, DeleteConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteConnectionRequest.class, DeleteConnectionResponse.class)
                .withName("DeleteConnection")
                .withUri("/v5/{project_id}/connections/{connection_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConnectionRequest::getConnectionId, DeleteConnectionRequest::setConnectionId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConnectionRequest::getXLanguage, DeleteConnectionRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteJdbcDriverRequest, DeleteJdbcDriverResponse> deleteJdbcDriver =
        genForDeleteJdbcDriver();

    private static HttpRequestDef<DeleteJdbcDriverRequest, DeleteJdbcDriverResponse> genForDeleteJdbcDriver() {
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
            f -> f.withMarshaller(DeleteJdbcDriverRequest::getXLanguage, DeleteJdbcDriverRequest::setXLanguage));
        builder.<DeleteDriverReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteDriverReq.class),
            f -> f.withMarshaller(DeleteJdbcDriverRequest::getBody, DeleteJdbcDriverRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteJobRequest, DeleteJobResponse> deleteJob = genForDeleteJob();

    private static HttpRequestDef<DeleteJobRequest, DeleteJobResponse> genForDeleteJob() {
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
            f -> f.withMarshaller(DeleteJobRequest::getJobId, DeleteJobRequest::setJobId));
        builder.<DeleteJobRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteJobRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DeleteJobRequest::getXLanguage, DeleteJobRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteReplicationJobRequest, DeleteReplicationJobResponse> deleteReplicationJob =
        genForDeleteReplicationJob();

    private static HttpRequestDef<DeleteReplicationJobRequest, DeleteReplicationJobResponse> genForDeleteReplicationJob() {
        // basic
        HttpRequestDef.Builder<DeleteReplicationJobRequest, DeleteReplicationJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteReplicationJobRequest.class, DeleteReplicationJobResponse.class)
            .withName("DeleteReplicationJob")
            .withUri("/v5/{project_id}/backup-migration-jobs/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteReplicationJobRequest::getJobId, DeleteReplicationJobRequest::setJobId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteReplicationJobRequest::getXLanguage,
                DeleteReplicationJobRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserJdbcDriverRequest, DeleteUserJdbcDriverResponse> deleteUserJdbcDriver =
        genForDeleteUserJdbcDriver();

    private static HttpRequestDef<DeleteUserJdbcDriverRequest, DeleteUserJdbcDriverResponse> genForDeleteUserJdbcDriver() {
        // basic
        HttpRequestDef.Builder<DeleteUserJdbcDriverRequest, DeleteUserJdbcDriverResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteUserJdbcDriverRequest.class, DeleteUserJdbcDriverResponse.class)
            .withName("DeleteUserJdbcDriver")
            .withUri("/v5/{project_id}/drivers")
            .withContentType("application/json");

        // requests
        builder.<DeleteUserJdbcDriverRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteUserJdbcDriverRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DeleteUserJdbcDriverRequest::getXLanguage,
                DeleteUserJdbcDriverRequest::setXLanguage));
        builder.<DeleteUserDriverReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteUserDriverReq.class),
            f -> f.withMarshaller(DeleteUserJdbcDriverRequest::getBody, DeleteUserJdbcDriverRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadBatchCreateTemplateRequest, DownloadBatchCreateTemplateResponse> downloadBatchCreateTemplate =
        genForDownloadBatchCreateTemplate();

    private static HttpRequestDef<DownloadBatchCreateTemplateRequest, DownloadBatchCreateTemplateResponse> genForDownloadBatchCreateTemplate() {
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
            f -> f.withMarshaller(DownloadBatchCreateTemplateRequest::getXLanguage,
                DownloadBatchCreateTemplateRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadDbObjectTemplateRequest, DownloadDbObjectTemplateResponse> downloadDbObjectTemplate =
        genForDownloadDbObjectTemplate();

    private static HttpRequestDef<DownloadDbObjectTemplateRequest, DownloadDbObjectTemplateResponse> genForDownloadDbObjectTemplate() {
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
            f -> f.withMarshaller(DownloadDbObjectTemplateRequest::getJobId,
                DownloadDbObjectTemplateRequest::setJobId));
        builder.<DownloadDbObjectTemplateRequest.FileImportDbLevelEnum>withRequestField("file_import_db_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DownloadDbObjectTemplateRequest.FileImportDbLevelEnum.class),
            f -> f.withMarshaller(DownloadDbObjectTemplateRequest::getFileImportDbLevel,
                DownloadDbObjectTemplateRequest::setFileImportDbLevel));
        builder.<DownloadDbObjectTemplateRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DownloadDbObjectTemplateRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DownloadDbObjectTemplateRequest::getXLanguage,
                DownloadDbObjectTemplateRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteJobActionRequest, ExecuteJobActionResponse> executeJobAction =
        genForExecuteJobAction();

    private static HttpRequestDef<ExecuteJobActionRequest, ExecuteJobActionResponse> genForExecuteJobAction() {
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
            f -> f.withMarshaller(ExecuteJobActionRequest::getJobId, ExecuteJobActionRequest::setJobId));
        builder.<ExecuteJobActionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExecuteJobActionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExecuteJobActionRequest::getXLanguage, ExecuteJobActionRequest::setXLanguage));
        builder.<JobActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobActionReq.class),
            f -> f.withMarshaller(ExecuteJobActionRequest::getBody, ExecuteJobActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportOperationInfoRequest, ExportOperationInfoResponse> exportOperationInfo =
        genForExportOperationInfo();

    private static HttpRequestDef<ExportOperationInfoRequest, ExportOperationInfoResponse> genForExportOperationInfo() {
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
            f -> f.withMarshaller(ExportOperationInfoRequest::getJobId, ExportOperationInfoRequest::setJobId));
        builder.<ExportOperationInfoRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportOperationInfoRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExportOperationInfoRequest::getXLanguage, ExportOperationInfoRequest::setXLanguage));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ExportOperationInfoResponse::getBody, ExportOperationInfoResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ImportBatchCreateJobsRequest, ImportBatchCreateJobsResponse> importBatchCreateJobs =
        genForImportBatchCreateJobs();

    private static HttpRequestDef<ImportBatchCreateJobsRequest, ImportBatchCreateJobsResponse> genForImportBatchCreateJobs() {
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
            f -> f.withMarshaller(ImportBatchCreateJobsRequest::getXLanguage,
                ImportBatchCreateJobsRequest::setXLanguage));
        builder.<ImportBatchCreateJobsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportBatchCreateJobsRequestBody.class),
            f -> f.withMarshaller(ImportBatchCreateJobsRequest::getBody, ImportBatchCreateJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAsyncJobDetailRequest, ListAsyncJobDetailResponse> listAsyncJobDetail =
        genForListAsyncJobDetail();

    private static HttpRequestDef<ListAsyncJobDetailRequest, ListAsyncJobDetailResponse> genForListAsyncJobDetail() {
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
            f -> f.withMarshaller(ListAsyncJobDetailRequest::getAsyncJobId, ListAsyncJobDetailRequest::setAsyncJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAsyncJobDetailRequest::getOffset, ListAsyncJobDetailRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAsyncJobDetailRequest::getLimit, ListAsyncJobDetailRequest::setLimit));
        builder.<ListAsyncJobDetailRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAsyncJobDetailRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListAsyncJobDetailRequest::getXLanguage, ListAsyncJobDetailRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAsyncJobsRequest, ListAsyncJobsResponse> listAsyncJobs =
        genForListAsyncJobs();

    private static HttpRequestDef<ListAsyncJobsRequest, ListAsyncJobsResponse> genForListAsyncJobs() {
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
            f -> f.withMarshaller(ListAsyncJobsRequest::getAsyncJobId, ListAsyncJobsRequest::setAsyncJobId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncJobsRequest::getStatus, ListAsyncJobsRequest::setStatus));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncJobsRequest::getDomainName, ListAsyncJobsRequest::setDomainName));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncJobsRequest::getUserName, ListAsyncJobsRequest::setUserName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAsyncJobsRequest::getOffset, ListAsyncJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAsyncJobsRequest::getLimit, ListAsyncJobsRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncJobsRequest::getSortKey, ListAsyncJobsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncJobsRequest::getSortDir, ListAsyncJobsRequest::setSortDir));
        builder.<ListAsyncJobsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAsyncJobsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListAsyncJobsRequest::getXLanguage, ListAsyncJobsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConnectionsRequest, ListConnectionsResponse> listConnections =
        genForListConnections();

    private static HttpRequestDef<ListConnectionsRequest, ListConnectionsResponse> genForListConnections() {
        // basic
        HttpRequestDef.Builder<ListConnectionsRequest, ListConnectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConnectionsRequest.class, ListConnectionsResponse.class)
                .withName("ListConnections")
                .withUri("/v5/{project_id}/connections")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getConnectionId, ListConnectionsRequest::setConnectionId));
        builder.<ListConnectionsRequest.DbTypeEnum>withRequestField("db_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListConnectionsRequest.DbTypeEnum.class),
            f -> f.withMarshaller(ListConnectionsRequest::getDbType, ListConnectionsRequest::setDbType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getName, ListConnectionsRequest::setName));
        builder.<String>withRequestField("inst_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getInstId, ListConnectionsRequest::setInstId));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getIp, ListConnectionsRequest::setIp));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getDescription, ListConnectionsRequest::setDescription));
        builder.<String>withRequestField("create_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getCreateTime, ListConnectionsRequest::setCreateTime));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getEnterpriseProjectId,
                ListConnectionsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectionsRequest::getOffset, ListConnectionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectionsRequest::getLimit, ListConnectionsRequest::setLimit));
        builder.<Boolean>withRequestField("fetch_all",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListConnectionsRequest::getFetchAll, ListConnectionsRequest::setFetchAll));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getSortKey, ListConnectionsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getSortDir, ListConnectionsRequest::setSortDir));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getXLanguage, ListConnectionsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDbObjectsRequest, ListDbObjectsResponse> listDbObjects =
        genForListDbObjects();

    private static HttpRequestDef<ListDbObjectsRequest, ListDbObjectsResponse> genForListDbObjects() {
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
            f -> f.withMarshaller(ListDbObjectsRequest::getJobId, ListDbObjectsRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbObjectsRequest::getOffset, ListDbObjectsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbObjectsRequest::getLimit, ListDbObjectsRequest::setLimit));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbObjectsRequest::getType, ListDbObjectsRequest::setType));
        builder.<List<String>>withRequestField("db_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDbObjectsRequest::getDbNames, ListDbObjectsRequest::setDbNames));
        builder.<ListDbObjectsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDbObjectsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListDbObjectsRequest::getXLanguage, ListDbObjectsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceByTagsRequest, ListInstanceByTagsResponse> listInstanceByTags =
        genForListInstanceByTags();

    private static HttpRequestDef<ListInstanceByTagsRequest, ListInstanceByTagsResponse> genForListInstanceByTags() {
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
            f -> f.withMarshaller(ListInstanceByTagsRequest::getResourceType,
                ListInstanceByTagsRequest::setResourceType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceByTagsRequest::getLimit, ListInstanceByTagsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceByTagsRequest::getOffset, ListInstanceByTagsRequest::setOffset));
        builder.<ListInstanceByTagsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceByTagsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListInstanceByTagsRequest::getXLanguage, ListInstanceByTagsRequest::setXLanguage));
        builder.<QueryInstanceByTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryInstanceByTagReq.class),
            f -> f.withMarshaller(ListInstanceByTagsRequest::getBody, ListInstanceByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTags =
        genForListInstanceTags();

    private static HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> genForListInstanceTags() {
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
            f -> f.withMarshaller(ListInstanceTagsRequest::getResourceType, ListInstanceTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getResourceId, ListInstanceTagsRequest::setResourceId));
        builder.<ListInstanceTagsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceTagsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getXLanguage, ListInstanceTagsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJdbcDriversRequest, ListJdbcDriversResponse> listJdbcDrivers =
        genForListJdbcDrivers();

    private static HttpRequestDef<ListJdbcDriversRequest, ListJdbcDriversResponse> genForListJdbcDrivers() {
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
            f -> f.withMarshaller(ListJdbcDriversRequest::getLimit, ListJdbcDriversRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJdbcDriversRequest::getOffset, ListJdbcDriversRequest::setOffset));
        builder.<ListJdbcDriversRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListJdbcDriversRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListJdbcDriversRequest::getXLanguage, ListJdbcDriversRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobDdlsRequest, ListJobDdlsResponse> listJobDdls = genForListJobDdls();

    private static HttpRequestDef<ListJobDdlsRequest, ListJobDdlsResponse> genForListJobDdls() {
        // basic
        HttpRequestDef.Builder<ListJobDdlsRequest, ListJobDdlsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobDdlsRequest.class, ListJobDdlsResponse.class)
                .withName("ListJobDdls")
                .withUri("/v5/{project_id}/jobs/{job_id}/ddl")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobDdlsRequest::getJobId, ListJobDdlsRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobDdlsRequest::getOffset, ListJobDdlsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobDdlsRequest::getLimit, ListJobDdlsRequest::setLimit));
        builder.<Long>withRequestField("start_seq_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListJobDdlsRequest::getStartSeqNo, ListJobDdlsRequest::setStartSeqNo));
        builder.<Long>withRequestField("end_seq_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListJobDdlsRequest::getEndSeqNo, ListJobDdlsRequest::setEndSeqNo));
        builder.<ListJobDdlsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListJobDdlsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListJobDdlsRequest::getStatus, ListJobDdlsRequest::setStatus));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobDdlsRequest::getXLanguage, ListJobDdlsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobHistoryParametersRequest, ListJobHistoryParametersResponse> listJobHistoryParameters =
        genForListJobHistoryParameters();

    private static HttpRequestDef<ListJobHistoryParametersRequest, ListJobHistoryParametersResponse> genForListJobHistoryParameters() {
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
            f -> f.withMarshaller(ListJobHistoryParametersRequest::getJobId,
                ListJobHistoryParametersRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobHistoryParametersRequest::getOffset,
                ListJobHistoryParametersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobHistoryParametersRequest::getLimit,
                ListJobHistoryParametersRequest::setLimit));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobHistoryParametersRequest::getBeginTime,
                ListJobHistoryParametersRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobHistoryParametersRequest::getEndTime,
                ListJobHistoryParametersRequest::setEndTime));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobHistoryParametersRequest::getName, ListJobHistoryParametersRequest::setName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobHistoryParametersRequest::getXLanguage,
                ListJobHistoryParametersRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobParametersRequest, ListJobParametersResponse> listJobParameters =
        genForListJobParameters();

    private static HttpRequestDef<ListJobParametersRequest, ListJobParametersResponse> genForListJobParameters() {
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
            f -> f.withMarshaller(ListJobParametersRequest::getJobId, ListJobParametersRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobParametersRequest::getOffset, ListJobParametersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobParametersRequest::getLimit, ListJobParametersRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobParametersRequest::getName, ListJobParametersRequest::setName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobParametersRequest::getXLanguage, ListJobParametersRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobsRequest, ListJobsResponse> listJobs = genForListJobs();

    private static HttpRequestDef<ListJobsRequest, ListJobsResponse> genForListJobs() {
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
            f -> f.withMarshaller(ListJobsRequest::getJobType, ListJobsRequest::setJobType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getName, ListJobsRequest::setName));
        builder.<ListJobsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListJobsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListJobsRequest::getStatus, ListJobsRequest::setStatus));
        builder.<ListJobsRequest.EngineTypeEnum>withRequestField("engine_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListJobsRequest.EngineTypeEnum.class),
            f -> f.withMarshaller(ListJobsRequest::getEngineType, ListJobsRequest::setEngineType));
        builder.<ListJobsRequest.NetTypeEnum>withRequestField("net_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListJobsRequest.NetTypeEnum.class),
            f -> f.withMarshaller(ListJobsRequest::getNetType, ListJobsRequest::setNetType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getEnterpriseProjectId, ListJobsRequest::setEnterpriseProjectId));
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
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getSortKey, ListJobsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getSortDir, ListJobsRequest::setSortDir));
        builder.<List<String>>withRequestField("instance_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListJobsRequest::getInstanceIds, ListJobsRequest::setInstanceIds));
        builder.<String>withRequestField("instance_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getInstanceIp, ListJobsRequest::setInstanceIp));
        builder.<ListJobsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListJobsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListJobsRequest::getXLanguage, ListJobsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLinksRequest, ListLinksResponse> listLinks = genForListLinks();

    private static HttpRequestDef<ListLinksRequest, ListLinksResponse> genForListLinks() {
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
            f -> f.withMarshaller(ListLinksRequest::getJobType, ListLinksRequest::setJobType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLinksRequest::getOffset, ListLinksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLinksRequest::getLimit, ListLinksRequest::setLimit));
        builder.<ListLinksRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListLinksRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListLinksRequest::getXLanguage, ListLinksRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTags =
        genForListProjectTags();

    private static HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> genForListProjectTags() {
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
            f -> f.withMarshaller(ListProjectTagsRequest::getResourceType, ListProjectTagsRequest::setResourceType));
        builder.<ListProjectTagsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProjectTagsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getXLanguage, ListProjectTagsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListReplicationJobsRequest, ListReplicationJobsResponse> listReplicationJobs =
        genForListReplicationJobs();

    private static HttpRequestDef<ListReplicationJobsRequest, ListReplicationJobsResponse> genForListReplicationJobs() {
        // basic
        HttpRequestDef.Builder<ListReplicationJobsRequest, ListReplicationJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListReplicationJobsRequest.class, ListReplicationJobsResponse.class)
                .withName("ListReplicationJobs")
                .withUri("/v5/{project_id}/backup-migration-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReplicationJobsRequest::getName, ListReplicationJobsRequest::setName));
        builder.<ListReplicationJobsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListReplicationJobsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListReplicationJobsRequest::getStatus, ListReplicationJobsRequest::setStatus));
        builder.<List<String>>withRequestField("dbs_instance_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListReplicationJobsRequest::getDbsInstanceIds,
                ListReplicationJobsRequest::setDbsInstanceIds));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReplicationJobsRequest::getDescription,
                ListReplicationJobsRequest::setDescription));
        builder.<String>withRequestField("create_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReplicationJobsRequest::getCreateAt, ListReplicationJobsRequest::setCreateAt));
        builder.<String>withRequestField("completed_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReplicationJobsRequest::getCompletedAt,
                ListReplicationJobsRequest::setCompletedAt));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReplicationJobsRequest::getEnterpriseProjectId,
                ListReplicationJobsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReplicationJobsRequest::getTags, ListReplicationJobsRequest::setTags));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListReplicationJobsRequest::getLimit, ListReplicationJobsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListReplicationJobsRequest::getOffset, ListReplicationJobsRequest::setOffset));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReplicationJobsRequest::getSortKey, ListReplicationJobsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReplicationJobsRequest::getSortDir, ListReplicationJobsRequest::setSortDir));
        builder.<ListReplicationJobsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListReplicationJobsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListReplicationJobsRequest::getXLanguage, ListReplicationJobsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForListTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForListTags() {
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
            f -> f.withMarshaller(ListTagsRequest::getResourceType, ListTagsRequest::setResourceType));
        builder.<ListTagsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTagsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListTagsRequest::getXLanguage, ListTagsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserJdbcDriversRequest, ListUserJdbcDriversResponse> listUserJdbcDrivers =
        genForListUserJdbcDrivers();

    private static HttpRequestDef<ListUserJdbcDriversRequest, ListUserJdbcDriversResponse> genForListUserJdbcDrivers() {
        // basic
        HttpRequestDef.Builder<ListUserJdbcDriversRequest, ListUserJdbcDriversResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserJdbcDriversRequest.class, ListUserJdbcDriversResponse.class)
                .withName("ListUserJdbcDrivers")
                .withUri("/v5/{project_id}/drivers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserJdbcDriversRequest::getLimit, ListUserJdbcDriversRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserJdbcDriversRequest::getOffset, ListUserJdbcDriversRequest::setOffset));
        builder.<ListUserJdbcDriversRequest.DriverTypeEnum>withRequestField("driver_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListUserJdbcDriversRequest.DriverTypeEnum.class),
            f -> f.withMarshaller(ListUserJdbcDriversRequest::getDriverType,
                ListUserJdbcDriversRequest::setDriverType));
        builder.<ListUserJdbcDriversRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListUserJdbcDriversRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListUserJdbcDriversRequest::getXLanguage, ListUserJdbcDriversRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListsAgencyPermissionsRequest, ListsAgencyPermissionsResponse> listsAgencyPermissions =
        genForListsAgencyPermissions();

    private static HttpRequestDef<ListsAgencyPermissionsRequest, ListsAgencyPermissionsResponse> genForListsAgencyPermissions() {
        // basic
        HttpRequestDef.Builder<ListsAgencyPermissionsRequest, ListsAgencyPermissionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListsAgencyPermissionsRequest.class, ListsAgencyPermissionsResponse.class)
            .withName("ListsAgencyPermissions")
            .withUri("/v5/{project_id}/agency/permissions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListsAgencyPermissionsRequest::getSourceType,
                ListsAgencyPermissionsRequest::setSourceType));
        builder.<String>withRequestField("target_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListsAgencyPermissionsRequest::getTargetType,
                ListsAgencyPermissionsRequest::setTargetType));
        builder.<Boolean>withRequestField("is_non_dbs",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListsAgencyPermissionsRequest::getIsNonDbs,
                ListsAgencyPermissionsRequest::setIsNonDbs));
        builder.<ListsAgencyPermissionsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListsAgencyPermissionsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListsAgencyPermissionsRequest::getXLanguage,
                ListsAgencyPermissionsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyConnectionRequest, ModifyConnectionResponse> modifyConnection =
        genForModifyConnection();

    private static HttpRequestDef<ModifyConnectionRequest, ModifyConnectionResponse> genForModifyConnection() {
        // basic
        HttpRequestDef.Builder<ModifyConnectionRequest, ModifyConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyConnectionRequest.class, ModifyConnectionResponse.class)
                .withName("ModifyConnection")
                .withUri("/v5/{project_id}/connections/{connection_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyConnectionRequest::getConnectionId, ModifyConnectionRequest::setConnectionId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyConnectionRequest::getXLanguage, ModifyConnectionRequest::setXLanguage));
        builder.<UpdateConnectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateConnectionReq.class),
            f -> f.withMarshaller(ModifyConnectionRequest::getBody, ModifyConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowActionsRequest, ShowActionsResponse> showActions = genForShowActions();

    private static HttpRequestDef<ShowActionsRequest, ShowActionsResponse> genForShowActions() {
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
            f -> f.withMarshaller(ShowActionsRequest::getJobId, ShowActionsRequest::setJobId));
        builder.<ShowActionsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowActionsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowActionsRequest::getXLanguage, ShowActionsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowColumnInfoResultRequest, ShowColumnInfoResultResponse> showColumnInfoResult =
        genForShowColumnInfoResult();

    private static HttpRequestDef<ShowColumnInfoResultRequest, ShowColumnInfoResultResponse> genForShowColumnInfoResult() {
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
            f -> f.withMarshaller(ShowColumnInfoResultRequest::getJobId, ShowColumnInfoResultRequest::setJobId));
        builder.<String>withRequestField("query_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowColumnInfoResultRequest::getQueryId, ShowColumnInfoResultRequest::setQueryId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowColumnInfoResultRequest::getOffset, ShowColumnInfoResultRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowColumnInfoResultRequest::getLimit, ShowColumnInfoResultRequest::setLimit));
        builder.<ShowColumnInfoResultRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowColumnInfoResultRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowColumnInfoResultRequest::getXLanguage,
                ShowColumnInfoResultRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComparePolicyRequest, ShowComparePolicyResponse> showComparePolicy =
        genForShowComparePolicy();

    private static HttpRequestDef<ShowComparePolicyRequest, ShowComparePolicyResponse> genForShowComparePolicy() {
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
            f -> f.withMarshaller(ShowComparePolicyRequest::getJobId, ShowComparePolicyRequest::setJobId));
        builder.<ShowComparePolicyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowComparePolicyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowComparePolicyRequest::getXLanguage, ShowComparePolicyRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataFilteringResultRequest, ShowDataFilteringResultResponse> showDataFilteringResult =
        genForShowDataFilteringResult();

    private static HttpRequestDef<ShowDataFilteringResultRequest, ShowDataFilteringResultResponse> genForShowDataFilteringResult() {
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
            f -> f.withMarshaller(ShowDataFilteringResultRequest::getJobId, ShowDataFilteringResultRequest::setJobId));
        builder.<String>withRequestField("query_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataFilteringResultRequest::getQueryId,
                ShowDataFilteringResultRequest::setQueryId));
        builder.<ShowDataFilteringResultRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDataFilteringResultRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowDataFilteringResultRequest::getXLanguage,
                ShowDataFilteringResultRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataProcessingRulesResultRequest, ShowDataProcessingRulesResultResponse> showDataProcessingRulesResult =
        genForShowDataProcessingRulesResult();

    private static HttpRequestDef<ShowDataProcessingRulesResultRequest, ShowDataProcessingRulesResultResponse> genForShowDataProcessingRulesResult() {
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
            f -> f.withMarshaller(ShowDataProcessingRulesResultRequest::getJobId,
                ShowDataProcessingRulesResultRequest::setJobId));
        builder.<String>withRequestField("query_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataProcessingRulesResultRequest::getQueryId,
                ShowDataProcessingRulesResultRequest::setQueryId));
        builder.<ShowDataProcessingRulesResultRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDataProcessingRulesResultRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowDataProcessingRulesResultRequest::getXLanguage,
                ShowDataProcessingRulesResultRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataProgressRequest, ShowDataProgressResponse> showDataProgress =
        genForShowDataProgress();

    private static HttpRequestDef<ShowDataProgressRequest, ShowDataProgressResponse> genForShowDataProgress() {
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
            f -> f.withMarshaller(ShowDataProgressRequest::getJobId, ShowDataProgressRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDataProgressRequest::getOffset, ShowDataProgressRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDataProgressRequest::getLimit, ShowDataProgressRequest::setLimit));
        builder.<ShowDataProgressRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDataProgressRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowDataProgressRequest::getXLanguage, ShowDataProgressRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDbObjectCollectionStatusRequest, ShowDbObjectCollectionStatusResponse> showDbObjectCollectionStatus =
        genForShowDbObjectCollectionStatus();

    private static HttpRequestDef<ShowDbObjectCollectionStatusRequest, ShowDbObjectCollectionStatusResponse> genForShowDbObjectCollectionStatus() {
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
            f -> f.withMarshaller(ShowDbObjectCollectionStatusRequest::getJobId,
                ShowDbObjectCollectionStatusRequest::setJobId));
        builder.<String>withRequestField("query_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDbObjectCollectionStatusRequest::getQueryId,
                ShowDbObjectCollectionStatusRequest::setQueryId));
        builder.<ShowDbObjectCollectionStatusRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDbObjectCollectionStatusRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowDbObjectCollectionStatusRequest::getXLanguage,
                ShowDbObjectCollectionStatusRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDbObjectTemplateProgressRequest, ShowDbObjectTemplateProgressResponse> showDbObjectTemplateProgress =
        genForShowDbObjectTemplateProgress();

    private static HttpRequestDef<ShowDbObjectTemplateProgressRequest, ShowDbObjectTemplateProgressResponse> genForShowDbObjectTemplateProgress() {
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
            f -> f.withMarshaller(ShowDbObjectTemplateProgressRequest::getJobId,
                ShowDbObjectTemplateProgressRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDbObjectTemplateProgressRequest::getOffset,
                ShowDbObjectTemplateProgressRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDbObjectTemplateProgressRequest::getLimit,
                ShowDbObjectTemplateProgressRequest::setLimit));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDbObjectTemplateProgressRequest::getType,
                ShowDbObjectTemplateProgressRequest::setType));
        builder.<ShowDbObjectTemplateProgressRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDbObjectTemplateProgressRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowDbObjectTemplateProgressRequest::getXLanguage,
                ShowDbObjectTemplateProgressRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDbObjectTemplateResultRequest, ShowDbObjectTemplateResultResponse> showDbObjectTemplateResult =
        genForShowDbObjectTemplateResult();

    private static HttpRequestDef<ShowDbObjectTemplateResultRequest, ShowDbObjectTemplateResultResponse> genForShowDbObjectTemplateResult() {
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
            f -> f.withMarshaller(ShowDbObjectTemplateResultRequest::getJobId,
                ShowDbObjectTemplateResultRequest::setJobId));
        builder.<ShowDbObjectTemplateResultRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowDbObjectTemplateResultRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowDbObjectTemplateResultRequest::getType,
                ShowDbObjectTemplateResultRequest::setType));
        builder.<String>withRequestField("file_export_object_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDbObjectTemplateResultRequest::getFileExportObjectLevel,
                ShowDbObjectTemplateResultRequest::setFileExportObjectLevel));
        builder.<ShowDbObjectTemplateResultRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDbObjectTemplateResultRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowDbObjectTemplateResultRequest::getXLanguage,
                ShowDbObjectTemplateResultRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDbObjectsListRequest, ShowDbObjectsListResponse> showDbObjectsList =
        genForShowDbObjectsList();

    private static HttpRequestDef<ShowDbObjectsListRequest, ShowDbObjectsListResponse> genForShowDbObjectsList() {
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
            f -> f.withMarshaller(ShowDbObjectsListRequest::getJobId, ShowDbObjectsListRequest::setJobId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDbObjectsListRequest::getType, ShowDbObjectsListRequest::setType));
        builder.<ShowDbObjectsListRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDbObjectsListRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowDbObjectsListRequest::getXLanguage, ShowDbObjectsListRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDirtyDataRequest, ShowDirtyDataResponse> showDirtyData =
        genForShowDirtyData();

    private static HttpRequestDef<ShowDirtyDataRequest, ShowDirtyDataResponse> genForShowDirtyData() {
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
            f -> f.withMarshaller(ShowDirtyDataRequest::getJobId, ShowDirtyDataRequest::setJobId));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDirtyDataRequest::getBeginTime, ShowDirtyDataRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDirtyDataRequest::getEndTime, ShowDirtyDataRequest::setEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDirtyDataRequest::getOffset, ShowDirtyDataRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDirtyDataRequest::getLimit, ShowDirtyDataRequest::setLimit));
        builder.<ShowDirtyDataRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDirtyDataRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowDirtyDataRequest::getXLanguage, ShowDirtyDataRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse> showEnterpriseProject =
        genForShowEnterpriseProject();

    private static HttpRequestDef<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse> genForShowEnterpriseProject() {
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
            f -> f.withMarshaller(ShowEnterpriseProjectRequest::getOffset, ShowEnterpriseProjectRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowEnterpriseProjectRequest::getLimit, ShowEnterpriseProjectRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnterpriseProjectRequest::getName, ShowEnterpriseProjectRequest::setName));
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnterpriseProjectRequest::getDomainId,
                ShowEnterpriseProjectRequest::setDomainId));
        builder.<ShowEnterpriseProjectRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowEnterpriseProjectRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowEnterpriseProjectRequest::getXLanguage,
                ShowEnterpriseProjectRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHealthCompareJobDetailRequest, ShowHealthCompareJobDetailResponse> showHealthCompareJobDetail =
        genForShowHealthCompareJobDetail();

    private static HttpRequestDef<ShowHealthCompareJobDetailRequest, ShowHealthCompareJobDetailResponse> genForShowHealthCompareJobDetail() {
        // basic
        HttpRequestDef.Builder<ShowHealthCompareJobDetailRequest, ShowHealthCompareJobDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowHealthCompareJobDetailRequest.class,
                    ShowHealthCompareJobDetailResponse.class)
                .withName("ShowHealthCompareJobDetail")
                .withUri("/v5/{project_id}/jobs/{job_id}/health-compare-jobs/{compare_job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHealthCompareJobDetailRequest::getJobId,
                ShowHealthCompareJobDetailRequest::setJobId));
        builder.<String>withRequestField("compare_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHealthCompareJobDetailRequest::getCompareJobId,
                ShowHealthCompareJobDetailRequest::setCompareJobId));
        builder.<ShowHealthCompareJobDetailRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowHealthCompareJobDetailRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowHealthCompareJobDetailRequest::getXLanguage,
                ShowHealthCompareJobDetailRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHealthCompareJobListRequest, ShowHealthCompareJobListResponse> showHealthCompareJobList =
        genForShowHealthCompareJobList();

    private static HttpRequestDef<ShowHealthCompareJobListRequest, ShowHealthCompareJobListResponse> genForShowHealthCompareJobList() {
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
            f -> f.withMarshaller(ShowHealthCompareJobListRequest::getJobId,
                ShowHealthCompareJobListRequest::setJobId));
        builder.<ShowHealthCompareJobListRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowHealthCompareJobListRequest.StatusEnum.class),
            f -> f.withMarshaller(ShowHealthCompareJobListRequest::getStatus,
                ShowHealthCompareJobListRequest::setStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHealthCompareJobListRequest::getOffset,
                ShowHealthCompareJobListRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHealthCompareJobListRequest::getLimit,
                ShowHealthCompareJobListRequest::setLimit));
        builder.<ShowHealthCompareJobListRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowHealthCompareJobListRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowHealthCompareJobListRequest::getXLanguage,
                ShowHealthCompareJobListRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHealthObjectCompareJobOverviewRequest, ShowHealthObjectCompareJobOverviewResponse> showHealthObjectCompareJobOverview =
        genForShowHealthObjectCompareJobOverview();

    private static HttpRequestDef<ShowHealthObjectCompareJobOverviewRequest, ShowHealthObjectCompareJobOverviewResponse> genForShowHealthObjectCompareJobOverview() {
        // basic
        HttpRequestDef.Builder<ShowHealthObjectCompareJobOverviewRequest, ShowHealthObjectCompareJobOverviewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowHealthObjectCompareJobOverviewRequest.class,
                    ShowHealthObjectCompareJobOverviewResponse.class)
                .withName("ShowHealthObjectCompareJobOverview")
                .withUri("/v5/{project_id}/jobs/{job_id}/health-compare-jobs/object/{compare_job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHealthObjectCompareJobOverviewRequest::getJobId,
                ShowHealthObjectCompareJobOverviewRequest::setJobId));
        builder.<String>withRequestField("compare_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHealthObjectCompareJobOverviewRequest::getCompareJobId,
                ShowHealthObjectCompareJobOverviewRequest::setCompareJobId));
        builder.<ShowHealthObjectCompareJobOverviewRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowHealthObjectCompareJobOverviewRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowHealthObjectCompareJobOverviewRequest::getXLanguage,
                ShowHealthObjectCompareJobOverviewRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIncrementComponentsDetailRequest, ShowIncrementComponentsDetailResponse> showIncrementComponentsDetail =
        genForShowIncrementComponentsDetail();

    private static HttpRequestDef<ShowIncrementComponentsDetailRequest, ShowIncrementComponentsDetailResponse> genForShowIncrementComponentsDetail() {
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
            f -> f.withMarshaller(ShowIncrementComponentsDetailRequest::getJobId,
                ShowIncrementComponentsDetailRequest::setJobId));
        builder.<ShowIncrementComponentsDetailRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowIncrementComponentsDetailRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowIncrementComponentsDetailRequest::getXLanguage,
                ShowIncrementComponentsDetailRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceTagsRequest, ShowInstanceTagsResponse> showInstanceTags =
        genForShowInstanceTags();

    private static HttpRequestDef<ShowInstanceTagsRequest, ShowInstanceTagsResponse> genForShowInstanceTags() {
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
            f -> f.withMarshaller(ShowInstanceTagsRequest::getResourceType, ShowInstanceTagsRequest::setResourceType));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceTagsRequest::getJobId, ShowInstanceTagsRequest::setJobId));
        builder.<ShowInstanceTagsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowInstanceTagsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowInstanceTagsRequest::getXLanguage, ShowInstanceTagsRequest::setXLanguage));

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
                .withUri("/v5/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getJobId, ShowJobDetailRequest::setJobId));
        builder.<ShowJobDetailRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowJobDetailRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getType, ShowJobDetailRequest::setType));
        builder.<String>withRequestField("query_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getQueryId, ShowJobDetailRequest::setQueryId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getOffset, ShowJobDetailRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getLimit, ShowJobDetailRequest::setLimit));
        builder.<ShowJobDetailRequest.CompareTypeEnum>withRequestField("compare_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobDetailRequest.CompareTypeEnum.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getCompareType, ShowJobDetailRequest::setCompareType));
        builder.<ShowJobDetailRequest.QueryTypeEnum>withRequestField("query_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobDetailRequest.QueryTypeEnum.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getQueryType, ShowJobDetailRequest::setQueryType));
        builder.<ShowJobDetailRequest.ObjectTypeEnum>withRequestField("object_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobDetailRequest.ObjectTypeEnum.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getObjectType, ShowJobDetailRequest::setObjectType));
        builder.<String>withRequestField("compare_task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getCompareTaskId, ShowJobDetailRequest::setCompareTaskId));
        builder.<String>withRequestField("source_db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getSourceDbName, ShowJobDetailRequest::setSourceDbName));
        builder.<String>withRequestField("target_db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getTargetDbName, ShowJobDetailRequest::setTargetDbName));
        builder.<ShowJobDetailRequest.CompareDetailTypeEnum>withRequestField("compare_detail_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobDetailRequest.CompareDetailTypeEnum.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getCompareDetailType,
                ShowJobDetailRequest::setCompareDetailType));
        builder.<ShowJobDetailRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobDetailRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getXLanguage, ShowJobDetailRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMeteringRequest, ShowMeteringResponse> showMetering = genForShowMetering();

    private static HttpRequestDef<ShowMeteringRequest, ShowMeteringResponse> genForShowMetering() {
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
            f -> f.withMarshaller(ShowMeteringRequest::getJobId, ShowMeteringRequest::setJobId));
        builder.<ShowMeteringRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowMeteringRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowMeteringRequest::getXLanguage, ShowMeteringRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMonitorDataRequest, ShowMonitorDataResponse> showMonitorData =
        genForShowMonitorData();

    private static HttpRequestDef<ShowMonitorDataRequest, ShowMonitorDataResponse> genForShowMonitorData() {
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
            f -> f.withMarshaller(ShowMonitorDataRequest::getJobId, ShowMonitorDataRequest::setJobId));
        builder.<ShowMonitorDataRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowMonitorDataRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowMonitorDataRequest::getXLanguage, ShowMonitorDataRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowObjectMappingRequest, ShowObjectMappingResponse> showObjectMapping =
        genForShowObjectMapping();

    private static HttpRequestDef<ShowObjectMappingRequest, ShowObjectMappingResponse> genForShowObjectMapping() {
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
            f -> f.withMarshaller(ShowObjectMappingRequest::getJobId, ShowObjectMappingRequest::setJobId));
        builder.<ShowObjectMappingRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowObjectMappingRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowObjectMappingRequest::getXLanguage, ShowObjectMappingRequest::setXLanguage));
        builder.<QueryUserSelectedObjectInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryUserSelectedObjectInfoReq.class),
            f -> f.withMarshaller(ShowObjectMappingRequest::getBody, ShowObjectMappingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPositionResultRequest, ShowPositionResultResponse> showPositionResult =
        genForShowPositionResult();

    private static HttpRequestDef<ShowPositionResultRequest, ShowPositionResultResponse> genForShowPositionResult() {
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
            f -> f.withMarshaller(ShowPositionResultRequest::getJobId, ShowPositionResultRequest::setJobId));
        builder.<String>withRequestField("query_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPositionResultRequest::getQueryId, ShowPositionResultRequest::setQueryId));
        builder.<ShowPositionResultRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowPositionResultRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowPositionResultRequest::getXLanguage, ShowPositionResultRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProgressDataRequest, ShowProgressDataResponse> showProgressData =
        genForShowProgressData();

    private static HttpRequestDef<ShowProgressDataRequest, ShowProgressDataResponse> genForShowProgressData() {
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
            f -> f.withMarshaller(ShowProgressDataRequest::getJobId, ShowProgressDataRequest::setJobId));
        builder.<String>withRequestField("type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProgressDataRequest::getType, ShowProgressDataRequest::setType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProgressDataRequest::getOffset, ShowProgressDataRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProgressDataRequest::getLimit, ShowProgressDataRequest::setLimit));
        builder.<ShowProgressDataRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowProgressDataRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowProgressDataRequest::getXLanguage, ShowProgressDataRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReplayResultsRequest, ShowReplayResultsResponse> showReplayResults =
        genForShowReplayResults();

    private static HttpRequestDef<ShowReplayResultsRequest, ShowReplayResultsResponse> genForShowReplayResults() {
        // basic
        HttpRequestDef.Builder<ShowReplayResultsRequest, ShowReplayResultsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowReplayResultsRequest.class, ShowReplayResultsResponse.class)
                .withName("ShowReplayResults")
                .withUri("/v5/{project_id}/jobs/{job_id}/replay-results")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReplayResultsRequest::getJobId, ShowReplayResultsRequest::setJobId));
        builder.<ShowReplayResultsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowReplayResultsRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowReplayResultsRequest::getType, ShowReplayResultsRequest::setType));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReplayResultsRequest::getStartTime, ShowReplayResultsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReplayResultsRequest::getEndTime, ShowReplayResultsRequest::setEndTime));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowReplayResultsRequest::getOffset, ShowReplayResultsRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowReplayResultsRequest::getLimit, ShowReplayResultsRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReplayResultsRequest::getSortKey, ShowReplayResultsRequest::setSortKey));
        builder.<ShowReplayResultsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowReplayResultsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ShowReplayResultsRequest::getSortDir, ShowReplayResultsRequest::setSortDir));
        builder.<ShowReplayResultsRequest.TargetNameEnum>withRequestField("target_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowReplayResultsRequest.TargetNameEnum.class),
            f -> f.withMarshaller(ShowReplayResultsRequest::getTargetName, ShowReplayResultsRequest::setTargetName));
        builder.<Boolean>withRequestField("is_sample",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowReplayResultsRequest::getIsSample, ShowReplayResultsRequest::setIsSample));
        builder.<String>withRequestField("error_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReplayResultsRequest::getErrorType, ShowReplayResultsRequest::setErrorType));
        builder.<String>withRequestField("sql_template_md5",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReplayResultsRequest::getSqlTemplateMd5,
                ShowReplayResultsRequest::setSqlTemplateMd5));
        builder.<ShowReplayResultsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowReplayResultsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowReplayResultsRequest::getXLanguage, ShowReplayResultsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReplicationJobRequest, ShowReplicationJobResponse> showReplicationJob =
        genForShowReplicationJob();

    private static HttpRequestDef<ShowReplicationJobRequest, ShowReplicationJobResponse> genForShowReplicationJob() {
        // basic
        HttpRequestDef.Builder<ShowReplicationJobRequest, ShowReplicationJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowReplicationJobRequest.class, ShowReplicationJobResponse.class)
                .withName("ShowReplicationJob")
                .withUri("/v5/{project_id}/backup-migration-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReplicationJobRequest::getJobId, ShowReplicationJobRequest::setJobId));
        builder.<ShowReplicationJobRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowReplicationJobRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowReplicationJobRequest::getXLanguage, ShowReplicationJobRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSupportObjectTypeRequest, ShowSupportObjectTypeResponse> showSupportObjectType =
        genForShowSupportObjectType();

    private static HttpRequestDef<ShowSupportObjectTypeRequest, ShowSupportObjectTypeResponse> genForShowSupportObjectType() {
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
            f -> f.withMarshaller(ShowSupportObjectTypeRequest::getJobId, ShowSupportObjectTypeRequest::setJobId));
        builder.<ShowSupportObjectTypeRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowSupportObjectTypeRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowSupportObjectTypeRequest::getXLanguage,
                ShowSupportObjectTypeRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUpdateObjectSavingStatusRequest, ShowUpdateObjectSavingStatusResponse> showUpdateObjectSavingStatus =
        genForShowUpdateObjectSavingStatus();

    private static HttpRequestDef<ShowUpdateObjectSavingStatusRequest, ShowUpdateObjectSavingStatusResponse> genForShowUpdateObjectSavingStatus() {
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
            f -> f.withMarshaller(ShowUpdateObjectSavingStatusRequest::getJobId,
                ShowUpdateObjectSavingStatusRequest::setJobId));
        builder.<String>withRequestField("query_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpdateObjectSavingStatusRequest::getQueryId,
                ShowUpdateObjectSavingStatusRequest::setQueryId));
        builder.<ShowUpdateObjectSavingStatusRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowUpdateObjectSavingStatusRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowUpdateObjectSavingStatusRequest::getXLanguage,
                ShowUpdateObjectSavingStatusRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopJobActionRequest, StopJobActionResponse> stopJobAction =
        genForStopJobAction();

    private static HttpRequestDef<StopJobActionRequest, StopJobActionResponse> genForStopJobAction() {
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
            f -> f.withMarshaller(StopJobActionRequest::getJobId, StopJobActionRequest::setJobId));
        builder.<StopJobActionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StopJobActionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StopJobActionRequest::getXLanguage, StopJobActionRequest::setXLanguage));
        builder.<StopJobActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StopJobActionReq.class),
            f -> f.withMarshaller(StopJobActionRequest::getBody, StopJobActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SyncJdbcDriverRequest, SyncJdbcDriverResponse> syncJdbcDriver =
        genForSyncJdbcDriver();

    private static HttpRequestDef<SyncJdbcDriverRequest, SyncJdbcDriverResponse> genForSyncJdbcDriver() {
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
            f -> f.withMarshaller(SyncJdbcDriverRequest::getJobId, SyncJdbcDriverRequest::setJobId));
        builder.<SyncJdbcDriverRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SyncJdbcDriverRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SyncJdbcDriverRequest::getXLanguage, SyncJdbcDriverRequest::setXLanguage));
        builder.<UpdateDriverReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDriverReq.class),
            f -> f.withMarshaller(SyncJdbcDriverRequest::getBody, SyncJdbcDriverRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SyncUserJdbcDriverRequest, SyncUserJdbcDriverResponse> syncUserJdbcDriver =
        genForSyncUserJdbcDriver();

    private static HttpRequestDef<SyncUserJdbcDriverRequest, SyncUserJdbcDriverResponse> genForSyncUserJdbcDriver() {
        // basic
        HttpRequestDef.Builder<SyncUserJdbcDriverRequest, SyncUserJdbcDriverResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SyncUserJdbcDriverRequest.class, SyncUserJdbcDriverResponse.class)
                .withName("SyncUserJdbcDriver")
                .withUri("/v5/{project_id}/jobs/{job_id}/update-driver")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SyncUserJdbcDriverRequest::getJobId, SyncUserJdbcDriverRequest::setJobId));
        builder.<SyncUserJdbcDriverRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SyncUserJdbcDriverRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SyncUserJdbcDriverRequest::getXLanguage, SyncUserJdbcDriverRequest::setXLanguage));
        builder.<UpdateUserDriverReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserDriverReq.class),
            f -> f.withMarshaller(SyncUserJdbcDriverRequest::getBody, SyncUserJdbcDriverRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBatchAsyncJobsRequest, UpdateBatchAsyncJobsResponse> updateBatchAsyncJobs =
        genForUpdateBatchAsyncJobs();

    private static HttpRequestDef<UpdateBatchAsyncJobsRequest, UpdateBatchAsyncJobsResponse> genForUpdateBatchAsyncJobs() {
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
            f -> f.withMarshaller(UpdateBatchAsyncJobsRequest::getAsyncJobId,
                UpdateBatchAsyncJobsRequest::setAsyncJobId));
        builder.<UpdateBatchAsyncJobsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateBatchAsyncJobsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateBatchAsyncJobsRequest::getXLanguage,
                UpdateBatchAsyncJobsRequest::setXLanguage));
        builder.<BatchAsyncUpdateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAsyncUpdateJobReq.class),
            f -> f.withMarshaller(UpdateBatchAsyncJobsRequest::getBody, UpdateBatchAsyncJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateComparePolicyRequest, UpdateComparePolicyResponse> updateComparePolicy =
        genForUpdateComparePolicy();

    private static HttpRequestDef<UpdateComparePolicyRequest, UpdateComparePolicyResponse> genForUpdateComparePolicy() {
        // basic
        HttpRequestDef.Builder<UpdateComparePolicyRequest, UpdateComparePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateComparePolicyRequest.class, UpdateComparePolicyResponse.class)
                .withName("UpdateComparePolicy")
                .withUri("/v5/{project_id}/jobs/{job_id}/compare-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComparePolicyRequest::getJobId, UpdateComparePolicyRequest::setJobId));
        builder.<UpdateComparePolicyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateComparePolicyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateComparePolicyRequest::getXLanguage, UpdateComparePolicyRequest::setXLanguage));
        builder.<ModifyComparePolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyComparePolicyReq.class),
            f -> f.withMarshaller(UpdateComparePolicyRequest::getBody, UpdateComparePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataProgressRequest, UpdateDataProgressResponse> updateDataProgress =
        genForUpdateDataProgress();

    private static HttpRequestDef<UpdateDataProgressRequest, UpdateDataProgressResponse> genForUpdateDataProgress() {
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
            f -> f.withMarshaller(UpdateDataProgressRequest::getJobId, UpdateDataProgressRequest::setJobId));
        builder.<UpdateDataProgressRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDataProgressRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateDataProgressRequest::getXLanguage, UpdateDataProgressRequest::setXLanguage));
        builder.<DataProcessReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DataProcessReq.class),
            f -> f.withMarshaller(UpdateDataProgressRequest::getBody, UpdateDataProgressRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateJobRequest, UpdateJobResponse> updateJob = genForUpdateJob();

    private static HttpRequestDef<UpdateJobRequest, UpdateJobResponse> genForUpdateJob() {
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
            f -> f.withMarshaller(UpdateJobRequest::getJobId, UpdateJobRequest::setJobId));
        builder.<UpdateJobRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateJobRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateJobRequest::getXLanguage, UpdateJobRequest::setXLanguage));
        builder.<SingleUpdateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SingleUpdateJobReq.class),
            f -> f.withMarshaller(UpdateJobRequest::getBody, UpdateJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateJobConfigurationsRequest, UpdateJobConfigurationsResponse> updateJobConfigurations =
        genForUpdateJobConfigurations();

    private static HttpRequestDef<UpdateJobConfigurationsRequest, UpdateJobConfigurationsResponse> genForUpdateJobConfigurations() {
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
            f -> f.withMarshaller(UpdateJobConfigurationsRequest::getJobId, UpdateJobConfigurationsRequest::setJobId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateJobConfigurationsRequest::getXLanguage,
                UpdateJobConfigurationsRequest::setXLanguage));
        builder.<ModifyParameterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyParameterReq.class),
            f -> f.withMarshaller(UpdateJobConfigurationsRequest::getBody, UpdateJobConfigurationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateReplicationJobRequest, UpdateReplicationJobResponse> updateReplicationJob =
        genForUpdateReplicationJob();

    private static HttpRequestDef<UpdateReplicationJobRequest, UpdateReplicationJobResponse> genForUpdateReplicationJob() {
        // basic
        HttpRequestDef.Builder<UpdateReplicationJobRequest, UpdateReplicationJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateReplicationJobRequest.class, UpdateReplicationJobResponse.class)
            .withName("UpdateReplicationJob")
            .withUri("/v5/{project_id}/backup-migration-jobs/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReplicationJobRequest::getJobId, UpdateReplicationJobRequest::setJobId));
        builder.<UpdateReplicationJobRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateReplicationJobRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateReplicationJobRequest::getXLanguage,
                UpdateReplicationJobRequest::setXLanguage));
        builder.<ModifyOfflineTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyOfflineTaskReq.class),
            f -> f.withMarshaller(UpdateReplicationJobRequest::getBody, UpdateReplicationJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStartPositionRequest, UpdateStartPositionResponse> updateStartPosition =
        genForUpdateStartPosition();

    private static HttpRequestDef<UpdateStartPositionRequest, UpdateStartPositionResponse> genForUpdateStartPosition() {
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
            f -> f.withMarshaller(UpdateStartPositionRequest::getJobId, UpdateStartPositionRequest::setJobId));
        builder.<UpdateStartPositionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateStartPositionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateStartPositionRequest::getXLanguage, UpdateStartPositionRequest::setXLanguage));
        builder.<ModifyStartPositionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyStartPositionReq.class),
            f -> f.withMarshaller(UpdateStartPositionRequest::getBody, UpdateStartPositionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadDbObjectTemplateRequest, UploadDbObjectTemplateResponse> uploadDbObjectTemplate =
        genForUploadDbObjectTemplate();

    private static HttpRequestDef<UploadDbObjectTemplateRequest, UploadDbObjectTemplateResponse> genForUploadDbObjectTemplate() {
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
            f -> f.withMarshaller(UploadDbObjectTemplateRequest::getJobId, UploadDbObjectTemplateRequest::setJobId));
        builder.<UploadDbObjectTemplateRequest.FileImportDbLevelEnum>withRequestField("file_import_db_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UploadDbObjectTemplateRequest.FileImportDbLevelEnum.class),
            f -> f.withMarshaller(UploadDbObjectTemplateRequest::getFileImportDbLevel,
                UploadDbObjectTemplateRequest::setFileImportDbLevel));
        builder.<UploadDbObjectTemplateRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UploadDbObjectTemplateRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UploadDbObjectTemplateRequest::getXLanguage,
                UploadDbObjectTemplateRequest::setXLanguage));
        builder.<UploadDbObjectTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadDbObjectTemplateRequestBody.class),
            f -> f.withMarshaller(UploadDbObjectTemplateRequest::getBody, UploadDbObjectTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadJdbcDriverRequest, UploadJdbcDriverResponse> uploadJdbcDriver =
        genForUploadJdbcDriver();

    private static HttpRequestDef<UploadJdbcDriverRequest, UploadJdbcDriverResponse> genForUploadJdbcDriver() {
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
            f -> f.withMarshaller(UploadJdbcDriverRequest::getXLanguage, UploadJdbcDriverRequest::setXLanguage));
        builder.<UploadJdbcDriverRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadJdbcDriverRequestBody.class),
            f -> f.withMarshaller(UploadJdbcDriverRequest::getBody, UploadJdbcDriverRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadUserJdbcDriverRequest, UploadUserJdbcDriverResponse> uploadUserJdbcDriver =
        genForUploadUserJdbcDriver();

    private static HttpRequestDef<UploadUserJdbcDriverRequest, UploadUserJdbcDriverResponse> genForUploadUserJdbcDriver() {
        // basic
        HttpRequestDef.Builder<UploadUserJdbcDriverRequest, UploadUserJdbcDriverResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UploadUserJdbcDriverRequest.class, UploadUserJdbcDriverResponse.class)
            .withName("UploadUserJdbcDriver")
            .withUri("/v5/{project_id}/driver")
            .withContentType("multipart/form-data");

        // requests
        builder.<UploadUserJdbcDriverRequest.DriverTypeEnum>withRequestField("driver_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadUserJdbcDriverRequest.DriverTypeEnum.class),
            f -> f.withMarshaller(UploadUserJdbcDriverRequest::getDriverType,
                UploadUserJdbcDriverRequest::setDriverType));
        builder.<UploadUserJdbcDriverRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UploadUserJdbcDriverRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UploadUserJdbcDriverRequest::getXLanguage,
                UploadUserJdbcDriverRequest::setXLanguage));
        builder.<UploadUserJdbcDriverRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadUserJdbcDriverRequestBody.class),
            f -> f.withMarshaller(UploadUserJdbcDriverRequest::getBody, UploadUserJdbcDriverRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateJobNameRequest, ValidateJobNameResponse> validateJobName =
        genForValidateJobName();

    private static HttpRequestDef<ValidateJobNameRequest, ValidateJobNameResponse> genForValidateJobName() {
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
            f -> f.withMarshaller(ValidateJobNameRequest::getXLanguage, ValidateJobNameRequest::setXLanguage));
        builder.<CheckJobNameReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckJobNameReq.class),
            f -> f.withMarshaller(ValidateJobNameRequest::getBody, ValidateJobNameRequest::setBody));

        // response

        return builder.build();
    }

}
