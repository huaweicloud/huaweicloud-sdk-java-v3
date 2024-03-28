package com.huaweicloud.sdk.dsc.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dsc.v1.model.AddBucketsRequest;
import com.huaweicloud.sdk.dsc.v1.model.AddBucketsResponse;
import com.huaweicloud.sdk.dsc.v1.model.AddRuleGroupRequest;
import com.huaweicloud.sdk.dsc.v1.model.AddRuleGroupResponse;
import com.huaweicloud.sdk.dsc.v1.model.AddRuleRequest;
import com.huaweicloud.sdk.dsc.v1.model.AddRuleResponse;
import com.huaweicloud.sdk.dsc.v1.model.AddScanJobRequest;
import com.huaweicloud.sdk.dsc.v1.model.AddScanJobResponse;
import com.huaweicloud.sdk.dsc.v1.model.AssetNameRequest;
import com.huaweicloud.sdk.dsc.v1.model.BatchAddDataMaskRequest;
import com.huaweicloud.sdk.dsc.v1.model.BatchAddDataMaskResponse;
import com.huaweicloud.sdk.dsc.v1.model.BucketsRequest;
import com.huaweicloud.sdk.dsc.v1.model.ChangeDbTemplateOperationRequest;
import com.huaweicloud.sdk.dsc.v1.model.ChangeDbTemplateOperationResponse;
import com.huaweicloud.sdk.dsc.v1.model.ChangeRuleRequest;
import com.huaweicloud.sdk.dsc.v1.model.ChangeRuleResponse;
import com.huaweicloud.sdk.dsc.v1.model.CreateDatabaseWaterMarkRequest;
import com.huaweicloud.sdk.dsc.v1.model.CreateDatabaseWaterMarkResponse;
import com.huaweicloud.sdk.dsc.v1.model.CreateDocWatermarkByAddressRequest;
import com.huaweicloud.sdk.dsc.v1.model.CreateDocWatermarkByAddressRequestBody;
import com.huaweicloud.sdk.dsc.v1.model.CreateDocWatermarkByAddressResponse;
import com.huaweicloud.sdk.dsc.v1.model.CreateDocWatermarkRequest;
import com.huaweicloud.sdk.dsc.v1.model.CreateDocWatermarkRequestBody;
import com.huaweicloud.sdk.dsc.v1.model.CreateDocWatermarkResponse;
import com.huaweicloud.sdk.dsc.v1.model.CreateImageWatermarkByAddressRequest;
import com.huaweicloud.sdk.dsc.v1.model.CreateImageWatermarkByAddressRequestBody;
import com.huaweicloud.sdk.dsc.v1.model.CreateImageWatermarkByAddressResponse;
import com.huaweicloud.sdk.dsc.v1.model.CreateImageWatermarkRequest;
import com.huaweicloud.sdk.dsc.v1.model.CreateImageWatermarkRequestBody;
import com.huaweicloud.sdk.dsc.v1.model.CreateImageWatermarkResponse;
import com.huaweicloud.sdk.dsc.v1.model.CreateProductOrderRequest;
import com.huaweicloud.sdk.dsc.v1.model.CreateProductOrderResponse;
import com.huaweicloud.sdk.dsc.v1.model.DefaultTopicRequest;
import com.huaweicloud.sdk.dsc.v1.model.DeleteBucketRequest;
import com.huaweicloud.sdk.dsc.v1.model.DeleteBucketResponse;
import com.huaweicloud.sdk.dsc.v1.model.DeleteRuleGroupRequest;
import com.huaweicloud.sdk.dsc.v1.model.DeleteRuleGroupResponse;
import com.huaweicloud.sdk.dsc.v1.model.DeleteRuleRequest;
import com.huaweicloud.sdk.dsc.v1.model.DeleteRuleResponse;
import com.huaweicloud.sdk.dsc.v1.model.DeleteScanJobRequest;
import com.huaweicloud.sdk.dsc.v1.model.DeleteScanJobResponse;
import com.huaweicloud.sdk.dsc.v1.model.DynamicDataMask;
import com.huaweicloud.sdk.dsc.v1.model.EmbeddedDatabaseWatermark;
import com.huaweicloud.sdk.dsc.v1.model.ExtractedDatabaseWatermark;
import com.huaweicloud.sdk.dsc.v1.model.ListBucketsRequest;
import com.huaweicloud.sdk.dsc.v1.model.ListBucketsResponse;
import com.huaweicloud.sdk.dsc.v1.model.ListDbMaskTaskRequest;
import com.huaweicloud.sdk.dsc.v1.model.ListDbMaskTaskResponse;
import com.huaweicloud.sdk.dsc.v1.model.ListRuleGroupsRequest;
import com.huaweicloud.sdk.dsc.v1.model.ListRuleGroupsResponse;
import com.huaweicloud.sdk.dsc.v1.model.MaskSwitchRequest;
import com.huaweicloud.sdk.dsc.v1.model.PeriodOrderRequest;
import com.huaweicloud.sdk.dsc.v1.model.RuleChangeRequest;
import com.huaweicloud.sdk.dsc.v1.model.RuleGroupRequest;
import com.huaweicloud.sdk.dsc.v1.model.RuleRequest;
import com.huaweicloud.sdk.dsc.v1.model.ScanJobRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowDatabaseWaterMarkRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowDatabaseWaterMarkResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowDocWatermarkByAddressRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowDocWatermarkByAddressRequestBody;
import com.huaweicloud.sdk.dsc.v1.model.ShowDocWatermarkByAddressResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowDocWatermarkRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowDocWatermarkRequestBody;
import com.huaweicloud.sdk.dsc.v1.model.ShowDocWatermarkResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowImageWatermarkByAddressRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowImageWatermarkByAddressRequestBody;
import com.huaweicloud.sdk.dsc.v1.model.ShowImageWatermarkByAddressResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowImageWatermarkRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowImageWatermarkRequestBody;
import com.huaweicloud.sdk.dsc.v1.model.ShowImageWatermarkResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowImageWatermarkWithImageByAddressRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowImageWatermarkWithImageByAddressRequestBody;
import com.huaweicloud.sdk.dsc.v1.model.ShowImageWatermarkWithImageByAddressResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowImageWatermarkWithImageRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowImageWatermarkWithImageRequestBody;
import com.huaweicloud.sdk.dsc.v1.model.ShowImageWatermarkWithImageResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowOpenApiCalledRecordsRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowOpenApiCalledRecordsResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowRulesRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowRulesResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowScanJobResultsRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowScanJobResultsResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowScanJobsRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowScanJobsResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowSpecificationRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowSpecificationResponse;
import com.huaweicloud.sdk.dsc.v1.model.ShowTopicsRequest;
import com.huaweicloud.sdk.dsc.v1.model.ShowTopicsResponse;
import com.huaweicloud.sdk.dsc.v1.model.UpdateAssetNameRequest;
import com.huaweicloud.sdk.dsc.v1.model.UpdateAssetNameResponse;
import com.huaweicloud.sdk.dsc.v1.model.UpdateDefaultTopicRequest;
import com.huaweicloud.sdk.dsc.v1.model.UpdateDefaultTopicResponse;

