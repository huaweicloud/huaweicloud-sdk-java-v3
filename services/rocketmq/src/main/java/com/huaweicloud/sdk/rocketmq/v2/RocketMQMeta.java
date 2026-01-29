package com.huaweicloud.sdk.rocketmq.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.rocketmq.v2.model.AlterAutoVolumeExpandConfig;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchCreateOrDeleteRocketmqTagRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchCreateOrDeleteRocketmqTagResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchCreateOrDeleteTagReq;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteDiagnosisRecordsForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteDiagnosisRecordsForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteDiagnosisRecordsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteDiagnosisRecordsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteDiagnosisReportReq;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteInstanceReq;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteInstancesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteInstancesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteRocketMqMigrationTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteRocketMqMigrationTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchResumeInstanceReq;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchUpdateConsumerGroupReq;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchUpdateConsumerGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchUpdateConsumerGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateConsumerGroupOrBatchDeleteConsumerGroupReq;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateConsumerGroupOrBatchDeleteConsumerGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateConsumerGroupOrBatchDeleteConsumerGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateDiagnosisTaskForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateDiagnosisTaskForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateDiagnosisTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateDiagnosisTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateInstanceByEngineReq;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateInstanceByEngineRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateInstanceByEngineResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreatePostPaidInstanceForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreatePostPaidInstanceForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreatePostPaidInstanceReq;
import com.huaweicloud.sdk.rocketmq.v2.model.CreatePostPaidInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreatePostPaidInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateRocketMqMigrationTaskReq;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateRocketMqMigrationTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateRocketMqMigrationTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateTopicOrBatchDeleteTopicReq;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateTopicOrBatchDeleteTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateTopicOrBatchDeleteTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeadletterResendReq;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteBackgroundTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteBackgroundTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteConsumerGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteConsumerGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteScheduledTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteScheduledTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DiagnosisReq;
import com.huaweicloud.sdk.rocketmq.v2.model.EnableDnsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.EnableDnsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListAvailableZonesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListAvailableZonesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListBackgroundTasksRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListBackgroundTasksResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListBrokersRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListBrokersResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConfigFeaturesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConfigFeaturesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumeGroupAccessPolicyForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumeGroupAccessPolicyForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumeGroupAccessPolicyRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumeGroupAccessPolicyResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumerGroupOfTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumerGroupOfTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListDiagnosisReportsForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListDiagnosisReportsForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListDiagnosisReportsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListDiagnosisReportsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListEngineProductsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListEngineProductsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstanceConsumerGroupsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstanceConsumerGroupsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstancesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstancesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessageTraceForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessageTraceForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessageTraceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessageTraceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessagesForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessagesForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessagesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessagesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListRocketInstanceTopicsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListRocketInstanceTopicsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListRocketMqMigrationTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListRocketMqMigrationTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListScheduledTasksRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListScheduledTasksResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListTopicAccessPolicyRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListTopicAccessPolicyResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.MetadataDeleteReq;
import com.huaweicloud.sdk.rocketmq.v2.model.ModifyConfigReq;
import com.huaweicloud.sdk.rocketmq.v2.model.ModifyInstanceSslConfigRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ModifyInstanceSslConfigResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ModifyRecyclePolicyReq;
import com.huaweicloud.sdk.rocketmq.v2.model.ModifyRecyclePolicyRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ModifyRecyclePolicyResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.PlainSSLSwitchRep;
import com.huaweicloud.sdk.rocketmq.v2.model.ResendReq;
import com.huaweicloud.sdk.rocketmq.v2.model.ResetConsumeOffsetForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ResetConsumeOffsetForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ResetConsumeOffsetReq;
import com.huaweicloud.sdk.rocketmq.v2.model.ResetConsumeOffsetRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ResetConsumeOffsetResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ResizeEngineInstanceReq;
import com.huaweicloud.sdk.rocketmq.v2.model.ResizeInstanceForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ResizeInstanceForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.RestoreRecycleInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.RestoreRecycleInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.SendDlqMessageForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.SendDlqMessageForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.SendDlqMessageRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.SendDlqMessageResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.SendMessageForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.SendMessageForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.SendMessageReq;
import com.huaweicloud.sdk.rocketmq.v2.model.SendMessageRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.SendMessageResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowBackgroundTaskProgressRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowBackgroundTaskProgressResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowBackgroundTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowBackgroundTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowCesHierarchyRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowCesHierarchyResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerConnectionsForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerConnectionsForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerConnectionsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerConnectionsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerListOrDetailsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerListOrDetailsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowDiagnosisReportForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowDiagnosisReportForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowDiagnosisReportRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowDiagnosisReportResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowDiagnosisStackForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowDiagnosisStackForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowDiagnosisStackRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowDiagnosisStackResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowEngineInstanceExtendProductInfoForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowEngineInstanceExtendProductInfoForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowEngineInstanceExtendProductInfoRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowEngineInstanceExtendProductInfoResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowInstanceNodesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowInstanceNodesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowOneTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowOneTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowQuotasRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowQuotasResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRecycleInstancesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRecycleInstancesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketMqConfigsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketMqConfigsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketMqProductCoresRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketMqProductCoresResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketMqScalePreCheckInfoRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketMqScalePreCheckInfoResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketmqProjectTagsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketmqProjectTagsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketmqTagsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketmqTagsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowTopicStatusRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowTopicStatusResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowVolumeExpandConfigRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowVolumeExpandConfigResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateConsumerGroup;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateConsumerGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateConsumerGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateInstanceReq;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateRocketMqConfigsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateRocketMqConfigsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateScheduledTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateScheduledTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateTopicReq;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateVolumeExpansionConfigRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateVolumeExpansionConfigResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.User;
import com.huaweicloud.sdk.rocketmq.v2.model.ValidateConsumedMessageForRocketMqRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ValidateConsumedMessageForRocketMqResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ValidateConsumedMessageRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ValidateConsumedMessageResponse;

@SuppressWarnings("unchecked")
public class RocketMQMeta {

    public static final HttpRequestDef<BatchCreateOrDeleteRocketmqTagRequest, BatchCreateOrDeleteRocketmqTagResponse> batchCreateOrDeleteRocketmqTag =
        genForBatchCreateOrDeleteRocketmqTag();

