package com.huaweicloud.sdk.dsc.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dsc.v1.model.*;

@SuppressWarnings("unchecked")
public class DscMeta {

    public static final HttpRequestDef<AddBucketsRequest, AddBucketsResponse> addBuckets = genForaddBuckets();

    private static HttpRequestDef<AddBucketsRequest, AddBucketsResponse> genForaddBuckets() {
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
            f -> f.withMarshaller(AddBucketsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<BucketsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BucketsRequest.class),
            f -> f.withMarshaller(AddBucketsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddRuleRequest, AddRuleResponse> addRule = genForaddRule();

    private static HttpRequestDef<AddRuleRequest, AddRuleResponse> genForaddRule() {
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
            f -> f.withMarshaller(AddRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddRuleGroupRequest, AddRuleGroupResponse> addRuleGroup = genForaddRuleGroup();

    private static HttpRequestDef<AddRuleGroupRequest, AddRuleGroupResponse> genForaddRuleGroup() {
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
            f -> f.withMarshaller(AddRuleGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddScanJobRequest, AddScanJobResponse> addScanJob = genForaddScanJob();

    private static HttpRequestDef<AddScanJobRequest, AddScanJobResponse> genForaddScanJob() {
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
            f -> f.withMarshaller(AddScanJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddDataMaskRequest, BatchAddDataMaskResponse> batchAddDataMask =
        genForbatchAddDataMask();

    private static HttpRequestDef<BatchAddDataMaskRequest, BatchAddDataMaskResponse> genForbatchAddDataMask() {
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
            f -> f.withMarshaller(BatchAddDataMaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeDbTemplateOperationRequest, ChangeDbTemplateOperationResponse> changeDbTemplateOperation =
        genForchangeDbTemplateOperation();

    private static HttpRequestDef<ChangeDbTemplateOperationRequest, ChangeDbTemplateOperationResponse> genForchangeDbTemplateOperation() {
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
            f -> f.withMarshaller(ChangeDbTemplateOperationRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<MaskSwitchRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MaskSwitchRequest.class),
            f -> f.withMarshaller(ChangeDbTemplateOperationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeRuleRequest, ChangeRuleResponse> changeRule = genForchangeRule();

    private static HttpRequestDef<ChangeRuleRequest, ChangeRuleResponse> genForchangeRule() {
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
            f -> f.withMarshaller(ChangeRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse> createDatabaseWaterMark =
        genForcreateDatabaseWaterMark();

    private static HttpRequestDef<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse> genForcreateDatabaseWaterMark() {
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
            f -> f.withMarshaller(CreateDatabaseWaterMarkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDocWatermarkRequest, CreateDocWatermarkResponse> createDocWatermark =
        genForcreateDocWatermark();

    private static HttpRequestDef<CreateDocWatermarkRequest, CreateDocWatermarkResponse> genForcreateDocWatermark() {
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
            f -> f.withMarshaller(CreateDocWatermarkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDocWatermarkByAddressRequest, CreateDocWatermarkByAddressResponse> createDocWatermarkByAddress =
        genForcreateDocWatermarkByAddress();

    private static HttpRequestDef<CreateDocWatermarkByAddressRequest, CreateDocWatermarkByAddressResponse> genForcreateDocWatermarkByAddress() {
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
            f -> f.withMarshaller(CreateDocWatermarkByAddressRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateImageWatermarkRequest, CreateImageWatermarkResponse> createImageWatermark =
        genForcreateImageWatermark();

    private static HttpRequestDef<CreateImageWatermarkRequest, CreateImageWatermarkResponse> genForcreateImageWatermark() {
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
            f -> f.withMarshaller(CreateImageWatermarkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateImageWatermarkByAddressRequest, CreateImageWatermarkByAddressResponse> createImageWatermarkByAddress =
        genForcreateImageWatermarkByAddress();

    private static HttpRequestDef<CreateImageWatermarkByAddressRequest, CreateImageWatermarkByAddressResponse> genForcreateImageWatermarkByAddress() {
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
            f -> f.withMarshaller(CreateImageWatermarkByAddressRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProductOrderRequest, CreateProductOrderResponse> createProductOrder =
        genForcreateProductOrder();

    private static HttpRequestDef<CreateProductOrderRequest, CreateProductOrderResponse> genForcreateProductOrder() {
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
            f -> f.withMarshaller(CreateProductOrderRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBucketRequest, DeleteBucketResponse> deleteBucket = genFordeleteBucket();

    private static HttpRequestDef<DeleteBucketRequest, DeleteBucketResponse> genFordeleteBucket() {
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
            f -> f.withMarshaller(DeleteBucketRequest::getBucketId, (req, v) -> {
                req.setBucketId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> deleteRule = genFordeleteRule();

    private static HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> genFordeleteRule() {
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
            f -> f.withMarshaller(DeleteRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRuleGroupRequest, DeleteRuleGroupResponse> deleteRuleGroup =
        genFordeleteRuleGroup();

    private static HttpRequestDef<DeleteRuleGroupRequest, DeleteRuleGroupResponse> genFordeleteRuleGroup() {
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
            f -> f.withMarshaller(DeleteRuleGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBucketsRequest, ListBucketsResponse> listBuckets = genForlistBuckets();

    private static HttpRequestDef<ListBucketsRequest, ListBucketsResponse> genForlistBuckets() {
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
            f -> f.withMarshaller(ListBucketsRequest::getAdded, (req, v) -> {
                req.setAdded(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBucketsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBucketsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDbMaskTaskRequest, ListDbMaskTaskResponse> listDbMaskTask =
        genForlistDbMaskTask();

    private static HttpRequestDef<ListDbMaskTaskRequest, ListDbMaskTaskResponse> genForlistDbMaskTask() {
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
            f -> f.withMarshaller(ListDbMaskTaskRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbMaskTaskRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbMaskTaskRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbMaskTaskRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRelationBucketsRequest, ListRelationBucketsResponse> listRelationBuckets =
        genForlistRelationBuckets();

    private static HttpRequestDef<ListRelationBucketsRequest, ListRelationBucketsResponse> genForlistRelationBuckets() {
        // basic
        HttpRequestDef.Builder<ListRelationBucketsRequest, ListRelationBucketsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRelationBucketsRequest.class, ListRelationBucketsResponse.class)
                .withName("ListRelationBuckets")
                .withUri("/v1/{project_id}/sdg/server/relation/jobs/{job_id}/obs/buckets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationBucketsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("assets_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationBucketsRequest::getAssetsName, (req, v) -> {
                req.setAssetsName(v);
            }));
        builder.<Integer>withRequestField("risk_start",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationBucketsRequest::getRiskStart, (req, v) -> {
                req.setRiskStart(v);
            }));
        builder.<Integer>withRequestField("risk_end",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationBucketsRequest::getRiskEnd, (req, v) -> {
                req.setRiskEnd(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationBucketsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationBucketsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRelationColumnRequest, ListRelationColumnResponse> listRelationColumn =
        genForlistRelationColumn();

    private static HttpRequestDef<ListRelationColumnRequest, ListRelationColumnResponse> genForlistRelationColumn() {
        // basic
        HttpRequestDef.Builder<ListRelationColumnRequest, ListRelationColumnResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRelationColumnRequest.class, ListRelationColumnResponse.class)
                .withName("ListRelationColumn")
                .withUri("/v1/{project_id}/sdg/server/relation/jobs/{job_id}/dbs/{table_id}/columns")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationColumnRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationColumnRequest::getTableId, (req, v) -> {
                req.setTableId(v);
            }));
        builder.<String>withRequestField("assets_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationColumnRequest::getAssetsName, (req, v) -> {
                req.setAssetsName(v);
            }));
        builder.<Integer>withRequestField("risk_start",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationColumnRequest::getRiskStart, (req, v) -> {
                req.setRiskStart(v);
            }));
        builder.<Integer>withRequestField("risk_end",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationColumnRequest::getRiskEnd, (req, v) -> {
                req.setRiskEnd(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationColumnRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationColumnRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRelationDbRequest, ListRelationDbResponse> listRelationDb =
        genForlistRelationDb();

    private static HttpRequestDef<ListRelationDbRequest, ListRelationDbResponse> genForlistRelationDb() {
        // basic
        HttpRequestDef.Builder<ListRelationDbRequest, ListRelationDbResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRelationDbRequest.class, ListRelationDbResponse.class)
                .withName("ListRelationDb")
                .withUri("/v1/{project_id}/sdg/server/relation/jobs/{job_id}/dbs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationDbRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("assets_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationDbRequest::getAssetsName, (req, v) -> {
                req.setAssetsName(v);
            }));
        builder.<Integer>withRequestField("risk_start",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationDbRequest::getRiskStart, (req, v) -> {
                req.setRiskStart(v);
            }));
        builder.<Integer>withRequestField("risk_end",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationDbRequest::getRiskEnd, (req, v) -> {
                req.setRiskEnd(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationDbRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationDbRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRelationFileRequest, ListRelationFileResponse> listRelationFile =
        genForlistRelationFile();

    private static HttpRequestDef<ListRelationFileRequest, ListRelationFileResponse> genForlistRelationFile() {
        // basic
        HttpRequestDef.Builder<ListRelationFileRequest, ListRelationFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRelationFileRequest.class, ListRelationFileResponse.class)
                .withName("ListRelationFile")
                .withUri("/v1/{project_id}/sdg/server/relation/jobs/{job_id}/obs/{bucket_id}/files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationFileRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("bucket_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationFileRequest::getBucketId, (req, v) -> {
                req.setBucketId(v);
            }));
        builder.<String>withRequestField("assets_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationFileRequest::getAssetsName, (req, v) -> {
                req.setAssetsName(v);
            }));
        builder.<Integer>withRequestField("risk_start",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationFileRequest::getRiskStart, (req, v) -> {
                req.setRiskStart(v);
            }));
        builder.<Integer>withRequestField("risk_end",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationFileRequest::getRiskEnd, (req, v) -> {
                req.setRiskEnd(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationFileRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationFileRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationFileRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRelationTableRequest, ListRelationTableResponse> listRelationTable =
        genForlistRelationTable();

    private static HttpRequestDef<ListRelationTableRequest, ListRelationTableResponse> genForlistRelationTable() {
        // basic
        HttpRequestDef.Builder<ListRelationTableRequest, ListRelationTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRelationTableRequest.class, ListRelationTableResponse.class)
                .withName("ListRelationTable")
                .withUri("/v1/{project_id}/sdg/server/relation/jobs/{job_id}/dbs/{db_id}/tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationTableRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("db_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationTableRequest::getDbId, (req, v) -> {
                req.setDbId(v);
            }));
        builder.<String>withRequestField("assets_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationTableRequest::getAssetsName, (req, v) -> {
                req.setAssetsName(v);
            }));
        builder.<Integer>withRequestField("risk_start",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationTableRequest::getRiskStart, (req, v) -> {
                req.setRiskStart(v);
            }));
        builder.<Integer>withRequestField("risk_end",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationTableRequest::getRiskEnd, (req, v) -> {
                req.setRiskEnd(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationTableRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationTableRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationTableRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRuleGroupsRequest, ListRuleGroupsResponse> listRuleGroups =
        genForlistRuleGroups();

    private static HttpRequestDef<ListRuleGroupsRequest, ListRuleGroupsResponse> genForlistRuleGroups() {
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
            f -> f.withMarshaller(ListRuleGroupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse> showDatabaseWaterMark =
        genForshowDatabaseWaterMark();

    private static HttpRequestDef<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse> genForshowDatabaseWaterMark() {
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
            f -> f.withMarshaller(ShowDatabaseWaterMarkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDocWatermarkRequest, ShowDocWatermarkResponse> showDocWatermark =
        genForshowDocWatermark();

    private static HttpRequestDef<ShowDocWatermarkRequest, ShowDocWatermarkResponse> genForshowDocWatermark() {
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
            f -> f.withMarshaller(ShowDocWatermarkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDocWatermarkByAddressRequest, ShowDocWatermarkByAddressResponse> showDocWatermarkByAddress =
        genForshowDocWatermarkByAddress();

    private static HttpRequestDef<ShowDocWatermarkByAddressRequest, ShowDocWatermarkByAddressResponse> genForshowDocWatermarkByAddress() {
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
            f -> f.withMarshaller(ShowDocWatermarkByAddressRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageWatermarkRequest, ShowImageWatermarkResponse> showImageWatermark =
        genForshowImageWatermark();

    private static HttpRequestDef<ShowImageWatermarkRequest, ShowImageWatermarkResponse> genForshowImageWatermark() {
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
            f -> f.withMarshaller(ShowImageWatermarkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageWatermarkByAddressRequest, ShowImageWatermarkByAddressResponse> showImageWatermarkByAddress =
        genForshowImageWatermarkByAddress();

    private static HttpRequestDef<ShowImageWatermarkByAddressRequest, ShowImageWatermarkByAddressResponse> genForshowImageWatermarkByAddress() {
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
            f -> f.withMarshaller(ShowImageWatermarkByAddressRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageWatermarkWithImageRequest, ShowImageWatermarkWithImageResponse> showImageWatermarkWithImage =
        genForshowImageWatermarkWithImage();

    private static HttpRequestDef<ShowImageWatermarkWithImageRequest, ShowImageWatermarkWithImageResponse> genForshowImageWatermarkWithImage() {
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
            f -> f.withMarshaller(ShowImageWatermarkWithImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageWatermarkWithImageByAddressRequest, ShowImageWatermarkWithImageByAddressResponse> showImageWatermarkWithImageByAddress =
        genForshowImageWatermarkWithImageByAddress();

    private static HttpRequestDef<ShowImageWatermarkWithImageByAddressRequest, ShowImageWatermarkWithImageByAddressResponse> genForshowImageWatermarkWithImageByAddress() {
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
            f -> f.withMarshaller(ShowImageWatermarkWithImageByAddressRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRulesRequest, ShowRulesResponse> showRules = genForshowRules();

    private static HttpRequestDef<ShowRulesRequest, ShowRulesResponse> genForshowRules() {
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
            f -> f.withMarshaller(ShowRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScanJobResultsRequest, ShowScanJobResultsResponse> showScanJobResults =
        genForshowScanJobResults();

    private static HttpRequestDef<ShowScanJobResultsRequest, ShowScanJobResultsResponse> genForshowScanJobResults() {
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
            f -> f.withMarshaller(ShowScanJobResultsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowScanJobResultsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowScanJobResultsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ShowScanJobResultsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowScanJobResultsRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowScanJobResultsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScanJobResultsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScanJobResultsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScanJobsRequest, ShowScanJobsResponse> showScanJobs = genForshowScanJobs();

    private static HttpRequestDef<ShowScanJobsRequest, ShowScanJobsResponse> genForshowScanJobs() {
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
            f -> f.withMarshaller(ShowScanJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowScanJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("content",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScanJobsRequest::getContent, (req, v) -> {
                req.setContent(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScanJobsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScanJobsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSpecificationRequest, ShowSpecificationResponse> showSpecification =
        genForshowSpecification();

    private static HttpRequestDef<ShowSpecificationRequest, ShowSpecificationResponse> genForshowSpecification() {
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

    public static final HttpRequestDef<ShowTopicsRequest, ShowTopicsResponse> showTopics = genForshowTopics();

    private static HttpRequestDef<ShowTopicsRequest, ShowTopicsResponse> genForshowTopics() {
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
            f -> f.withMarshaller(ShowTopicsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTopicsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssetNameRequest, UpdateAssetNameResponse> updateAssetName =
        genForupdateAssetName();

    private static HttpRequestDef<UpdateAssetNameRequest, UpdateAssetNameResponse> genForupdateAssetName() {
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
            f -> f.withMarshaller(UpdateAssetNameRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<AssetNameRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssetNameRequest.class),
            f -> f.withMarshaller(UpdateAssetNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDefaultTopicRequest, UpdateDefaultTopicResponse> updateDefaultTopic =
        genForupdateDefaultTopic();

    private static HttpRequestDef<UpdateDefaultTopicRequest, UpdateDefaultTopicResponse> genForupdateDefaultTopic() {
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
            f -> f.withMarshaller(UpdateDefaultTopicRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOpenApiCalledRecordsRequest, ShowOpenApiCalledRecordsResponse> showOpenApiCalledRecords =
        genForshowOpenApiCalledRecords();

    private static HttpRequestDef<ShowOpenApiCalledRecordsRequest, ShowOpenApiCalledRecordsResponse> genForshowOpenApiCalledRecords() {
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
            f -> f.withMarshaller(ShowOpenApiCalledRecordsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("called_url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOpenApiCalledRecordsRequest::getCalledUrl, (req, v) -> {
                req.setCalledUrl(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowOpenApiCalledRecordsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowOpenApiCalledRecordsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOpenApiCalledRecordsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

}
