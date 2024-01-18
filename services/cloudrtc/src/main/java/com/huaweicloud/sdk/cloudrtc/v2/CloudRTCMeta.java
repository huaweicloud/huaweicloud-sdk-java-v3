package com.huaweicloud.sdk.cloudrtc.v2;

import com.huaweicloud.sdk.cloudrtc.v2.model.AppAuthReq;
import com.huaweicloud.sdk.cloudrtc.v2.model.AppCallbackUrlReq;
import com.huaweicloud.sdk.cloudrtc.v2.model.AppReq;
import com.huaweicloud.sdk.cloudrtc.v2.model.AutoRecordModeReq;
import com.huaweicloud.sdk.cloudrtc.v2.model.CreateAppRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.CreateAppResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.CreateIndividualStreamJobRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.CreateIndividualStreamJobResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.CreateMixJobRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.CreateMixJobResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.CreateRecordRuleRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.CreateRecordRuleResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.DeleteAppRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.DeleteAppResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.DeleteRecordRuleRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.DeleteRecordRuleResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.IndividualStreamJobReq;
import com.huaweicloud.sdk.cloudrtc.v2.model.ListAppsRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ListAppsResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.ListObsBucketObjectsRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ListObsBucketObjectsResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.ListObsBucketsRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ListObsBucketsResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.ListRecordRulesRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ListRecordRulesResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.MixJobReq;
import com.huaweicloud.sdk.cloudrtc.v2.model.ObsAuthorityConfig;
import com.huaweicloud.sdk.cloudrtc.v2.model.RecordRuleReq;
import com.huaweicloud.sdk.cloudrtc.v2.model.RemoveRoomRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.RemoveRoomResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.RemoveUsersReq;
import com.huaweicloud.sdk.cloudrtc.v2.model.RemoveUsersRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.RemoveUsersResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowAppRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowAppResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowAutoRecordRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowAutoRecordResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowIndividualStreamJobRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowIndividualStreamJobResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowMixJobRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowMixJobResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowRecordCallbackRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowRecordCallbackResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowRecordRuleRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowRecordRuleResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowUrlAuthRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowUrlAuthResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.StartAppRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.StartAppResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.StopAppRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.StopAppResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.StopIndividualStreamJobRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.StopIndividualStreamJobResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.StopMixJobRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.StopMixJobResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateAutoRecordRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateAutoRecordResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateIndividualJobReq;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateIndividualStreamJobRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateIndividualStreamJobResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateMixJobReq;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateMixJobRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateMixJobResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateObsBucketAuthorityRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateObsBucketAuthorityResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateRecordCallbackRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateRecordCallbackResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateRecordRuleRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateRecordRuleResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateUrlAuthRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateUrlAuthResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CloudRTCMeta {

    public static final HttpRequestDef<CreateAppRequest, CreateAppResponse> createApp = genForCreateApp();

    private static HttpRequestDef<CreateAppRequest, CreateAppResponse> genForCreateApp() {
        // basic
        HttpRequestDef.Builder<CreateAppRequest, CreateAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppRequest.class, CreateAppResponse.class)
                .withName("CreateApp")
                .withUri("/v2/apps")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppRequest::getAuthorization, CreateAppRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppRequest::getXSdkDate, CreateAppRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppRequest::getXProjectId, CreateAppRequest::setXProjectId));
        builder.<AppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppReq.class),
            f -> f.withMarshaller(CreateAppRequest::getBody, CreateAppRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAppResponse::getXRequestId, CreateAppResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateIndividualStreamJobRequest, CreateIndividualStreamJobResponse> createIndividualStreamJob =
        genForCreateIndividualStreamJob();

    private static HttpRequestDef<CreateIndividualStreamJobRequest, CreateIndividualStreamJobResponse> genForCreateIndividualStreamJob() {
        // basic
        HttpRequestDef.Builder<CreateIndividualStreamJobRequest, CreateIndividualStreamJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateIndividualStreamJobRequest.class,
                    CreateIndividualStreamJobResponse.class)
                .withName("CreateIndividualStreamJob")
                .withUri("/v2/apps/{app_id}/individual-stream-jobs")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIndividualStreamJobRequest::getAppId,
                CreateIndividualStreamJobRequest::setAppId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIndividualStreamJobRequest::getAuthorization,
                CreateIndividualStreamJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIndividualStreamJobRequest::getXSdkDate,
                CreateIndividualStreamJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIndividualStreamJobRequest::getXProjectId,
                CreateIndividualStreamJobRequest::setXProjectId));
        builder.<IndividualStreamJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IndividualStreamJobReq.class),
            f -> f.withMarshaller(CreateIndividualStreamJobRequest::getBody,
                CreateIndividualStreamJobRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateIndividualStreamJobResponse::getXRequestId,
                CreateIndividualStreamJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateMixJobRequest, CreateMixJobResponse> createMixJob = genForCreateMixJob();

    private static HttpRequestDef<CreateMixJobRequest, CreateMixJobResponse> genForCreateMixJob() {
        // basic
        HttpRequestDef.Builder<CreateMixJobRequest, CreateMixJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMixJobRequest.class, CreateMixJobResponse.class)
                .withName("CreateMixJob")
                .withUri("/v2/apps/{app_id}/mix-stream-jobs")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMixJobRequest::getAppId, CreateMixJobRequest::setAppId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMixJobRequest::getAuthorization, CreateMixJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMixJobRequest::getXSdkDate, CreateMixJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMixJobRequest::getXProjectId, CreateMixJobRequest::setXProjectId));
        builder.<MixJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MixJobReq.class),
            f -> f.withMarshaller(CreateMixJobRequest::getBody, CreateMixJobRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateMixJobResponse::getXRequestId, CreateMixJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordRuleRequest, CreateRecordRuleResponse> createRecordRule =
        genForCreateRecordRule();

    private static HttpRequestDef<CreateRecordRuleRequest, CreateRecordRuleResponse> genForCreateRecordRule() {
        // basic
        HttpRequestDef.Builder<CreateRecordRuleRequest, CreateRecordRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRecordRuleRequest.class, CreateRecordRuleResponse.class)
                .withName("CreateRecordRule")
                .withUri("/v2/apps/{app_id}/record-rules")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRecordRuleRequest::getAppId, CreateRecordRuleRequest::setAppId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRecordRuleRequest::getAuthorization,
                CreateRecordRuleRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRecordRuleRequest::getXSdkDate, CreateRecordRuleRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRecordRuleRequest::getXProjectId, CreateRecordRuleRequest::setXProjectId));
        builder.<RecordRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecordRuleReq.class),
            f -> f.withMarshaller(CreateRecordRuleRequest::getBody, CreateRecordRuleRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateRecordRuleResponse::getXRequestId, CreateRecordRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppRequest, DeleteAppResponse> deleteApp = genForDeleteApp();

    private static HttpRequestDef<DeleteAppRequest, DeleteAppResponse> genForDeleteApp() {
        // basic
        HttpRequestDef.Builder<DeleteAppRequest, DeleteAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppRequest.class, DeleteAppResponse.class)
                .withName("DeleteApp")
                .withUri("/v2/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getAppId, DeleteAppRequest::setAppId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getAuthorization, DeleteAppRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getXSdkDate, DeleteAppRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getXProjectId, DeleteAppRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAppResponse::getXRequestId, DeleteAppResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteRecordRuleRequest, DeleteRecordRuleResponse> deleteRecordRule =
        genForDeleteRecordRule();

    private static HttpRequestDef<DeleteRecordRuleRequest, DeleteRecordRuleResponse> genForDeleteRecordRule() {
        // basic
        HttpRequestDef.Builder<DeleteRecordRuleRequest, DeleteRecordRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRecordRuleRequest.class, DeleteRecordRuleResponse.class)
                .withName("DeleteRecordRule")
                .withUri("/v2/apps/{app_id}/record-rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordRuleRequest::getAppId, DeleteRecordRuleRequest::setAppId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordRuleRequest::getRuleId, DeleteRecordRuleRequest::setRuleId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordRuleRequest::getAuthorization,
                DeleteRecordRuleRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordRuleRequest::getXSdkDate, DeleteRecordRuleRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordRuleRequest::getXProjectId, DeleteRecordRuleRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRecordRuleResponse::getXRequestId, DeleteRecordRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAppsRequest, ListAppsResponse> listApps = genForListApps();

    private static HttpRequestDef<ListAppsRequest, ListAppsResponse> genForListApps() {
        // basic
        HttpRequestDef.Builder<ListAppsRequest, ListAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppsRequest.class, ListAppsResponse.class)
                .withName("ListApps")
                .withUri("/v2/apps")
                .withContentType("application/json");

        // requests
        builder.<ListAppsRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAppsRequest.StateEnum.class),
            f -> f.withMarshaller(ListAppsRequest::getState, ListAppsRequest::setState));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsRequest::getOffset, ListAppsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsRequest::getLimit, ListAppsRequest::setLimit));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getAuthorization, ListAppsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getXSdkDate, ListAppsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getXProjectId, ListAppsRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppsResponse::getXRequestId, ListAppsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRecordRulesRequest, ListRecordRulesResponse> listRecordRules =
        genForListRecordRules();

    private static HttpRequestDef<ListRecordRulesRequest, ListRecordRulesResponse> genForListRecordRules() {
        // basic
        HttpRequestDef.Builder<ListRecordRulesRequest, ListRecordRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRecordRulesRequest.class, ListRecordRulesResponse.class)
                .withName("ListRecordRules")
                .withUri("/v2/apps/{app_id}/record-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getAppId, ListRecordRulesRequest::setAppId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getOffset, ListRecordRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getLimit, ListRecordRulesRequest::setLimit));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getAuthorization, ListRecordRulesRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getXSdkDate, ListRecordRulesRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getXProjectId, ListRecordRulesRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRecordRulesResponse::getXRequestId, ListRecordRulesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<RemoveRoomRequest, RemoveRoomResponse> removeRoom = genForRemoveRoom();

    private static HttpRequestDef<RemoveRoomRequest, RemoveRoomResponse> genForRemoveRoom() {
        // basic
        HttpRequestDef.Builder<RemoveRoomRequest, RemoveRoomResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RemoveRoomRequest.class, RemoveRoomResponse.class)
                .withName("RemoveRoom")
                .withUri("/v2/apps/{app_id}/rooms/{room_id}/dismiss")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveRoomRequest::getAppId, RemoveRoomRequest::setAppId));
        builder.<String>withRequestField("room_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveRoomRequest::getRoomId, RemoveRoomRequest::setRoomId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveRoomRequest::getAuthorization, RemoveRoomRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveRoomRequest::getXSdkDate, RemoveRoomRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveRoomRequest::getXProjectId, RemoveRoomRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RemoveRoomResponse::getXRequestId, RemoveRoomResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<RemoveUsersRequest, RemoveUsersResponse> removeUsers = genForRemoveUsers();

    private static HttpRequestDef<RemoveUsersRequest, RemoveUsersResponse> genForRemoveUsers() {
        // basic
        HttpRequestDef.Builder<RemoveUsersRequest, RemoveUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RemoveUsersRequest.class, RemoveUsersResponse.class)
                .withName("RemoveUsers")
                .withUri("/v2/apps/{app_id}/rooms/{room_id}/batch-remove-users")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveUsersRequest::getAppId, RemoveUsersRequest::setAppId));
        builder.<String>withRequestField("room_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveUsersRequest::getRoomId, RemoveUsersRequest::setRoomId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveUsersRequest::getAuthorization, RemoveUsersRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveUsersRequest::getXSdkDate, RemoveUsersRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveUsersRequest::getXProjectId, RemoveUsersRequest::setXProjectId));
        builder.<RemoveUsersReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemoveUsersReq.class),
            f -> f.withMarshaller(RemoveUsersRequest::getBody, RemoveUsersRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RemoveUsersResponse::getXRequestId, RemoveUsersResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAppRequest, ShowAppResponse> showApp = genForShowApp();

    private static HttpRequestDef<ShowAppRequest, ShowAppResponse> genForShowApp() {
        // basic
        HttpRequestDef.Builder<ShowAppRequest, ShowAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppRequest.class, ShowAppResponse.class)
                .withName("ShowApp")
                .withUri("/v2/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppRequest::getAppId, ShowAppRequest::setAppId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppRequest::getAuthorization, ShowAppRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppRequest::getXSdkDate, ShowAppRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppRequest::getXProjectId, ShowAppRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAppResponse::getXRequestId, ShowAppResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoRecordRequest, ShowAutoRecordResponse> showAutoRecord =
        genForShowAutoRecord();

    private static HttpRequestDef<ShowAutoRecordRequest, ShowAutoRecordResponse> genForShowAutoRecord() {
        // basic
        HttpRequestDef.Builder<ShowAutoRecordRequest, ShowAutoRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAutoRecordRequest.class, ShowAutoRecordResponse.class)
                .withName("ShowAutoRecord")
                .withUri("/v2/apps/{app_id}/auto-record-mode")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoRecordRequest::getAppId, ShowAutoRecordRequest::setAppId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoRecordRequest::getAuthorization, ShowAutoRecordRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoRecordRequest::getXSdkDate, ShowAutoRecordRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoRecordRequest::getXProjectId, ShowAutoRecordRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAutoRecordResponse::getXRequestId, ShowAutoRecordResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowIndividualStreamJobRequest, ShowIndividualStreamJobResponse> showIndividualStreamJob =
        genForShowIndividualStreamJob();

    private static HttpRequestDef<ShowIndividualStreamJobRequest, ShowIndividualStreamJobResponse> genForShowIndividualStreamJob() {
        // basic
        HttpRequestDef.Builder<ShowIndividualStreamJobRequest, ShowIndividualStreamJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowIndividualStreamJobRequest.class, ShowIndividualStreamJobResponse.class)
            .withName("ShowIndividualStreamJob")
            .withUri("/v2/apps/{app_id}/individual-stream-jobs/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIndividualStreamJobRequest::getAppId, ShowIndividualStreamJobRequest::setAppId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIndividualStreamJobRequest::getJobId, ShowIndividualStreamJobRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIndividualStreamJobRequest::getAuthorization,
                ShowIndividualStreamJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIndividualStreamJobRequest::getXSdkDate,
                ShowIndividualStreamJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIndividualStreamJobRequest::getXProjectId,
                ShowIndividualStreamJobRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowIndividualStreamJobResponse::getXRequestId,
                ShowIndividualStreamJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowMixJobRequest, ShowMixJobResponse> showMixJob = genForShowMixJob();

    private static HttpRequestDef<ShowMixJobRequest, ShowMixJobResponse> genForShowMixJob() {
        // basic
        HttpRequestDef.Builder<ShowMixJobRequest, ShowMixJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMixJobRequest.class, ShowMixJobResponse.class)
                .withName("ShowMixJob")
                .withUri("/v2/apps/{app_id}/mix-stream-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMixJobRequest::getAppId, ShowMixJobRequest::setAppId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMixJobRequest::getJobId, ShowMixJobRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMixJobRequest::getAuthorization, ShowMixJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMixJobRequest::getXSdkDate, ShowMixJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMixJobRequest::getXProjectId, ShowMixJobRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMixJobResponse::getXRequestId, ShowMixJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordCallbackRequest, ShowRecordCallbackResponse> showRecordCallback =
        genForShowRecordCallback();

    private static HttpRequestDef<ShowRecordCallbackRequest, ShowRecordCallbackResponse> genForShowRecordCallback() {
        // basic
        HttpRequestDef.Builder<ShowRecordCallbackRequest, ShowRecordCallbackResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecordCallbackRequest.class, ShowRecordCallbackResponse.class)
                .withName("ShowRecordCallback")
                .withUri("/v2/apps/{app_id}/record-callback")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordCallbackRequest::getAppId, ShowRecordCallbackRequest::setAppId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordCallbackRequest::getAuthorization,
                ShowRecordCallbackRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordCallbackRequest::getXSdkDate, ShowRecordCallbackRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordCallbackRequest::getXProjectId, ShowRecordCallbackRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowRecordCallbackResponse::getXRequestId,
                ShowRecordCallbackResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordRuleRequest, ShowRecordRuleResponse> showRecordRule =
        genForShowRecordRule();

    private static HttpRequestDef<ShowRecordRuleRequest, ShowRecordRuleResponse> genForShowRecordRule() {
        // basic
        HttpRequestDef.Builder<ShowRecordRuleRequest, ShowRecordRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecordRuleRequest.class, ShowRecordRuleResponse.class)
                .withName("ShowRecordRule")
                .withUri("/v2/apps/{app_id}/record-rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordRuleRequest::getAppId, ShowRecordRuleRequest::setAppId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordRuleRequest::getRuleId, ShowRecordRuleRequest::setRuleId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordRuleRequest::getAuthorization, ShowRecordRuleRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordRuleRequest::getXSdkDate, ShowRecordRuleRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordRuleRequest::getXProjectId, ShowRecordRuleRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowRecordRuleResponse::getXRequestId, ShowRecordRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowUrlAuthRequest, ShowUrlAuthResponse> showUrlAuth = genForShowUrlAuth();

    private static HttpRequestDef<ShowUrlAuthRequest, ShowUrlAuthResponse> genForShowUrlAuth() {
        // basic
        HttpRequestDef.Builder<ShowUrlAuthRequest, ShowUrlAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUrlAuthRequest.class, ShowUrlAuthResponse.class)
                .withName("ShowUrlAuth")
                .withUri("/v2/apps/{app_id}/authentication")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUrlAuthRequest::getAppId, ShowUrlAuthRequest::setAppId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUrlAuthRequest::getAuthorization, ShowUrlAuthRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUrlAuthRequest::getXSdkDate, ShowUrlAuthRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUrlAuthRequest::getXProjectId, ShowUrlAuthRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowUrlAuthResponse::getXRequestId, ShowUrlAuthResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<StartAppRequest, StartAppResponse> startApp = genForStartApp();

    private static HttpRequestDef<StartAppRequest, StartAppResponse> genForStartApp() {
        // basic
        HttpRequestDef.Builder<StartAppRequest, StartAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartAppRequest.class, StartAppResponse.class)
                .withName("StartApp")
                .withUri("/v2/apps/{app_id}/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAppRequest::getAppId, StartAppRequest::setAppId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAppRequest::getAuthorization, StartAppRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAppRequest::getXSdkDate, StartAppRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAppRequest::getXProjectId, StartAppRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StartAppResponse::getXRequestId, StartAppResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<StopAppRequest, StopAppResponse> stopApp = genForStopApp();

    private static HttpRequestDef<StopAppRequest, StopAppResponse> genForStopApp() {
        // basic
        HttpRequestDef.Builder<StopAppRequest, StopAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopAppRequest.class, StopAppResponse.class)
                .withName("StopApp")
                .withUri("/v2/apps/{app_id}/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopAppRequest::getAppId, StopAppRequest::setAppId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopAppRequest::getAuthorization, StopAppRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopAppRequest::getXSdkDate, StopAppRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopAppRequest::getXProjectId, StopAppRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopAppResponse::getXRequestId, StopAppResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<StopIndividualStreamJobRequest, StopIndividualStreamJobResponse> stopIndividualStreamJob =
        genForStopIndividualStreamJob();

    private static HttpRequestDef<StopIndividualStreamJobRequest, StopIndividualStreamJobResponse> genForStopIndividualStreamJob() {
        // basic
        HttpRequestDef.Builder<StopIndividualStreamJobRequest, StopIndividualStreamJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, StopIndividualStreamJobRequest.class, StopIndividualStreamJobResponse.class)
            .withName("StopIndividualStreamJob")
            .withUri("/v2/apps/{app_id}/individual-stream-jobs/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopIndividualStreamJobRequest::getAppId, StopIndividualStreamJobRequest::setAppId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopIndividualStreamJobRequest::getJobId, StopIndividualStreamJobRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopIndividualStreamJobRequest::getAuthorization,
                StopIndividualStreamJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopIndividualStreamJobRequest::getXSdkDate,
                StopIndividualStreamJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopIndividualStreamJobRequest::getXProjectId,
                StopIndividualStreamJobRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopIndividualStreamJobResponse::getXRequestId,
                StopIndividualStreamJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<StopMixJobRequest, StopMixJobResponse> stopMixJob = genForStopMixJob();

    private static HttpRequestDef<StopMixJobRequest, StopMixJobResponse> genForStopMixJob() {
        // basic
        HttpRequestDef.Builder<StopMixJobRequest, StopMixJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, StopMixJobRequest.class, StopMixJobResponse.class)
                .withName("StopMixJob")
                .withUri("/v2/apps/{app_id}/mix-stream-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopMixJobRequest::getAppId, StopMixJobRequest::setAppId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopMixJobRequest::getJobId, StopMixJobRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopMixJobRequest::getAuthorization, StopMixJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopMixJobRequest::getXSdkDate, StopMixJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopMixJobRequest::getXProjectId, StopMixJobRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopMixJobResponse::getXRequestId, StopMixJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateAutoRecordRequest, UpdateAutoRecordResponse> updateAutoRecord =
        genForUpdateAutoRecord();

    private static HttpRequestDef<UpdateAutoRecordRequest, UpdateAutoRecordResponse> genForUpdateAutoRecord() {
        // basic
        HttpRequestDef.Builder<UpdateAutoRecordRequest, UpdateAutoRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAutoRecordRequest.class, UpdateAutoRecordResponse.class)
                .withName("UpdateAutoRecord")
                .withUri("/v2/apps/{app_id}/auto-record-mode")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoRecordRequest::getAppId, UpdateAutoRecordRequest::setAppId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoRecordRequest::getAuthorization,
                UpdateAutoRecordRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoRecordRequest::getXSdkDate, UpdateAutoRecordRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoRecordRequest::getXProjectId, UpdateAutoRecordRequest::setXProjectId));
        builder.<AutoRecordModeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AutoRecordModeReq.class),
            f -> f.withMarshaller(UpdateAutoRecordRequest::getBody, UpdateAutoRecordRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateAutoRecordResponse::getXRequestId, UpdateAutoRecordResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateIndividualStreamJobRequest, UpdateIndividualStreamJobResponse> updateIndividualStreamJob =
        genForUpdateIndividualStreamJob();

    private static HttpRequestDef<UpdateIndividualStreamJobRequest, UpdateIndividualStreamJobResponse> genForUpdateIndividualStreamJob() {
        // basic
        HttpRequestDef.Builder<UpdateIndividualStreamJobRequest, UpdateIndividualStreamJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateIndividualStreamJobRequest.class,
                    UpdateIndividualStreamJobResponse.class)
                .withName("UpdateIndividualStreamJob")
                .withUri("/v2/apps/{app_id}/individual-stream-jobs/{job_id}")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIndividualStreamJobRequest::getAppId,
                UpdateIndividualStreamJobRequest::setAppId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIndividualStreamJobRequest::getJobId,
                UpdateIndividualStreamJobRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIndividualStreamJobRequest::getAuthorization,
                UpdateIndividualStreamJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIndividualStreamJobRequest::getXSdkDate,
                UpdateIndividualStreamJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIndividualStreamJobRequest::getXProjectId,
                UpdateIndividualStreamJobRequest::setXProjectId));
        builder.<UpdateIndividualJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIndividualJobReq.class),
            f -> f.withMarshaller(UpdateIndividualStreamJobRequest::getBody,
                UpdateIndividualStreamJobRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateIndividualStreamJobResponse::getXRequestId,
                UpdateIndividualStreamJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateMixJobRequest, UpdateMixJobResponse> updateMixJob = genForUpdateMixJob();

    private static HttpRequestDef<UpdateMixJobRequest, UpdateMixJobResponse> genForUpdateMixJob() {
        // basic
        HttpRequestDef.Builder<UpdateMixJobRequest, UpdateMixJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMixJobRequest.class, UpdateMixJobResponse.class)
                .withName("UpdateMixJob")
                .withUri("/v2/apps/{app_id}/mix-stream-jobs/{job_id}")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMixJobRequest::getAppId, UpdateMixJobRequest::setAppId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMixJobRequest::getJobId, UpdateMixJobRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMixJobRequest::getAuthorization, UpdateMixJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMixJobRequest::getXSdkDate, UpdateMixJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMixJobRequest::getXProjectId, UpdateMixJobRequest::setXProjectId));
        builder.<UpdateMixJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMixJobReq.class),
            f -> f.withMarshaller(UpdateMixJobRequest::getBody, UpdateMixJobRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMixJobResponse::getXRequestId, UpdateMixJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecordCallbackRequest, UpdateRecordCallbackResponse> updateRecordCallback =
        genForUpdateRecordCallback();

    private static HttpRequestDef<UpdateRecordCallbackRequest, UpdateRecordCallbackResponse> genForUpdateRecordCallback() {
        // basic
        HttpRequestDef.Builder<UpdateRecordCallbackRequest, UpdateRecordCallbackResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateRecordCallbackRequest.class, UpdateRecordCallbackResponse.class)
            .withName("UpdateRecordCallback")
            .withUri("/v2/apps/{app_id}/record-callback")
            .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordCallbackRequest::getAppId, UpdateRecordCallbackRequest::setAppId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordCallbackRequest::getAuthorization,
                UpdateRecordCallbackRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordCallbackRequest::getXSdkDate, UpdateRecordCallbackRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordCallbackRequest::getXProjectId,
                UpdateRecordCallbackRequest::setXProjectId));
        builder.<AppCallbackUrlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppCallbackUrlReq.class),
            f -> f.withMarshaller(UpdateRecordCallbackRequest::getBody, UpdateRecordCallbackRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateRecordCallbackResponse::getXRequestId,
                UpdateRecordCallbackResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecordRuleRequest, UpdateRecordRuleResponse> updateRecordRule =
        genForUpdateRecordRule();

    private static HttpRequestDef<UpdateRecordRuleRequest, UpdateRecordRuleResponse> genForUpdateRecordRule() {
        // basic
        HttpRequestDef.Builder<UpdateRecordRuleRequest, UpdateRecordRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRecordRuleRequest.class, UpdateRecordRuleResponse.class)
                .withName("UpdateRecordRule")
                .withUri("/v2/apps/{app_id}/record-rules/{rule_id}")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordRuleRequest::getAppId, UpdateRecordRuleRequest::setAppId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordRuleRequest::getRuleId, UpdateRecordRuleRequest::setRuleId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordRuleRequest::getAuthorization,
                UpdateRecordRuleRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordRuleRequest::getXSdkDate, UpdateRecordRuleRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordRuleRequest::getXProjectId, UpdateRecordRuleRequest::setXProjectId));
        builder.<RecordRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecordRuleReq.class),
            f -> f.withMarshaller(UpdateRecordRuleRequest::getBody, UpdateRecordRuleRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateRecordRuleResponse::getXRequestId, UpdateRecordRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateUrlAuthRequest, UpdateUrlAuthResponse> updateUrlAuth =
        genForUpdateUrlAuth();

    private static HttpRequestDef<UpdateUrlAuthRequest, UpdateUrlAuthResponse> genForUpdateUrlAuth() {
        // basic
        HttpRequestDef.Builder<UpdateUrlAuthRequest, UpdateUrlAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUrlAuthRequest.class, UpdateUrlAuthResponse.class)
                .withName("UpdateUrlAuth")
                .withUri("/v2/apps/{app_id}/authentication")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUrlAuthRequest::getAppId, UpdateUrlAuthRequest::setAppId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUrlAuthRequest::getAuthorization, UpdateUrlAuthRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUrlAuthRequest::getXSdkDate, UpdateUrlAuthRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUrlAuthRequest::getXProjectId, UpdateUrlAuthRequest::setXProjectId));
        builder.<AppAuthReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppAuthReq.class),
            f -> f.withMarshaller(UpdateUrlAuthRequest::getBody, UpdateUrlAuthRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateUrlAuthResponse::getXRequestId, UpdateUrlAuthResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListObsBucketObjectsRequest, ListObsBucketObjectsResponse> listObsBucketObjects =
        genForListObsBucketObjects();

    private static HttpRequestDef<ListObsBucketObjectsRequest, ListObsBucketObjectsResponse> genForListObsBucketObjects() {
        // basic
        HttpRequestDef.Builder<ListObsBucketObjectsRequest, ListObsBucketObjectsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListObsBucketObjectsRequest.class, ListObsBucketObjectsResponse.class)
            .withName("ListObsBucketObjects")
            .withUri("/v2/rtc-ops/buckets/objects")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bucket",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObsBucketObjectsRequest::getBucket, ListObsBucketObjectsRequest::setBucket));
        builder.<String>withRequestField("prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObsBucketObjectsRequest::getPrefix, ListObsBucketObjectsRequest::setPrefix));
        builder.<ListObsBucketObjectsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListObsBucketObjectsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListObsBucketObjectsRequest::getType, ListObsBucketObjectsRequest::setType));
        builder.<ListObsBucketObjectsRequest.LocationEnum>withRequestField("location",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListObsBucketObjectsRequest.LocationEnum.class),
            f -> f.withMarshaller(ListObsBucketObjectsRequest::getLocation, ListObsBucketObjectsRequest::setLocation));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListObsBucketObjectsResponse::getXRequestId,
                ListObsBucketObjectsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListObsBucketsRequest, ListObsBucketsResponse> listObsBuckets =
        genForListObsBuckets();

    private static HttpRequestDef<ListObsBucketsRequest, ListObsBucketsResponse> genForListObsBuckets() {
        // basic
        HttpRequestDef.Builder<ListObsBucketsRequest, ListObsBucketsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListObsBucketsRequest.class, ListObsBucketsResponse.class)
                .withName("ListObsBuckets")
                .withUri("/v2/rtc-ops/buckets")
                .withContentType("application/json");

        // requests

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListObsBucketsResponse::getXRequestId, ListObsBucketsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateObsBucketAuthorityRequest, UpdateObsBucketAuthorityResponse> updateObsBucketAuthority =
        genForUpdateObsBucketAuthority();

    private static HttpRequestDef<UpdateObsBucketAuthorityRequest, UpdateObsBucketAuthorityResponse> genForUpdateObsBucketAuthority() {
        // basic
        HttpRequestDef.Builder<UpdateObsBucketAuthorityRequest, UpdateObsBucketAuthorityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateObsBucketAuthorityRequest.class, UpdateObsBucketAuthorityResponse.class)
                .withName("UpdateObsBucketAuthority")
                .withUri("/v2/rtc-ops/buckets/authentication")
                .withContentType("application/json");

        // requests
        builder.<ObsAuthorityConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ObsAuthorityConfig.class),
            f -> f.withMarshaller(UpdateObsBucketAuthorityRequest::getBody, UpdateObsBucketAuthorityRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateObsBucketAuthorityResponse::getXRequestId,
                UpdateObsBucketAuthorityResponse::setXRequestId));
        return builder.build();
    }

}