    private static HttpRequestDef<BatchCreateOrDeleteRocketmqTagRequest, BatchCreateOrDeleteRocketmqTagResponse> genForBatchCreateOrDeleteRocketmqTag() {
        // basic
        HttpRequestDef.Builder<BatchCreateOrDeleteRocketmqTagRequest, BatchCreateOrDeleteRocketmqTagResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateOrDeleteRocketmqTagRequest.class,
                    BatchCreateOrDeleteRocketmqTagResponse.class)
                .withName("BatchCreateOrDeleteRocketmqTag")
                .withUri("/v2/{project_id}/rocketmq/{instance_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateOrDeleteRocketmqTagRequest::getInstanceId,
                BatchCreateOrDeleteRocketmqTagRequest::setInstanceId));
        builder.<BatchCreateOrDeleteTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateOrDeleteTagReq.class),
            f -> f.withMarshaller(BatchCreateOrDeleteRocketmqTagRequest::getBody,
                BatchCreateOrDeleteRocketmqTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDiagnosisRecordsRequest, BatchDeleteDiagnosisRecordsResponse> batchDeleteDiagnosisRecords =
        genForBatchDeleteDiagnosisRecords();

    private static HttpRequestDef<BatchDeleteDiagnosisRecordsRequest, BatchDeleteDiagnosisRecordsResponse> genForBatchDeleteDiagnosisRecords() {
        // basic
        HttpRequestDef.Builder<BatchDeleteDiagnosisRecordsRequest, BatchDeleteDiagnosisRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteDiagnosisRecordsRequest.class,
                    BatchDeleteDiagnosisRecordsResponse.class)
                .withName("BatchDeleteDiagnosisRecords")
                .withUri("/v2/{project_id}/{engine}/instances/{instance_id}/diagnosis/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteDiagnosisRecordsRequest::getEngine,
                BatchDeleteDiagnosisRecordsRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteDiagnosisRecordsRequest::getInstanceId,
                BatchDeleteDiagnosisRecordsRequest::setInstanceId));
        builder.<BatchDeleteDiagnosisReportReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteDiagnosisReportReq.class),
            f -> f.withMarshaller(BatchDeleteDiagnosisRecordsRequest::getBody,
                BatchDeleteDiagnosisRecordsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDiagnosisRecordsForRocketMqRequest, BatchDeleteDiagnosisRecordsForRocketMqResponse> batchDeleteDiagnosisRecordsForRocketMq =
        genForBatchDeleteDiagnosisRecordsForRocketMq();

    private static HttpRequestDef<BatchDeleteDiagnosisRecordsForRocketMqRequest, BatchDeleteDiagnosisRecordsForRocketMqResponse> genForBatchDeleteDiagnosisRecordsForRocketMq() {
        // basic
        HttpRequestDef.Builder<BatchDeleteDiagnosisRecordsForRocketMqRequest, BatchDeleteDiagnosisRecordsForRocketMqResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteDiagnosisRecordsForRocketMqRequest.class,
                    BatchDeleteDiagnosisRecordsForRocketMqResponse.class)
                .withName("BatchDeleteDiagnosisRecordsForRocketMq")
                .withUri("/v2/{project_id}/rocketmq/instances/{instance_id}/diagnosis/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteDiagnosisRecordsForRocketMqRequest::getInstanceId,
                BatchDeleteDiagnosisRecordsForRocketMqRequest::setInstanceId));
        builder.<BatchDeleteDiagnosisReportReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteDiagnosisReportReq.class),
            f -> f.withMarshaller(BatchDeleteDiagnosisRecordsForRocketMqRequest::getBody,
                BatchDeleteDiagnosisRecordsForRocketMqRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> batchDeleteInstances =
        genForBatchDeleteInstances();

    private static HttpRequestDef<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> genForBatchDeleteInstances() {
        // basic
        HttpRequestDef.Builder<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteInstancesRequest.class, BatchDeleteInstancesResponse.class)
            .withName("BatchDeleteInstances")
            .withUri("/v2/{project_id}/instances/action")
            .withContentType("application/json");

        // requests
        builder.<BatchDeleteInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteInstanceReq.class),
            f -> f.withMarshaller(BatchDeleteInstancesRequest::getBody, BatchDeleteInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteRocketMqMigrationTaskRequest, BatchDeleteRocketMqMigrationTaskResponse> batchDeleteRocketMqMigrationTask =
        genForBatchDeleteRocketMqMigrationTask();

    private static HttpRequestDef<BatchDeleteRocketMqMigrationTaskRequest, BatchDeleteRocketMqMigrationTaskResponse> genForBatchDeleteRocketMqMigrationTask() {
        // basic
        HttpRequestDef.Builder<BatchDeleteRocketMqMigrationTaskRequest, BatchDeleteRocketMqMigrationTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteRocketMqMigrationTaskRequest.class,
                    BatchDeleteRocketMqMigrationTaskResponse.class)
                .withName("BatchDeleteRocketMqMigrationTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/metadata/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteRocketMqMigrationTaskRequest::getInstanceId,
                BatchDeleteRocketMqMigrationTaskRequest::setInstanceId));
        builder.<MetadataDeleteReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MetadataDeleteReq.class),
            f -> f.withMarshaller(BatchDeleteRocketMqMigrationTaskRequest::getBody,
                BatchDeleteRocketMqMigrationTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateConsumerGroupRequest, BatchUpdateConsumerGroupResponse> batchUpdateConsumerGroup =
        genForBatchUpdateConsumerGroup();

    private static HttpRequestDef<BatchUpdateConsumerGroupRequest, BatchUpdateConsumerGroupResponse> genForBatchUpdateConsumerGroup() {
        // basic
        HttpRequestDef.Builder<BatchUpdateConsumerGroupRequest, BatchUpdateConsumerGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, BatchUpdateConsumerGroupRequest.class, BatchUpdateConsumerGroupResponse.class)
                .withName("BatchUpdateConsumerGroup")
                .withUri("/v2/{project_id}/instances/{instance_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateConsumerGroupRequest::getInstanceId,
                BatchUpdateConsumerGroupRequest::setInstanceId));
        builder.<BatchUpdateConsumerGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateConsumerGroupReq.class),
            f -> f.withMarshaller(BatchUpdateConsumerGroupRequest::getBody, BatchUpdateConsumerGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConsumerGroupOrBatchDeleteConsumerGroupRequest, CreateConsumerGroupOrBatchDeleteConsumerGroupResponse> createConsumerGroupOrBatchDeleteConsumerGroup =
        genForCreateConsumerGroupOrBatchDeleteConsumerGroup();

    private static HttpRequestDef<CreateConsumerGroupOrBatchDeleteConsumerGroupRequest, CreateConsumerGroupOrBatchDeleteConsumerGroupResponse> genForCreateConsumerGroupOrBatchDeleteConsumerGroup() {
        // basic
        HttpRequestDef.Builder<CreateConsumerGroupOrBatchDeleteConsumerGroupRequest, CreateConsumerGroupOrBatchDeleteConsumerGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateConsumerGroupOrBatchDeleteConsumerGroupRequest.class,
                    CreateConsumerGroupOrBatchDeleteConsumerGroupResponse.class)
                .withName("CreateConsumerGroupOrBatchDeleteConsumerGroup")
                .withUri("/v2/{project_id}/instances/{instance_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConsumerGroupOrBatchDeleteConsumerGroupRequest::getInstanceId,
                CreateConsumerGroupOrBatchDeleteConsumerGroupRequest::setInstanceId));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConsumerGroupOrBatchDeleteConsumerGroupRequest::getAction,
                CreateConsumerGroupOrBatchDeleteConsumerGroupRequest::setAction));
        builder.<CreateConsumerGroupOrBatchDeleteConsumerGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateConsumerGroupOrBatchDeleteConsumerGroupReq.class),
            f -> f.withMarshaller(CreateConsumerGroupOrBatchDeleteConsumerGroupRequest::getBody,
                CreateConsumerGroupOrBatchDeleteConsumerGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> createDiagnosisTask =
        genForCreateDiagnosisTask();

    private static HttpRequestDef<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> genForCreateDiagnosisTask() {
        // basic
        HttpRequestDef.Builder<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDiagnosisTaskRequest.class, CreateDiagnosisTaskResponse.class)
                .withName("CreateDiagnosisTask")
                .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/diagnosis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDiagnosisTaskRequest::getEngine, CreateDiagnosisTaskRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDiagnosisTaskRequest::getInstanceId,
                CreateDiagnosisTaskRequest::setInstanceId));
        builder.<DiagnosisReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DiagnosisReq.class),
            f -> f.withMarshaller(CreateDiagnosisTaskRequest::getBody, CreateDiagnosisTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDiagnosisTaskForRocketMqRequest, CreateDiagnosisTaskForRocketMqResponse> createDiagnosisTaskForRocketMq =
        genForCreateDiagnosisTaskForRocketMq();

    private static HttpRequestDef<CreateDiagnosisTaskForRocketMqRequest, CreateDiagnosisTaskForRocketMqResponse> genForCreateDiagnosisTaskForRocketMq() {
        // basic
        HttpRequestDef.Builder<CreateDiagnosisTaskForRocketMqRequest, CreateDiagnosisTaskForRocketMqResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateDiagnosisTaskForRocketMqRequest.class,
                    CreateDiagnosisTaskForRocketMqResponse.class)
                .withName("CreateDiagnosisTaskForRocketMq")
                .withUri("/v2/{project_id}/rocketmq/instances/{instance_id}/diagnosis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDiagnosisTaskForRocketMqRequest::getInstanceId,
                CreateDiagnosisTaskForRocketMqRequest::setInstanceId));
        builder.<DiagnosisReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DiagnosisReq.class),
            f -> f.withMarshaller(CreateDiagnosisTaskForRocketMqRequest::getBody,
                CreateDiagnosisTaskForRocketMqRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse> createInstanceByEngine =
        genForCreateInstanceByEngine();

    private static HttpRequestDef<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse> genForCreateInstanceByEngine() {
        // basic
        HttpRequestDef.Builder<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateInstanceByEngineRequest.class, CreateInstanceByEngineResponse.class)
            .withName("CreateInstanceByEngine")
            .withUri("/v2/{engine}/{project_id}/instances")
            .withContentType("application/json");

        // requests
        builder.<CreateInstanceByEngineRequest.EngineEnum>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceByEngineRequest.EngineEnum.class),
            f -> f.withMarshaller(CreateInstanceByEngineRequest::getEngine, CreateInstanceByEngineRequest::setEngine));
        builder.<CreateInstanceByEngineReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceByEngineReq.class),
            f -> f.withMarshaller(CreateInstanceByEngineRequest::getBody, CreateInstanceByEngineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> createPostPaidInstance =
        genForCreatePostPaidInstance();

    private static HttpRequestDef<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> genForCreatePostPaidInstance() {
        // basic
        HttpRequestDef.Builder<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePostPaidInstanceRequest.class, CreatePostPaidInstanceResponse.class)
            .withName("CreatePostPaidInstance")
            .withUri("/v2/{project_id}/instances")
            .withContentType("application/json");

        // requests
        builder.<CreatePostPaidInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePostPaidInstanceReq.class),
            f -> f.withMarshaller(CreatePostPaidInstanceRequest::getBody, CreatePostPaidInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePostPaidInstanceForRocketMqRequest, CreatePostPaidInstanceForRocketMqResponse> createPostPaidInstanceForRocketMq =
        genForCreatePostPaidInstanceForRocketMq();

    private static HttpRequestDef<CreatePostPaidInstanceForRocketMqRequest, CreatePostPaidInstanceForRocketMqResponse> genForCreatePostPaidInstanceForRocketMq() {
        // basic
        HttpRequestDef.Builder<CreatePostPaidInstanceForRocketMqRequest, CreatePostPaidInstanceForRocketMqResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreatePostPaidInstanceForRocketMqRequest.class,
                    CreatePostPaidInstanceForRocketMqResponse.class)
                .withName("CreatePostPaidInstanceForRocketMq")
                .withUri("/v2/{project_id}/rocketmq/instances")
                .withContentType("application/json");

        // requests
        builder.<CreateInstanceByEngineReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceByEngineReq.class),
            f -> f.withMarshaller(CreatePostPaidInstanceForRocketMqRequest::getBody,
                CreatePostPaidInstanceForRocketMqRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRocketMqMigrationTaskRequest, CreateRocketMqMigrationTaskResponse> createRocketMqMigrationTask =
        genForCreateRocketMqMigrationTask();

    private static HttpRequestDef<CreateRocketMqMigrationTaskRequest, CreateRocketMqMigrationTaskResponse> genForCreateRocketMqMigrationTask() {
        // basic
        HttpRequestDef.Builder<CreateRocketMqMigrationTaskRequest, CreateRocketMqMigrationTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateRocketMqMigrationTaskRequest.class,
                    CreateRocketMqMigrationTaskResponse.class)
                .withName("CreateRocketMqMigrationTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/metadata")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRocketMqMigrationTaskRequest::getInstanceId,
                CreateRocketMqMigrationTaskRequest::setInstanceId));
        builder.<CreateRocketMqMigrationTaskRequest.OverwriteEnum>withRequestField("overwrite",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRocketMqMigrationTaskRequest.OverwriteEnum.class),
            f -> f.withMarshaller(CreateRocketMqMigrationTaskRequest::getOverwrite,
                CreateRocketMqMigrationTaskRequest::setOverwrite));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRocketMqMigrationTaskRequest::getName,
                CreateRocketMqMigrationTaskRequest::setName));
        builder.<CreateRocketMqMigrationTaskRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRocketMqMigrationTaskRequest.TypeEnum.class),
            f -> f.withMarshaller(CreateRocketMqMigrationTaskRequest::getType,
                CreateRocketMqMigrationTaskRequest::setType));
        builder.<CreateRocketMqMigrationTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRocketMqMigrationTaskReq.class),
            f -> f.withMarshaller(CreateRocketMqMigrationTaskRequest::getBody,
                CreateRocketMqMigrationTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUserRequest, CreateUserResponse> createUser = genForCreateUser();

    private static HttpRequestDef<CreateUserRequest, CreateUserResponse> genForCreateUser() {
        // basic
        HttpRequestDef.Builder<CreateUserRequest, CreateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateUserRequest.class, CreateUserResponse.class)
                .withName("CreateUser")
                .withUri("/v2/{project_id}/instances/{instance_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUserRequest::getInstanceId, CreateUserRequest::setInstanceId));
        builder.<User>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(User.class),
            f -> f.withMarshaller(CreateUserRequest::getBody, CreateUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> deleteBackgroundTask =
        genForDeleteBackgroundTask();

    private static HttpRequestDef<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> genForDeleteBackgroundTask() {
        // basic
        HttpRequestDef.Builder<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteBackgroundTaskRequest.class, DeleteBackgroundTaskResponse.class)
            .withName("DeleteBackgroundTask")
            .withUri("/v2/{project_id}/instances/{instance_id}/tasks/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackgroundTaskRequest::getInstanceId,
                DeleteBackgroundTaskRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackgroundTaskRequest::getTaskId, DeleteBackgroundTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse> deleteConsumerGroup =
        genForDeleteConsumerGroup();

    private static HttpRequestDef<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse> genForDeleteConsumerGroup() {
        // basic
        HttpRequestDef.Builder<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteConsumerGroupRequest.class, DeleteConsumerGroupResponse.class)
            .withName("DeleteConsumerGroup")
            .withUri("/v2/{project_id}/instances/{instance_id}/groups/{group}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConsumerGroupRequest::getInstanceId,
                DeleteConsumerGroupRequest::setInstanceId));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConsumerGroupRequest::getGroup, DeleteConsumerGroupRequest::setGroup));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genForDeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genForDeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, DeleteInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse> deleteScheduledTask =
        genForDeleteScheduledTask();

    private static HttpRequestDef<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse> genForDeleteScheduledTask() {
        // basic
        HttpRequestDef.Builder<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteScheduledTaskRequest.class, DeleteScheduledTaskResponse.class)
            .withName("DeleteScheduledTask")
            .withUri("/v2/{project_id}/instances/{instance_id}/scheduled-tasks/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScheduledTaskRequest::getInstanceId,
                DeleteScheduledTaskRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScheduledTaskRequest::getTaskId, DeleteScheduledTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserRequest, DeleteUserResponse> deleteUser = genForDeleteUser();

    private static HttpRequestDef<DeleteUserRequest, DeleteUserResponse> genForDeleteUser() {
        // basic
        HttpRequestDef.Builder<DeleteUserRequest, DeleteUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteUserRequest.class, DeleteUserResponse.class)
                .withName("DeleteUser")
                .withUri("/v2/{project_id}/instances/{instance_id}/users/{user_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRequest::getInstanceId, DeleteUserRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRequest::getUserName, DeleteUserRequest::setUserName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableDnsRequest, EnableDnsResponse> enableDns = genForEnableDns();

    private static HttpRequestDef<EnableDnsRequest, EnableDnsResponse> genForEnableDns() {
        // basic
        HttpRequestDef.Builder<EnableDnsRequest, EnableDnsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableDnsRequest.class, EnableDnsResponse.class)
                .withName("EnableDns")
                .withUri("/v2/{project_id}/rocketmq/instances/{instance_id}/dns")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableDnsRequest::getInstanceId, EnableDnsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZones =
        genForListAvailableZones();

    private static HttpRequestDef<ListAvailableZonesRequest, ListAvailableZonesResponse> genForListAvailableZones() {
        // basic
        HttpRequestDef.Builder<ListAvailableZonesRequest, ListAvailableZonesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAvailableZonesRequest.class, ListAvailableZonesResponse.class)
                .withName("ListAvailableZones")
                .withUri("/v2/available-zones")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackgroundTasksRequest, ListBackgroundTasksResponse> listBackgroundTasks =
        genForListBackgroundTasks();

    private static HttpRequestDef<ListBackgroundTasksRequest, ListBackgroundTasksResponse> genForListBackgroundTasks() {
        // basic
        HttpRequestDef.Builder<ListBackgroundTasksRequest, ListBackgroundTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackgroundTasksRequest.class, ListBackgroundTasksResponse.class)
                .withName("ListBackgroundTasks")
                .withUri("/v2/{project_id}/instances/{instance_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackgroundTasksRequest::getInstanceId,
                ListBackgroundTasksRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackgroundTasksRequest::getOffset, ListBackgroundTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackgroundTasksRequest::getLimit, ListBackgroundTasksRequest::setLimit));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackgroundTasksRequest::getBeginTime, ListBackgroundTasksRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackgroundTasksRequest::getEndTime, ListBackgroundTasksRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBrokersRequest, ListBrokersResponse> listBrokers = genForListBrokers();

    private static HttpRequestDef<ListBrokersRequest, ListBrokersResponse> genForListBrokers() {
        // basic
        HttpRequestDef.Builder<ListBrokersRequest, ListBrokersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBrokersRequest.class, ListBrokersResponse.class)
                .withName("ListBrokers")
                .withUri("/v2/{project_id}/instances/{instance_id}/brokers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBrokersRequest::getInstanceId, ListBrokersRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBrokersRequest::getLimit, ListBrokersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBrokersRequest::getOffset, ListBrokersRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigFeaturesRequest, ListConfigFeaturesResponse> listConfigFeatures =
        genForListConfigFeatures();

    private static HttpRequestDef<ListConfigFeaturesRequest, ListConfigFeaturesResponse> genForListConfigFeatures() {
        // basic
        HttpRequestDef.Builder<ListConfigFeaturesRequest, ListConfigFeaturesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConfigFeaturesRequest.class, ListConfigFeaturesResponse.class)
                .withName("ListConfigFeatures")
                .withUri("/v2/config/features")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConsumeGroupAccessPolicyRequest, ListConsumeGroupAccessPolicyResponse> listConsumeGroupAccessPolicy =
        genForListConsumeGroupAccessPolicy();

    private static HttpRequestDef<ListConsumeGroupAccessPolicyRequest, ListConsumeGroupAccessPolicyResponse> genForListConsumeGroupAccessPolicy() {
        // basic
        HttpRequestDef.Builder<ListConsumeGroupAccessPolicyRequest, ListConsumeGroupAccessPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListConsumeGroupAccessPolicyRequest.class,
                    ListConsumeGroupAccessPolicyResponse.class)
                .withName("ListConsumeGroupAccessPolicy")
                .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/groups/{group}/accesspolicy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsumeGroupAccessPolicyRequest::getEngine,
                ListConsumeGroupAccessPolicyRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsumeGroupAccessPolicyRequest::getInstanceId,
                ListConsumeGroupAccessPolicyRequest::setInstanceId));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsumeGroupAccessPolicyRequest::getGroup,
                ListConsumeGroupAccessPolicyRequest::setGroup));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConsumeGroupAccessPolicyRequest::getOffset,
                ListConsumeGroupAccessPolicyRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConsumeGroupAccessPolicyRequest::getLimit,
                ListConsumeGroupAccessPolicyRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConsumeGroupAccessPolicyForRocketMqRequest, ListConsumeGroupAccessPolicyForRocketMqResponse> listConsumeGroupAccessPolicyForRocketMq =
        genForListConsumeGroupAccessPolicyForRocketMq();

    private static HttpRequestDef<ListConsumeGroupAccessPolicyForRocketMqRequest, ListConsumeGroupAccessPolicyForRocketMqResponse> genForListConsumeGroupAccessPolicyForRocketMq() {
        // basic
        HttpRequestDef.Builder<ListConsumeGroupAccessPolicyForRocketMqRequest, ListConsumeGroupAccessPolicyForRocketMqResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListConsumeGroupAccessPolicyForRocketMqRequest.class,
                    ListConsumeGroupAccessPolicyForRocketMqResponse.class)
                .withName("ListConsumeGroupAccessPolicyForRocketMq")
                .withUri("/v2/{project_id}/rocketmq/instances/{instance_id}/groups/{group}/accesspolicy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsumeGroupAccessPolicyForRocketMqRequest::getInstanceId,
                ListConsumeGroupAccessPolicyForRocketMqRequest::setInstanceId));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsumeGroupAccessPolicyForRocketMqRequest::getGroup,
                ListConsumeGroupAccessPolicyForRocketMqRequest::setGroup));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConsumeGroupAccessPolicyForRocketMqRequest::getOffset,
                ListConsumeGroupAccessPolicyForRocketMqRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConsumeGroupAccessPolicyForRocketMqRequest::getLimit,
                ListConsumeGroupAccessPolicyForRocketMqRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDiagnosisReportsRequest, ListDiagnosisReportsResponse> listDiagnosisReports =
        genForListDiagnosisReports();

    private static HttpRequestDef<ListDiagnosisReportsRequest, ListDiagnosisReportsResponse> genForListDiagnosisReports() {
        // basic
        HttpRequestDef.Builder<ListDiagnosisReportsRequest, ListDiagnosisReportsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDiagnosisReportsRequest.class, ListDiagnosisReportsResponse.class)
            .withName("ListDiagnosisReports")
            .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/diagnosis")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDiagnosisReportsRequest::getEngine, ListDiagnosisReportsRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDiagnosisReportsRequest::getInstanceId,
                ListDiagnosisReportsRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDiagnosisReportsRequest::getOffset, ListDiagnosisReportsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDiagnosisReportsRequest::getLimit, ListDiagnosisReportsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDiagnosisReportsForRocketMqRequest, ListDiagnosisReportsForRocketMqResponse> listDiagnosisReportsForRocketMq =
        genForListDiagnosisReportsForRocketMq();

    private static HttpRequestDef<ListDiagnosisReportsForRocketMqRequest, ListDiagnosisReportsForRocketMqResponse> genForListDiagnosisReportsForRocketMq() {
        // basic
        HttpRequestDef.Builder<ListDiagnosisReportsForRocketMqRequest, ListDiagnosisReportsForRocketMqResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDiagnosisReportsForRocketMqRequest.class,
                    ListDiagnosisReportsForRocketMqResponse.class)
                .withName("ListDiagnosisReportsForRocketMq")
                .withUri("/v2/{project_id}/rocketmq/instances/{instance_id}/diagnosis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDiagnosisReportsForRocketMqRequest::getInstanceId,
                ListDiagnosisReportsForRocketMqRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDiagnosisReportsForRocketMqRequest::getOffset,
                ListDiagnosisReportsForRocketMqRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDiagnosisReportsForRocketMqRequest::getLimit,
                ListDiagnosisReportsForRocketMqRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEngineProductsRequest, ListEngineProductsResponse> listEngineProducts =
        genForListEngineProducts();

    private static HttpRequestDef<ListEngineProductsRequest, ListEngineProductsResponse> genForListEngineProducts() {
        // basic
        HttpRequestDef.Builder<ListEngineProductsRequest, ListEngineProductsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEngineProductsRequest.class, ListEngineProductsResponse.class)
                .withName("ListEngineProducts")
                .withUri("/v2/{engine}/products")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEngineProductsRequest::getEngine, ListEngineProductsRequest::setEngine));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEngineProductsRequest::getType, ListEngineProductsRequest::setType));
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEngineProductsRequest::getProductId, ListEngineProductsRequest::setProductId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEngineProductsRequest::getLimit, ListEngineProductsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEngineProductsRequest::getOffset, ListEngineProductsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse> listInstanceConsumerGroups =
        genForListInstanceConsumerGroups();

    private static HttpRequestDef<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse> genForListInstanceConsumerGroups() {
        // basic
        HttpRequestDef.Builder<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstanceConsumerGroupsRequest.class,
                    ListInstanceConsumerGroupsResponse.class)
                .withName("ListInstanceConsumerGroups")
                .withUri("/v2/{project_id}/instances/{instance_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceConsumerGroupsRequest::getInstanceId,
                ListInstanceConsumerGroupsRequest::setInstanceId));
        builder.<String>withRequestField("group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceConsumerGroupsRequest::getGroup,
                ListInstanceConsumerGroupsRequest::setGroup));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceConsumerGroupsRequest::getLimit,
                ListInstanceConsumerGroupsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceConsumerGroupsRequest::getOffset,
                ListInstanceConsumerGroupsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForListInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForListInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v2/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<ListInstancesRequest.EngineEnum>withRequestField("engine",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstancesRequest.EngineEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getEngine, ListInstancesRequest::setEngine));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getName, ListInstancesRequest::setName));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getInstanceId, ListInstancesRequest::setInstanceId));
        builder.<ListInstancesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getStatus, ListInstancesRequest::setStatus));
        builder.<ListInstancesRequest.IncludeFailureEnum>withRequestField("include_failure",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.IncludeFailureEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getIncludeFailure, ListInstancesRequest::setIncludeFailure));
        builder.<ListInstancesRequest.ExactMatchNameEnum>withRequestField("exact_match_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.ExactMatchNameEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getExactMatchName, ListInstancesRequest::setExactMatchName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getEnterpriseProjectId,
                ListInstancesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, ListInstancesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, ListInstancesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessageTraceRequest, ListMessageTraceResponse> listMessageTrace =
        genForListMessageTrace();

    private static HttpRequestDef<ListMessageTraceRequest, ListMessageTraceResponse> genForListMessageTrace() {
        // basic
        HttpRequestDef.Builder<ListMessageTraceRequest, ListMessageTraceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMessageTraceRequest.class, ListMessageTraceResponse.class)
                .withName("ListMessageTrace")
                .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/trace")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageTraceRequest::getEngine, ListMessageTraceRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageTraceRequest::getInstanceId, ListMessageTraceRequest::setInstanceId));
        builder.<String>withRequestField("msg_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageTraceRequest::getMsgId, ListMessageTraceRequest::setMsgId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessageTraceRequest::getLimit, ListMessageTraceRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessageTraceRequest::getOffset, ListMessageTraceRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessageTraceForRocketMqRequest, ListMessageTraceForRocketMqResponse> listMessageTraceForRocketMq =
        genForListMessageTraceForRocketMq();

    private static HttpRequestDef<ListMessageTraceForRocketMqRequest, ListMessageTraceForRocketMqResponse> genForListMessageTraceForRocketMq() {
        // basic
        HttpRequestDef.Builder<ListMessageTraceForRocketMqRequest, ListMessageTraceForRocketMqResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListMessageTraceForRocketMqRequest.class,
                    ListMessageTraceForRocketMqResponse.class)
                .withName("ListMessageTraceForRocketMq")
                .withUri("/v2/{project_id}/rocketmq/instances/{instance_id}/trace")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageTraceForRocketMqRequest::getInstanceId,
                ListMessageTraceForRocketMqRequest::setInstanceId));
        builder.<String>withRequestField("msg_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageTraceForRocketMqRequest::getMsgId,
                ListMessageTraceForRocketMqRequest::setMsgId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessageTraceForRocketMqRequest::getLimit,
                ListMessageTraceForRocketMqRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessageTraceForRocketMqRequest::getOffset,
                ListMessageTraceForRocketMqRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessagesRequest, ListMessagesResponse> listMessages = genForListMessages();

    private static HttpRequestDef<ListMessagesRequest, ListMessagesResponse> genForListMessages() {
        // basic
        HttpRequestDef.Builder<ListMessagesRequest, ListMessagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMessagesRequest.class, ListMessagesResponse.class)
                .withName("ListMessages")
                .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/messages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getEngine, ListMessagesRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getInstanceId, ListMessagesRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getTopic, ListMessagesRequest::setTopic));
        builder.<String>withRequestField("queue",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getQueue, ListMessagesRequest::setQueue));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessagesRequest::getLimit, ListMessagesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessagesRequest::getOffset, ListMessagesRequest::setOffset));
        builder.<String>withRequestField("key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getKey, ListMessagesRequest::setKey));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getStartTime, ListMessagesRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getEndTime, ListMessagesRequest::setEndTime));
        builder.<String>withRequestField("msg_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getMsgId, ListMessagesRequest::setMsgId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessagesForRocketMqRequest, ListMessagesForRocketMqResponse> listMessagesForRocketMq =
        genForListMessagesForRocketMq();

    private static HttpRequestDef<ListMessagesForRocketMqRequest, ListMessagesForRocketMqResponse> genForListMessagesForRocketMq() {
        // basic
        HttpRequestDef.Builder<ListMessagesForRocketMqRequest, ListMessagesForRocketMqResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMessagesForRocketMqRequest.class, ListMessagesForRocketMqResponse.class)
            .withName("ListMessagesForRocketMq")
            .withUri("/v2/{project_id}/rocketmq/instances/{instance_id}/messages")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesForRocketMqRequest::getInstanceId,
                ListMessagesForRocketMqRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesForRocketMqRequest::getTopic, ListMessagesForRocketMqRequest::setTopic));
        builder.<String>withRequestField("queue",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesForRocketMqRequest::getQueue, ListMessagesForRocketMqRequest::setQueue));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessagesForRocketMqRequest::getLimit, ListMessagesForRocketMqRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessagesForRocketMqRequest::getOffset,
                ListMessagesForRocketMqRequest::setOffset));
        builder.<String>withRequestField("key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesForRocketMqRequest::getKey, ListMessagesForRocketMqRequest::setKey));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesForRocketMqRequest::getStartTime,
                ListMessagesForRocketMqRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesForRocketMqRequest::getEndTime,
                ListMessagesForRocketMqRequest::setEndTime));
        builder.<String>withRequestField("msg_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesForRocketMqRequest::getMsgId, ListMessagesForRocketMqRequest::setMsgId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRocketMqMigrationTaskRequest, ListRocketMqMigrationTaskResponse> listRocketMqMigrationTask =
        genForListRocketMqMigrationTask();

    private static HttpRequestDef<ListRocketMqMigrationTaskRequest, ListRocketMqMigrationTaskResponse> genForListRocketMqMigrationTask() {
        // basic
        HttpRequestDef.Builder<ListRocketMqMigrationTaskRequest, ListRocketMqMigrationTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRocketMqMigrationTaskRequest.class,
                    ListRocketMqMigrationTaskResponse.class)
                .withName("ListRocketMqMigrationTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/metadata")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRocketMqMigrationTaskRequest::getInstanceId,
                ListRocketMqMigrationTaskRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRocketMqMigrationTaskRequest::getId, ListRocketMqMigrationTaskRequest::setId));
        builder.<ListRocketMqMigrationTaskRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRocketMqMigrationTaskRequest.TypeEnum.class),
            f -> f.withMarshaller(ListRocketMqMigrationTaskRequest::getType,
                ListRocketMqMigrationTaskRequest::setType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRocketMqMigrationTaskRequest::getOffset,
                ListRocketMqMigrationTaskRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRocketMqMigrationTaskRequest::getLimit,
                ListRocketMqMigrationTaskRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRocketMqMigrationTaskRequest::getName,
                ListRocketMqMigrationTaskRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScheduledTasksRequest, ListScheduledTasksResponse> listScheduledTasks =
        genForListScheduledTasks();

    private static HttpRequestDef<ListScheduledTasksRequest, ListScheduledTasksResponse> genForListScheduledTasks() {
        // basic
        HttpRequestDef.Builder<ListScheduledTasksRequest, ListScheduledTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScheduledTasksRequest.class, ListScheduledTasksResponse.class)
                .withName("ListScheduledTasks")
                .withUri("/v2/{project_id}/instances/{instance_id}/scheduled-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTasksRequest::getInstanceId, ListScheduledTasksRequest::setInstanceId));
        builder.<String>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTasksRequest::getStart, ListScheduledTasksRequest::setStart));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScheduledTasksRequest::getLimit, ListScheduledTasksRequest::setLimit));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTasksRequest::getBeginTime, ListScheduledTasksRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTasksRequest::getEndTime, ListScheduledTasksRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopicAccessPolicyRequest, ListTopicAccessPolicyResponse> listTopicAccessPolicy =
        genForListTopicAccessPolicy();

    private static HttpRequestDef<ListTopicAccessPolicyRequest, ListTopicAccessPolicyResponse> genForListTopicAccessPolicy() {
        // basic
        HttpRequestDef.Builder<ListTopicAccessPolicyRequest, ListTopicAccessPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTopicAccessPolicyRequest.class, ListTopicAccessPolicyResponse.class)
            .withName("ListTopicAccessPolicy")
            .withUri("/v2/{project_id}/instances/{instance_id}/topics/{topic}/accesspolicy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicAccessPolicyRequest::getInstanceId,
                ListTopicAccessPolicyRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicAccessPolicyRequest::getTopic, ListTopicAccessPolicyRequest::setTopic));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopicAccessPolicyRequest::getOffset, ListTopicAccessPolicyRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopicAccessPolicyRequest::getLimit, ListTopicAccessPolicyRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserRequest, ListUserResponse> listUser = genForListUser();

    private static HttpRequestDef<ListUserRequest, ListUserResponse> genForListUser() {
        // basic
        HttpRequestDef.Builder<ListUserRequest, ListUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserRequest.class, ListUserResponse.class)
                .withName("ListUser")
                .withUri("/v2/{project_id}/instances/{instance_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserRequest::getInstanceId, ListUserRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserRequest::getLimit, ListUserRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserRequest::getOffset, ListUserRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyInstanceSslConfigRequest, ModifyInstanceSslConfigResponse> modifyInstanceSslConfig =
        genForModifyInstanceSslConfig();

    private static HttpRequestDef<ModifyInstanceSslConfigRequest, ModifyInstanceSslConfigResponse> genForModifyInstanceSslConfig() {
        // basic
        HttpRequestDef.Builder<ModifyInstanceSslConfigRequest, ModifyInstanceSslConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ModifyInstanceSslConfigRequest.class, ModifyInstanceSslConfigResponse.class)
            .withName("ModifyInstanceSslConfig")
            .withUri("/v2/{project_id}/{engine}/instances/{instance_id}/plain-ssl-switch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyInstanceSslConfigRequest::getEngine,
                ModifyInstanceSslConfigRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyInstanceSslConfigRequest::getInstanceId,
                ModifyInstanceSslConfigRequest::setInstanceId));
        builder.<PlainSSLSwitchRep>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PlainSSLSwitchRep.class),
            f -> f.withMarshaller(ModifyInstanceSslConfigRequest::getBody, ModifyInstanceSslConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyRecyclePolicyRequest, ModifyRecyclePolicyResponse> modifyRecyclePolicy =
        genForModifyRecyclePolicy();

    private static HttpRequestDef<ModifyRecyclePolicyRequest, ModifyRecyclePolicyResponse> genForModifyRecyclePolicy() {
        // basic
        HttpRequestDef.Builder<ModifyRecyclePolicyRequest, ModifyRecyclePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyRecyclePolicyRequest.class, ModifyRecyclePolicyResponse.class)
                .withName("ModifyRecyclePolicy")
                .withUri("/v2/{project_id}/recycle")
                .withContentType("application/json");

        // requests
        builder.<ModifyRecyclePolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyRecyclePolicyReq.class),
            f -> f.withMarshaller(ModifyRecyclePolicyRequest::getBody, ModifyRecyclePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetConsumeOffsetRequest, ResetConsumeOffsetResponse> resetConsumeOffset =
        genForResetConsumeOffset();

    private static HttpRequestDef<ResetConsumeOffsetRequest, ResetConsumeOffsetResponse> genForResetConsumeOffset() {
        // basic
        HttpRequestDef.Builder<ResetConsumeOffsetRequest, ResetConsumeOffsetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetConsumeOffsetRequest.class, ResetConsumeOffsetResponse.class)
                .withName("ResetConsumeOffset")
                .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/groups/{group}/reset-message-offset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetConsumeOffsetRequest::getEngine, ResetConsumeOffsetRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetConsumeOffsetRequest::getInstanceId, ResetConsumeOffsetRequest::setInstanceId));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetConsumeOffsetRequest::getGroup, ResetConsumeOffsetRequest::setGroup));
        builder.<ResetConsumeOffsetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetConsumeOffsetReq.class),
            f -> f.withMarshaller(ResetConsumeOffsetRequest::getBody, ResetConsumeOffsetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetConsumeOffsetForRocketMqRequest, ResetConsumeOffsetForRocketMqResponse> resetConsumeOffsetForRocketMq =
        genForResetConsumeOffsetForRocketMq();

    private static HttpRequestDef<ResetConsumeOffsetForRocketMqRequest, ResetConsumeOffsetForRocketMqResponse> genForResetConsumeOffsetForRocketMq() {
        // basic
        HttpRequestDef.Builder<ResetConsumeOffsetForRocketMqRequest, ResetConsumeOffsetForRocketMqResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ResetConsumeOffsetForRocketMqRequest.class,
                    ResetConsumeOffsetForRocketMqResponse.class)
                .withName("ResetConsumeOffsetForRocketMq")
                .withUri("/v2/{project_id}/rocketmq/instances/{instance_id}/groups/{group}/reset-message-offset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetConsumeOffsetForRocketMqRequest::getInstanceId,
                ResetConsumeOffsetForRocketMqRequest::setInstanceId));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetConsumeOffsetForRocketMqRequest::getGroup,
                ResetConsumeOffsetForRocketMqRequest::setGroup));
        builder.<ResetConsumeOffsetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetConsumeOffsetReq.class),
            f -> f.withMarshaller(ResetConsumeOffsetForRocketMqRequest::getBody,
                ResetConsumeOffsetForRocketMqRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstance =
        genForResizeInstance();

    private static HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> genForResizeInstance() {
        // basic
        HttpRequestDef.Builder<ResizeInstanceRequest, ResizeInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeInstanceRequest.class, ResizeInstanceResponse.class)
                .withName("ResizeInstance")
                .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/extend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getEngine, ResizeInstanceRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getInstanceId, ResizeInstanceRequest::setInstanceId));
        builder.<ResizeEngineInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeEngineInstanceReq.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getBody, ResizeInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeInstanceForRocketMqRequest, ResizeInstanceForRocketMqResponse> resizeInstanceForRocketMq =
        genForResizeInstanceForRocketMq();

    private static HttpRequestDef<ResizeInstanceForRocketMqRequest, ResizeInstanceForRocketMqResponse> genForResizeInstanceForRocketMq() {
        // basic
        HttpRequestDef.Builder<ResizeInstanceForRocketMqRequest, ResizeInstanceForRocketMqResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ResizeInstanceForRocketMqRequest.class,
                    ResizeInstanceForRocketMqResponse.class)
                .withName("ResizeInstanceForRocketMq")
                .withUri("/v2/{project_id}/rocketmq/instances/{instance_id}/extend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeInstanceForRocketMqRequest::getInstanceId,
                ResizeInstanceForRocketMqRequest::setInstanceId));
        builder.<ResizeEngineInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeEngineInstanceReq.class),
            f -> f.withMarshaller(ResizeInstanceForRocketMqRequest::getBody,
                ResizeInstanceForRocketMqRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreRecycleInstanceRequest, RestoreRecycleInstanceResponse> restoreRecycleInstance =
        genForRestoreRecycleInstance();

    private static HttpRequestDef<RestoreRecycleInstanceRequest, RestoreRecycleInstanceResponse> genForRestoreRecycleInstance() {
        // basic
        HttpRequestDef.Builder<RestoreRecycleInstanceRequest, RestoreRecycleInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RestoreRecycleInstanceRequest.class, RestoreRecycleInstanceResponse.class)
            .withName("RestoreRecycleInstance")
            .withUri("/v2/{project_id}/recycle")
            .withContentType("application/json");

        // requests
        builder.<BatchResumeInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchResumeInstanceReq.class),
            f -> f.withMarshaller(RestoreRecycleInstanceRequest::getBody, RestoreRecycleInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendDlqMessageRequest, SendDlqMessageResponse> sendDlqMessage =
        genForSendDlqMessage();

    private static HttpRequestDef<SendDlqMessageRequest, SendDlqMessageResponse> genForSendDlqMessage() {
        // basic
        HttpRequestDef.Builder<SendDlqMessageRequest, SendDlqMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SendDlqMessageRequest.class, SendDlqMessageResponse.class)
                .withName("SendDlqMessage")
                .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/messages/deadletter-resend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendDlqMessageRequest::getEngine, SendDlqMessageRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendDlqMessageRequest::getInstanceId, SendDlqMessageRequest::setInstanceId));
        builder.<DeadletterResendReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeadletterResendReq.class),
            f -> f.withMarshaller(SendDlqMessageRequest::getBody, SendDlqMessageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendDlqMessageForRocketMqRequest, SendDlqMessageForRocketMqResponse> sendDlqMessageForRocketMq =
        genForSendDlqMessageForRocketMq();

    private static HttpRequestDef<SendDlqMessageForRocketMqRequest, SendDlqMessageForRocketMqResponse> genForSendDlqMessageForRocketMq() {
        // basic
        HttpRequestDef.Builder<SendDlqMessageForRocketMqRequest, SendDlqMessageForRocketMqResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SendDlqMessageForRocketMqRequest.class,
                    SendDlqMessageForRocketMqResponse.class)
                .withName("SendDlqMessageForRocketMq")
                .withUri("/v2/{project_id}/rocketmq/instances/{instance_id}/messages/deadletter-resend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendDlqMessageForRocketMqRequest::getInstanceId,
                SendDlqMessageForRocketMqRequest::setInstanceId));
        builder.<DeadletterResendReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeadletterResendReq.class),
            f -> f.withMarshaller(SendDlqMessageForRocketMqRequest::getBody,
                SendDlqMessageForRocketMqRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendMessageRequest, SendMessageResponse> sendMessage = genForSendMessage();

    private static HttpRequestDef<SendMessageRequest, SendMessageResponse> genForSendMessage() {
        // basic
        HttpRequestDef.Builder<SendMessageRequest, SendMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SendMessageRequest.class, SendMessageResponse.class)
                .withName("SendMessage")
                .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/messages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendMessageRequest::getEngine, SendMessageRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendMessageRequest::getInstanceId, SendMessageRequest::setInstanceId));
        builder.<SendMessageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SendMessageReq.class),
            f -> f.withMarshaller(SendMessageRequest::getBody, SendMessageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendMessageForRocketMqRequest, SendMessageForRocketMqResponse> sendMessageForRocketMq =
        genForSendMessageForRocketMq();

    private static HttpRequestDef<SendMessageForRocketMqRequest, SendMessageForRocketMqResponse> genForSendMessageForRocketMq() {
        // basic
        HttpRequestDef.Builder<SendMessageForRocketMqRequest, SendMessageForRocketMqResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SendMessageForRocketMqRequest.class, SendMessageForRocketMqResponse.class)
            .withName("SendMessageForRocketMq")
            .withUri("/v2/{project_id}/rocketmq/instances/{instance_id}/messages")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendMessageForRocketMqRequest::getInstanceId,
                SendMessageForRocketMqRequest::setInstanceId));
        builder.<SendMessageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SendMessageReq.class),
            f -> f.withMarshaller(SendMessageForRocketMqRequest::getBody, SendMessageForRocketMqRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse> showBackgroundTask =
        genForShowBackgroundTask();

    private static HttpRequestDef<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse> genForShowBackgroundTask() {
        // basic
        HttpRequestDef.Builder<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBackgroundTaskRequest.class, ShowBackgroundTaskResponse.class)
                .withName("ShowBackgroundTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackgroundTaskRequest::getInstanceId, ShowBackgroundTaskRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackgroundTaskRequest::getTaskId, ShowBackgroundTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackgroundTaskProgressRequest, ShowBackgroundTaskProgressResponse> showBackgroundTaskProgress =
        genForShowBackgroundTaskProgress();

    private static HttpRequestDef<ShowBackgroundTaskProgressRequest, ShowBackgroundTaskProgressResponse> genForShowBackgroundTaskProgress() {
        // basic
        HttpRequestDef.Builder<ShowBackgroundTaskProgressRequest, ShowBackgroundTaskProgressResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowBackgroundTaskProgressRequest.class,
                    ShowBackgroundTaskProgressResponse.class)
                .withName("ShowBackgroundTaskProgress")
                .withUri("/v2/{project_id}/instances/{instance_id}/tasks/{task_id}/progress")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackgroundTaskProgressRequest::getInstanceId,
                ShowBackgroundTaskProgressRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackgroundTaskProgressRequest::getTaskId,
                ShowBackgroundTaskProgressRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCesHierarchyRequest, ShowCesHierarchyResponse> showCesHierarchy =
        genForShowCesHierarchy();

    private static HttpRequestDef<ShowCesHierarchyRequest, ShowCesHierarchyResponse> genForShowCesHierarchy() {
        // basic
        HttpRequestDef.Builder<ShowCesHierarchyRequest, ShowCesHierarchyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCesHierarchyRequest.class, ShowCesHierarchyResponse.class)
                .withName("ShowCesHierarchy")
                .withUri("/v2/{project_id}/instances/{instance_id}/ces-hierarchy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCesHierarchyRequest::getInstanceId, ShowCesHierarchyRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConsumerConnectionsRequest, ShowConsumerConnectionsResponse> showConsumerConnections =
        genForShowConsumerConnections();

    private static HttpRequestDef<ShowConsumerConnectionsRequest, ShowConsumerConnectionsResponse> genForShowConsumerConnections() {
        // basic
        HttpRequestDef.Builder<ShowConsumerConnectionsRequest, ShowConsumerConnectionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowConsumerConnectionsRequest.class, ShowConsumerConnectionsResponse.class)
            .withName("ShowConsumerConnections")
            .withUri("/v2/rocketmq/{project_id}/instances/{instance_id}/groups/{group}/clients")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsumerConnectionsRequest::getInstanceId,
                ShowConsumerConnectionsRequest::setInstanceId));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsumerConnectionsRequest::getGroup, ShowConsumerConnectionsRequest::setGroup));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowConsumerConnectionsRequest::getLimit, ShowConsumerConnectionsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowConsumerConnectionsRequest::getOffset,
                ShowConsumerConnectionsRequest::setOffset));
        builder.<Boolean>withRequestField("is_detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowConsumerConnectionsRequest::getIsDetail,
                ShowConsumerConnectionsRequest::setIsDetail));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConsumerConnectionsForRocketMqRequest, ShowConsumerConnectionsForRocketMqResponse> showConsumerConnectionsForRocketMq =
        genForShowConsumerConnectionsForRocketMq();

    private static HttpRequestDef<ShowConsumerConnectionsForRocketMqRequest, ShowConsumerConnectionsForRocketMqResponse> genForShowConsumerConnectionsForRocketMq() {
        // basic
        HttpRequestDef.Builder<ShowConsumerConnectionsForRocketMqRequest, ShowConsumerConnectionsForRocketMqResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowConsumerConnectionsForRocketMqRequest.class,
                    ShowConsumerConnectionsForRocketMqResponse.class)
                .withName("ShowConsumerConnectionsForRocketMq")
                .withUri("/v2/{project_id}/rocketmq/instances/{instance_id}/groups/{group}/clients")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsumerConnectionsForRocketMqRequest::getInstanceId,
                ShowConsumerConnectionsForRocketMqRequest::setInstanceId));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsumerConnectionsForRocketMqRequest::getGroup,
                ShowConsumerConnectionsForRocketMqRequest::setGroup));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowConsumerConnectionsForRocketMqRequest::getLimit,
                ShowConsumerConnectionsForRocketMqRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowConsumerConnectionsForRocketMqRequest::getOffset,
                ShowConsumerConnectionsForRocketMqRequest::setOffset));
        builder.<Boolean>withRequestField("is_detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowConsumerConnectionsForRocketMqRequest::getIsDetail,
                ShowConsumerConnectionsForRocketMqRequest::setIsDetail));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConsumerListOrDetailsRequest, ShowConsumerListOrDetailsResponse> showConsumerListOrDetails =
        genForShowConsumerListOrDetails();

    private static HttpRequestDef<ShowConsumerListOrDetailsRequest, ShowConsumerListOrDetailsResponse> genForShowConsumerListOrDetails() {
        // basic
        HttpRequestDef.Builder<ShowConsumerListOrDetailsRequest, ShowConsumerListOrDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowConsumerListOrDetailsRequest.class,
                    ShowConsumerListOrDetailsResponse.class)
                .withName("ShowConsumerListOrDetails")
                .withUri("/v2/{project_id}/instances/{instance_id}/groups/{group}/topics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsumerListOrDetailsRequest::getInstanceId,
                ShowConsumerListOrDetailsRequest::setInstanceId));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsumerListOrDetailsRequest::getGroup,
                ShowConsumerListOrDetailsRequest::setGroup));
        builder.<String>withRequestField("topic",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsumerListOrDetailsRequest::getTopic,
                ShowConsumerListOrDetailsRequest::setTopic));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowConsumerListOrDetailsRequest::getLimit,
                ShowConsumerListOrDetailsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowConsumerListOrDetailsRequest::getOffset,
                ShowConsumerListOrDetailsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDiagnosisReportRequest, ShowDiagnosisReportResponse> showDiagnosisReport =
        genForShowDiagnosisReport();

    private static HttpRequestDef<ShowDiagnosisReportRequest, ShowDiagnosisReportResponse> genForShowDiagnosisReport() {
        // basic
        HttpRequestDef.Builder<ShowDiagnosisReportRequest, ShowDiagnosisReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDiagnosisReportRequest.class, ShowDiagnosisReportResponse.class)
                .withName("ShowDiagnosisReport")
                .withUri("/v2/{engine}/{project_id}/diagnosis/{report_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDiagnosisReportRequest::getEngine, ShowDiagnosisReportRequest::setEngine));
        builder.<String>withRequestField("report_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDiagnosisReportRequest::getReportId, ShowDiagnosisReportRequest::setReportId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDiagnosisReportForRocketMqRequest, ShowDiagnosisReportForRocketMqResponse> showDiagnosisReportForRocketMq =
        genForShowDiagnosisReportForRocketMq();

    private static HttpRequestDef<ShowDiagnosisReportForRocketMqRequest, ShowDiagnosisReportForRocketMqResponse> genForShowDiagnosisReportForRocketMq() {
        // basic
        HttpRequestDef.Builder<ShowDiagnosisReportForRocketMqRequest, ShowDiagnosisReportForRocketMqResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDiagnosisReportForRocketMqRequest.class,
                    ShowDiagnosisReportForRocketMqResponse.class)
                .withName("ShowDiagnosisReportForRocketMq")
                .withUri("/v2/{project_id}/rocketmq/diagnosis/{report_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("report_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDiagnosisReportForRocketMqRequest::getReportId,
                ShowDiagnosisReportForRocketMqRequest::setReportId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDiagnosisStackRequest, ShowDiagnosisStackResponse> showDiagnosisStack =
        genForShowDiagnosisStack();

    private static HttpRequestDef<ShowDiagnosisStackRequest, ShowDiagnosisStackResponse> genForShowDiagnosisStack() {
        // basic
        HttpRequestDef.Builder<ShowDiagnosisStackRequest, ShowDiagnosisStackResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDiagnosisStackRequest.class, ShowDiagnosisStackResponse.class)
                .withName("ShowDiagnosisStack")
                .withUri("/v2/{engine}/{project_id}/diagnosis/stack/{stack_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDiagnosisStackRequest::getEngine, ShowDiagnosisStackRequest::setEngine));
        builder.<String>withRequestField("stack_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDiagnosisStackRequest::getStackId, ShowDiagnosisStackRequest::setStackId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDiagnosisStackForRocketMqRequest, ShowDiagnosisStackForRocketMqResponse> showDiagnosisStackForRocketMq =
        genForShowDiagnosisStackForRocketMq();

    private static HttpRequestDef<ShowDiagnosisStackForRocketMqRequest, ShowDiagnosisStackForRocketMqResponse> genForShowDiagnosisStackForRocketMq() {
        // basic
        HttpRequestDef.Builder<ShowDiagnosisStackForRocketMqRequest, ShowDiagnosisStackForRocketMqResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDiagnosisStackForRocketMqRequest.class,
                    ShowDiagnosisStackForRocketMqResponse.class)
                .withName("ShowDiagnosisStackForRocketMq")
                .withUri("/v2/{project_id}/rocketmq/diagnosis/stack/{stack_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDiagnosisStackForRocketMqRequest::getStackId,
                ShowDiagnosisStackForRocketMqRequest::setStackId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse> showEngineInstanceExtendProductInfo =
        genForShowEngineInstanceExtendProductInfo();

    private static HttpRequestDef<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse> genForShowEngineInstanceExtendProductInfo() {
        // basic
        HttpRequestDef.Builder<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowEngineInstanceExtendProductInfoRequest.class,
                    ShowEngineInstanceExtendProductInfoResponse.class)
                .withName("ShowEngineInstanceExtendProductInfo")
                .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/extend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEngineInstanceExtendProductInfoRequest::getEngine,
                ShowEngineInstanceExtendProductInfoRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEngineInstanceExtendProductInfoRequest::getInstanceId,
                ShowEngineInstanceExtendProductInfoRequest::setInstanceId));
        builder.<ShowEngineInstanceExtendProductInfoRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowEngineInstanceExtendProductInfoRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowEngineInstanceExtendProductInfoRequest::getType,
                ShowEngineInstanceExtendProductInfoRequest::setType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowEngineInstanceExtendProductInfoRequest::getLimit,
                ShowEngineInstanceExtendProductInfoRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowEngineInstanceExtendProductInfoRequest::getOffset,
                ShowEngineInstanceExtendProductInfoRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEngineInstanceExtendProductInfoForRocketMqRequest, ShowEngineInstanceExtendProductInfoForRocketMqResponse> showEngineInstanceExtendProductInfoForRocketMq =
        genForShowEngineInstanceExtendProductInfoForRocketMq();

    private static HttpRequestDef<ShowEngineInstanceExtendProductInfoForRocketMqRequest, ShowEngineInstanceExtendProductInfoForRocketMqResponse> genForShowEngineInstanceExtendProductInfoForRocketMq() {
        // basic
        HttpRequestDef.Builder<ShowEngineInstanceExtendProductInfoForRocketMqRequest, ShowEngineInstanceExtendProductInfoForRocketMqResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowEngineInstanceExtendProductInfoForRocketMqRequest.class,
                    ShowEngineInstanceExtendProductInfoForRocketMqResponse.class)
                .withName("ShowEngineInstanceExtendProductInfoForRocketMq")
                .withUri("/v2/{project_id}/rocketmq/instances/{instance_id}/extend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEngineInstanceExtendProductInfoForRocketMqRequest::getInstanceId,
                ShowEngineInstanceExtendProductInfoForRocketMqRequest::setInstanceId));
        builder.<ShowEngineInstanceExtendProductInfoForRocketMqRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowEngineInstanceExtendProductInfoForRocketMqRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowEngineInstanceExtendProductInfoForRocketMqRequest::getType,
                ShowEngineInstanceExtendProductInfoForRocketMqRequest::setType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowEngineInstanceExtendProductInfoForRocketMqRequest::getLimit,
                ShowEngineInstanceExtendProductInfoForRocketMqRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowEngineInstanceExtendProductInfoForRocketMqRequest::getOffset,
                ShowEngineInstanceExtendProductInfoForRocketMqRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupRequest, ShowGroupResponse> showGroup = genForShowGroup();

    private static HttpRequestDef<ShowGroupRequest, ShowGroupResponse> genForShowGroup() {
        // basic
        HttpRequestDef.Builder<ShowGroupRequest, ShowGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGroupRequest.class, ShowGroupResponse.class)
                .withName("ShowGroup")
                .withUri("/v2/{project_id}/instances/{instance_id}/groups/{group}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGroupRequest::getInstanceId, ShowGroupRequest::setInstanceId));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGroupRequest::getGroup, ShowGroupRequest::setGroup));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForShowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForShowInstance() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRequest, ShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRequest.class, ShowInstanceResponse.class)
                .withName("ShowInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getInstanceId, ShowInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceNodesRequest, ShowInstanceNodesResponse> showInstanceNodes =
        genForShowInstanceNodes();

    private static HttpRequestDef<ShowInstanceNodesRequest, ShowInstanceNodesResponse> genForShowInstanceNodes() {
        // basic
        HttpRequestDef.Builder<ShowInstanceNodesRequest, ShowInstanceNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceNodesRequest.class, ShowInstanceNodesResponse.class)
                .withName("ShowInstanceNodes")
                .withUri("/v2/{project_id}/{engine}/instances/{instance_id}/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceNodesRequest::getEngine, ShowInstanceNodesRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceNodesRequest::getInstanceId, ShowInstanceNodesRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowInstanceNodesRequest::getLimit, ShowInstanceNodesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowInstanceNodesRequest::getOffset, ShowInstanceNodesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForShowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForShowQuotas() {
        // basic
        HttpRequestDef.Builder<ShowQuotasRequest, ShowQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotasRequest.class, ShowQuotasResponse.class)
                .withName("ShowQuotas")
                .withUri("/v2/{project_id}/quotas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("includeTagsQuota",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQuotasRequest::getIncludeTagsQuota, ShowQuotasRequest::setIncludeTagsQuota));
        builder.<String>withRequestField("onlyQuota",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQuotasRequest::getOnlyQuota, ShowQuotasRequest::setOnlyQuota));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecycleInstancesRequest, ShowRecycleInstancesResponse> showRecycleInstances =
        genForShowRecycleInstances();

    private static HttpRequestDef<ShowRecycleInstancesRequest, ShowRecycleInstancesResponse> genForShowRecycleInstances() {
        // basic
        HttpRequestDef.Builder<ShowRecycleInstancesRequest, ShowRecycleInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowRecycleInstancesRequest.class, ShowRecycleInstancesResponse.class)
            .withName("ShowRecycleInstances")
            .withUri("/v2/{project_id}/recycle")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRocketMqConfigsRequest, ShowRocketMqConfigsResponse> showRocketMqConfigs =
        genForShowRocketMqConfigs();

    private static HttpRequestDef<ShowRocketMqConfigsRequest, ShowRocketMqConfigsResponse> genForShowRocketMqConfigs() {
        // basic
        HttpRequestDef.Builder<ShowRocketMqConfigsRequest, ShowRocketMqConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRocketMqConfigsRequest.class, ShowRocketMqConfigsResponse.class)
                .withName("ShowRocketMqConfigs")
                .withUri("/v2/{project_id}/rocketmq/instances/{instance_id}/configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRocketMqConfigsRequest::getInstanceId,
                ShowRocketMqConfigsRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRocketMqConfigsRequest::getLimit, ShowRocketMqConfigsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRocketMqConfigsRequest::getOffset, ShowRocketMqConfigsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRocketMqProductCoresRequest, ShowRocketMqProductCoresResponse> showRocketMqProductCores =
        genForShowRocketMqProductCores();

    private static HttpRequestDef<ShowRocketMqProductCoresRequest, ShowRocketMqProductCoresResponse> genForShowRocketMqProductCores() {
        // basic
        HttpRequestDef.Builder<ShowRocketMqProductCoresRequest, ShowRocketMqProductCoresResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowRocketMqProductCoresRequest.class, ShowRocketMqProductCoresResponse.class)
                .withName("ShowRocketMqProductCores")
                .withUri("/v2/rocketmq/products/cores")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRocketMqProductCoresRequest::getInstanceId,
                ShowRocketMqProductCoresRequest::setInstanceId));
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRocketMqProductCoresRequest::getProductId,
                ShowRocketMqProductCoresRequest::setProductId));
        builder.<String>withRequestField("broker_num",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRocketMqProductCoresRequest::getBrokerNum,
                ShowRocketMqProductCoresRequest::setBrokerNum));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRocketMqScalePreCheckInfoRequest, ShowRocketMqScalePreCheckInfoResponse> showRocketMqScalePreCheckInfo =
        genForShowRocketMqScalePreCheckInfo();

    private static HttpRequestDef<ShowRocketMqScalePreCheckInfoRequest, ShowRocketMqScalePreCheckInfoResponse> genForShowRocketMqScalePreCheckInfo() {
        // basic
        HttpRequestDef.Builder<ShowRocketMqScalePreCheckInfoRequest, ShowRocketMqScalePreCheckInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowRocketMqScalePreCheckInfoRequest.class,
                    ShowRocketMqScalePreCheckInfoResponse.class)
                .withName("ShowRocketMqScalePreCheckInfo")
                .withUri("/v2/{project_id}/rocketmq/instances/{instance_id}/extend-check")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRocketMqScalePreCheckInfoRequest::getInstanceId,
                ShowRocketMqScalePreCheckInfoRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRocketmqProjectTagsRequest, ShowRocketmqProjectTagsResponse> showRocketmqProjectTags =
        genForShowRocketmqProjectTags();

    private static HttpRequestDef<ShowRocketmqProjectTagsRequest, ShowRocketmqProjectTagsResponse> genForShowRocketmqProjectTags() {
        // basic
        HttpRequestDef.Builder<ShowRocketmqProjectTagsRequest, ShowRocketmqProjectTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowRocketmqProjectTagsRequest.class, ShowRocketmqProjectTagsResponse.class)
            .withName("ShowRocketmqProjectTags")
            .withUri("/v2/{project_id}/rocketmq/tags")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRocketmqProjectTagsRequest::getLimit, ShowRocketmqProjectTagsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRocketmqProjectTagsRequest::getOffset,
                ShowRocketmqProjectTagsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRocketmqTagsRequest, ShowRocketmqTagsResponse> showRocketmqTags =
        genForShowRocketmqTags();

    private static HttpRequestDef<ShowRocketmqTagsRequest, ShowRocketmqTagsResponse> genForShowRocketmqTags() {
        // basic
        HttpRequestDef.Builder<ShowRocketmqTagsRequest, ShowRocketmqTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRocketmqTagsRequest.class, ShowRocketmqTagsResponse.class)
                .withName("ShowRocketmqTags")
                .withUri("/v2/{project_id}/rocketmq/{instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRocketmqTagsRequest::getInstanceId, ShowRocketmqTagsRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRocketmqTagsRequest::getLimit, ShowRocketmqTagsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRocketmqTagsRequest::getOffset, ShowRocketmqTagsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserRequest, ShowUserResponse> showUser = genForShowUser();

    private static HttpRequestDef<ShowUserRequest, ShowUserResponse> genForShowUser() {
        // basic
        HttpRequestDef.Builder<ShowUserRequest, ShowUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserRequest.class, ShowUserResponse.class)
                .withName("ShowUser")
                .withUri("/v2/{project_id}/instances/{instance_id}/users/{user_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserRequest::getInstanceId, ShowUserRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserRequest::getUserName, ShowUserRequest::setUserName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVolumeExpandConfigRequest, ShowVolumeExpandConfigResponse> showVolumeExpandConfig =
        genForShowVolumeExpandConfig();

    private static HttpRequestDef<ShowVolumeExpandConfigRequest, ShowVolumeExpandConfigResponse> genForShowVolumeExpandConfig() {
        // basic
        HttpRequestDef.Builder<ShowVolumeExpandConfigRequest, ShowVolumeExpandConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowVolumeExpandConfigRequest.class, ShowVolumeExpandConfigResponse.class)
            .withName("ShowVolumeExpandConfig")
            .withUri("/v2/{project_id}/instances/{instance_id}/auto-volume-expand")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVolumeExpandConfigRequest::getInstanceId,
                ShowVolumeExpandConfigRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConsumerGroupRequest, UpdateConsumerGroupResponse> updateConsumerGroup =
        genForUpdateConsumerGroup();

    private static HttpRequestDef<UpdateConsumerGroupRequest, UpdateConsumerGroupResponse> genForUpdateConsumerGroup() {
        // basic
        HttpRequestDef.Builder<UpdateConsumerGroupRequest, UpdateConsumerGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateConsumerGroupRequest.class, UpdateConsumerGroupResponse.class)
                .withName("UpdateConsumerGroup")
                .withUri("/v2/{project_id}/instances/{instance_id}/groups/{group}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConsumerGroupRequest::getInstanceId,
                UpdateConsumerGroupRequest::setInstanceId));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConsumerGroupRequest::getGroup, UpdateConsumerGroupRequest::setGroup));
        builder.<UpdateConsumerGroup>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateConsumerGroup.class),
            f -> f.withMarshaller(UpdateConsumerGroupRequest::getBody, UpdateConsumerGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> updateInstance =
        genForUpdateInstance();

    private static HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> genForUpdateInstance() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceRequest, UpdateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceRequest.class, UpdateInstanceResponse.class)
                .withName("UpdateInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getInstanceId, UpdateInstanceRequest::setInstanceId));
        builder.<UpdateInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceReq.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getBody, UpdateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRocketMqConfigsRequest, UpdateRocketMqConfigsResponse> updateRocketMqConfigs =
        genForUpdateRocketMqConfigs();

    private static HttpRequestDef<UpdateRocketMqConfigsRequest, UpdateRocketMqConfigsResponse> genForUpdateRocketMqConfigs() {
        // basic
        HttpRequestDef.Builder<UpdateRocketMqConfigsRequest, UpdateRocketMqConfigsResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateRocketMqConfigsRequest.class, UpdateRocketMqConfigsResponse.class)
            .withName("UpdateRocketMqConfigs")
            .withUri("/v2/{project_id}/rocketmq/instances/{instance_id}/configs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRocketMqConfigsRequest::getInstanceId,
                UpdateRocketMqConfigsRequest::setInstanceId));
        builder.<ModifyConfigReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyConfigReq.class),
            f -> f.withMarshaller(UpdateRocketMqConfigsRequest::getBody, UpdateRocketMqConfigsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateScheduledTaskRequest, UpdateScheduledTaskResponse> updateScheduledTask =
        genForUpdateScheduledTask();

    private static HttpRequestDef<UpdateScheduledTaskRequest, UpdateScheduledTaskResponse> genForUpdateScheduledTask() {
        // basic
        HttpRequestDef.Builder<UpdateScheduledTaskRequest, UpdateScheduledTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateScheduledTaskRequest.class, UpdateScheduledTaskResponse.class)
                .withName("UpdateScheduledTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/scheduled-tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScheduledTaskRequest::getInstanceId,
                UpdateScheduledTaskRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScheduledTaskRequest::getTaskId, UpdateScheduledTaskRequest::setTaskId));
        builder.<String>withRequestField("execute_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScheduledTaskRequest::getExecuteAt, UpdateScheduledTaskRequest::setExecuteAt));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScheduledTaskRequest::getStatus, UpdateScheduledTaskRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserRequest, UpdateUserResponse> updateUser = genForUpdateUser();

    private static HttpRequestDef<UpdateUserRequest, UpdateUserResponse> genForUpdateUser() {
        // basic
        HttpRequestDef.Builder<UpdateUserRequest, UpdateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserRequest.class, UpdateUserResponse.class)
                .withName("UpdateUser")
                .withUri("/v2/{project_id}/instances/{instance_id}/users/{user_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRequest::getInstanceId, UpdateUserRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRequest::getUserName, UpdateUserRequest::setUserName));
        builder.<User>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(User.class),
            f -> f.withMarshaller(UpdateUserRequest::getBody, UpdateUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVolumeExpansionConfigRequest, UpdateVolumeExpansionConfigResponse> updateVolumeExpansionConfig =
        genForUpdateVolumeExpansionConfig();

    private static HttpRequestDef<UpdateVolumeExpansionConfigRequest, UpdateVolumeExpansionConfigResponse> genForUpdateVolumeExpansionConfig() {
        // basic
        HttpRequestDef.Builder<UpdateVolumeExpansionConfigRequest, UpdateVolumeExpansionConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateVolumeExpansionConfigRequest.class,
                    UpdateVolumeExpansionConfigResponse.class)
                .withName("UpdateVolumeExpansionConfig")
                .withUri("/v2/{project_id}/instances/{instance_id}/auto-volume-expand")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVolumeExpansionConfigRequest::getInstanceId,
                UpdateVolumeExpansionConfigRequest::setInstanceId));
        builder.<AlterAutoVolumeExpandConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlterAutoVolumeExpandConfig.class),
            f -> f.withMarshaller(UpdateVolumeExpansionConfigRequest::getBody,
                UpdateVolumeExpansionConfigRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateVolumeExpansionConfigResponse::getBody,
                UpdateVolumeExpansionConfigResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ValidateConsumedMessageRequest, ValidateConsumedMessageResponse> validateConsumedMessage =
        genForValidateConsumedMessage();

    private static HttpRequestDef<ValidateConsumedMessageRequest, ValidateConsumedMessageResponse> genForValidateConsumedMessage() {
        // basic
        HttpRequestDef.Builder<ValidateConsumedMessageRequest, ValidateConsumedMessageResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ValidateConsumedMessageRequest.class, ValidateConsumedMessageResponse.class)
            .withName("ValidateConsumedMessage")
            .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/messages/resend")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateConsumedMessageRequest::getEngine,
                ValidateConsumedMessageRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateConsumedMessageRequest::getInstanceId,
                ValidateConsumedMessageRequest::setInstanceId));
        builder.<ResendReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResendReq.class),
            f -> f.withMarshaller(ValidateConsumedMessageRequest::getBody, ValidateConsumedMessageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateConsumedMessageForRocketMqRequest, ValidateConsumedMessageForRocketMqResponse> validateConsumedMessageForRocketMq =
        genForValidateConsumedMessageForRocketMq();

    private static HttpRequestDef<ValidateConsumedMessageForRocketMqRequest, ValidateConsumedMessageForRocketMqResponse> genForValidateConsumedMessageForRocketMq() {
        // basic
        HttpRequestDef.Builder<ValidateConsumedMessageForRocketMqRequest, ValidateConsumedMessageForRocketMqResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ValidateConsumedMessageForRocketMqRequest.class,
                    ValidateConsumedMessageForRocketMqResponse.class)
                .withName("ValidateConsumedMessageForRocketMq")
                .withUri("/v2/{project_id}/rocketmq/instances/{instance_id}/messages/resend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateConsumedMessageForRocketMqRequest::getInstanceId,
                ValidateConsumedMessageForRocketMqRequest::setInstanceId));
        builder.<ResendReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResendReq.class),
            f -> f.withMarshaller(ValidateConsumedMessageForRocketMqRequest::getBody,
                ValidateConsumedMessageForRocketMqRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTopicOrBatchDeleteTopicRequest, CreateTopicOrBatchDeleteTopicResponse> createTopicOrBatchDeleteTopic =
        genForCreateTopicOrBatchDeleteTopic();

    private static HttpRequestDef<CreateTopicOrBatchDeleteTopicRequest, CreateTopicOrBatchDeleteTopicResponse> genForCreateTopicOrBatchDeleteTopic() {
        // basic
        HttpRequestDef.Builder<CreateTopicOrBatchDeleteTopicRequest, CreateTopicOrBatchDeleteTopicResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateTopicOrBatchDeleteTopicRequest.class,
                    CreateTopicOrBatchDeleteTopicResponse.class)
                .withName("CreateTopicOrBatchDeleteTopic")
                .withUri("/v2/{project_id}/instances/{instance_id}/topics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTopicOrBatchDeleteTopicRequest::getInstanceId,
                CreateTopicOrBatchDeleteTopicRequest::setInstanceId));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTopicOrBatchDeleteTopicRequest::getAction,
                CreateTopicOrBatchDeleteTopicRequest::setAction));
        builder.<CreateTopicOrBatchDeleteTopicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTopicOrBatchDeleteTopicReq.class),
            f -> f.withMarshaller(CreateTopicOrBatchDeleteTopicRequest::getBody,
                CreateTopicOrBatchDeleteTopicRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTopicRequest, DeleteTopicResponse> deleteTopic = genForDeleteTopic();

    private static HttpRequestDef<DeleteTopicRequest, DeleteTopicResponse> genForDeleteTopic() {
        // basic
        HttpRequestDef.Builder<DeleteTopicRequest, DeleteTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTopicRequest.class, DeleteTopicResponse.class)
                .withName("DeleteTopic")
                .withUri("/v2/{project_id}/instances/{instance_id}/topics/{topic}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTopicRequest::getInstanceId, DeleteTopicRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTopicRequest::getTopic, DeleteTopicRequest::setTopic));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConsumerGroupOfTopicRequest, ListConsumerGroupOfTopicResponse> listConsumerGroupOfTopic =
        genForListConsumerGroupOfTopic();

    private static HttpRequestDef<ListConsumerGroupOfTopicRequest, ListConsumerGroupOfTopicResponse> genForListConsumerGroupOfTopic() {
        // basic
        HttpRequestDef.Builder<ListConsumerGroupOfTopicRequest, ListConsumerGroupOfTopicResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListConsumerGroupOfTopicRequest.class, ListConsumerGroupOfTopicResponse.class)
                .withName("ListConsumerGroupOfTopic")
                .withUri("/v2/{project_id}/instances/{instance_id}/topics/{topic}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsumerGroupOfTopicRequest::getInstanceId,
                ListConsumerGroupOfTopicRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsumerGroupOfTopicRequest::getTopic,
                ListConsumerGroupOfTopicRequest::setTopic));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConsumerGroupOfTopicRequest::getLimit,
                ListConsumerGroupOfTopicRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConsumerGroupOfTopicRequest::getOffset,
                ListConsumerGroupOfTopicRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRocketInstanceTopicsRequest, ListRocketInstanceTopicsResponse> listRocketInstanceTopics =
        genForListRocketInstanceTopics();

    private static HttpRequestDef<ListRocketInstanceTopicsRequest, ListRocketInstanceTopicsResponse> genForListRocketInstanceTopics() {
        // basic
        HttpRequestDef.Builder<ListRocketInstanceTopicsRequest, ListRocketInstanceTopicsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListRocketInstanceTopicsRequest.class, ListRocketInstanceTopicsResponse.class)
                .withName("ListRocketInstanceTopics")
                .withUri("/v2/{project_id}/instances/{instance_id}/topics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRocketInstanceTopicsRequest::getInstanceId,
                ListRocketInstanceTopicsRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRocketInstanceTopicsRequest::getLimit,
                ListRocketInstanceTopicsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRocketInstanceTopicsRequest::getOffset,
                ListRocketInstanceTopicsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOneTopicRequest, ShowOneTopicResponse> showOneTopic = genForShowOneTopic();

    private static HttpRequestDef<ShowOneTopicRequest, ShowOneTopicResponse> genForShowOneTopic() {
        // basic
        HttpRequestDef.Builder<ShowOneTopicRequest, ShowOneTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOneTopicRequest.class, ShowOneTopicResponse.class)
                .withName("ShowOneTopic")
                .withUri("/v2/{project_id}/instances/{instance_id}/topics/{topic}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOneTopicRequest::getInstanceId, ShowOneTopicRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOneTopicRequest::getTopic, ShowOneTopicRequest::setTopic));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTopicStatusRequest, ShowTopicStatusResponse> showTopicStatus =
        genForShowTopicStatus();

    private static HttpRequestDef<ShowTopicStatusRequest, ShowTopicStatusResponse> genForShowTopicStatus() {
        // basic
        HttpRequestDef.Builder<ShowTopicStatusRequest, ShowTopicStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTopicStatusRequest.class, ShowTopicStatusResponse.class)
                .withName("ShowTopicStatus")
                .withUri("/v2/{project_id}/instances/{instance_id}/topics/{topic}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopicStatusRequest::getInstanceId, ShowTopicStatusRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopicStatusRequest::getTopic, ShowTopicStatusRequest::setTopic));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTopicRequest, UpdateTopicResponse> updateTopic = genForUpdateTopic();

    private static HttpRequestDef<UpdateTopicRequest, UpdateTopicResponse> genForUpdateTopic() {
        // basic
        HttpRequestDef.Builder<UpdateTopicRequest, UpdateTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTopicRequest.class, UpdateTopicResponse.class)
                .withName("UpdateTopic")
                .withUri("/v2/{project_id}/instances/{instance_id}/topics/{topic}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTopicRequest::getInstanceId, UpdateTopicRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTopicRequest::getTopic, UpdateTopicRequest::setTopic));
        builder.<UpdateTopicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTopicReq.class),
            f -> f.withMarshaller(UpdateTopicRequest::getBody, UpdateTopicRequest::setBody));

        // response

        return builder.build();
    }

}
