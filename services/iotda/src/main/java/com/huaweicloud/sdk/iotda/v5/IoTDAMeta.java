package com.huaweicloud.sdk.iotda.v5;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.iotda.v5.model.AddActionReq;
import com.huaweicloud.sdk.iotda.v5.model.AddApplication;
import com.huaweicloud.sdk.iotda.v5.model.AddApplicationRequest;
import com.huaweicloud.sdk.iotda.v5.model.AddApplicationResponse;
import com.huaweicloud.sdk.iotda.v5.model.AddCertificateRequest;
import com.huaweicloud.sdk.iotda.v5.model.AddCertificateResponse;
import com.huaweicloud.sdk.iotda.v5.model.AddDevice;
import com.huaweicloud.sdk.iotda.v5.model.AddDeviceGroupDTO;
import com.huaweicloud.sdk.iotda.v5.model.AddDeviceGroupRequest;
import com.huaweicloud.sdk.iotda.v5.model.AddDeviceGroupResponse;
import com.huaweicloud.sdk.iotda.v5.model.AddDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.AddDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.AddProduct;
import com.huaweicloud.sdk.iotda.v5.model.AddQueueRequest;
import com.huaweicloud.sdk.iotda.v5.model.AddQueueResponse;
import com.huaweicloud.sdk.iotda.v5.model.AddRuleReq;
import com.huaweicloud.sdk.iotda.v5.model.AsyncDeviceCommandRequest;
import com.huaweicloud.sdk.iotda.v5.model.BatchShowQueueRequest;
import com.huaweicloud.sdk.iotda.v5.model.BatchShowQueueResponse;
import com.huaweicloud.sdk.iotda.v5.model.BatchTargets;
import com.huaweicloud.sdk.iotda.v5.model.BindTagsDTO;
import com.huaweicloud.sdk.iotda.v5.model.BroadcastMessageRequest;
import com.huaweicloud.sdk.iotda.v5.model.BroadcastMessageResponse;
import com.huaweicloud.sdk.iotda.v5.model.ChangeRuleStatusRequest;
import com.huaweicloud.sdk.iotda.v5.model.ChangeRuleStatusResponse;
import com.huaweicloud.sdk.iotda.v5.model.CheckCertificateRequest;
import com.huaweicloud.sdk.iotda.v5.model.CheckCertificateResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateAccessCodeRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateAccessCodeRequestBody;
import com.huaweicloud.sdk.iotda.v5.model.CreateAccessCodeResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateAsyncCommandRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateAsyncCommandResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateBatchTask;
import com.huaweicloud.sdk.iotda.v5.model.CreateBatchTaskRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateBatchTaskResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateCertificateDTO;
import com.huaweicloud.sdk.iotda.v5.model.CreateCommandRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateCommandResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateMessageRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateMessageResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateOrDeleteDeviceInGroupRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateOrDeleteDeviceInGroupResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateOtaPackage;
import com.huaweicloud.sdk.iotda.v5.model.CreateOtaPackageRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateOtaPackageResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateProductRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateProductResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateRoutingRuleRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateRoutingRuleResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateRuleActionRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateRuleActionResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateRuleRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateRuleResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteApplicationRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteApplicationResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteBatchTaskFileRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteBatchTaskFileResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteCertificateRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteCertificateResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteDeviceGroupRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteDeviceGroupResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteOtaPackageRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteOtaPackageResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteProductRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteProductResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteQueueRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteQueueResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteRoutingRuleRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteRoutingRuleResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteRuleActionRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteRuleActionResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteRuleRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteRuleResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeviceBroadcastRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeviceCommandRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeviceMessageRequest;
import com.huaweicloud.sdk.iotda.v5.model.DevicePropertiesRequest;
import com.huaweicloud.sdk.iotda.v5.model.FreezeDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.FreezeDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListBatchTaskFilesRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListBatchTaskFilesResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListBatchTasksRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListBatchTasksResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListCertificatesRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListCertificatesResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListDeviceGroupsRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListDeviceGroupsResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListDeviceMessagesRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListDeviceMessagesResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListDevicesRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListDevicesResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListOtaPackageInfoRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListOtaPackageInfoResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListProductsRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListProductsResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListPropertiesRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListPropertiesResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListResourcesByTagsRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListResourcesByTagsResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListRoutingRulesRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListRoutingRulesResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListRuleActionsRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListRuleActionsResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListRulesRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListRulesResponse;
import com.huaweicloud.sdk.iotda.v5.model.QueryResourceByTagsDTO;
import com.huaweicloud.sdk.iotda.v5.model.QueueInfo;
import com.huaweicloud.sdk.iotda.v5.model.ResetDeviceSecret;
import com.huaweicloud.sdk.iotda.v5.model.ResetDeviceSecretRequest;
import com.huaweicloud.sdk.iotda.v5.model.ResetDeviceSecretResponse;
import com.huaweicloud.sdk.iotda.v5.model.ResetFingerprint;
import com.huaweicloud.sdk.iotda.v5.model.ResetFingerprintRequest;
import com.huaweicloud.sdk.iotda.v5.model.ResetFingerprintResponse;
import com.huaweicloud.sdk.iotda.v5.model.RetryBatchTaskRequest;
import com.huaweicloud.sdk.iotda.v5.model.RetryBatchTaskResponse;
import com.huaweicloud.sdk.iotda.v5.model.Rule;
import com.huaweicloud.sdk.iotda.v5.model.RuleStatus;
import com.huaweicloud.sdk.iotda.v5.model.SearchDevicesRequest;
import com.huaweicloud.sdk.iotda.v5.model.SearchDevicesResponse;
import com.huaweicloud.sdk.iotda.v5.model.SearchSql;
import com.huaweicloud.sdk.iotda.v5.model.ShowApplicationRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowApplicationResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowApplicationsRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowApplicationsResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowAsyncDeviceCommandRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowAsyncDeviceCommandResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowBatchTaskRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowBatchTaskResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceGroupRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceGroupResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceMessageRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceMessageResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceShadowRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceShadowResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowDevicesInGroupRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowDevicesInGroupResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowOtaPackageRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowOtaPackageResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowProductRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowProductResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowQueueRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowQueueResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowRoutingRuleRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowRoutingRuleResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowRuleActionRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowRuleActionResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowRuleRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowRuleResponse;
import com.huaweicloud.sdk.iotda.v5.model.StopBatchTaskRequest;
import com.huaweicloud.sdk.iotda.v5.model.StopBatchTaskResponse;
import com.huaweicloud.sdk.iotda.v5.model.TagDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.TagDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.UnbindTagsDTO;
import com.huaweicloud.sdk.iotda.v5.model.UnfreezeDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.UnfreezeDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.UntagDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.UntagDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateActionReq;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDesireds;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDevice;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceGroupDTO;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceGroupRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceGroupResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceShadowDesiredDataRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceShadowDesiredDataResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateProduct;
import com.huaweicloud.sdk.iotda.v5.model.UpdateProductRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateProductResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdatePropertiesRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdatePropertiesResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateRoutingRuleRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateRoutingRuleResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateRuleActionRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateRuleActionResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateRuleReq;
import com.huaweicloud.sdk.iotda.v5.model.UpdateRuleRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateRuleResponse;
import com.huaweicloud.sdk.iotda.v5.model.UploadBatchTaskFileRequest;
import com.huaweicloud.sdk.iotda.v5.model.UploadBatchTaskFileRequestBody;
import com.huaweicloud.sdk.iotda.v5.model.UploadBatchTaskFileResponse;
import com.huaweicloud.sdk.iotda.v5.model.VerifyCertificateDTO;

