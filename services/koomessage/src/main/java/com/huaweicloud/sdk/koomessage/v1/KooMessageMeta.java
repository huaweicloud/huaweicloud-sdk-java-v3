package com.huaweicloud.sdk.koomessage.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.koomessage.v1.model.*;

import java.time.OffsetDateTime;
import java.util.List;

@SuppressWarnings("unchecked")
public class KooMessageMeta {

    public static final HttpRequestDef<AddCallBackRequest, AddCallBackResponse> addCallBack = genForaddCallBack();

    private static HttpRequestDef<AddCallBackRequest, AddCallBackResponse> genForaddCallBack() {
        // basic
        HttpRequestDef.Builder<AddCallBackRequest, AddCallBackResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddCallBackRequest.class, AddCallBackResponse.class)
                .withName("AddCallBack")
                .withUri("/v1/aim/callbacks")
                .withContentType("application/json");

        // requests
        builder.<AddCallbackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddCallbackRequestBody.class),
            f -> f.withMarshaller(AddCallBackRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimCallbacksRequest, ListAimCallbacksResponse> listAimCallbacks =
        genForlistAimCallbacks();

    private static HttpRequestDef<ListAimCallbacksRequest, ListAimCallbacksResponse> genForlistAimCallbacks() {
        // basic
        HttpRequestDef.Builder<ListAimCallbacksRequest, ListAimCallbacksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAimCallbacksRequest.class, ListAimCallbacksResponse.class)
                .withName("ListAimCallbacks")
                .withUri("/v1/aim/callbacks")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckMobileCapabilityRequest, CheckMobileCapabilityResponse> checkMobileCapability =
        genForcheckMobileCapability();

    private static HttpRequestDef<CheckMobileCapabilityRequest, CheckMobileCapabilityResponse> genForcheckMobileCapability() {
        // basic
        HttpRequestDef.Builder<CheckMobileCapabilityRequest, CheckMobileCapabilityResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CheckMobileCapabilityRequest.class, CheckMobileCapabilityResponse.class)
            .withName("CheckMobileCapability")
            .withUri("/v1/aim/mobile-capabilities/check")
            .withContentType("application/json");

        // requests
        builder.<CheckMobileCapabilityRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckMobileCapabilityRequestBody.class),
            f -> f.withMarshaller(CheckMobileCapabilityRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResolveTaskRequest, CreateResolveTaskResponse> createResolveTask =
        genForcreateResolveTask();

    private static HttpRequestDef<CreateResolveTaskRequest, CreateResolveTaskResponse> genForcreateResolveTask() {
        // basic
        HttpRequestDef.Builder<CreateResolveTaskRequest, CreateResolveTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResolveTaskRequest.class, CreateResolveTaskResponse.class)
                .withName("CreateResolveTask")
                .withUri("/v1/aim/resolve-tasks")
                .withContentType("application/json");

        // requests
        builder.<CreateResolveTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResolveTaskRequestBody.class),
            f -> f.withMarshaller(CreateResolveTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimResolveDetailsRequest, ListAimResolveDetailsResponse> listAimResolveDetails =
        genForlistAimResolveDetails();

    private static HttpRequestDef<ListAimResolveDetailsRequest, ListAimResolveDetailsResponse> genForlistAimResolveDetails() {
        // basic
        HttpRequestDef.Builder<ListAimResolveDetailsRequest, ListAimResolveDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAimResolveDetailsRequest.class, ListAimResolveDetailsResponse.class)
            .withName("ListAimResolveDetails")
            .withUri("/v1/aim/resolve-details")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("tpl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getTplId, (req, v) -> {
                req.setTplId(v);
            }));
        builder.<String>withRequestField("tpl_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getTplName, (req, v) -> {
                req.setTplName(v);
            }));
        builder.<String>withRequestField("cust_flag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getCustFlag, (req, v) -> {
                req.setCustFlag(v);
            }));
        builder.<String>withRequestField("sms_sign",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getSmsSign, (req, v) -> {
                req.setSmsSign(v);
            }));
        builder.<String>withRequestField("aim_url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getAimUrl, (req, v) -> {
                req.setAimUrl(v);
            }));
        builder.<String>withRequestField("resolved_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getResolvedStatus, (req, v) -> {
                req.setResolvedStatus(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResolveTasksRequest, ListResolveTasksResponse> listResolveTasks =
        genForlistResolveTasks();

    private static HttpRequestDef<ListResolveTasksRequest, ListResolveTasksResponse> genForlistResolveTasks() {
        // basic
        HttpRequestDef.Builder<ListResolveTasksRequest, ListResolveTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResolveTasksRequest.class, ListResolveTasksResponse.class)
                .withName("ListResolveTasks")
                .withUri("/v1/aim/resolve-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("tpl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getTplId, (req, v) -> {
                req.setTplId(v);
            }));
        builder.<String>withRequestField("tpl_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getTplName, (req, v) -> {
                req.setTplName(v);
            }));
        builder.<String>withRequestField("cust_flag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getCustFlag, (req, v) -> {
                req.setCustFlag(v);
            }));
        builder.<String>withRequestField("aim_url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getAimUrl, (req, v) -> {
                req.setAimUrl(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMenusRequest, ListMenusResponse> listMenus = genForlistMenus();

    private static HttpRequestDef<ListMenusRequest, ListMenusResponse> genForlistMenus() {
        // basic
        HttpRequestDef.Builder<ListMenusRequest, ListMenusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMenusRequest.class, ListMenusResponse.class)
                .withName("ListMenus")
                .withUri("/v1/aim-sa/menus")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("menu_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMenusRequest::getMenuId, (req, v) -> {
                req.setMenuId(v);
            }));
        builder.<String>withRequestField("pub_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMenusRequest::getPubId, (req, v) -> {
                req.setPubId(v);
            }));
        builder.<String>withRequestField("pub_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMenusRequest::getPubName, (req, v) -> {
                req.setPubName(v);
            }));
        builder.<String>withRequestField("online_begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMenusRequest::getOnlineBeginTime, (req, v) -> {
                req.setOnlineBeginTime(v);
            }));
        builder.<String>withRequestField("online_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMenusRequest::getOnlineEndTime, (req, v) -> {
                req.setOnlineEndTime(v);
            }));
        builder.<Integer>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMenusRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<String>withRequestField("menu_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMenusRequest::getMenuName, (req, v) -> {
                req.setMenuName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMenusRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMenusRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMenuRequest, UpdateMenuResponse> updateMenu = genForupdateMenu();

    private static HttpRequestDef<UpdateMenuRequest, UpdateMenuResponse> genForupdateMenu() {
        // basic
        HttpRequestDef.Builder<UpdateMenuRequest, UpdateMenuResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMenuRequest.class, UpdateMenuResponse.class)
                .withName("UpdateMenu")
                .withUri("/v1/aim-sa/menus/{menu_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("menu_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMenuRequest::getMenuId, (req, v) -> {
                req.setMenuId(v);
            }));
        builder.<UpdateMenuRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMenuRequestBody.class),
            f -> f.withMarshaller(UpdateMenuRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePortInfoRequest, DeletePortInfoResponse> deletePortInfo =
        genFordeletePortInfo();

    private static HttpRequestDef<DeletePortInfoRequest, DeletePortInfoResponse> genFordeletePortInfo() {
        // basic
        HttpRequestDef.Builder<DeletePortInfoRequest, DeletePortInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePortInfoRequest.class, DeletePortInfoResponse.class)
                .withName("DeletePortInfo")
                .withUri("/v1/aim-sa/ports/{port_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePortInfoRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortInfosRequest, ListPortInfosResponse> listPortInfos =
        genForlistPortInfos();

    private static HttpRequestDef<ListPortInfosRequest, ListPortInfosResponse> genForlistPortInfos() {
        // basic
        HttpRequestDef.Builder<ListPortInfosRequest, ListPortInfosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPortInfosRequest.class, ListPortInfosResponse.class)
                .withName("ListPortInfos")
                .withUri("/v1/aim-sa/ports")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortInfosRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortInfosRequest::getPort, (req, v) -> {
                req.setPort(v);
            }));
        builder.<Integer>withRequestField("port_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortInfosRequest::getPortType, (req, v) -> {
                req.setPortType(v);
            }));
        builder.<String>withRequestField("sign_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortInfosRequest::getSignSearch, (req, v) -> {
                req.setSignSearch(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortInfosRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortInfosRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<OffsetDateTime>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPortInfosRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<OffsetDateTime>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPortInfosRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("pub_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortInfosRequest::getPubName, (req, v) -> {
                req.setPubName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LockPortRequest, LockPortResponse> lockPort = genForlockPort();

    private static HttpRequestDef<LockPortRequest, LockPortResponse> genForlockPort() {
        // basic
        HttpRequestDef.Builder<LockPortRequest, LockPortResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, LockPortRequest.class, LockPortResponse.class)
                .withName("LockPort")
                .withUri("/v1/aim-sa/ports/associate")
                .withContentType("application/json");

        // requests
        builder.<LockPortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(LockPortRequestBody.class),
            f -> f.withMarshaller(LockPortRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterPortRequest, RegisterPortResponse> registerPort = genForregisterPort();

    private static HttpRequestDef<RegisterPortRequest, RegisterPortResponse> genForregisterPort() {
        // basic
        HttpRequestDef.Builder<RegisterPortRequest, RegisterPortResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RegisterPortRequest.class, RegisterPortResponse.class)
                .withName("RegisterPort")
                .withUri("/v1/aim-sa/ports")
                .withContentType("application/json");

        // requests
        builder.<RegisterPortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RegisterPortRequestBody.class),
            f -> f.withMarshaller(RegisterPortRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnlockPortRequest, UnlockPortResponse> unlockPort = genForunlockPort();

    private static HttpRequestDef<UnlockPortRequest, UnlockPortResponse> genForunlockPort() {
        // basic
        HttpRequestDef.Builder<UnlockPortRequest, UnlockPortResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnlockPortRequest.class, UnlockPortResponse.class)
                .withName("UnlockPort")
                .withUri("/v1/aim-sa/ports/disassociate")
                .withContentType("application/json");

        // requests
        builder.<UnlockPortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnlockPortRequestBody.class),
            f -> f.withMarshaller(UnlockPortRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortalInfosRequest, ListPortalInfosResponse> listPortalInfos =
        genForlistPortalInfos();

    private static HttpRequestDef<ListPortalInfosRequest, ListPortalInfosResponse> genForlistPortalInfos() {
        // basic
        HttpRequestDef.Builder<ListPortalInfosRequest, ListPortalInfosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPortalInfosRequest.class, ListPortalInfosResponse.class)
                .withName("ListPortalInfos")
                .withUri("/v1/aim-sa/portals")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pub_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortalInfosRequest::getPubName, (req, v) -> {
                req.setPubName(v);
            }));
        builder.<OffsetDateTime>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPortalInfosRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<OffsetDateTime>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPortalInfosRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortalInfosRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortalInfosRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortalInfosRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePortalInfoRequest, UpdatePortalInfoResponse> updatePortalInfo =
        genForupdatePortalInfo();

    private static HttpRequestDef<UpdatePortalInfoRequest, UpdatePortalInfoResponse> genForupdatePortalInfo() {
        // basic
        HttpRequestDef.Builder<UpdatePortalInfoRequest, UpdatePortalInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePortalInfoRequest.class, UpdatePortalInfoResponse.class)
                .withName("UpdatePortalInfo")
                .withUri("/v1/aim-sa/portals/{portal_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("portal_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePortalInfoRequest::getPortalId, (req, v) -> {
                req.setPortalId(v);
            }));
        builder.<UpdatePortalInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePortalInfoRequestBody.class),
            f -> f.withMarshaller(UpdatePortalInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<FreezePubRequest, FreezePubResponse> freezePub = genForfreezePub();

    private static HttpRequestDef<FreezePubRequest, FreezePubResponse> genForfreezePub() {
        // basic
        HttpRequestDef.Builder<FreezePubRequest, FreezePubResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, FreezePubRequest.class, FreezePubResponse.class)
                .withName("FreezePub")
                .withUri("/v1/aim-sa/pubs/{pub_id}/freeze")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pub_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(FreezePubRequest::getPubId, (req, v) -> {
                req.setPubId(v);
            }));
        builder.<FreezePubRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(FreezePubRequestBody.class),
            f -> f.withMarshaller(FreezePubRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPubInfosRequest, ListPubInfosResponse> listPubInfos = genForlistPubInfos();

    private static HttpRequestDef<ListPubInfosRequest, ListPubInfosResponse> genForlistPubInfos() {
        // basic
        HttpRequestDef.Builder<ListPubInfosRequest, ListPubInfosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPubInfosRequest.class, ListPubInfosResponse.class)
                .withName("ListPubInfos")
                .withUri("/v1/aim-sa/pubs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pub_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPubInfosRequest::getPubName, (req, v) -> {
                req.setPubName(v);
            }));
        builder.<Integer>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPubInfosRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<OffsetDateTime>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPubInfosRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPubInfosRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPubInfosRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<OffsetDateTime>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPubInfosRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("industry",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPubInfosRequest::getIndustry, (req, v) -> {
                req.setIndustry(v);
            }));
        builder.<Integer>withRequestField("approve_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPubInfosRequest::getApproveState, (req, v) -> {
                req.setApproveState(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnfreezePubRequest, UnfreezePubResponse> unfreezePub = genForunfreezePub();

    private static HttpRequestDef<UnfreezePubRequest, UnfreezePubResponse> genForunfreezePub() {
        // basic
        HttpRequestDef.Builder<UnfreezePubRequest, UnfreezePubResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnfreezePubRequest.class, UnfreezePubResponse.class)
                .withName("UnfreezePub")
                .withUri("/v1/aim-sa/pubs/{pub_id}/unfreeze")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pub_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnfreezePubRequest::getPubId, (req, v) -> {
                req.setPubId(v);
            }));
        builder.<UnfreezePubRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UnfreezePubRequestBody.class),
            f -> f.withMarshaller(UnfreezePubRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePubInfoRequest, UpdatePubInfoResponse> updatePubInfo =
        genForupdatePubInfo();

    private static HttpRequestDef<UpdatePubInfoRequest, UpdatePubInfoResponse> genForupdatePubInfo() {
        // basic
        HttpRequestDef.Builder<UpdatePubInfoRequest, UpdatePubInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdatePubInfoRequest.class, UpdatePubInfoResponse.class)
                .withName("UpdatePubInfo")
                .withUri("/v1/aim-sa/pubs/{pub_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pub_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePubInfoRequest::getPubId, (req, v) -> {
                req.setPubId(v);
            }));
        builder.<UpdatePubInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePubInfoRequestBody.class),
            f -> f.withMarshaller(UpdatePubInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePubInfoRequest, CreatePubInfoResponse> createPubInfo =
        genForcreatePubInfo();

    private static HttpRequestDef<CreatePubInfoRequest, CreatePubInfoResponse> genForcreatePubInfo() {
        // basic
        HttpRequestDef.Builder<CreatePubInfoRequest, CreatePubInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePubInfoRequest.class, CreatePubInfoResponse.class)
                .withName("CreatePubInfo")
                .withUri("/v1/aim-sa/unify/pubs")
                .withContentType("application/json");

        // requests
        builder.<CreatePubInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePubInfoRequestBody.class),
            f -> f.withMarshaller(CreatePubInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PushMenuInfoRequest, PushMenuInfoResponse> pushMenuInfo = genForpushMenuInfo();

    private static HttpRequestDef<PushMenuInfoRequest, PushMenuInfoResponse> genForpushMenuInfo() {
        // basic
        HttpRequestDef.Builder<PushMenuInfoRequest, PushMenuInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PushMenuInfoRequest.class, PushMenuInfoResponse.class)
                .withName("PushMenuInfo")
                .withUri("/v1/aim-sa/menus/{menu_id}/push")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("menu_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PushMenuInfoRequest::getMenuId, (req, v) -> {
                req.setMenuId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PushPortalInfoRequest, PushPortalInfoResponse> pushPortalInfo =
        genForpushPortalInfo();

    private static HttpRequestDef<PushPortalInfoRequest, PushPortalInfoResponse> genForpushPortalInfo() {
        // basic
        HttpRequestDef.Builder<PushPortalInfoRequest, PushPortalInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PushPortalInfoRequest.class, PushPortalInfoResponse.class)
                .withName("PushPortalInfo")
                .withUri("/v1/aim-sa/portals/{portal_id}/push")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("portal_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PushPortalInfoRequest::getPortalId, (req, v) -> {
                req.setPortalId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadMediaRequest, UploadMediaResponse> uploadMedia = genForuploadMedia();

    private static HttpRequestDef<UploadMediaRequest, UploadMediaResponse> genForuploadMedia() {
        // basic
        HttpRequestDef.Builder<UploadMediaRequest, UploadMediaResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadMediaRequest.class, UploadMediaResponse.class)
                .withName("UploadMedia")
                .withUri("/v1/aim-sa/media/upload")
                .withContentType("multipart/form-data");

        // requests
        builder.<UploadMediaRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadMediaRequestBody.class),
            f -> f.withMarshaller(UploadMediaRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAimSendTaskRequest, CreateAimSendTaskResponse> createAimSendTask =
        genForcreateAimSendTask();

    private static HttpRequestDef<CreateAimSendTaskRequest, CreateAimSendTaskResponse> genForcreateAimSendTask() {
        // basic
        HttpRequestDef.Builder<CreateAimSendTaskRequest, CreateAimSendTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAimSendTaskRequest.class, CreateAimSendTaskResponse.class)
                .withName("CreateAimSendTask")
                .withUri("/v1/aim/send-tasks")
                .withContentType("application/json");

        // requests
        builder.<CreateAimSendTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAimSendTaskRequestBody.class),
            f -> f.withMarshaller(CreateAimSendTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimSendDetailsRequest, ListAimSendDetailsResponse> listAimSendDetails =
        genForlistAimSendDetails();

    private static HttpRequestDef<ListAimSendDetailsRequest, ListAimSendDetailsResponse> genForlistAimSendDetails() {
        // basic
        HttpRequestDef.Builder<ListAimSendDetailsRequest, ListAimSendDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAimSendDetailsRequest.class, ListAimSendDetailsResponse.class)
                .withName("ListAimSendDetails")
                .withUri("/v1/aim/send-details")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("tpl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getTplId, (req, v) -> {
                req.setTplId(v);
            }));
        builder.<String>withRequestField("sms_sign",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getSmsSign, (req, v) -> {
                req.setSmsSign(v);
            }));
        builder.<String>withRequestField("cust_flag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getCustFlag, (req, v) -> {
                req.setCustFlag(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimSendReportsRequest, ListAimSendReportsResponse> listAimSendReports =
        genForlistAimSendReports();

    private static HttpRequestDef<ListAimSendReportsRequest, ListAimSendReportsResponse> genForlistAimSendReports() {
        // basic
        HttpRequestDef.Builder<ListAimSendReportsRequest, ListAimSendReportsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAimSendReportsRequest.class, ListAimSendReportsResponse.class)
                .withName("ListAimSendReports")
                .withUri("/v1/aim/send-reports")
                .withContentType("application/json");

        // requests
        builder.<ListAimSendReportsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAimSendReportsRequestBody.class),
            f -> f.withMarshaller(ListAimSendReportsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimSendTasksRequest, ListAimSendTasksResponse> listAimSendTasks =
        genForlistAimSendTasks();

    private static HttpRequestDef<ListAimSendTasksRequest, ListAimSendTasksResponse> genForlistAimSendTasks() {
        // basic
        HttpRequestDef.Builder<ListAimSendTasksRequest, ListAimSendTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAimSendTasksRequest.class, ListAimSendTasksResponse.class)
                .withName("ListAimSendTasks")
                .withUri("/v1/aim/send-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));
        builder.<String>withRequestField("tpl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getTplId, (req, v) -> {
                req.setTplId(v);
            }));
        builder.<String>withRequestField("tpl_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getTplName, (req, v) -> {
                req.setTplName(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("task_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getTaskStatus, (req, v) -> {
                req.setTaskStatus(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAimPersonalTemplateRequest, CreateAimPersonalTemplateResponse> createAimPersonalTemplate =
        genForcreateAimPersonalTemplate();

    private static HttpRequestDef<CreateAimPersonalTemplateRequest, CreateAimPersonalTemplateResponse> genForcreateAimPersonalTemplate() {
        // basic
        HttpRequestDef.Builder<CreateAimPersonalTemplateRequest, CreateAimPersonalTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateAimPersonalTemplateRequest.class,
                    CreateAimPersonalTemplateResponse.class)
                .withName("CreateAimPersonalTemplate")
                .withUri("/v1/aim/templates")
                .withContentType("application/json");

        // requests
        builder.<CreateAimPersonalTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAimPersonalTemplateRequestBody.class),
            f -> f.withMarshaller(CreateAimPersonalTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAimPersonalTemplateRequest, DeleteAimPersonalTemplateResponse> deleteAimPersonalTemplate =
        genFordeleteAimPersonalTemplate();

    private static HttpRequestDef<DeleteAimPersonalTemplateRequest, DeleteAimPersonalTemplateResponse> genFordeleteAimPersonalTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteAimPersonalTemplateRequest, DeleteAimPersonalTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteAimPersonalTemplateRequest.class,
                    DeleteAimPersonalTemplateResponse.class)
                .withName("DeleteAimPersonalTemplate")
                .withUri("/v1/aim/template/{tpl_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tpl_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAimPersonalTemplateRequest::getTplId, (req, v) -> {
                req.setTplId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateMaterialRequest, DeleteTemplateMaterialResponse> deleteTemplateMaterial =
        genFordeleteTemplateMaterial();

    private static HttpRequestDef<DeleteTemplateMaterialRequest, DeleteTemplateMaterialResponse> genFordeleteTemplateMaterial() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateMaterialRequest, DeleteTemplateMaterialResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteTemplateMaterialRequest.class, DeleteTemplateMaterialResponse.class)
            .withName("DeleteTemplateMaterial")
            .withUri("/v1/aim/template-materials/delete")
            .withContentType("application/json");

        // requests
        builder.<DeleteTemplateMaterialRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTemplateMaterialRequestBody.class),
            f -> f.withMarshaller(DeleteTemplateMaterialRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimTemplateMaterialsRequest, ListAimTemplateMaterialsResponse> listAimTemplateMaterials =
        genForlistAimTemplateMaterials();

    private static HttpRequestDef<ListAimTemplateMaterialsRequest, ListAimTemplateMaterialsResponse> genForlistAimTemplateMaterials() {
        // basic
        HttpRequestDef.Builder<ListAimTemplateMaterialsRequest, ListAimTemplateMaterialsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListAimTemplateMaterialsRequest.class, ListAimTemplateMaterialsResponse.class)
                .withName("ListAimTemplateMaterials")
                .withUri("/v1/aim/template-materials")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplateMaterialsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplateMaterialsRequest::getFileName, (req, v) -> {
                req.setFileName(v);
            }));
        builder.<String>withRequestField("material_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplateMaterialsRequest::getMaterialId, (req, v) -> {
                req.setMaterialId(v);
            }));
        builder.<String>withRequestField("aim_resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplateMaterialsRequest::getAimResourceId, (req, v) -> {
                req.setAimResourceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimTemplateMaterialsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimTemplateMaterialsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimTemplateReportsRequest, ListAimTemplateReportsResponse> listAimTemplateReports =
        genForlistAimTemplateReports();

    private static HttpRequestDef<ListAimTemplateReportsRequest, ListAimTemplateReportsResponse> genForlistAimTemplateReports() {
        // basic
        HttpRequestDef.Builder<ListAimTemplateReportsRequest, ListAimTemplateReportsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListAimTemplateReportsRequest.class, ListAimTemplateReportsResponse.class)
            .withName("ListAimTemplateReports")
            .withUri("/v1/aim/tempalte-reports/query")
            .withContentType("application/json");

        // requests
        builder.<ListAimTemplateReportsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAimTemplateReportsRequestBody.class),
            f -> f.withMarshaller(ListAimTemplateReportsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimTemplatesRequest, ListAimTemplatesResponse> listAimTemplates =
        genForlistAimTemplates();

    private static HttpRequestDef<ListAimTemplatesRequest, ListAimTemplatesResponse> genForlistAimTemplates() {
        // basic
        HttpRequestDef.Builder<ListAimTemplatesRequest, ListAimTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAimTemplatesRequest.class, ListAimTemplatesResponse.class)
                .withName("ListAimTemplates")
                .withUri("/v1/aim/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tpl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getTplId, (req, v) -> {
                req.setTplId(v);
            }));
        builder.<String>withRequestField("tpl_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getTplName, (req, v) -> {
                req.setTplName(v);
            }));
        builder.<String>withRequestField("tpl_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getTplType, (req, v) -> {
                req.setTplType(v);
            }));
        builder.<List<String>>withRequestField("factory_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getFactoryType, (req, v) -> {
                req.setFactoryType(v);
            }));
        builder.<Boolean>withRequestField("has_param",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getHasParam, (req, v) -> {
                req.setHasParam(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Boolean>withRequestField("is_only_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getIsOnlyStatus, (req, v) -> {
                req.setIsOnlyStatus(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePersonalTemplateStateRequest, UpdatePersonalTemplateStateResponse> updatePersonalTemplateState =
        genForupdatePersonalTemplateState();

    private static HttpRequestDef<UpdatePersonalTemplateStateRequest, UpdatePersonalTemplateStateResponse> genForupdatePersonalTemplateState() {
        // basic
        HttpRequestDef.Builder<UpdatePersonalTemplateStateRequest, UpdatePersonalTemplateStateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdatePersonalTemplateStateRequest.class,
                    UpdatePersonalTemplateStateResponse.class)
                .withName("UpdatePersonalTemplateState")
                .withUri("/v1/aim/template-state/{tpl_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tpl_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePersonalTemplateStateRequest::getTplId, (req, v) -> {
                req.setTplId(v);
            }));
        builder.<UpdatePersonalTemplateStateDataRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePersonalTemplateStateDataRequest.class),
            f -> f.withMarshaller(UpdatePersonalTemplateStateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadAimTemplateMaterialRequest, UploadAimTemplateMaterialResponse> uploadAimTemplateMaterial =
        genForuploadAimTemplateMaterial();

    private static HttpRequestDef<UploadAimTemplateMaterialRequest, UploadAimTemplateMaterialResponse> genForuploadAimTemplateMaterial() {
        // basic
        HttpRequestDef.Builder<UploadAimTemplateMaterialRequest, UploadAimTemplateMaterialResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UploadAimTemplateMaterialRequest.class,
                    UploadAimTemplateMaterialResponse.class)
                .withName("UploadAimTemplateMaterial")
                .withUri("/v1/aim/template-materials")
                .withContentType("application/json");

        // requests
        builder.<UploadAimTemplateMaterialRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadAimTemplateMaterialRequestBody.class),
            f -> f.withMarshaller(UploadAimTemplateMaterialRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddVmsCallBackRequest, AddVmsCallBackResponse> addVmsCallBack =
        genForaddVmsCallBack();

    private static HttpRequestDef<AddVmsCallBackRequest, AddVmsCallBackResponse> genForaddVmsCallBack() {
        // basic
        HttpRequestDef.Builder<AddVmsCallBackRequest, AddVmsCallBackResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddVmsCallBackRequest.class, AddVmsCallBackResponse.class)
                .withName("AddVmsCallBack")
                .withUri("/v1/aim-basic/callbacks")
                .withContentType("application/json");

        // requests
        builder.<AddVmsCallBackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddVmsCallBackRequestBody.class),
            f -> f.withMarshaller(AddVmsCallBackRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVmsSendTaskRequest, CreateVmsSendTaskResponse> createVmsSendTask =
        genForcreateVmsSendTask();

    private static HttpRequestDef<CreateVmsSendTaskRequest, CreateVmsSendTaskResponse> genForcreateVmsSendTask() {
        // basic
        HttpRequestDef.Builder<CreateVmsSendTaskRequest, CreateVmsSendTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVmsSendTaskRequest.class, CreateVmsSendTaskResponse.class)
                .withName("CreateVmsSendTask")
                .withUri("/v1/aim-basic/send-tasks")
                .withContentType("application/json");

        // requests
        builder.<CreateVmsSendTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVmsSendTaskRequestBody.class),
            f -> f.withMarshaller(CreateVmsSendTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVmsCallbacksRequest, ListVmsCallbacksResponse> listVmsCallbacks =
        genForlistVmsCallbacks();

    private static HttpRequestDef<ListVmsCallbacksRequest, ListVmsCallbacksResponse> genForlistVmsCallbacks() {
        // basic
        HttpRequestDef.Builder<ListVmsCallbacksRequest, ListVmsCallbacksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVmsCallbacksRequest.class, ListVmsCallbacksResponse.class)
                .withName("ListVmsCallbacks")
                .withUri("/v1/aim-basic/callbacks")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVmsSendTasksRequest, ListVmsSendTasksResponse> listVmsSendTasks =
        genForlistVmsSendTasks();

    private static HttpRequestDef<ListVmsSendTasksRequest, ListVmsSendTasksResponse> genForlistVmsSendTasks() {
        // basic
        HttpRequestDef.Builder<ListVmsSendTasksRequest, ListVmsSendTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVmsSendTasksRequest.class, ListVmsSendTasksResponse.class)
                .withName("ListVmsSendTasks")
                .withUri("/v1/aim-basic/send-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("tpl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getTplId, (req, v) -> {
                req.setTplId(v);
            }));
        builder.<String>withRequestField("tpl_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getTplName, (req, v) -> {
                req.setTplName(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("send_begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getSendBeginTime, (req, v) -> {
                req.setSendBeginTime(v);
            }));
        builder.<String>withRequestField("send_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getSendEndTime, (req, v) -> {
                req.setSendEndTime(v);
            }));
        builder.<String>withRequestField("operator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getOperator, (req, v) -> {
                req.setOperator(v);
            }));
        builder.<String>withRequestField("task_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getTaskStatus, (req, v) -> {
                req.setTaskStatus(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVmsTemplateRequest, CreateVmsTemplateResponse> createVmsTemplate =
        genForcreateVmsTemplate();

    private static HttpRequestDef<CreateVmsTemplateRequest, CreateVmsTemplateResponse> genForcreateVmsTemplate() {
        // basic
        HttpRequestDef.Builder<CreateVmsTemplateRequest, CreateVmsTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVmsTemplateRequest.class, CreateVmsTemplateResponse.class)
                .withName("CreateVmsTemplate")
                .withUri("/v1/aim-basic/templates")
                .withContentType("application/json");

        // requests
        builder.<CreateVmsTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVmsTemplateRequestBody.class),
            f -> f.withMarshaller(CreateVmsTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVmsTemplateStatusRequest, ListVmsTemplateStatusResponse> listVmsTemplateStatus =
        genForlistVmsTemplateStatus();

    private static HttpRequestDef<ListVmsTemplateStatusRequest, ListVmsTemplateStatusResponse> genForlistVmsTemplateStatus() {
        // basic
        HttpRequestDef.Builder<ListVmsTemplateStatusRequest, ListVmsTemplateStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListVmsTemplateStatusRequest.class, ListVmsTemplateStatusResponse.class)
            .withName("ListVmsTemplateStatus")
            .withUri("/v1/aim-basic/templates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tpl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getTplId, (req, v) -> {
                req.setTplId(v);
            }));
        builder.<String>withRequestField("tpl_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getTplName, (req, v) -> {
                req.setTplName(v);
            }));
        builder.<String>withRequestField("tpl_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getTplType, (req, v) -> {
                req.setTplType(v);
            }));
        builder.<Boolean>withRequestField("has_param",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getHasParam, (req, v) -> {
                req.setHasParam(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

}