@SuppressWarnings("unchecked")
public class DscMeta {

    public static final HttpRequestDef<AddBucketsRequest, AddBucketsResponse> addBuckets = genForAddBuckets();

    private static HttpRequestDef<AddBucketsRequest, AddBucketsResponse> genForAddBuckets() {
        // basic
        HttpRequestDef.Builder<AddBucketsRequest, AddBucketsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddBucketsRequest.class, AddBucketsResponse.class)
                .withName("AddBuckets")
                .withUri("/v1/{project_id}/sdg/asset/obs/buckets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddBucketsRequest::getType, AddBucketsRequest::setType));
        builder.<BucketsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BucketsRequest.class),
            f -> f.withMarshaller(AddBucketsRequest::getBody, AddBucketsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddRuleRequest, AddRuleResponse> addRule = genForAddRule();

    private static HttpRequestDef<AddRuleRequest, AddRuleResponse> genForAddRule() {
        // basic
        HttpRequestDef.Builder<AddRuleRequest, AddRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddRuleRequest.class, AddRuleResponse.class)
                .withName("AddRule")
                .withUri("/v1/{project_id}/sdg/server/scan/rules")
                .withContentType("application/json");

        // requests
        builder.<RuleRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RuleRequest.class),
            f -> f.withMarshaller(AddRuleRequest::getBody, AddRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddRuleGroupRequest, AddRuleGroupResponse> addRuleGroup = genForAddRuleGroup();

    private static HttpRequestDef<AddRuleGroupRequest, AddRuleGroupResponse> genForAddRuleGroup() {
        // basic
        HttpRequestDef.Builder<AddRuleGroupRequest, AddRuleGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddRuleGroupRequest.class, AddRuleGroupResponse.class)
                .withName("AddRuleGroup")
                .withUri("/v1/{project_id}/sdg/server/scan/groups")
                .withContentType("application/json");

        // requests
        builder.<RuleGroupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RuleGroupRequest.class),
            f -> f.withMarshaller(AddRuleGroupRequest::getBody, AddRuleGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddScanJobRequest, AddScanJobResponse> addScanJob = genForAddScanJob();

    private static HttpRequestDef<AddScanJobRequest, AddScanJobResponse> genForAddScanJob() {
        // basic
        HttpRequestDef.Builder<AddScanJobRequest, AddScanJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddScanJobRequest.class, AddScanJobResponse.class)
                .withName("AddScanJob")
                .withUri("/v1/{project_id}/sdg/scan/job")
                .withContentType("application/json");

        // requests
        builder.<ScanJobRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ScanJobRequest.class),
            f -> f.withMarshaller(AddScanJobRequest::getBody, AddScanJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddDataMaskRequest, BatchAddDataMaskResponse> batchAddDataMask =
        genForBatchAddDataMask();

    private static HttpRequestDef<BatchAddDataMaskRequest, BatchAddDataMaskResponse> genForBatchAddDataMask() {
        // basic
        HttpRequestDef.Builder<BatchAddDataMaskRequest, BatchAddDataMaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchAddDataMaskRequest.class, BatchAddDataMaskResponse.class)
                .withName("BatchAddDataMask")
                .withUri("/v1/{project_id}/data/mask")
                .withContentType("application/json");

        // requests
        builder.<DynamicDataMask>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DynamicDataMask.class),
            f -> f.withMarshaller(BatchAddDataMaskRequest::getBody, BatchAddDataMaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeDbTemplateOperationRequest, ChangeDbTemplateOperationResponse> changeDbTemplateOperation =
        genForChangeDbTemplateOperation();

    private static HttpRequestDef<ChangeDbTemplateOperationRequest, ChangeDbTemplateOperationResponse> genForChangeDbTemplateOperation() {
        // basic
        HttpRequestDef.Builder<ChangeDbTemplateOperationRequest, ChangeDbTemplateOperationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ChangeDbTemplateOperationRequest.class,
                    ChangeDbTemplateOperationResponse.class)
                .withName("ChangeDbTemplateOperation")
                .withUri("/v1/{project_id}/sdg/server/mask/dbs/templates/{template_id}/operation")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeDbTemplateOperationRequest::getTemplateId,
                ChangeDbTemplateOperationRequest::setTemplateId));
        builder.<MaskSwitchRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MaskSwitchRequest.class),
            f -> f.withMarshaller(ChangeDbTemplateOperationRequest::getBody,
                ChangeDbTemplateOperationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeRuleRequest, ChangeRuleResponse> changeRule = genForChangeRule();

    private static HttpRequestDef<ChangeRuleRequest, ChangeRuleResponse> genForChangeRule() {
        // basic
        HttpRequestDef.Builder<ChangeRuleRequest, ChangeRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeRuleRequest.class, ChangeRuleResponse.class)
                .withName("ChangeRule")
                .withUri("/v1/{project_id}/sdg/server/scan/rules")
                .withContentType("application/json");

        // requests
        builder.<RuleChangeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RuleChangeRequest.class),
            f -> f.withMarshaller(ChangeRuleRequest::getBody, ChangeRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse> createDatabaseWaterMark =
        genForCreateDatabaseWaterMark();

    private static HttpRequestDef<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse> genForCreateDatabaseWaterMark() {
        // basic
        HttpRequestDef.Builder<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDatabaseWaterMarkRequest.class, CreateDatabaseWaterMarkResponse.class)
            .withName("CreateDatabaseWaterMark")
            .withUri("/v1/{project_id}/sdg/database/watermark/embed")
            .withContentType("application/json");

        // requests
        builder.<EmbeddedDatabaseWatermark>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EmbeddedDatabaseWatermark.class),
            f -> f.withMarshaller(CreateDatabaseWaterMarkRequest::getBody, CreateDatabaseWaterMarkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDocWatermarkRequest, CreateDocWatermarkResponse> createDocWatermark =
        genForCreateDocWatermark();

    private static HttpRequestDef<CreateDocWatermarkRequest, CreateDocWatermarkResponse> genForCreateDocWatermark() {
        // basic
        HttpRequestDef.Builder<CreateDocWatermarkRequest, CreateDocWatermarkResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDocWatermarkRequest.class, CreateDocWatermarkResponse.class)
                .withName("CreateDocWatermark")
                .withUri("/v1/{project_id}/sdg/doc/watermark/embed")
                .withContentType("multipart/form-data");

        // requests
        builder.<CreateDocWatermarkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDocWatermarkRequestBody.class),
            f -> f.withMarshaller(CreateDocWatermarkRequest::getBody, CreateDocWatermarkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDocWatermarkByAddressRequest, CreateDocWatermarkByAddressResponse> createDocWatermarkByAddress =
        genForCreateDocWatermarkByAddress();

    private static HttpRequestDef<CreateDocWatermarkByAddressRequest, CreateDocWatermarkByAddressResponse> genForCreateDocWatermarkByAddress() {
        // basic
        HttpRequestDef.Builder<CreateDocWatermarkByAddressRequest, CreateDocWatermarkByAddressResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateDocWatermarkByAddressRequest.class,
                    CreateDocWatermarkByAddressResponse.class)
                .withName("CreateDocWatermarkByAddress")
                .withUri("/v1/{project_id}/doc-address/watermark/embed")
                .withContentType("application/json");

        // requests
        builder.<CreateDocWatermarkByAddressRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDocWatermarkByAddressRequestBody.class),
            f -> f.withMarshaller(CreateDocWatermarkByAddressRequest::getBody,
                CreateDocWatermarkByAddressRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateImageWatermarkRequest, CreateImageWatermarkResponse> createImageWatermark =
        genForCreateImageWatermark();

    private static HttpRequestDef<CreateImageWatermarkRequest, CreateImageWatermarkResponse> genForCreateImageWatermark() {
        // basic
        HttpRequestDef.Builder<CreateImageWatermarkRequest, CreateImageWatermarkResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateImageWatermarkRequest.class, CreateImageWatermarkResponse.class)
            .withName("CreateImageWatermark")
            .withUri("/v1/{project_id}/image/watermark/embed")
            .withContentType("multipart/form-data");

        // requests
        builder.<CreateImageWatermarkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateImageWatermarkRequestBody.class),
            f -> f.withMarshaller(CreateImageWatermarkRequest::getBody, CreateImageWatermarkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateImageWatermarkByAddressRequest, CreateImageWatermarkByAddressResponse> createImageWatermarkByAddress =
        genForCreateImageWatermarkByAddress();

    private static HttpRequestDef<CreateImageWatermarkByAddressRequest, CreateImageWatermarkByAddressResponse> genForCreateImageWatermarkByAddress() {
        // basic
        HttpRequestDef.Builder<CreateImageWatermarkByAddressRequest, CreateImageWatermarkByAddressResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateImageWatermarkByAddressRequest.class,
                    CreateImageWatermarkByAddressResponse.class)
                .withName("CreateImageWatermarkByAddress")
                .withUri("/v1/{project_id}/image-address/watermark/embed")
                .withContentType("application/json");

        // requests
        builder.<CreateImageWatermarkByAddressRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateImageWatermarkByAddressRequestBody.class),
            f -> f.withMarshaller(CreateImageWatermarkByAddressRequest::getBody,
                CreateImageWatermarkByAddressRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProductOrderRequest, CreateProductOrderResponse> createProductOrder =
        genForCreateProductOrder();

    private static HttpRequestDef<CreateProductOrderRequest, CreateProductOrderResponse> genForCreateProductOrder() {
        // basic
        HttpRequestDef.Builder<CreateProductOrderRequest, CreateProductOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProductOrderRequest.class, CreateProductOrderResponse.class)
                .withName("CreateProductOrder")
                .withUri("/v1/{project_id}/period/order")
                .withContentType("application/json");

        // requests
        builder.<PeriodOrderRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PeriodOrderRequest.class),
            f -> f.withMarshaller(CreateProductOrderRequest::getBody, CreateProductOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBucketRequest, DeleteBucketResponse> deleteBucket = genForDeleteBucket();

    private static HttpRequestDef<DeleteBucketRequest, DeleteBucketResponse> genForDeleteBucket() {
        // basic
        HttpRequestDef.Builder<DeleteBucketRequest, DeleteBucketResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBucketRequest.class, DeleteBucketResponse.class)
                .withName("DeleteBucket")
                .withUri("/v1/{project_id}/sdg/asset/obs/bucket/{bucket_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bucket_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBucketRequest::getBucketId, DeleteBucketRequest::setBucketId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> deleteRule = genForDeleteRule();

    private static HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> genForDeleteRule() {
        // basic
        HttpRequestDef.Builder<DeleteRuleRequest, DeleteRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRuleRequest.class, DeleteRuleResponse.class)
                .withName("DeleteRule")
                .withUri("/v1/{project_id}/sdg/server/scan/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleRequest::getRuleId, DeleteRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRuleGroupRequest, DeleteRuleGroupResponse> deleteRuleGroup =
        genForDeleteRuleGroup();

    private static HttpRequestDef<DeleteRuleGroupRequest, DeleteRuleGroupResponse> genForDeleteRuleGroup() {
        // basic
        HttpRequestDef.Builder<DeleteRuleGroupRequest, DeleteRuleGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRuleGroupRequest.class, DeleteRuleGroupResponse.class)
                .withName("DeleteRuleGroup")
                .withUri("/v1/{project_id}/sdg/server/scan/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleGroupRequest::getGroupId, DeleteRuleGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScanJobRequest, DeleteScanJobResponse> deleteScanJob =
        genForDeleteScanJob();

    private static HttpRequestDef<DeleteScanJobRequest, DeleteScanJobResponse> genForDeleteScanJob() {
        // basic
        HttpRequestDef.Builder<DeleteScanJobRequest, DeleteScanJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteScanJobRequest.class, DeleteScanJobResponse.class)
                .withName("DeleteScanJob")
                .withUri("/v1/{project_id}/sdg/scan/job/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScanJobRequest::getJobId, DeleteScanJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBucketsRequest, ListBucketsResponse> listBuckets = genForListBuckets();

    private static HttpRequestDef<ListBucketsRequest, ListBucketsResponse> genForListBuckets() {
        // basic
        HttpRequestDef.Builder<ListBucketsRequest, ListBucketsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBucketsRequest.class, ListBucketsResponse.class)
                .withName("ListBuckets")
                .withUri("/v1/{project_id}/sdg/asset/obs/buckets")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("added",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListBucketsRequest::getAdded, ListBucketsRequest::setAdded));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBucketsRequest::getOffset, ListBucketsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBucketsRequest::getLimit, ListBucketsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDbMaskTaskRequest, ListDbMaskTaskResponse> listDbMaskTask =
        genForListDbMaskTask();

    private static HttpRequestDef<ListDbMaskTaskRequest, ListDbMaskTaskResponse> genForListDbMaskTask() {
        // basic
        HttpRequestDef.Builder<ListDbMaskTaskRequest, ListDbMaskTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDbMaskTaskRequest.class, ListDbMaskTaskResponse.class)
                .withName("ListDbMaskTask")
                .withUri("/v1/{project_id}/sdg/server/mask/dbs/templates/{template_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbMaskTaskRequest::getTemplateId, ListDbMaskTaskRequest::setTemplateId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbMaskTaskRequest::getWorkspaceId, ListDbMaskTaskRequest::setWorkspaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbMaskTaskRequest::getOffset, ListDbMaskTaskRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbMaskTaskRequest::getLimit, ListDbMaskTaskRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRuleGroupsRequest, ListRuleGroupsResponse> listRuleGroups =
        genForListRuleGroups();

    private static HttpRequestDef<ListRuleGroupsRequest, ListRuleGroupsResponse> genForListRuleGroups() {
        // basic
        HttpRequestDef.Builder<ListRuleGroupsRequest, ListRuleGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRuleGroupsRequest.class, ListRuleGroupsResponse.class)
                .withName("ListRuleGroups")
                .withUri("/v1/{project_id}/sdg/server/scan/groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleGroupsRequest::getOffset, ListRuleGroupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleGroupsRequest::getLimit, ListRuleGroupsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse> showDatabaseWaterMark =
        genForShowDatabaseWaterMark();

    private static HttpRequestDef<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse> genForShowDatabaseWaterMark() {
        // basic
        HttpRequestDef.Builder<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowDatabaseWaterMarkRequest.class, ShowDatabaseWaterMarkResponse.class)
            .withName("ShowDatabaseWaterMark")
            .withUri("/v1/{project_id}/sdg/database/watermark/extract")
            .withContentType("application/json");

        // requests
        builder.<ExtractedDatabaseWatermark>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExtractedDatabaseWatermark.class),
            f -> f.withMarshaller(ShowDatabaseWaterMarkRequest::getBody, ShowDatabaseWaterMarkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDocWatermarkRequest, ShowDocWatermarkResponse> showDocWatermark =
        genForShowDocWatermark();

    private static HttpRequestDef<ShowDocWatermarkRequest, ShowDocWatermarkResponse> genForShowDocWatermark() {
        // basic
        HttpRequestDef.Builder<ShowDocWatermarkRequest, ShowDocWatermarkResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowDocWatermarkRequest.class, ShowDocWatermarkResponse.class)
                .withName("ShowDocWatermark")
                .withUri("/v1/{project_id}/sdg/doc/watermark/extract")
                .withContentType("multipart/form-data");

        // requests
        builder.<ShowDocWatermarkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowDocWatermarkRequestBody.class),
            f -> f.withMarshaller(ShowDocWatermarkRequest::getBody, ShowDocWatermarkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDocWatermarkByAddressRequest, ShowDocWatermarkByAddressResponse> showDocWatermarkByAddress =
        genForShowDocWatermarkByAddress();

    private static HttpRequestDef<ShowDocWatermarkByAddressRequest, ShowDocWatermarkByAddressResponse> genForShowDocWatermarkByAddress() {
        // basic
        HttpRequestDef.Builder<ShowDocWatermarkByAddressRequest, ShowDocWatermarkByAddressResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowDocWatermarkByAddressRequest.class,
                    ShowDocWatermarkByAddressResponse.class)
                .withName("ShowDocWatermarkByAddress")
                .withUri("/v1/{project_id}/doc-address/watermark/extract")
                .withContentType("application/json");

        // requests
        builder.<ShowDocWatermarkByAddressRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowDocWatermarkByAddressRequestBody.class),
            f -> f.withMarshaller(ShowDocWatermarkByAddressRequest::getBody,
                ShowDocWatermarkByAddressRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageWatermarkRequest, ShowImageWatermarkResponse> showImageWatermark =
        genForShowImageWatermark();

    private static HttpRequestDef<ShowImageWatermarkRequest, ShowImageWatermarkResponse> genForShowImageWatermark() {
        // basic
        HttpRequestDef.Builder<ShowImageWatermarkRequest, ShowImageWatermarkResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowImageWatermarkRequest.class, ShowImageWatermarkResponse.class)
                .withName("ShowImageWatermark")
                .withUri("/v1/{project_id}/image/watermark/extract")
                .withContentType("multipart/form-data");

        // requests
        builder.<ShowImageWatermarkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowImageWatermarkRequestBody.class),
            f -> f.withMarshaller(ShowImageWatermarkRequest::getBody, ShowImageWatermarkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageWatermarkByAddressRequest, ShowImageWatermarkByAddressResponse> showImageWatermarkByAddress =
        genForShowImageWatermarkByAddress();

    private static HttpRequestDef<ShowImageWatermarkByAddressRequest, ShowImageWatermarkByAddressResponse> genForShowImageWatermarkByAddress() {
        // basic
        HttpRequestDef.Builder<ShowImageWatermarkByAddressRequest, ShowImageWatermarkByAddressResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowImageWatermarkByAddressRequest.class,
                    ShowImageWatermarkByAddressResponse.class)
                .withName("ShowImageWatermarkByAddress")
                .withUri("/v1/{project_id}/image-address/watermark/extract")
                .withContentType("application/json");

        // requests
        builder.<ShowImageWatermarkByAddressRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowImageWatermarkByAddressRequestBody.class),
            f -> f.withMarshaller(ShowImageWatermarkByAddressRequest::getBody,
                ShowImageWatermarkByAddressRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageWatermarkWithImageRequest, ShowImageWatermarkWithImageResponse> showImageWatermarkWithImage =
        genForShowImageWatermarkWithImage();

    private static HttpRequestDef<ShowImageWatermarkWithImageRequest, ShowImageWatermarkWithImageResponse> genForShowImageWatermarkWithImage() {
        // basic
        HttpRequestDef.Builder<ShowImageWatermarkWithImageRequest, ShowImageWatermarkWithImageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowImageWatermarkWithImageRequest.class,
                    ShowImageWatermarkWithImageResponse.class)
                .withName("ShowImageWatermarkWithImage")
                .withUri("/v1/{project_id}/image/watermark/extract-image")
                .withContentType("multipart/form-data");

        // requests
        builder.<ShowImageWatermarkWithImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowImageWatermarkWithImageRequestBody.class),
            f -> f.withMarshaller(ShowImageWatermarkWithImageRequest::getBody,
                ShowImageWatermarkWithImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageWatermarkWithImageByAddressRequest, ShowImageWatermarkWithImageByAddressResponse> showImageWatermarkWithImageByAddress =
        genForShowImageWatermarkWithImageByAddress();

    private static HttpRequestDef<ShowImageWatermarkWithImageByAddressRequest, ShowImageWatermarkWithImageByAddressResponse> genForShowImageWatermarkWithImageByAddress() {
        // basic
        HttpRequestDef.Builder<ShowImageWatermarkWithImageByAddressRequest, ShowImageWatermarkWithImageByAddressResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowImageWatermarkWithImageByAddressRequest.class,
                    ShowImageWatermarkWithImageByAddressResponse.class)
                .withName("ShowImageWatermarkWithImageByAddress")
                .withUri("/v1/{project_id}/image-address/watermark/extract-image")
                .withContentType("application/json");

        // requests
        builder.<ShowImageWatermarkWithImageByAddressRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowImageWatermarkWithImageByAddressRequestBody.class),
            f -> f.withMarshaller(ShowImageWatermarkWithImageByAddressRequest::getBody,
                ShowImageWatermarkWithImageByAddressRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRulesRequest, ShowRulesResponse> showRules = genForShowRules();

    private static HttpRequestDef<ShowRulesRequest, ShowRulesResponse> genForShowRules() {
        // basic
        HttpRequestDef.Builder<ShowRulesRequest, ShowRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRulesRequest.class, ShowRulesResponse.class)
                .withName("ShowRules")
                .withUri("/v1/{project_id}/sdg/server/scan/rules")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRulesRequest::getOffset, ShowRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRulesRequest::getLimit, ShowRulesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScanJobResultsRequest, ShowScanJobResultsResponse> showScanJobResults =
        genForShowScanJobResults();

    private static HttpRequestDef<ShowScanJobResultsRequest, ShowScanJobResultsResponse> genForShowScanJobResults() {
        // basic
        HttpRequestDef.Builder<ShowScanJobResultsRequest, ShowScanJobResultsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScanJobResultsRequest.class, ShowScanJobResultsResponse.class)
                .withName("ShowScanJobResults")
                .withUri("/v1/{project_id}/sdg/scan/job/{job_id}/results")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScanJobResultsRequest::getJobId, ShowScanJobResultsRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowScanJobResultsRequest::getOffset, ShowScanJobResultsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowScanJobResultsRequest::getLimit, ShowScanJobResultsRequest::setLimit));
        builder.<ShowScanJobResultsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowScanJobResultsRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowScanJobResultsRequest::getType, ShowScanJobResultsRequest::setType));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScanJobResultsRequest::getStartTime, ShowScanJobResultsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScanJobResultsRequest::getEndTime, ShowScanJobResultsRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScanJobsRequest, ShowScanJobsResponse> showScanJobs = genForShowScanJobs();

    private static HttpRequestDef<ShowScanJobsRequest, ShowScanJobsResponse> genForShowScanJobs() {
        // basic
        HttpRequestDef.Builder<ShowScanJobsRequest, ShowScanJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScanJobsRequest.class, ShowScanJobsResponse.class)
                .withName("ShowScanJobs")
                .withUri("/v1/{project_id}/sdg/scan/jobs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowScanJobsRequest::getOffset, ShowScanJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowScanJobsRequest::getLimit, ShowScanJobsRequest::setLimit));
        builder.<String>withRequestField("content",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScanJobsRequest::getContent, ShowScanJobsRequest::setContent));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScanJobsRequest::getStartTime, ShowScanJobsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScanJobsRequest::getEndTime, ShowScanJobsRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSpecificationRequest, ShowSpecificationResponse> showSpecification =
        genForShowSpecification();

    private static HttpRequestDef<ShowSpecificationRequest, ShowSpecificationResponse> genForShowSpecification() {
        // basic
        HttpRequestDef.Builder<ShowSpecificationRequest, ShowSpecificationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSpecificationRequest.class, ShowSpecificationResponse.class)
                .withName("ShowSpecification")
                .withUri("/v1/{project_id}/period/product/specification")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTopicsRequest, ShowTopicsResponse> showTopics = genForShowTopics();

    private static HttpRequestDef<ShowTopicsRequest, ShowTopicsResponse> genForShowTopics() {
        // basic
        HttpRequestDef.Builder<ShowTopicsRequest, ShowTopicsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTopicsRequest.class, ShowTopicsResponse.class)
                .withName("ShowTopics")
                .withUri("/v1/{project_id}/sdg/smn/topics")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTopicsRequest::getOffset, ShowTopicsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTopicsRequest::getLimit, ShowTopicsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssetNameRequest, UpdateAssetNameResponse> updateAssetName =
        genForUpdateAssetName();

    private static HttpRequestDef<UpdateAssetNameRequest, UpdateAssetNameResponse> genForUpdateAssetName() {
        // basic
        HttpRequestDef.Builder<UpdateAssetNameRequest, UpdateAssetNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAssetNameRequest.class, UpdateAssetNameResponse.class)
                .withName("UpdateAssetName")
                .withUri("/v1/{project_id}/sdg/asset/{asset_id}/name")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAssetNameRequest::getAssetId, UpdateAssetNameRequest::setAssetId));
        builder.<AssetNameRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssetNameRequest.class),
            f -> f.withMarshaller(UpdateAssetNameRequest::getBody, UpdateAssetNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDefaultTopicRequest, UpdateDefaultTopicResponse> updateDefaultTopic =
        genForUpdateDefaultTopic();

    private static HttpRequestDef<UpdateDefaultTopicRequest, UpdateDefaultTopicResponse> genForUpdateDefaultTopic() {
        // basic
        HttpRequestDef.Builder<UpdateDefaultTopicRequest, UpdateDefaultTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDefaultTopicRequest.class, UpdateDefaultTopicResponse.class)
                .withName("UpdateDefaultTopic")
                .withUri("/v1/{project_id}/sdg/smn/topic")
                .withContentType("application/json");

        // requests
        builder.<DefaultTopicRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DefaultTopicRequest.class),
            f -> f.withMarshaller(UpdateDefaultTopicRequest::getBody, UpdateDefaultTopicRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOpenApiCalledRecordsRequest, ShowOpenApiCalledRecordsResponse> showOpenApiCalledRecords =
        genForShowOpenApiCalledRecords();

    private static HttpRequestDef<ShowOpenApiCalledRecordsRequest, ShowOpenApiCalledRecordsResponse> genForShowOpenApiCalledRecords() {
        // basic
        HttpRequestDef.Builder<ShowOpenApiCalledRecordsRequest, ShowOpenApiCalledRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowOpenApiCalledRecordsRequest.class, ShowOpenApiCalledRecordsResponse.class)
                .withName("ShowOpenApiCalledRecords")
                .withUri("/v1/{project_id}/openapi/called-records")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowOpenApiCalledRecordsRequest::getLimit,
                ShowOpenApiCalledRecordsRequest::setLimit));
        builder.<String>withRequestField("called_url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOpenApiCalledRecordsRequest::getCalledUrl,
                ShowOpenApiCalledRecordsRequest::setCalledUrl));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowOpenApiCalledRecordsRequest::getStartTime,
                ShowOpenApiCalledRecordsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowOpenApiCalledRecordsRequest::getEndTime,
                ShowOpenApiCalledRecordsRequest::setEndTime));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOpenApiCalledRecordsRequest::getMarker,
                ShowOpenApiCalledRecordsRequest::setMarker));

        // response

        return builder.build();
    }

}