@SuppressWarnings("unchecked")
public class IoTDAMeta {

    public static final HttpRequestDef<CreateAccessCodeRequest, CreateAccessCodeResponse> createAccessCode =
        genForcreateAccessCode();

    private static HttpRequestDef<CreateAccessCodeRequest, CreateAccessCodeResponse> genForcreateAccessCode() {
        // basic
        HttpRequestDef.Builder<CreateAccessCodeRequest, CreateAccessCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAccessCodeRequest.class, CreateAccessCodeResponse.class)
                .withName("CreateAccessCode")
                .withUri("/v5/iot/{project_id}/auth/accesscode")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAccessCodeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateAccessCodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAccessCodeRequestBody.class),
            f -> f.withMarshaller(CreateAccessCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddQueueRequest, AddQueueResponse> addQueue = genForaddQueue();

    private static HttpRequestDef<AddQueueRequest, AddQueueResponse> genForaddQueue() {
        // basic
        HttpRequestDef.Builder<AddQueueRequest, AddQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddQueueRequest.class, AddQueueResponse.class)
                .withName("AddQueue")
                .withUri("/v5/iot/{project_id}/amqp-queues")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddQueueRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<QueueInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueueInfo.class),
            f -> f.withMarshaller(AddQueueRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowQueueRequest, BatchShowQueueResponse> batchShowQueue =
        genForbatchShowQueue();

    private static HttpRequestDef<BatchShowQueueRequest, BatchShowQueueResponse> genForbatchShowQueue() {
        // basic
        HttpRequestDef.Builder<BatchShowQueueRequest, BatchShowQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, BatchShowQueueRequest.class, BatchShowQueueResponse.class)
                .withName("BatchShowQueue")
                .withUri("/v5/iot/{project_id}/amqp-queues")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowQueueRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowQueueRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowQueueRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowQueueRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowQueueRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteQueueRequest, DeleteQueueResponse> deleteQueue = genFordeleteQueue();

    private static HttpRequestDef<DeleteQueueRequest, DeleteQueueResponse> genFordeleteQueue() {
        // basic
        HttpRequestDef.Builder<DeleteQueueRequest, DeleteQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteQueueRequest.class, DeleteQueueResponse.class)
                .withName("DeleteQueue")
                .withUri("/v5/iot/{project_id}/amqp-queues/{queue_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteQueueRequest::getQueueId, (req, v) -> {
                req.setQueueId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteQueueRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteQueueResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowQueueRequest, ShowQueueResponse> showQueue = genForshowQueue();

    private static HttpRequestDef<ShowQueueRequest, ShowQueueResponse> genForshowQueue() {
        // basic
        HttpRequestDef.Builder<ShowQueueRequest, ShowQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQueueRequest.class, ShowQueueResponse.class)
                .withName("ShowQueue")
                .withUri("/v5/iot/{project_id}/amqp-queues/{queue_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQueueRequest::getQueueId, (req, v) -> {
                req.setQueueId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQueueRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddApplicationRequest, AddApplicationResponse> addApplication =
        genForaddApplication();

    private static HttpRequestDef<AddApplicationRequest, AddApplicationResponse> genForaddApplication() {
        // basic
        HttpRequestDef.Builder<AddApplicationRequest, AddApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddApplicationRequest.class, AddApplicationResponse.class)
                .withName("AddApplication")
                .withUri("/v5/iot/{project_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddApplicationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AddApplication>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddApplication.class),
            f -> f.withMarshaller(AddApplicationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplication =
        genFordeleteApplication();

    private static HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> genFordeleteApplication() {
        // basic
        HttpRequestDef.Builder<DeleteApplicationRequest, DeleteApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteApplicationRequest.class, DeleteApplicationResponse.class)
                .withName("DeleteApplication")
                .withUri("/v5/iot/{project_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteApplicationResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationRequest, ShowApplicationResponse> showApplication =
        genForshowApplication();

    private static HttpRequestDef<ShowApplicationRequest, ShowApplicationResponse> genForshowApplication() {
        // basic
        HttpRequestDef.Builder<ShowApplicationRequest, ShowApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApplicationRequest.class, ShowApplicationResponse.class)
                .withName("ShowApplication")
                .withUri("/v5/iot/{project_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationsRequest, ShowApplicationsResponse> showApplications =
        genForshowApplications();

    private static HttpRequestDef<ShowApplicationsRequest, ShowApplicationsResponse> genForshowApplications() {
        // basic
        HttpRequestDef.Builder<ShowApplicationsRequest, ShowApplicationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApplicationsRequest.class, ShowApplicationsResponse.class)
                .withName("ShowApplications")
                .withUri("/v5/iot/{project_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("default_app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowApplicationsRequest::getDefaultApp, (req, v) -> {
                req.setDefaultApp(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAsyncCommandRequest, CreateAsyncCommandResponse> createAsyncCommand =
        genForcreateAsyncCommand();

    private static HttpRequestDef<CreateAsyncCommandRequest, CreateAsyncCommandResponse> genForcreateAsyncCommand() {
        // basic
        HttpRequestDef.Builder<CreateAsyncCommandRequest, CreateAsyncCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAsyncCommandRequest.class, CreateAsyncCommandResponse.class)
                .withName("CreateAsyncCommand")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/async-commands")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAsyncCommandRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAsyncCommandRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AsyncDeviceCommandRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AsyncDeviceCommandRequest.class),
            f -> f.withMarshaller(CreateAsyncCommandRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAsyncDeviceCommandRequest, ShowAsyncDeviceCommandResponse> showAsyncDeviceCommand =
        genForshowAsyncDeviceCommand();

    private static HttpRequestDef<ShowAsyncDeviceCommandRequest, ShowAsyncDeviceCommandResponse> genForshowAsyncDeviceCommand() {
        // basic
        HttpRequestDef.Builder<ShowAsyncDeviceCommandRequest, ShowAsyncDeviceCommandResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAsyncDeviceCommandRequest.class, ShowAsyncDeviceCommandResponse.class)
            .withName("ShowAsyncDeviceCommand")
            .withUri("/v5/iot/{project_id}/devices/{device_id}/async-commands/{command_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAsyncDeviceCommandRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAsyncDeviceCommandRequest::getCommandId, (req, v) -> {
                req.setCommandId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAsyncDeviceCommandRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBatchTaskRequest, CreateBatchTaskResponse> createBatchTask =
        genForcreateBatchTask();

    private static HttpRequestDef<CreateBatchTaskRequest, CreateBatchTaskResponse> genForcreateBatchTask() {
        // basic
        HttpRequestDef.Builder<CreateBatchTaskRequest, CreateBatchTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBatchTaskRequest.class, CreateBatchTaskResponse.class)
                .withName("CreateBatchTask")
                .withUri("/v5/iot/{project_id}/batchtasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBatchTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateBatchTask>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBatchTask.class),
            f -> f.withMarshaller(CreateBatchTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBatchTasksRequest, ListBatchTasksResponse> listBatchTasks =
        genForlistBatchTasks();

    private static HttpRequestDef<ListBatchTasksRequest, ListBatchTasksResponse> genForlistBatchTasks() {
        // basic
        HttpRequestDef.Builder<ListBatchTasksRequest, ListBatchTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBatchTasksRequest.class, ListBatchTasksResponse.class)
                .withName("ListBatchTasks")
                .withUri("/v5/iot/{project_id}/batchtasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("task_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getTaskType, (req, v) -> {
                req.setTaskType(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryBatchTaskRequest, RetryBatchTaskResponse> retryBatchTask =
        genForretryBatchTask();

    private static HttpRequestDef<RetryBatchTaskRequest, RetryBatchTaskResponse> genForretryBatchTask() {
        // basic
        HttpRequestDef.Builder<RetryBatchTaskRequest, RetryBatchTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RetryBatchTaskRequest.class, RetryBatchTaskResponse.class)
                .withName("RetryBatchTask")
                .withUri("/v5/iot/{project_id}/batchtasks/{task_id}/retry")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryBatchTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryBatchTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<BatchTargets>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchTargets.class),
            f -> f.withMarshaller(RetryBatchTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchTaskRequest, ShowBatchTaskResponse> showBatchTask =
        genForshowBatchTask();

    private static HttpRequestDef<ShowBatchTaskRequest, ShowBatchTaskResponse> genForshowBatchTask() {
        // basic
        HttpRequestDef.Builder<ShowBatchTaskRequest, ShowBatchTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBatchTaskRequest.class, ShowBatchTaskResponse.class)
                .withName("ShowBatchTask")
                .withUri("/v5/iot/{project_id}/batchtasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("task_detail_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchTaskRequest::getTaskDetailStatus, (req, v) -> {
                req.setTaskDetailStatus(v);
            }));
        builder.<String>withRequestField("target",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchTaskRequest::getTarget, (req, v) -> {
                req.setTarget(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBatchTaskRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchTaskRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBatchTaskRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopBatchTaskRequest, StopBatchTaskResponse> stopBatchTask =
        genForstopBatchTask();

    private static HttpRequestDef<StopBatchTaskRequest, StopBatchTaskResponse> genForstopBatchTask() {
        // basic
        HttpRequestDef.Builder<StopBatchTaskRequest, StopBatchTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopBatchTaskRequest.class, StopBatchTaskResponse.class)
                .withName("StopBatchTask")
                .withUri("/v5/iot/{project_id}/batchtasks/{task_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopBatchTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopBatchTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<BatchTargets>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchTargets.class),
            f -> f.withMarshaller(StopBatchTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBatchTaskFileRequest, DeleteBatchTaskFileResponse> deleteBatchTaskFile =
        genFordeleteBatchTaskFile();

    private static HttpRequestDef<DeleteBatchTaskFileRequest, DeleteBatchTaskFileResponse> genFordeleteBatchTaskFile() {
        // basic
        HttpRequestDef.Builder<DeleteBatchTaskFileRequest, DeleteBatchTaskFileResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteBatchTaskFileRequest.class, DeleteBatchTaskFileResponse.class)
            .withName("DeleteBatchTaskFile")
            .withUri("/v5/iot/{project_id}/batchtask-files/{file_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("file_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBatchTaskFileRequest::getFileId, (req, v) -> {
                req.setFileId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBatchTaskFileRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBatchTaskFileResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListBatchTaskFilesRequest, ListBatchTaskFilesResponse> listBatchTaskFiles =
        genForlistBatchTaskFiles();

    private static HttpRequestDef<ListBatchTaskFilesRequest, ListBatchTaskFilesResponse> genForlistBatchTaskFiles() {
        // basic
        HttpRequestDef.Builder<ListBatchTaskFilesRequest, ListBatchTaskFilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBatchTaskFilesRequest.class, ListBatchTaskFilesResponse.class)
                .withName("ListBatchTaskFiles")
                .withUri("/v5/iot/{project_id}/batchtask-files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchTaskFilesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadBatchTaskFileRequest, UploadBatchTaskFileResponse> uploadBatchTaskFile =
        genForuploadBatchTaskFile();

    private static HttpRequestDef<UploadBatchTaskFileRequest, UploadBatchTaskFileResponse> genForuploadBatchTaskFile() {
        // basic
        HttpRequestDef.Builder<UploadBatchTaskFileRequest, UploadBatchTaskFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadBatchTaskFileRequest.class, UploadBatchTaskFileResponse.class)
                .withName("UploadBatchTaskFile")
                .withUri("/v5/iot/{project_id}/batchtask-files")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadBatchTaskFileRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UploadBatchTaskFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadBatchTaskFileRequestBody.class),
            f -> f.withMarshaller(UploadBatchTaskFileRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BroadcastMessageRequest, BroadcastMessageResponse> broadcastMessage =
        genForbroadcastMessage();

    private static HttpRequestDef<BroadcastMessageRequest, BroadcastMessageResponse> genForbroadcastMessage() {
        // basic
        HttpRequestDef.Builder<BroadcastMessageRequest, BroadcastMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BroadcastMessageRequest.class, BroadcastMessageResponse.class)
                .withName("BroadcastMessage")
                .withUri("/v5/iot/{project_id}/broadcast-messages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BroadcastMessageRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<DeviceBroadcastRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeviceBroadcastRequest.class),
            f -> f.withMarshaller(BroadcastMessageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddCertificateRequest, AddCertificateResponse> addCertificate =
        genForaddCertificate();

    private static HttpRequestDef<AddCertificateRequest, AddCertificateResponse> genForaddCertificate() {
        // basic
        HttpRequestDef.Builder<AddCertificateRequest, AddCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddCertificateRequest.class, AddCertificateResponse.class)
                .withName("AddCertificate")
                .withUri("/v5/iot/{project_id}/certificates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Sp-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddCertificateRequest::getSpAuthToken, (req, v) -> {
                req.setSpAuthToken(v);
            }));
        builder.<String>withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddCertificateRequest::getStageAuthToken, (req, v) -> {
                req.setStageAuthToken(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddCertificateRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateCertificateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCertificateDTO.class),
            f -> f.withMarshaller(AddCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckCertificateRequest, CheckCertificateResponse> checkCertificate =
        genForcheckCertificate();

    private static HttpRequestDef<CheckCertificateRequest, CheckCertificateResponse> genForcheckCertificate() {
        // basic
        HttpRequestDef.Builder<CheckCertificateRequest, CheckCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckCertificateRequest.class, CheckCertificateResponse.class)
                .withName("CheckCertificate")
                .withUri("/v5/iot/{project_id}/certificates/{certificate_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<String>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckCertificateRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            }));
        builder.<String>withRequestField("Sp-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckCertificateRequest::getSpAuthToken, (req, v) -> {
                req.setSpAuthToken(v);
            }));
        builder.<String>withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckCertificateRequest::getStageAuthToken, (req, v) -> {
                req.setStageAuthToken(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckCertificateRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<VerifyCertificateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VerifyCertificateDTO.class),
            f -> f.withMarshaller(CheckCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckCertificateResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificate =
        genFordeleteCertificate();

    private static HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> genFordeleteCertificate() {
        // basic
        HttpRequestDef.Builder<DeleteCertificateRequest, DeleteCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCertificateRequest.class, DeleteCertificateResponse.class)
                .withName("DeleteCertificate")
                .withUri("/v5/iot/{project_id}/certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<String>withRequestField("Sp-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getSpAuthToken, (req, v) -> {
                req.setSpAuthToken(v);
            }));
        builder.<String>withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getStageAuthToken, (req, v) -> {
                req.setStageAuthToken(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteCertificateResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> listCertificates =
        genForlistCertificates();

    private static HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> genForlistCertificates() {
        // basic
        HttpRequestDef.Builder<ListCertificatesRequest, ListCertificatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertificatesRequest.class, ListCertificatesResponse.class)
                .withName("ListCertificates")
                .withUri("/v5/iot/{project_id}/certificates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("Sp-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getSpAuthToken, (req, v) -> {
                req.setSpAuthToken(v);
            }));
        builder.<String>withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getStageAuthToken, (req, v) -> {
                req.setStageAuthToken(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCommandRequest, CreateCommandResponse> createCommand =
        genForcreateCommand();

    private static HttpRequestDef<CreateCommandRequest, CreateCommandResponse> genForcreateCommand() {
        // basic
        HttpRequestDef.Builder<CreateCommandRequest, CreateCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCommandRequest.class, CreateCommandResponse.class)
                .withName("CreateCommand")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/commands")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCommandRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCommandRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<DeviceCommandRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeviceCommandRequest.class),
            f -> f.withMarshaller(CreateCommandRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDeviceGroupRequest, AddDeviceGroupResponse> addDeviceGroup =
        genForaddDeviceGroup();

    private static HttpRequestDef<AddDeviceGroupRequest, AddDeviceGroupResponse> genForaddDeviceGroup() {
        // basic
        HttpRequestDef.Builder<AddDeviceGroupRequest, AddDeviceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddDeviceGroupRequest.class, AddDeviceGroupResponse.class)
                .withName("AddDeviceGroup")
                .withUri("/v5/iot/{project_id}/device-group")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDeviceGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AddDeviceGroupDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddDeviceGroupDTO.class),
            f -> f.withMarshaller(AddDeviceGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrDeleteDeviceInGroupRequest, CreateOrDeleteDeviceInGroupResponse> createOrDeleteDeviceInGroup =
        genForcreateOrDeleteDeviceInGroup();

    private static HttpRequestDef<CreateOrDeleteDeviceInGroupRequest, CreateOrDeleteDeviceInGroupResponse> genForcreateOrDeleteDeviceInGroup() {
        // basic
        HttpRequestDef.Builder<CreateOrDeleteDeviceInGroupRequest, CreateOrDeleteDeviceInGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateOrDeleteDeviceInGroupRequest.class,
                    CreateOrDeleteDeviceInGroupResponse.class)
                .withName("CreateOrDeleteDeviceInGroup")
                .withUri("/v5/iot/{project_id}/device-group/{group_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOrDeleteDeviceInGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOrDeleteDeviceInGroupRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            }));
        builder.<String>withRequestField("device_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOrDeleteDeviceInGroupRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOrDeleteDeviceInGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateOrDeleteDeviceInGroupResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> deleteDeviceGroup =
        genFordeleteDeviceGroup();

    private static HttpRequestDef<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> genFordeleteDeviceGroup() {
        // basic
        HttpRequestDef.Builder<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeviceGroupRequest.class, DeleteDeviceGroupResponse.class)
                .withName("DeleteDeviceGroup")
                .withUri("/v5/iot/{project_id}/device-group/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDeviceGroupResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListDeviceGroupsRequest, ListDeviceGroupsResponse> listDeviceGroups =
        genForlistDeviceGroups();

    private static HttpRequestDef<ListDeviceGroupsRequest, ListDeviceGroupsResponse> genForlistDeviceGroups() {
        // basic
        HttpRequestDef.Builder<ListDeviceGroupsRequest, ListDeviceGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDeviceGroupsRequest.class, ListDeviceGroupsResponse.class)
                .withName("ListDeviceGroups")
                .withUri("/v5/iot/{project_id}/device-group")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeviceGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceGroupsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeviceGroupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("last_modified_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceGroupsRequest::getLastModifiedTime, (req, v) -> {
                req.setLastModifiedTime(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceGroupsRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("group_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceGroupsRequest::getGroupType, (req, v) -> {
                req.setGroupType(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceGroupsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceGroupsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceGroupRequest, ShowDeviceGroupResponse> showDeviceGroup =
        genForshowDeviceGroup();

    private static HttpRequestDef<ShowDeviceGroupRequest, ShowDeviceGroupResponse> genForshowDeviceGroup() {
        // basic
        HttpRequestDef.Builder<ShowDeviceGroupRequest, ShowDeviceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceGroupRequest.class, ShowDeviceGroupResponse.class)
                .withName("ShowDeviceGroup")
                .withUri("/v5/iot/{project_id}/device-group/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> showDevicesInGroup =
        genForshowDevicesInGroup();

    private static HttpRequestDef<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> genForshowDevicesInGroup() {
        // basic
        HttpRequestDef.Builder<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDevicesInGroupRequest.class, ShowDevicesInGroupResponse.class)
                .withName("ShowDevicesInGroup")
                .withUri("/v5/iot/{project_id}/device-group/{group_id}/devices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> updateDeviceGroup =
        genForupdateDeviceGroup();

    private static HttpRequestDef<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> genForupdateDeviceGroup() {
        // basic
        HttpRequestDef.Builder<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDeviceGroupRequest.class, UpdateDeviceGroupResponse.class)
                .withName("UpdateDeviceGroup")
                .withUri("/v5/iot/{project_id}/device-group/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateDeviceGroupDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDeviceGroupDTO.class),
            f -> f.withMarshaller(UpdateDeviceGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDeviceRequest, AddDeviceResponse> addDevice = genForaddDevice();

    private static HttpRequestDef<AddDeviceRequest, AddDeviceResponse> genForaddDevice() {
        // basic
        HttpRequestDef.Builder<AddDeviceRequest, AddDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddDeviceRequest.class, AddDeviceResponse.class)
                .withName("AddDevice")
                .withUri("/v5/iot/{project_id}/devices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDeviceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AddDevice>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDevice.class),
            f -> f.withMarshaller(AddDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeviceRequest, DeleteDeviceResponse> deleteDevice = genFordeleteDevice();

    private static HttpRequestDef<DeleteDeviceRequest, DeleteDeviceResponse> genFordeleteDevice() {
        // basic
        HttpRequestDef.Builder<DeleteDeviceRequest, DeleteDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeviceRequest.class, DeleteDeviceResponse.class)
                .withName("DeleteDevice")
                .withUri("/v5/iot/{project_id}/devices/{device_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDeviceResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<FreezeDeviceRequest, FreezeDeviceResponse> freezeDevice = genForfreezeDevice();

    private static HttpRequestDef<FreezeDeviceRequest, FreezeDeviceResponse> genForfreezeDevice() {
        // basic
        HttpRequestDef.Builder<FreezeDeviceRequest, FreezeDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, FreezeDeviceRequest.class, FreezeDeviceResponse.class)
                .withName("FreezeDevice")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/freeze")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(FreezeDeviceRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(FreezeDeviceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(FreezeDeviceResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListDevicesRequest, ListDevicesResponse> listDevices = genForlistDevices();

    private static HttpRequestDef<ListDevicesRequest, ListDevicesResponse> genForlistDevices() {
        // basic
        HttpRequestDef.Builder<ListDevicesRequest, ListDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDevicesRequest.class, ListDevicesResponse.class)
                .withName("ListDevices")
                .withUri("/v5/iot/{project_id}/devices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            }));
        builder.<String>withRequestField("gateway_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getGatewayId, (req, v) -> {
                req.setGatewayId(v);
            }));
        builder.<Boolean>withRequestField("is_cascade_query",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDevicesRequest::getIsCascadeQuery, (req, v) -> {
                req.setIsCascadeQuery(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("device_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getDeviceName, (req, v) -> {
                req.setDeviceName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDevicesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDevicesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetDeviceSecretRequest, ResetDeviceSecretResponse> resetDeviceSecret =
        genForresetDeviceSecret();

    private static HttpRequestDef<ResetDeviceSecretRequest, ResetDeviceSecretResponse> genForresetDeviceSecret() {
        // basic
        HttpRequestDef.Builder<ResetDeviceSecretRequest, ResetDeviceSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetDeviceSecretRequest.class, ResetDeviceSecretResponse.class)
                .withName("ResetDeviceSecret")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetDeviceSecretRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetDeviceSecretRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetDeviceSecretRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ResetDeviceSecret>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetDeviceSecret.class),
            f -> f.withMarshaller(ResetDeviceSecretRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetFingerprintRequest, ResetFingerprintResponse> resetFingerprint =
        genForresetFingerprint();

    private static HttpRequestDef<ResetFingerprintRequest, ResetFingerprintResponse> genForresetFingerprint() {
        // basic
        HttpRequestDef.Builder<ResetFingerprintRequest, ResetFingerprintResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetFingerprintRequest.class, ResetFingerprintResponse.class)
                .withName("ResetFingerprint")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/reset-fingerprint")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetFingerprintRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetFingerprintRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ResetFingerprint>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetFingerprint.class),
            f -> f.withMarshaller(ResetFingerprintRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchDevicesRequest, SearchDevicesResponse> searchDevices =
        genForsearchDevices();

    private static HttpRequestDef<SearchDevicesRequest, SearchDevicesResponse> genForsearchDevices() {
        // basic
        HttpRequestDef.Builder<SearchDevicesRequest, SearchDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchDevicesRequest.class, SearchDevicesResponse.class)
                .withName("SearchDevices")
                .withUri("/v5/iot/{project_id}/search/query-devices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDevicesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<SearchSql>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchSql.class),
            f -> f.withMarshaller(SearchDevicesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceRequest, ShowDeviceResponse> showDevice = genForshowDevice();

    private static HttpRequestDef<ShowDeviceRequest, ShowDeviceResponse> genForshowDevice() {
        // basic
        HttpRequestDef.Builder<ShowDeviceRequest, ShowDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceRequest.class, ShowDeviceResponse.class)
                .withName("ShowDevice")
                .withUri("/v5/iot/{project_id}/devices/{device_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnfreezeDeviceRequest, UnfreezeDeviceResponse> unfreezeDevice =
        genForunfreezeDevice();

    private static HttpRequestDef<UnfreezeDeviceRequest, UnfreezeDeviceResponse> genForunfreezeDevice() {
        // basic
        HttpRequestDef.Builder<UnfreezeDeviceRequest, UnfreezeDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnfreezeDeviceRequest.class, UnfreezeDeviceResponse.class)
                .withName("UnfreezeDevice")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/unfreeze")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnfreezeDeviceRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnfreezeDeviceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UnfreezeDeviceResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> updateDevice = genForupdateDevice();

    private static HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> genForupdateDevice() {
        // basic
        HttpRequestDef.Builder<UpdateDeviceRequest, UpdateDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDeviceRequest.class, UpdateDeviceResponse.class)
                .withName("UpdateDevice")
                .withUri("/v5/iot/{project_id}/devices/{device_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateDevice>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDevice.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceShadowRequest, ShowDeviceShadowResponse> showDeviceShadow =
        genForshowDeviceShadow();

    private static HttpRequestDef<ShowDeviceShadowRequest, ShowDeviceShadowResponse> genForshowDeviceShadow() {
        // basic
        HttpRequestDef.Builder<ShowDeviceShadowRequest, ShowDeviceShadowResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceShadowRequest.class, ShowDeviceShadowResponse.class)
                .withName("ShowDeviceShadow")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/shadow")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceShadowRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceShadowRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceShadowDesiredDataRequest, UpdateDeviceShadowDesiredDataResponse> updateDeviceShadowDesiredData =
        genForupdateDeviceShadowDesiredData();

    private static HttpRequestDef<UpdateDeviceShadowDesiredDataRequest, UpdateDeviceShadowDesiredDataResponse> genForupdateDeviceShadowDesiredData() {
        // basic
        HttpRequestDef.Builder<UpdateDeviceShadowDesiredDataRequest, UpdateDeviceShadowDesiredDataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateDeviceShadowDesiredDataRequest.class,
                    UpdateDeviceShadowDesiredDataResponse.class)
                .withName("UpdateDeviceShadowDesiredData")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/shadow")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceShadowDesiredDataRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceShadowDesiredDataRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateDesireds>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDesireds.class),
            f -> f.withMarshaller(UpdateDeviceShadowDesiredDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMessageRequest, CreateMessageResponse> createMessage =
        genForcreateMessage();

    private static HttpRequestDef<CreateMessageRequest, CreateMessageResponse> genForcreateMessage() {
        // basic
        HttpRequestDef.Builder<CreateMessageRequest, CreateMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMessageRequest.class, CreateMessageResponse.class)
                .withName("CreateMessage")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/messages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMessageRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMessageRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<DeviceMessageRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeviceMessageRequest.class),
            f -> f.withMarshaller(CreateMessageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDeviceMessagesRequest, ListDeviceMessagesResponse> listDeviceMessages =
        genForlistDeviceMessages();

    private static HttpRequestDef<ListDeviceMessagesRequest, ListDeviceMessagesResponse> genForlistDeviceMessages() {
        // basic
        HttpRequestDef.Builder<ListDeviceMessagesRequest, ListDeviceMessagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDeviceMessagesRequest.class, ListDeviceMessagesResponse.class)
                .withName("ListDeviceMessages")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/messages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceMessagesRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceMessagesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceMessageRequest, ShowDeviceMessageResponse> showDeviceMessage =
        genForshowDeviceMessage();

    private static HttpRequestDef<ShowDeviceMessageRequest, ShowDeviceMessageResponse> genForshowDeviceMessage() {
        // basic
        HttpRequestDef.Builder<ShowDeviceMessageRequest, ShowDeviceMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceMessageRequest.class, ShowDeviceMessageResponse.class)
                .withName("ShowDeviceMessage")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/messages/{message_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceMessageRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("message_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceMessageRequest::getMessageId, (req, v) -> {
                req.setMessageId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceMessageRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOtaPackageRequest, CreateOtaPackageResponse> createOtaPackage =
        genForcreateOtaPackage();

    private static HttpRequestDef<CreateOtaPackageRequest, CreateOtaPackageResponse> genForcreateOtaPackage() {
        // basic
        HttpRequestDef.Builder<CreateOtaPackageRequest, CreateOtaPackageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateOtaPackageRequest.class, CreateOtaPackageResponse.class)
                .withName("CreateOtaPackage")
                .withUri("/v5/iot/{project_id}/ota-upgrades/packages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOtaPackageRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateOtaPackage>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOtaPackage.class),
            f -> f.withMarshaller(CreateOtaPackageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteOtaPackageRequest, DeleteOtaPackageResponse> deleteOtaPackage =
        genFordeleteOtaPackage();

    private static HttpRequestDef<DeleteOtaPackageRequest, DeleteOtaPackageResponse> genFordeleteOtaPackage() {
        // basic
        HttpRequestDef.Builder<DeleteOtaPackageRequest, DeleteOtaPackageResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteOtaPackageRequest.class, DeleteOtaPackageResponse.class)
                .withName("DeleteOtaPackage")
                .withUri("/v5/iot/{project_id}/ota-upgrades/packages/{package_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("package_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOtaPackageRequest::getPackageId, (req, v) -> {
                req.setPackageId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOtaPackageRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteOtaPackageResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListOtaPackageInfoRequest, ListOtaPackageInfoResponse> listOtaPackageInfo =
        genForlistOtaPackageInfo();

    private static HttpRequestDef<ListOtaPackageInfoRequest, ListOtaPackageInfoResponse> genForlistOtaPackageInfo() {
        // basic
        HttpRequestDef.Builder<ListOtaPackageInfoRequest, ListOtaPackageInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOtaPackageInfoRequest.class, ListOtaPackageInfoResponse.class)
                .withName("ListOtaPackageInfo")
                .withUri("/v5/iot/{project_id}/ota-upgrades/packages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOtaPackageInfoRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("package_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOtaPackageInfoRequest::getPackageType, (req, v) -> {
                req.setPackageType(v);
            }));
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOtaPackageInfoRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOtaPackageInfoRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOtaPackageInfoRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOtaPackageInfoRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOtaPackageInfoRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOtaPackageInfoRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOtaPackageRequest, ShowOtaPackageResponse> showOtaPackage =
        genForshowOtaPackage();

    private static HttpRequestDef<ShowOtaPackageRequest, ShowOtaPackageResponse> genForshowOtaPackage() {
        // basic
        HttpRequestDef.Builder<ShowOtaPackageRequest, ShowOtaPackageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOtaPackageRequest.class, ShowOtaPackageResponse.class)
                .withName("ShowOtaPackage")
                .withUri("/v5/iot/{project_id}/ota-upgrades/packages/{package_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("package_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOtaPackageRequest::getPackageId, (req, v) -> {
                req.setPackageId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOtaPackageRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProductRequest, CreateProductResponse> createProduct =
        genForcreateProduct();

    private static HttpRequestDef<CreateProductRequest, CreateProductResponse> genForcreateProduct() {
        // basic
        HttpRequestDef.Builder<CreateProductRequest, CreateProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProductRequest.class, CreateProductResponse.class)
                .withName("CreateProduct")
                .withUri("/v5/iot/{project_id}/products")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProductRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AddProduct>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddProduct.class),
            f -> f.withMarshaller(CreateProductRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProductRequest, DeleteProductResponse> deleteProduct =
        genFordeleteProduct();

    private static HttpRequestDef<DeleteProductRequest, DeleteProductResponse> genFordeleteProduct() {
        // basic
        HttpRequestDef.Builder<DeleteProductRequest, DeleteProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteProductRequest.class, DeleteProductResponse.class)
                .withName("DeleteProduct")
                .withUri("/v5/iot/{project_id}/products/{product_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProductRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProductRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProductRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteProductResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListProductsRequest, ListProductsResponse> listProducts = genForlistProducts();

    private static HttpRequestDef<ListProductsRequest, ListProductsResponse> genForlistProducts() {
        // basic
        HttpRequestDef.Builder<ListProductsRequest, ListProductsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProductsRequest.class, ListProductsResponse.class)
                .withName("ListProducts")
                .withUri("/v5/iot/{project_id}/products")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProductRequest, ShowProductResponse> showProduct = genForshowProduct();

    private static HttpRequestDef<ShowProductRequest, ShowProductResponse> genForshowProduct() {
        // basic
        HttpRequestDef.Builder<ShowProductRequest, ShowProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProductRequest.class, ShowProductResponse.class)
                .withName("ShowProduct")
                .withUri("/v5/iot/{project_id}/products/{product_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProductRequest, UpdateProductResponse> updateProduct =
        genForupdateProduct();

    private static HttpRequestDef<UpdateProductRequest, UpdateProductResponse> genForupdateProduct() {
        // basic
        HttpRequestDef.Builder<UpdateProductRequest, UpdateProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProductRequest.class, UpdateProductResponse.class)
                .withName("UpdateProduct")
                .withUri("/v5/iot/{project_id}/products/{product_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProductRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProductRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateProduct>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProduct.class),
            f -> f.withMarshaller(UpdateProductRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPropertiesRequest, ListPropertiesResponse> listProperties =
        genForlistProperties();

    private static HttpRequestDef<ListPropertiesRequest, ListPropertiesResponse> genForlistProperties() {
        // basic
        HttpRequestDef.Builder<ListPropertiesRequest, ListPropertiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPropertiesRequest.class, ListPropertiesResponse.class)
                .withName("ListProperties")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/properties")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPropertiesRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("service_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPropertiesRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPropertiesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePropertiesRequest, UpdatePropertiesResponse> updateProperties =
        genForupdateProperties();

    private static HttpRequestDef<UpdatePropertiesRequest, UpdatePropertiesResponse> genForupdateProperties() {
        // basic
        HttpRequestDef.Builder<UpdatePropertiesRequest, UpdatePropertiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePropertiesRequest.class, UpdatePropertiesResponse.class)
                .withName("UpdateProperties")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/properties")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePropertiesRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePropertiesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<DevicePropertiesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DevicePropertiesRequest.class),
            f -> f.withMarshaller(UpdatePropertiesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRoutingRuleRequest, CreateRoutingRuleResponse> createRoutingRule =
        genForcreateRoutingRule();

    private static HttpRequestDef<CreateRoutingRuleRequest, CreateRoutingRuleResponse> genForcreateRoutingRule() {
        // basic
        HttpRequestDef.Builder<CreateRoutingRuleRequest, CreateRoutingRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRoutingRuleRequest.class, CreateRoutingRuleResponse.class)
                .withName("CreateRoutingRule")
                .withUri("/v5/iot/{project_id}/routing-rule/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRoutingRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AddRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddRuleReq.class),
            f -> f.withMarshaller(CreateRoutingRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRuleActionRequest, CreateRuleActionResponse> createRuleAction =
        genForcreateRuleAction();

    private static HttpRequestDef<CreateRuleActionRequest, CreateRuleActionResponse> genForcreateRuleAction() {
        // basic
        HttpRequestDef.Builder<CreateRuleActionRequest, CreateRuleActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRuleActionRequest.class, CreateRuleActionResponse.class)
                .withName("CreateRuleAction")
                .withUri("/v5/iot/{project_id}/routing-rule/actions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRuleActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AddActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddActionReq.class),
            f -> f.withMarshaller(CreateRuleActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRoutingRuleRequest, DeleteRoutingRuleResponse> deleteRoutingRule =
        genFordeleteRoutingRule();

    private static HttpRequestDef<DeleteRoutingRuleRequest, DeleteRoutingRuleResponse> genFordeleteRoutingRule() {
        // basic
        HttpRequestDef.Builder<DeleteRoutingRuleRequest, DeleteRoutingRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRoutingRuleRequest.class, DeleteRoutingRuleResponse.class)
                .withName("DeleteRoutingRule")
                .withUri("/v5/iot/{project_id}/routing-rule/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRoutingRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRoutingRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRoutingRuleResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRuleActionRequest, DeleteRuleActionResponse> deleteRuleAction =
        genFordeleteRuleAction();

    private static HttpRequestDef<DeleteRuleActionRequest, DeleteRuleActionResponse> genFordeleteRuleAction() {
        // basic
        HttpRequestDef.Builder<DeleteRuleActionRequest, DeleteRuleActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRuleActionRequest.class, DeleteRuleActionResponse.class)
                .withName("DeleteRuleAction")
                .withUri("/v5/iot/{project_id}/routing-rule/actions/{action_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("action_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleActionRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRuleActionResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListRoutingRulesRequest, ListRoutingRulesResponse> listRoutingRules =
        genForlistRoutingRules();

    private static HttpRequestDef<ListRoutingRulesRequest, ListRoutingRulesResponse> genForlistRoutingRules() {
        // basic
        HttpRequestDef.Builder<ListRoutingRulesRequest, ListRoutingRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRoutingRulesRequest.class, ListRoutingRulesResponse.class)
                .withName("ListRoutingRules")
                .withUri("/v5/iot/{project_id}/routing-rule/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingRulesRequest::getResource, (req, v) -> {
                req.setResource(v);
            }));
        builder.<String>withRequestField("event",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingRulesRequest::getEvent, (req, v) -> {
                req.setEvent(v);
            }));
        builder.<String>withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingRulesRequest::getAppType, (req, v) -> {
                req.setAppType(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingRulesRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("rule_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingRulesRequest::getRuleName, (req, v) -> {
                req.setRuleName(v);
            }));
        builder.<Boolean>withRequestField("active",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRoutingRulesRequest::getActive, (req, v) -> {
                req.setActive(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRoutingRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingRulesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRoutingRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingRulesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRuleActionsRequest, ListRuleActionsResponse> listRuleActions =
        genForlistRuleActions();

    private static HttpRequestDef<ListRuleActionsRequest, ListRuleActionsResponse> genForlistRuleActions() {
        // basic
        HttpRequestDef.Builder<ListRuleActionsRequest, ListRuleActionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRuleActionsRequest.class, ListRuleActionsResponse.class)
                .withName("ListRuleActions")
                .withUri("/v5/iot/{project_id}/routing-rule/actions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleActionsRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("channel",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleActionsRequest::getChannel, (req, v) -> {
                req.setChannel(v);
            }));
        builder.<String>withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleActionsRequest::getAppType, (req, v) -> {
                req.setAppType(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleActionsRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleActionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleActionsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleActionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleActionsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRoutingRuleRequest, ShowRoutingRuleResponse> showRoutingRule =
        genForshowRoutingRule();

    private static HttpRequestDef<ShowRoutingRuleRequest, ShowRoutingRuleResponse> genForshowRoutingRule() {
        // basic
        HttpRequestDef.Builder<ShowRoutingRuleRequest, ShowRoutingRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRoutingRuleRequest.class, ShowRoutingRuleResponse.class)
                .withName("ShowRoutingRule")
                .withUri("/v5/iot/{project_id}/routing-rule/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRoutingRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRoutingRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRuleActionRequest, ShowRuleActionResponse> showRuleAction =
        genForshowRuleAction();

    private static HttpRequestDef<ShowRuleActionRequest, ShowRuleActionResponse> genForshowRuleAction() {
        // basic
        HttpRequestDef.Builder<ShowRuleActionRequest, ShowRuleActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRuleActionRequest.class, ShowRuleActionResponse.class)
                .withName("ShowRuleAction")
                .withUri("/v5/iot/{project_id}/routing-rule/actions/{action_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("action_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRuleActionRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRuleActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRoutingRuleRequest, UpdateRoutingRuleResponse> updateRoutingRule =
        genForupdateRoutingRule();

    private static HttpRequestDef<UpdateRoutingRuleRequest, UpdateRoutingRuleResponse> genForupdateRoutingRule() {
        // basic
        HttpRequestDef.Builder<UpdateRoutingRuleRequest, UpdateRoutingRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRoutingRuleRequest.class, UpdateRoutingRuleResponse.class)
                .withName("UpdateRoutingRule")
                .withUri("/v5/iot/{project_id}/routing-rule/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRoutingRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRoutingRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRuleReq.class),
            f -> f.withMarshaller(UpdateRoutingRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRuleActionRequest, UpdateRuleActionResponse> updateRuleAction =
        genForupdateRuleAction();

    private static HttpRequestDef<UpdateRuleActionRequest, UpdateRuleActionResponse> genForupdateRuleAction() {
        // basic
        HttpRequestDef.Builder<UpdateRuleActionRequest, UpdateRuleActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRuleActionRequest.class, UpdateRuleActionResponse.class)
                .withName("UpdateRuleAction")
                .withUri("/v5/iot/{project_id}/routing-rule/actions/{action_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("action_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRuleActionRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRuleActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateActionReq.class),
            f -> f.withMarshaller(UpdateRuleActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeRuleStatusRequest, ChangeRuleStatusResponse> changeRuleStatus =
        genForchangeRuleStatus();

    private static HttpRequestDef<ChangeRuleStatusRequest, ChangeRuleStatusResponse> genForchangeRuleStatus() {
        // basic
        HttpRequestDef.Builder<ChangeRuleStatusRequest, ChangeRuleStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeRuleStatusRequest.class, ChangeRuleStatusResponse.class)
                .withName("ChangeRuleStatus")
                .withUri("/v5/iot/{project_id}/rules/{rule_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeRuleStatusRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeRuleStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<RuleStatus>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RuleStatus.class),
            f -> f.withMarshaller(ChangeRuleStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRuleRequest, CreateRuleResponse> createRule = genForcreateRule();

    private static HttpRequestDef<CreateRuleRequest, CreateRuleResponse> genForcreateRule() {
        // basic
        HttpRequestDef.Builder<CreateRuleRequest, CreateRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRuleRequest.class, CreateRuleResponse.class)
                .withName("CreateRule")
                .withUri("/v5/iot/{project_id}/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Rule>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Rule.class),
            f -> f.withMarshaller(CreateRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withUri("/v5/iot/{project_id}/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRuleResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListRulesRequest, ListRulesResponse> listRules = genForlistRules();

    private static HttpRequestDef<ListRulesRequest, ListRulesResponse> genForlistRules() {
        // basic
        HttpRequestDef.Builder<ListRulesRequest, ListRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRulesRequest.class, ListRulesResponse.class)
                .withName("ListRules")
                .withUri("/v5/iot/{project_id}/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRulesRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("rule_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRulesRequest::getRuleType, (req, v) -> {
                req.setRuleType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRulesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRulesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRuleRequest, ShowRuleResponse> showRule = genForshowRule();

    private static HttpRequestDef<ShowRuleRequest, ShowRuleResponse> genForshowRule() {
        // basic
        HttpRequestDef.Builder<ShowRuleRequest, ShowRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRuleRequest.class, ShowRuleResponse.class)
                .withName("ShowRule")
                .withUri("/v5/iot/{project_id}/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRuleRequest, UpdateRuleResponse> updateRule = genForupdateRule();

    private static HttpRequestDef<UpdateRuleRequest, UpdateRuleResponse> genForupdateRule() {
        // basic
        HttpRequestDef.Builder<UpdateRuleRequest, UpdateRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRuleRequest.class, UpdateRuleResponse.class)
                .withName("UpdateRule")
                .withUri("/v5/iot/{project_id}/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Rule>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Rule.class),
            f -> f.withMarshaller(UpdateRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourcesByTagsRequest, ListResourcesByTagsResponse> listResourcesByTags =
        genForlistResourcesByTags();

    private static HttpRequestDef<ListResourcesByTagsRequest, ListResourcesByTagsResponse> genForlistResourcesByTags() {
        // basic
        HttpRequestDef.Builder<ListResourcesByTagsRequest, ListResourcesByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListResourcesByTagsRequest.class, ListResourcesByTagsResponse.class)
                .withName("ListResourcesByTags")
                .withUri("/v5/iot/{project_id}/tags/query-resources")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourcesByTagsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesByTagsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourcesByTagsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesByTagsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<QueryResourceByTagsDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(QueryResourceByTagsDTO.class),
            f -> f.withMarshaller(ListResourcesByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TagDeviceRequest, TagDeviceResponse> tagDevice = genFortagDevice();

    private static HttpRequestDef<TagDeviceRequest, TagDeviceResponse> genFortagDevice() {
        // basic
        HttpRequestDef.Builder<TagDeviceRequest, TagDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, TagDeviceRequest.class, TagDeviceResponse.class)
                .withName("TagDevice")
                .withUri("/v5/iot/{project_id}/tags/bind-resource")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(TagDeviceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<BindTagsDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BindTagsDTO.class),
            f -> f.withMarshaller(TagDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(TagDeviceResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UntagDeviceRequest, UntagDeviceResponse> untagDevice = genForuntagDevice();

    private static HttpRequestDef<UntagDeviceRequest, UntagDeviceResponse> genForuntagDevice() {
        // basic
        HttpRequestDef.Builder<UntagDeviceRequest, UntagDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UntagDeviceRequest.class, UntagDeviceResponse.class)
                .withName("UntagDevice")
                .withUri("/v5/iot/{project_id}/tags/unbind-resource")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UntagDeviceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UnbindTagsDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UnbindTagsDTO.class),
            f -> f.withMarshaller(UntagDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UntagDeviceResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

}
