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
import com.huaweicloud.sdk.cloudrtc.v2.model.ListRecordRulesRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ListRecordRulesResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.MixJobReq;
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

    public static final HttpRequestDef<CreateAppRequest, CreateAppResponse> createApp = genForcreateApp();

    private static HttpRequestDef<CreateAppRequest, CreateAppResponse> genForcreateApp() {
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
            f -> f.withMarshaller(CreateAppRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<AppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppReq.class),
            f -> f.withMarshaller(CreateAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAppResponse::getXRequestId, CreateAppResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateIndividualStreamJobRequest, CreateIndividualStreamJobResponse> createIndividualStreamJob =
        genForcreateIndividualStreamJob();

    private static HttpRequestDef<CreateIndividualStreamJobRequest, CreateIndividualStreamJobResponse> genForcreateIndividualStreamJob() {
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
            f -> f.withMarshaller(CreateIndividualStreamJobRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIndividualStreamJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIndividualStreamJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIndividualStreamJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<IndividualStreamJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IndividualStreamJobReq.class),
            f -> f.withMarshaller(CreateIndividualStreamJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateIndividualStreamJobResponse::getXRequestId,
                CreateIndividualStreamJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateMixJobRequest, CreateMixJobResponse> createMixJob = genForcreateMixJob();

    private static HttpRequestDef<CreateMixJobRequest, CreateMixJobResponse> genForcreateMixJob() {
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
            f -> f.withMarshaller(CreateMixJobRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMixJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMixJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMixJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<MixJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MixJobReq.class),
            f -> f.withMarshaller(CreateMixJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateMixJobResponse::getXRequestId, CreateMixJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordRuleRequest, CreateRecordRuleResponse> createRecordRule =
        genForcreateRecordRule();

    private static HttpRequestDef<CreateRecordRuleRequest, CreateRecordRuleResponse> genForcreateRecordRule() {
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
            f -> f.withMarshaller(CreateRecordRuleRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRecordRuleRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRecordRuleRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRecordRuleRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<RecordRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecordRuleReq.class),
            f -> f.withMarshaller(CreateRecordRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateRecordRuleResponse::getXRequestId, CreateRecordRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppRequest, DeleteAppResponse> deleteApp = genFordeleteApp();

    private static HttpRequestDef<DeleteAppRequest, DeleteAppResponse> genFordeleteApp() {
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
            f -> f.withMarshaller(DeleteAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAppResponse::getXRequestId, DeleteAppResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteRecordRuleRequest, DeleteRecordRuleResponse> deleteRecordRule =
        genFordeleteRecordRule();

    private static HttpRequestDef<DeleteRecordRuleRequest, DeleteRecordRuleResponse> genFordeleteRecordRule() {
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
            f -> f.withMarshaller(DeleteRecordRuleRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordRuleRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordRuleRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordRuleRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRecordRuleResponse::getXRequestId, DeleteRecordRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAppsRequest, ListAppsResponse> listApps = genForlistApps();

    private static HttpRequestDef<ListAppsRequest, ListAppsResponse> genForlistApps() {
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
            f -> f.withMarshaller(ListAppsRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppsResponse::getXRequestId, ListAppsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRecordRulesRequest, ListRecordRulesResponse> listRecordRules =
        genForlistRecordRules();

    private static HttpRequestDef<ListRecordRulesRequest, ListRecordRulesResponse> genForlistRecordRules() {
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
            f -> f.withMarshaller(ListRecordRulesRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRecordRulesResponse::getXRequestId, ListRecordRulesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<RemoveRoomRequest, RemoveRoomResponse> removeRoom = genForremoveRoom();

    private static HttpRequestDef<RemoveRoomRequest, RemoveRoomResponse> genForremoveRoom() {
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
            f -> f.withMarshaller(RemoveRoomRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("room_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveRoomRequest::getRoomId, (req, v) -> {
                req.setRoomId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveRoomRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveRoomRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveRoomRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RemoveRoomResponse::getXRequestId, RemoveRoomResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<RemoveUsersRequest, RemoveUsersResponse> removeUsers = genForremoveUsers();

    private static HttpRequestDef<RemoveUsersRequest, RemoveUsersResponse> genForremoveUsers() {
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
            f -> f.withMarshaller(RemoveUsersRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("room_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveUsersRequest::getRoomId, (req, v) -> {
                req.setRoomId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveUsersRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveUsersRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveUsersRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<RemoveUsersReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemoveUsersReq.class),
            f -> f.withMarshaller(RemoveUsersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RemoveUsersResponse::getXRequestId, RemoveUsersResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAppRequest, ShowAppResponse> showApp = genForshowApp();

    private static HttpRequestDef<ShowAppRequest, ShowAppResponse> genForshowApp() {
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
            f -> f.withMarshaller(ShowAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAppResponse::getXRequestId, ShowAppResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoRecordRequest, ShowAutoRecordResponse> showAutoRecord =
        genForshowAutoRecord();

    private static HttpRequestDef<ShowAutoRecordRequest, ShowAutoRecordResponse> genForshowAutoRecord() {
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
            f -> f.withMarshaller(ShowAutoRecordRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoRecordRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoRecordRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoRecordRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAutoRecordResponse::getXRequestId, ShowAutoRecordResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowIndividualStreamJobRequest, ShowIndividualStreamJobResponse> showIndividualStreamJob =
        genForshowIndividualStreamJob();

    private static HttpRequestDef<ShowIndividualStreamJobRequest, ShowIndividualStreamJobResponse> genForshowIndividualStreamJob() {
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
            f -> f.withMarshaller(ShowIndividualStreamJobRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIndividualStreamJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIndividualStreamJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIndividualStreamJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIndividualStreamJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowIndividualStreamJobResponse::getXRequestId,
                ShowIndividualStreamJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowMixJobRequest, ShowMixJobResponse> showMixJob = genForshowMixJob();

    private static HttpRequestDef<ShowMixJobRequest, ShowMixJobResponse> genForshowMixJob() {
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
            f -> f.withMarshaller(ShowMixJobRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMixJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMixJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMixJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMixJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMixJobResponse::getXRequestId, ShowMixJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordCallbackRequest, ShowRecordCallbackResponse> showRecordCallback =
        genForshowRecordCallback();

    private static HttpRequestDef<ShowRecordCallbackRequest, ShowRecordCallbackResponse> genForshowRecordCallback() {
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
            f -> f.withMarshaller(ShowRecordCallbackRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordCallbackRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordCallbackRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordCallbackRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

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
        genForshowRecordRule();

    private static HttpRequestDef<ShowRecordRuleRequest, ShowRecordRuleResponse> genForshowRecordRule() {
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
            f -> f.withMarshaller(ShowRecordRuleRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordRuleRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordRuleRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordRuleRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowRecordRuleResponse::getXRequestId, ShowRecordRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowUrlAuthRequest, ShowUrlAuthResponse> showUrlAuth = genForshowUrlAuth();

    private static HttpRequestDef<ShowUrlAuthRequest, ShowUrlAuthResponse> genForshowUrlAuth() {
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
            f -> f.withMarshaller(ShowUrlAuthRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUrlAuthRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUrlAuthRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUrlAuthRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowUrlAuthResponse::getXRequestId, ShowUrlAuthResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<StartAppRequest, StartAppResponse> startApp = genForstartApp();

    private static HttpRequestDef<StartAppRequest, StartAppResponse> genForstartApp() {
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
            f -> f.withMarshaller(StartAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAppRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAppRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAppRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StartAppResponse::getXRequestId, StartAppResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<StopAppRequest, StopAppResponse> stopApp = genForstopApp();

    private static HttpRequestDef<StopAppRequest, StopAppResponse> genForstopApp() {
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
            f -> f.withMarshaller(StopAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopAppRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopAppRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopAppRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopAppResponse::getXRequestId, StopAppResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<StopIndividualStreamJobRequest, StopIndividualStreamJobResponse> stopIndividualStreamJob =
        genForstopIndividualStreamJob();

    private static HttpRequestDef<StopIndividualStreamJobRequest, StopIndividualStreamJobResponse> genForstopIndividualStreamJob() {
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
            f -> f.withMarshaller(StopIndividualStreamJobRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopIndividualStreamJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopIndividualStreamJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopIndividualStreamJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopIndividualStreamJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopIndividualStreamJobResponse::getXRequestId,
                StopIndividualStreamJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<StopMixJobRequest, StopMixJobResponse> stopMixJob = genForstopMixJob();

    private static HttpRequestDef<StopMixJobRequest, StopMixJobResponse> genForstopMixJob() {
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
            f -> f.withMarshaller(StopMixJobRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopMixJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopMixJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopMixJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopMixJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopMixJobResponse::getXRequestId, StopMixJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateAutoRecordRequest, UpdateAutoRecordResponse> updateAutoRecord =
        genForupdateAutoRecord();

    private static HttpRequestDef<UpdateAutoRecordRequest, UpdateAutoRecordResponse> genForupdateAutoRecord() {
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
            f -> f.withMarshaller(UpdateAutoRecordRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoRecordRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoRecordRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoRecordRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<AutoRecordModeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AutoRecordModeReq.class),
            f -> f.withMarshaller(UpdateAutoRecordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateAutoRecordResponse::getXRequestId, UpdateAutoRecordResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateIndividualStreamJobRequest, UpdateIndividualStreamJobResponse> updateIndividualStreamJob =
        genForupdateIndividualStreamJob();

    private static HttpRequestDef<UpdateIndividualStreamJobRequest, UpdateIndividualStreamJobResponse> genForupdateIndividualStreamJob() {
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
            f -> f.withMarshaller(UpdateIndividualStreamJobRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIndividualStreamJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIndividualStreamJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIndividualStreamJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIndividualStreamJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<UpdateIndividualJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIndividualJobReq.class),
            f -> f.withMarshaller(UpdateIndividualStreamJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateIndividualStreamJobResponse::getXRequestId,
                UpdateIndividualStreamJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateMixJobRequest, UpdateMixJobResponse> updateMixJob = genForupdateMixJob();

    private static HttpRequestDef<UpdateMixJobRequest, UpdateMixJobResponse> genForupdateMixJob() {
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
            f -> f.withMarshaller(UpdateMixJobRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMixJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMixJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMixJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMixJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<UpdateMixJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMixJobReq.class),
            f -> f.withMarshaller(UpdateMixJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMixJobResponse::getXRequestId, UpdateMixJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecordCallbackRequest, UpdateRecordCallbackResponse> updateRecordCallback =
        genForupdateRecordCallback();

    private static HttpRequestDef<UpdateRecordCallbackRequest, UpdateRecordCallbackResponse> genForupdateRecordCallback() {
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
            f -> f.withMarshaller(UpdateRecordCallbackRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordCallbackRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordCallbackRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordCallbackRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<AppCallbackUrlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppCallbackUrlReq.class),
            f -> f.withMarshaller(UpdateRecordCallbackRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForupdateRecordRule();

    private static HttpRequestDef<UpdateRecordRuleRequest, UpdateRecordRuleResponse> genForupdateRecordRule() {
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
            f -> f.withMarshaller(UpdateRecordRuleRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordRuleRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordRuleRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordRuleRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<RecordRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecordRuleReq.class),
            f -> f.withMarshaller(UpdateRecordRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateRecordRuleResponse::getXRequestId, UpdateRecordRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateUrlAuthRequest, UpdateUrlAuthResponse> updateUrlAuth =
        genForupdateUrlAuth();

    private static HttpRequestDef<UpdateUrlAuthRequest, UpdateUrlAuthResponse> genForupdateUrlAuth() {
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
            f -> f.withMarshaller(UpdateUrlAuthRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUrlAuthRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUrlAuthRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUrlAuthRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<AppAuthReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppAuthReq.class),
            f -> f.withMarshaller(UpdateUrlAuthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateUrlAuthResponse::getXRequestId, UpdateUrlAuthResponse::setXRequestId));
        return builder.build();
    }

}
